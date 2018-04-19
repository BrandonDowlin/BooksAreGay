package models.books;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.shopping.*;

@Entity
public class Book extends Model 
{
    @Id
    private Long id;

    @Constraints.Required
    private String title;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy="books")
    private List<Genre> genres;

    @ManyToMany
    private List<Wishlist> wishlists;

    @Constraints.Required
    @ManyToOne
    private Author author;
    @Constraints.Required
    private String description;

    @Constraints.Required
    @ManyToOne
    private Publisher publisher;

    @Constraints.Required
    private int stock; 
    @Constraints.Required
    private double price; 

    public static final Finder<Long, Book> find = new Finder<>(Book.class);
        
        private List<Long> genSelect = new ArrayList<Long>();

        public static final List<Book> findAll() 
        { 
            
            return Book.find.all();
        }

        public static List<Book> findAll(String filter)
        {
            return Book.find.query().where()
            .ilike("title", "%" + filter + "%")
            .orderBy("title asc")
            .findList();
        }
        
        public static List<Book> findFilter(Long genID, String filter)
        {
            return Book.find.query().where()
            .eq("genres.id", genID)
            .ilike("name", "%" + filter + "%")
            .orderBy("name asc")
            .findList();
        }

        public Book(){            
        }

        public Book(Long id, String title, Author author, String description, Publisher publisher, int stock, double price, List<Genre> genres) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.description = description;
            this.publisher = publisher;
            this.stock = stock;
            this.price = price;
            this.genres = genres;
        }

        // Accessor methods
        public Long getId() 
        {
            return id;
        }
        public void setId(Long id) 
        {
            this.id = id;
        }
        public String getTitle() 
        {
            return title;
        }
        public void setTitle(String title) 
        {
            this.title = title;
        }
        public List<Genre> getGenres() {
            return genres;
        }
        public void setGenres(List<Genre> genres) {
            this.genres = genres;
        }
        public List<Wishlist> getWishlists() {
            return wishlists;
        }
        public void setWishlists(List<Wishlist> wishlists) {
            this.wishlists = wishlists;
        }
        public String getDescription() 
        { 
            return description; 
        } 
        public void setDescription(String description) 
        { 
            this.description = description; 
        }
        public int getStock() 
        { 
            return stock; 
        } 
        public void setStock(int stock)
        { 
            this.stock = stock; 
        } 
        public double getPrice() 
        { 
            return price; 
        } 
        public void setPrice(double price) 
        { 
            this.price = price; 
        } 
        public List<Long> getGenSelect(){
            return genSelect;
        }
        public void setGenSelect(List<Long> genSelect){
            this.genSelect = genSelect;
        }
        public Author getAuthor() {
            return author;
        }
        public void setAuthor(Author author) {
            this.author = author;
        }
        public Publisher getPublisher() {
            return publisher;
        }
        public void setPublisher(Publisher publisher){
            this.publisher = publisher;
        }
        public boolean decrementStock(){
            boolean allowed =true;
            if ((stock-1) < 0){
                allowed = false;
            }else{
                stock = stock-1;
            }
            return allowed;
        }
        public void incrementStock(int q){          
            stock = stock +q;
        }


}
    