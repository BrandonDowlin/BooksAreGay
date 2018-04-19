package controllers;

import java.util.*;
import play.mvc.*;
import play.data.*;
import javax.inject.Inject;
import java.time.*;
import io.ebean.*;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;

import models.users.*;
import models.books.*;
import models.shopping.*;

import controllers.security.*;

@Security.Authenticated(Secured.class)
@With(CheckIfCustomer.class)

public class ShoppingCtrl extends Controller
{
    private FormFactory formFactory;
    private Environment env;
    
    @Inject
    public ShoppingCtrl(Environment e, FormFactory f) 
    {
        this.env = e;
        this.formFactory = f;
    }

    private Customer getCurrentUser() 
    {
		return (Customer)User.getLoggedIn(session().get("email"));
	}

    @Transactional
    public Result showBasket()
    {
        return ok(basket.render(getCurrentUser()));
    }

    @Transactional
    public Result addToBasket(Long id) 
    {
      
        Book b = Book.find.byId(id);
        
        Customer customer = (Customer)User.getLoggedIn(session().get("email"));
        if(b.decrementStock())
        {
        
            if (customer.getBasket() == null) 
            {
                customer.setBasket(new Basket());
                customer.getBasket().setCustomer(customer);
                customer.update();
            }

            b.update();
        
            customer.getBasket().addBook(b);
            customer.update();
        }
             
        return ok(basket.render(customer));
    }

    @Transactional
    public Result addOne(Long itemId, Long bid) {
        
        OrderItem item = OrderItem.find.byId(itemId);
        Book b = Book.find.byId(bid);
        
        if(b.decrementStock())
        {    
            item.increaseQty();
            item.update();
            b.update();
        }
        else
        {
            flash("success", "Sorry, no more of these books left");
        }

        return redirect(routes.ShoppingCtrl.showBasket());
    }

    @Transactional
    public Result removeOne(Long itemId) 
    {
        OrderItem item = OrderItem.find.byId(itemId);
        Customer c = getCurrentUser();
        
        c.getBasket().removeItem(item);
        c.getBasket().update();
        
        return ok(basket.render(c));
    }

    @Transactional
    public Result emptyBasket()
    {
        
        Customer c = getCurrentUser();
        c.getBasket().removeAllItems();
        c.getBasket().update();
        
        return ok(basket.render(c));
    }

    @Transactional
    public Result placeOrder() 
    {
        Customer c = getCurrentUser();
        
        // Create an order instance
        ShopOrder order = new ShopOrder();
        
        // Associate order with customer
        order.setCustomer(c);
        
        // Copy basket to order
        order.setItems(c.getBasket().getBasketItems());
        
        // Save the order now to generate a new id for this order
        order.save();
       
       // Move items from basket to order
        for (OrderItem i: order.getItems()) {
            // Associate with order
            i.setOrder(order);
            // Remove from basket
            i.setBasket(null);
            // update item
            i.update();
        }
        
        // Update the order
        order.update();
        
        // Clear and update the shopping basket
        c.getBasket().setBasketItems(null);
        c.getBasket().update();
        
        // Show order confirmed view
        return ok(orderConfirmed.render(c, order));
    }
    
    @Transactional
    public Result viewOrders() {

        Customer currUser = getCurrentUser();

        List<ShopOrder> orders = Ebean.find(ShopOrder.class)
        .where().eq("customer", currUser)
        .findList();

        return ok(viewOrders.render(currUser, orders));
    }

    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render(getCurrentUser(), order));
    }

    public Result cancelOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);

        if (order == null) {
            flash("success", "Order Order not found");
            return redirect(routes.ShoppingCtrl.viewOrders());
        }

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime orderTime = LocalDateTime.ofInstant(order.getOrderDate().toInstant(), ZoneId.systemDefault());
        

        if (orderTime.getYear() == now.getYear()) {
            if (orderTime.getMonthValue() == now.getMonthValue()) {
                if (orderTime.getDayOfYear() == now.getDayOfYear()) {
                    if ((now.getHour() - orderTime.getHour()) <= 1) {
                        order.delete();
                        flash("success", "Order Cancelled");
                        return redirect(routes.ShoppingCtrl.viewOrders());
                    }  
                }
            }
        }

        flash("success", "Order is too late to be Cancelled");
        return redirect(routes.ShoppingCtrl.viewOrders());
    }


}