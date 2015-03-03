package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result myindex() {
        return ok(myindex.render("Hello Mr.User  :Now Your cna tack the registration...!  "));
    }
    
    public static Result myhomepage() {
        return ok(myhomepage.render("Hello Mr.User  :Now Your cna tack the registration...!  "));
    }
}
