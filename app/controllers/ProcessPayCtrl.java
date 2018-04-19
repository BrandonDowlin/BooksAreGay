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

public class ProcessPayCtrl extends Controller {
    
    private FormFactory formFactory;
    private Environment env;

    @Inject
    public ProcessPayCtrl (Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    public Result processpay(){
        Form<ProcessPay> processpayForm = formFactory.form(ProcessPay.class);
        return ok(processpay.render(processpayForm, User.getLoggedIn(session().get("email"))));
    }

    public Result processpaySubmit() {
        Form<ProcessPay> processpayForm = formFactory.form(ProcessPay.class).bindFromRequest();
        if(processpayForm.hasErrors()){
            return badRequest(processpay.render(processpayForm, User.getLoggedIn(session().get("email"))));
        }

        else {
            session().clear();
            session("email", processpayForm.get().getemail());
        }
        return redirect(controllers.routes.BookCtrl.index());
    }
    

}

