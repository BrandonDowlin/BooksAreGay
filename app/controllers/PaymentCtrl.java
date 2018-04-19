package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;
import models.users.*;

public class PaymentCtrl extends Controller {
    
    private FormFactory formFactory;
    private Environment env;

    @Inject
    public PaymentCtrl (Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    public Result payment(){
        Form<Payment> paymentForm = formFactory.form(Payment.class);
        return ok(payment.render(paymentForm, User.getLoggedIn(session().get("email"))));
    }

    public Result paymentSubmit() {
        Form<Payment> paymentForm = formFactory.form(Payment.class).bindFromRequest();
        if(paymentForm.hasErrors()){
            return badRequest(payment.render(paymentForm, User.getLoggedIn(session().get("email"))));
        }

        else {
            session().clear();
            session("email", paymentForm.get().getemail());
        }
        return redirect(controllers.routes.BookCtrl.index());
    }
    

}

