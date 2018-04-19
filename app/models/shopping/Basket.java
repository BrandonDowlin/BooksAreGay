package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.books.*;
import models.users.*;

@Entity
public class Basket extends Model {

    @Id
    private Long id;
    
    @OneToMany(mappedBy = "basket", cascade = CascadeType.PERSIST)
    private List<OrderItem> basketItems;
    
    @OneToOne
    private Customer customer;

    public  Basket() {
    }

    public void addBook(Book b) {
        
        boolean itemFound = false;
        for (OrderItem i : basketItems) {
            if (i.getBook().getId() == b.getId()) {
                i.increaseQty();
                itemFound = true;
                break;
            }
        }
        if (itemFound == false) {
            OrderItem newItem = new OrderItem(b);
            basketItems.add(newItem);
        }
    }
    public void removeItem(OrderItem item) {

        for (Iterator<OrderItem> iter = basketItems.iterator(); iter.hasNext();) {
            OrderItem i = iter.next();
            if (i.getId().equals(item.getId()))
            {
                if (i.getQuantity() > 1 ) {
                    i.decreaseQty();
                }
                
                else {
                    // delete object from db
                    i.delete();
                    // remove object from list
                    iter.remove();
                    break;
                }             
            }
		}
    }
    public void removeAllItems() {
        for (OrderItem i : basketItems) {
            Book b = Book.find.byId(i.getBook().getId());
            if (i.getBook().getId() == b.getId()) {
                int quantity = i.getQuantity();
                b.incrementStock(quantity);
                b.update();
            }
        }

        for(OrderItem i: this.basketItems) {
            i.delete();
           }
            this.basketItems = null;
    }
    public double getBasketTotal() {
        
        double total = 0;
        
        for (OrderItem i: basketItems) {
            total += i.getItemTotal();
        }
        return total;
    }

    public static Finder<Long,Basket> find = new Finder<Long,Basket>(Basket.class);

    
    public static List<Basket> findAll() {
        return Basket.find.all();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(List<OrderItem> basketItems) {
        this.basketItems = basketItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}