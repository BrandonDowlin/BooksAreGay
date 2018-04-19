package controllers;
import controllers.security.*;
import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import models.users.*;
import models.books.*;
import models.shopping.*;
import views.html.*;

public class BookCtrl extends Controller {
    private FormFactory formFactory;
    private Environment e;

    @Inject
    public BookCtrl(FormFactory f, Environment env)
    {
        this.formFactory = f;
        this.e = env;   
    }

    @Transactional
    public User getCurrentUser()
    {
        User u = User.getLoggedIn(session().get("email"));
        return u;
    }
  
    private Customer getCurrentCustomer() 
    {
		return (Customer)User.getLoggedIn(session().get("email"));
	}

    public Result index()
    {
        return redirect(routes.BookCtrl.listBooks(0,""));
    }

    @Transactional
    public Result listBooks(Long gen, String filter)
    {
        List<Genre> genres = Genre.findAll();
        List<Book> books = new ArrayList<Book>();

        if(gen == 0)
        {
            books = Book.findAll(filter);
        }
        else
        {
            books = Book.findFilter(gen, filter);
        }
        return ok(listBooks.render(books, genres, gen, filter, getCurrentUser(), e));
    }
        public Result bookDetails(Long id) {
            Book b;
            b= Book.find.byId(id);
            return ok(bookDetails.render(b,User.getLoggedIn(session().get("email")),e));
        }

        @Transactional
        public Result showWishlist() {
            Customer c = getCurrentCustomer();
            if(c.getWishlist() == null){
                Wishlist w = new Wishlist();
                c.setWishlist(w);
                w.setCustomer(c);

                w.save();
                c.update();
            }

            return ok(wishlist.render(getCurrentCustomer(), e));
        }

        public Result addToWishlist(Long id){
            Book b = Book.find.byId(id);
            Customer c = getCurrentCustomer();

            if(c.getWishlist() == null){
                Wishlist w = new Wishlist();
                c.setWishlist(w);
                w.setCustomer(c);

                w.save();
                c.update();
            }

            c.getWishlist().getWishlistItems().add(b);
            b.getWishlists().add(c.getWishlist());

            c.update();
            b.update();
            
            return ok(wishlist.render(getCurrentCustomer(), e));
        }

        public Result removeFromWishlist(Long id) 
        {
            Book b = Book.find.byId(id);
            Customer c = getCurrentCustomer();

            for(Book book : c.getWishlist().getWishlistItems()){
                if(book.getId() == b.getId()){
                    c.getWishlist().getWishlistItems().remove(book);
                    book.getWishlists().remove(c.getWishlist());
                }
            }
            b.update();
            c.update();

            flash("success", "Book has been deleted from your wishlist");
            return ok(wishlist.render(getCurrentCustomer(), e));
        }


        // public Result removeFromWishlist(Long id){
        //     Book b = Book.find.byId(id);
        //     Customer c = getCurrentCustomer();
        //     List<Book> items = c.getWishlist().getWishlistItems();
        //     List<Wishlist> wishlists = b.getWishlists();

        //     Iterator it1 = items.iterator();

        //     while (it1.hasNext()) {
        //         Book book = (Book) it1.next();
        //             if(book.getId() == id){
        //             it1.remove(book);
        //         }
        //     }

        //     Iterator it2 = wishlists.iterator();

        //     while (it2.hasNext()) {
        //         Wishlist w = (Wishlist) it2.next();
        //         if(w.getCustomer().getEmail() == c.getEmail()){
        //         wishlists.remove(w);
        //         }
        //     }

        //     // for(int i =0; i<items.size();i++){
        //     //     if(items.get(i).getId() == id){
        //     //                 items.remove(i);
        //     //             }
        //     // }
        //     // for(int i =0; i<wishlists.size();i++){
        //     //     if(wishlist.get(i).getCustomer().getEmail() == c.getEmail()){
        //     //                 wishlists.remove(i);
        //     //             }
        //     // }

        //     // for(Book book : items){
        //     //     if(book.getId() == id){
        //     //         items.remove(book);
        //     //     }
        //     // }
        //     // for(Wishlist w : wishlists) {
        //     //     if(w.getCustomer().getEmail() == c.getEmail()){
        //     //         wishlists.remove(w);
        //     //     }
        //     // }
        //     c.getWishlist().setWishlistItems(items);
        //     b.setWishlists(wishlists);

        //     c.update();            
        //     b.update();
        //     return ok(bookDetails.render(b,User.getLoggedIn(session().get("email")),e));
        // }
    }

