
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/conf/routes
// @DATE:Thu Apr 19 21:59:29 BST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:60
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseAdminBookCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def addBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminBookCtrl.addBook",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/addBook"})
        }
      """
    )
  
    // @LINE:54
    def updateBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminBookCtrl.updateBook",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/updateBook/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:52
    def addBookSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminBookCtrl.addBookSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/addBookSubmit"})
        }
      """
    )
  
    // @LINE:57
    def deleteBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminBookCtrl.deleteBook",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/deleteBook/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:55
    def updateBookSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminBookCtrl.updateBookSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/updateBookSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def updateCustomerSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateCustomerSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateCustomerSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:41
    def myAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.myAccount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myaccount"})
        }
      """
    )
  
    // @LINE:23
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:20
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser"})
        }
      """
    )
  
    // @LINE:22
    def addUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUserSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUserSubmit"})
        }
      """
    )
  
    // @LINE:19
    def usersPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.usersPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usersPage"})
        }
      """
    )
  
    // @LINE:21
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:25
    def updateCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateCustomer",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateCustomer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:24
    def updateUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateUserSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateUserSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseBookCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def listBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookCtrl.listBooks",
      """
        function(gen0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Home" + _qS([(gen0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("gen", gen0)), (filter1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:44
    def removeFromWishlist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookCtrl.removeFromWishlist",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeFromWishlist/id" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:42
    def showWishlist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookCtrl.showWishlist",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wishlist"})
        }
      """
    )
  
    // @LINE:43
    def addToWishlist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookCtrl.addToWishlist",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToWishlist/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookCtrl.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:11
    def bookDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookCtrl.bookDetails",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bookDetails/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:38
  class ReversePaymentCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def paymentSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentCtrl.paymentSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentSubmit"})
        }
      """
    )
  
    // @LINE:38
    def payment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentCtrl.payment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment"})
        }
      """
    )
  
  }

  // @LINE:46
  class ReverseProcessPayCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def processpaySubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProcessPayCtrl.processpaySubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "processpaySubmit"})
        }
      """
    )
  
    // @LINE:46
    def processpay: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProcessPayCtrl.processpay",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "processpay"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseShoppingCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def addToBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addToBasket",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToBasket/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:36
    def viewOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.viewOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrders"})
        }
      """
    )
  
    // @LINE:37
    def cancelOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.cancelOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cancelOrder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:31
    def addOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addOne",
      """
        function(itemId0,pid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addOne/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("pid", pid1)])})
        }
      """
    )
  
    // @LINE:35
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.viewOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrder/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:34
    def placeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.placeOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "placeOrder"})
        }
      """
    )
  
    // @LINE:32
    def removeOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.removeOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeOne/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
    // @LINE:29
    def showBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.showBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showBasket"})
        }
      """
    )
  
    // @LINE:33
    def emptyBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.emptyBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emptyBasket"})
        }
      """
    )
  
  }


}
