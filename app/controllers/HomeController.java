package controllers;
import controllers.security.*;
import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.*;
import javax.inject.Inject;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import models.*;
import models.users.*;
import views.html.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private FormFactory formFactory;
    private Environment e;
    
        @Inject
        public HomeController(FormFactory f,Environment env) {
            this.formFactory = f;
            this.e = env;
        }
    

        @Transactional
        public Result addUser() {
            Form<User> userForm = formFactory.form(User.class);

            return ok(addUser.render(userForm, User.getUserById(session().get("email"))));
        }
        @Transactional
        public Result addUserSubmit() {
            Customer newUser;
            Form<Customer> newUserForm = formFactory.form(Customer.class).bindFromRequest();

            if (newUserForm.hasErrors()){
                flash("failure", "Form error");
                return badRequest(addUser.render(formFactory.form(User.class), User.getUserById(session().get("email"))));
            }
            else {
                newUser = newUserForm.get();
                
                   newUser.save();
                    

            }
            flash("success", "User " + newUser.getName() + " has been created");

            return redirect(controllers.security.routes.LoginCtrl.login());
        }
        @Transactional
        public Result updateUser(String id) {
            User u;
            Form<User> userForm;
            List<String> roleList = User.options();
    
            try {
                u = User.find.byId(id);
                userForm = formFactory.form(User.class).fill(u);
            } 
            catch (Exception ex) {
                return badRequest("error");
            }
            return ok(updateUser.render(id, userForm, User.getUserById(session().get("email"))));
        }
        public Result updateUserSubmit(String id) {
        
           
            Form<User> updateUserForm = formFactory.form(User.class).bindFromRequest();
    
            if (updateUserForm.hasErrors()) {
                
                List<String> roleList = User.options();
                return badRequest(updateUser.render(id,updateUserForm, User.getUserById(session().get("email"))));
            }   
                User u = updateUserForm.get();
                u.setEmail(id);
                u.update();    
                flash("success", "User " + u.getName() + " has been  updated ");
                
                // Redirect to the index page
                return redirect(controllers.routes.HomeController.usersPage());
            }
        @Security.Authenticated(Secured.class)
        @With(CheckIfAdmin.class)
        @Transactional
        public Result deleteUser(String id) {
            User.find.ref(id).delete();
    
            flash("success", "User has been deleted");
            
            return redirect(routes.HomeController.usersPage());
        }

        @Security.Authenticated(Secured.class)
        @With(CheckIfAdmin.class)
        public Result usersPage() {
            List<User> userList = User.findAll();
            return ok(usersPage.render(userList, User.getUserById(session().get("email")),e));
        }

        @Transactional
        public Result myAccount() {
            return ok(myAccount.render(User.getLoggedIn(session().get("email"))));
        }

        @Transactional
        public Result updateCustomer(String id) {
            Customer c;
            Form<Customer> customerForm;
    
            try {
                c = Customer.find.byId(id);
                customerForm = formFactory.form(Customer.class).fill(c);
            } 
            catch (Exception ex) {
                return badRequest("error");
            }
            return ok(updateCustomer.render(id, customerForm, User.getUserById(session().get("email"))));
        }

        public Result updateCustomerSubmit(String id) {
            Form<Customer> updateCustomerForm = formFactory.form(Customer.class).bindFromRequest();
    
            if (updateCustomerForm.hasErrors()) {
                
                return badRequest(updateCustomer.render(id,updateCustomerForm, User.getUserById(session().get("email"))));
            }   
                Customer c = updateCustomerForm.get();
                c.setEmail(id);
                c.update();    
                flash("success", "User " + c.getName() + " has been  updated ");
                
                // Redirect to the index page
                return redirect(controllers.routes.HomeController.usersPage());
            }
}