
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/conf/routes
// @DATE:Thu Apr 19 21:59:29 BST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  BookCtrl_0: controllers.BookCtrl,
  // @LINE:14
  LoginCtrl_5: controllers.security.LoginCtrl,
  // @LINE:19
  HomeController_3: controllers.HomeController,
  // @LINE:29
  ShoppingCtrl_4: controllers.ShoppingCtrl,
  // @LINE:38
  PaymentCtrl_2: controllers.PaymentCtrl,
  // @LINE:46
  ProcessPayCtrl_7: controllers.ProcessPayCtrl,
  // @LINE:51
  AdminBookCtrl_1: controllers.AdminBookCtrl,
  // @LINE:60
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    BookCtrl_0: controllers.BookCtrl,
    // @LINE:14
    LoginCtrl_5: controllers.security.LoginCtrl,
    // @LINE:19
    HomeController_3: controllers.HomeController,
    // @LINE:29
    ShoppingCtrl_4: controllers.ShoppingCtrl,
    // @LINE:38
    PaymentCtrl_2: controllers.PaymentCtrl,
    // @LINE:46
    ProcessPayCtrl_7: controllers.ProcessPayCtrl,
    // @LINE:51
    AdminBookCtrl_1: controllers.AdminBookCtrl,
    // @LINE:60
    Assets_6: controllers.Assets
  ) = this(errorHandler, BookCtrl_0, LoginCtrl_5, HomeController_3, ShoppingCtrl_4, PaymentCtrl_2, ProcessPayCtrl_7, AdminBookCtrl_1, Assets_6, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, BookCtrl_0, LoginCtrl_5, HomeController_3, ShoppingCtrl_4, PaymentCtrl_2, ProcessPayCtrl_7, AdminBookCtrl_1, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.BookCtrl.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Home""", """controllers.BookCtrl.listBooks(gen:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bookDetails/""" + "$" + """id<[^/]+>""", """controllers.BookCtrl.bookDetails(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginCtrl.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginCtrl.loginSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.security.LoginCtrl.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usersPage""", """controllers.HomeController.usersPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser""", """controllers.HomeController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delUser/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteUser(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.HomeController.addUserSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUser/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateUser(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUserSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateUserSubmit(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateCustomer/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateCustomer(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateCustomerSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateCustomerSubmit(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long, pid:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrders""", """controllers.ShoppingCtrl.viewOrders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancelOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.cancelOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment""", """controllers.PaymentCtrl.payment"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paymentSubmit""", """controllers.PaymentCtrl.paymentSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myaccount""", """controllers.HomeController.myAccount"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wishlist""", """controllers.BookCtrl.showWishlist()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToWishlist/""" + "$" + """id<[^/]+>""", """controllers.BookCtrl.addToWishlist(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeFromWishlist/id""", """controllers.BookCtrl.removeFromWishlist(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """processpay""", """controllers.ProcessPayCtrl.processpay"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """processpaySubmit""", """controllers.ProcessPayCtrl.processpaySubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addBook""", """controllers.AdminBookCtrl.addBook()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addBookSubmit""", """controllers.AdminBookCtrl.addBookSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateBook/""" + "$" + """id<[^/]+>""", """controllers.AdminBookCtrl.updateBook(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateBookSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminBookCtrl.updateBookSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/deleteBook/""" + "$" + """id<[^/]+>""", """controllers.AdminBookCtrl.deleteBook(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_BookCtrl_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_BookCtrl_index0_invoker = createInvoker(
    BookCtrl_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookCtrl",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_BookCtrl_listBooks1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Home")))
  )
  private[this] lazy val controllers_BookCtrl_listBooks1_invoker = createInvoker(
    BookCtrl_0.listBooks(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookCtrl",
      "listBooks",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """Home""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_BookCtrl_bookDetails2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bookDetails/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookCtrl_bookDetails2_invoker = createInvoker(
    BookCtrl_0.bookDetails(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookCtrl",
      "bookDetails",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """bookDetails/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_security_LoginCtrl_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_login3_invoker = createInvoker(
    LoginCtrl_5.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """ Login form""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit4_invoker = createInvoker(
    LoginCtrl_5.loginSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_security_LoginCtrl_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginCtrl_logout5_invoker = createInvoker(
    LoginCtrl_5.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_usersPage6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usersPage")))
  )
  private[this] lazy val controllers_HomeController_usersPage6_invoker = createInvoker(
    HomeController_3.usersPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "usersPage",
      Nil,
      "GET",
      this.prefix + """usersPage""",
      """ Register form""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_addUser7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val controllers_HomeController_addUser7_invoker = createInvoker(
    HomeController_3.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUser",
      Nil,
      "GET",
      this.prefix + """addUser""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_deleteUser8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delUser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteUser8_invoker = createInvoker(
    HomeController_3.deleteUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteUser",
      Seq(classOf[String]),
      "GET",
      this.prefix + """delUser/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_addUserSubmit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_addUserSubmit9_invoker = createInvoker(
    HomeController_3.addUserSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUserSubmit",
      Nil,
      "POST",
      this.prefix + """addUserSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_updateUser10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateUser10_invoker = createInvoker(
    HomeController_3.updateUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateUser",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateUser/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_updateUserSubmit11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUserSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateUserSubmit11_invoker = createInvoker(
    HomeController_3.updateUserSubmit(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateUserSubmit",
      Seq(classOf[String]),
      "POST",
      this.prefix + """updateUserSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_updateCustomer12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateCustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateCustomer12_invoker = createInvoker(
    HomeController_3.updateCustomer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateCustomer",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateCustomer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_updateCustomerSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateCustomerSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateCustomerSubmit13_invoker = createInvoker(
    HomeController_3.updateCustomerSubmit(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateCustomerSubmit",
      Seq(classOf[String]),
      "POST",
      this.prefix + """updateCustomerSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ShoppingCtrl_showBasket14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket14_invoker = createInvoker(
    ShoppingCtrl_4.showBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Nil,
      "GET",
      this.prefix + """showBasket""",
      """ Shopping""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ShoppingCtrl_addToBasket15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket15_invoker = createInvoker(
    ShoppingCtrl_4.addToBasket(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ShoppingCtrl_addOne16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne16_invoker = createInvoker(
    ShoppingCtrl_4.addOne(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ShoppingCtrl_removeOne17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne17_invoker = createInvoker(
    ShoppingCtrl_4.removeOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket18_invoker = createInvoker(
    ShoppingCtrl_4.emptyBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Nil,
      "GET",
      this.prefix + """emptyBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ShoppingCtrl_placeOrder19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder19_invoker = createInvoker(
    ShoppingCtrl_4.placeOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Nil,
      "GET",
      this.prefix + """placeOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ShoppingCtrl_viewOrder20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder20_invoker = createInvoker(
    ShoppingCtrl_4.viewOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ShoppingCtrl_viewOrders21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrders")))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrders21_invoker = createInvoker(
    ShoppingCtrl_4.viewOrders,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrders",
      Nil,
      "GET",
      this.prefix + """viewOrders""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_ShoppingCtrl_cancelOrder22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancelOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_cancelOrder22_invoker = createInvoker(
    ShoppingCtrl_4.cancelOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "cancelOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cancelOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_PaymentCtrl_payment23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_PaymentCtrl_payment23_invoker = createInvoker(
    PaymentCtrl_2.payment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentCtrl",
      "payment",
      Nil,
      "GET",
      this.prefix + """payment""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_PaymentCtrl_paymentSubmit24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paymentSubmit")))
  )
  private[this] lazy val controllers_PaymentCtrl_paymentSubmit24_invoker = createInvoker(
    PaymentCtrl_2.paymentSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentCtrl",
      "paymentSubmit",
      Nil,
      "POST",
      this.prefix + """paymentSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_HomeController_myAccount25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myaccount")))
  )
  private[this] lazy val controllers_HomeController_myAccount25_invoker = createInvoker(
    HomeController_3.myAccount,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "myAccount",
      Nil,
      "GET",
      this.prefix + """myaccount""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_BookCtrl_showWishlist26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wishlist")))
  )
  private[this] lazy val controllers_BookCtrl_showWishlist26_invoker = createInvoker(
    BookCtrl_0.showWishlist(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookCtrl",
      "showWishlist",
      Nil,
      "GET",
      this.prefix + """wishlist""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_BookCtrl_addToWishlist27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToWishlist/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookCtrl_addToWishlist27_invoker = createInvoker(
    BookCtrl_0.addToWishlist(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookCtrl",
      "addToWishlist",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToWishlist/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_BookCtrl_removeFromWishlist28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeFromWishlist/id")))
  )
  private[this] lazy val controllers_BookCtrl_removeFromWishlist28_invoker = createInvoker(
    BookCtrl_0.removeFromWishlist(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookCtrl",
      "removeFromWishlist",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """removeFromWishlist/id""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_ProcessPayCtrl_processpay29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("processpay")))
  )
  private[this] lazy val controllers_ProcessPayCtrl_processpay29_invoker = createInvoker(
    ProcessPayCtrl_7.processpay,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProcessPayCtrl",
      "processpay",
      Nil,
      "GET",
      this.prefix + """processpay""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_ProcessPayCtrl_processpaySubmit30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("processpaySubmit")))
  )
  private[this] lazy val controllers_ProcessPayCtrl_processpaySubmit30_invoker = createInvoker(
    ProcessPayCtrl_7.processpaySubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProcessPayCtrl",
      "processpaySubmit",
      Nil,
      "POST",
      this.prefix + """processpaySubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_AdminBookCtrl_addBook31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addBook")))
  )
  private[this] lazy val controllers_AdminBookCtrl_addBook31_invoker = createInvoker(
    AdminBookCtrl_1.addBook(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminBookCtrl",
      "addBook",
      Nil,
      "GET",
      this.prefix + """Admin/addBook""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_AdminBookCtrl_addBookSubmit32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addBookSubmit")))
  )
  private[this] lazy val controllers_AdminBookCtrl_addBookSubmit32_invoker = createInvoker(
    AdminBookCtrl_1.addBookSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminBookCtrl",
      "addBookSubmit",
      Nil,
      "POST",
      this.prefix + """Admin/addBookSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_AdminBookCtrl_updateBook33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateBook/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminBookCtrl_updateBook33_invoker = createInvoker(
    AdminBookCtrl_1.updateBook(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminBookCtrl",
      "updateBook",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/updateBook/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_AdminBookCtrl_updateBookSubmit34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateBookSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminBookCtrl_updateBookSubmit34_invoker = createInvoker(
    AdminBookCtrl_1.updateBookSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminBookCtrl",
      "updateBookSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """Admin/updateBookSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_AdminBookCtrl_deleteBook35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/deleteBook/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminBookCtrl_deleteBook35_invoker = createInvoker(
    AdminBookCtrl_1.deleteBook(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminBookCtrl",
      "deleteBook",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """Admin/deleteBook/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Assets_versioned36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned36_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_BookCtrl_index0_route(params@_) =>
      call { 
        controllers_BookCtrl_index0_invoker.call(BookCtrl_0.index())
      }
  
    // @LINE:10
    case controllers_BookCtrl_listBooks1_route(params@_) =>
      call(params.fromQuery[Long]("gen", Some(0)), params.fromQuery[String]("filter", Some(""))) { (gen, filter) =>
        controllers_BookCtrl_listBooks1_invoker.call(BookCtrl_0.listBooks(gen, filter))
      }
  
    // @LINE:11
    case controllers_BookCtrl_bookDetails2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookCtrl_bookDetails2_invoker.call(BookCtrl_0.bookDetails(id))
      }
  
    // @LINE:14
    case controllers_security_LoginCtrl_login3_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_login3_invoker.call(LoginCtrl_5.login())
      }
  
    // @LINE:15
    case controllers_security_LoginCtrl_loginSubmit4_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_loginSubmit4_invoker.call(LoginCtrl_5.loginSubmit())
      }
  
    // @LINE:16
    case controllers_security_LoginCtrl_logout5_route(params@_) =>
      call { 
        controllers_security_LoginCtrl_logout5_invoker.call(LoginCtrl_5.logout())
      }
  
    // @LINE:19
    case controllers_HomeController_usersPage6_route(params@_) =>
      call { 
        controllers_HomeController_usersPage6_invoker.call(HomeController_3.usersPage)
      }
  
    // @LINE:20
    case controllers_HomeController_addUser7_route(params@_) =>
      call { 
        controllers_HomeController_addUser7_invoker.call(HomeController_3.addUser)
      }
  
    // @LINE:21
    case controllers_HomeController_deleteUser8_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteUser8_invoker.call(HomeController_3.deleteUser(id))
      }
  
    // @LINE:22
    case controllers_HomeController_addUserSubmit9_route(params@_) =>
      call { 
        controllers_HomeController_addUserSubmit9_invoker.call(HomeController_3.addUserSubmit)
      }
  
    // @LINE:23
    case controllers_HomeController_updateUser10_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateUser10_invoker.call(HomeController_3.updateUser(id))
      }
  
    // @LINE:24
    case controllers_HomeController_updateUserSubmit11_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateUserSubmit11_invoker.call(HomeController_3.updateUserSubmit(id))
      }
  
    // @LINE:25
    case controllers_HomeController_updateCustomer12_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateCustomer12_invoker.call(HomeController_3.updateCustomer(id))
      }
  
    // @LINE:26
    case controllers_HomeController_updateCustomerSubmit13_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateCustomerSubmit13_invoker.call(HomeController_3.updateCustomerSubmit(id))
      }
  
    // @LINE:29
    case controllers_ShoppingCtrl_showBasket14_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_showBasket14_invoker.call(ShoppingCtrl_4.showBasket())
      }
  
    // @LINE:30
    case controllers_ShoppingCtrl_addToBasket15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket15_invoker.call(ShoppingCtrl_4.addToBasket(id))
      }
  
    // @LINE:31
    case controllers_ShoppingCtrl_addOne16_route(params@_) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("pid", None)) { (itemId, pid) =>
        controllers_ShoppingCtrl_addOne16_invoker.call(ShoppingCtrl_4.addOne(itemId, pid))
      }
  
    // @LINE:32
    case controllers_ShoppingCtrl_removeOne17_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne17_invoker.call(ShoppingCtrl_4.removeOne(itemId))
      }
  
    // @LINE:33
    case controllers_ShoppingCtrl_emptyBasket18_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket18_invoker.call(ShoppingCtrl_4.emptyBasket())
      }
  
    // @LINE:34
    case controllers_ShoppingCtrl_placeOrder19_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_placeOrder19_invoker.call(ShoppingCtrl_4.placeOrder())
      }
  
    // @LINE:35
    case controllers_ShoppingCtrl_viewOrder20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder20_invoker.call(ShoppingCtrl_4.viewOrder(id))
      }
  
    // @LINE:36
    case controllers_ShoppingCtrl_viewOrders21_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_viewOrders21_invoker.call(ShoppingCtrl_4.viewOrders)
      }
  
    // @LINE:37
    case controllers_ShoppingCtrl_cancelOrder22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_cancelOrder22_invoker.call(ShoppingCtrl_4.cancelOrder(id))
      }
  
    // @LINE:38
    case controllers_PaymentCtrl_payment23_route(params@_) =>
      call { 
        controllers_PaymentCtrl_payment23_invoker.call(PaymentCtrl_2.payment)
      }
  
    // @LINE:39
    case controllers_PaymentCtrl_paymentSubmit24_route(params@_) =>
      call { 
        controllers_PaymentCtrl_paymentSubmit24_invoker.call(PaymentCtrl_2.paymentSubmit)
      }
  
    // @LINE:41
    case controllers_HomeController_myAccount25_route(params@_) =>
      call { 
        controllers_HomeController_myAccount25_invoker.call(HomeController_3.myAccount)
      }
  
    // @LINE:42
    case controllers_BookCtrl_showWishlist26_route(params@_) =>
      call { 
        controllers_BookCtrl_showWishlist26_invoker.call(BookCtrl_0.showWishlist())
      }
  
    // @LINE:43
    case controllers_BookCtrl_addToWishlist27_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookCtrl_addToWishlist27_invoker.call(BookCtrl_0.addToWishlist(id))
      }
  
    // @LINE:44
    case controllers_BookCtrl_removeFromWishlist28_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_BookCtrl_removeFromWishlist28_invoker.call(BookCtrl_0.removeFromWishlist(id))
      }
  
    // @LINE:46
    case controllers_ProcessPayCtrl_processpay29_route(params@_) =>
      call { 
        controllers_ProcessPayCtrl_processpay29_invoker.call(ProcessPayCtrl_7.processpay)
      }
  
    // @LINE:47
    case controllers_ProcessPayCtrl_processpaySubmit30_route(params@_) =>
      call { 
        controllers_ProcessPayCtrl_processpaySubmit30_invoker.call(ProcessPayCtrl_7.processpaySubmit)
      }
  
    // @LINE:51
    case controllers_AdminBookCtrl_addBook31_route(params@_) =>
      call { 
        controllers_AdminBookCtrl_addBook31_invoker.call(AdminBookCtrl_1.addBook())
      }
  
    // @LINE:52
    case controllers_AdminBookCtrl_addBookSubmit32_route(params@_) =>
      call { 
        controllers_AdminBookCtrl_addBookSubmit32_invoker.call(AdminBookCtrl_1.addBookSubmit())
      }
  
    // @LINE:54
    case controllers_AdminBookCtrl_updateBook33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminBookCtrl_updateBook33_invoker.call(AdminBookCtrl_1.updateBook(id))
      }
  
    // @LINE:55
    case controllers_AdminBookCtrl_updateBookSubmit34_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminBookCtrl_updateBookSubmit34_invoker.call(AdminBookCtrl_1.updateBookSubmit(id))
      }
  
    // @LINE:57
    case controllers_AdminBookCtrl_deleteBook35_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminBookCtrl_deleteBook35_invoker.call(AdminBookCtrl_1.deleteBook(id))
      }
  
    // @LINE:60
    case controllers_Assets_versioned36_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned36_invoker.call(Assets_6.versioned(path, file))
      }
  }
}
