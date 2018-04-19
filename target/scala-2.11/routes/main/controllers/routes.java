
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/conf/routes
// @DATE:Thu Apr 19 21:59:29 BST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAdminBookCtrl AdminBookCtrl = new controllers.ReverseAdminBookCtrl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBookCtrl BookCtrl = new controllers.ReverseBookCtrl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePaymentCtrl PaymentCtrl = new controllers.ReversePaymentCtrl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProcessPayCtrl ProcessPayCtrl = new controllers.ReverseProcessPayCtrl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseShoppingCtrl ShoppingCtrl = new controllers.ReverseShoppingCtrl(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAdminBookCtrl AdminBookCtrl = new controllers.javascript.ReverseAdminBookCtrl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBookCtrl BookCtrl = new controllers.javascript.ReverseBookCtrl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePaymentCtrl PaymentCtrl = new controllers.javascript.ReversePaymentCtrl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProcessPayCtrl ProcessPayCtrl = new controllers.javascript.ReverseProcessPayCtrl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseShoppingCtrl ShoppingCtrl = new controllers.javascript.ReverseShoppingCtrl(RoutesPrefix.byNamePrefix());
  }

}
