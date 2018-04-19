package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.books.*;
import models.users.*;

@Entity
public class Wishlist extends Model {
    @Id
    private Long id;

    @ManyToMany(mappedBy = "wishlists", cascade = CascadeType.PERSIST)
    private List<Book> wishlistItems; 

    @OneToOne
    private Customer customer;

    public Wishlist() {
    }

    public static Finder<Long,Wishlist> find = new Finder<Long,Wishlist>(Wishlist.class);

    public static List<Wishlist> findAll() {
        return Wishlist.find.all();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public List<Book> getWishlistItems() {
        return wishlistItems;
    }
    public void setWishlistItems(List<Book> items) {
        this.wishlistItems = wishlistItems;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}