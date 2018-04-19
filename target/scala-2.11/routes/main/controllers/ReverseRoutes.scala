
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/conf/routes
// @DATE:Thu Apr 19 21:59:29 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:60
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:51
  class ReverseAdminBookCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def addBook(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/addBook")
    }
  
    // @LINE:54
    def updateBook(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/updateBook/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:52
    def addBookSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/addBookSubmit")
    }
  
    // @LINE:57
    def deleteBook(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/deleteBook/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:55
    def updateBookSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/updateBookSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:19
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def updateCustomerSubmit(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateCustomerSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:41
    def myAccount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "myaccount")
    }
  
    // @LINE:23
    def updateUser(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:20
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addUser")
    }
  
    // @LINE:22
    def addUserSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addUserSubmit")
    }
  
    // @LINE:19
    def usersPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usersPage")
    }
  
    // @LINE:21
    def deleteUser(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:25
    def updateCustomer(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateCustomer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:24
    def updateUserSubmit(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateUserSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:6
  class ReverseBookCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def listBooks(gen:Long = 0, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Home" + play.core.routing.queryString(List(if(gen == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("gen", gen)), if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:44
    def removeFromWishlist(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeFromWishlist/id" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:42
    def showWishlist(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "wishlist")
    }
  
    // @LINE:43
    def addToWishlist(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToWishlist/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:11
    def bookDetails(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bookDetails/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:38
  class ReversePaymentCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def paymentSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paymentSubmit")
    }
  
    // @LINE:38
    def payment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment")
    }
  
  }

  // @LINE:46
  class ReverseProcessPayCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def processpaySubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "processpaySubmit")
    }
  
    // @LINE:46
    def processpay(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "processpay")
    }
  
  }

  // @LINE:29
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def addToBasket(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:36
    def viewOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrders")
    }
  
    // @LINE:37
    def cancelOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cancelOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:31
    def addOne(itemId:Long, pid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("pid", pid)))))
    }
  
    // @LINE:35
    def viewOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:34
    def placeOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:32
    def removeOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:29
    def showBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
    // @LINE:33
    def emptyBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }


}
