
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/conf/routes
// @DATE:Thu Apr 19 21:59:29 BST 2018

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginCtrl LoginCtrl = new controllers.security.ReverseLoginCtrl(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginCtrl LoginCtrl = new controllers.security.javascript.ReverseLoginCtrl(RoutesPrefix.byNamePrefix());
  }

}
