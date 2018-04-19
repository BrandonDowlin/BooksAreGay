
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import models.users.User
/*2.2*/import models.users.Payment

object payment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Payment],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(paymentForm: Form[models.users.Payment], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.68*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Payment", user)/*6.23*/ {_display_(Seq[Any](format.raw/*6.25*/("""
    """),format.raw/*7.5*/("""<p class="lead">Payment</p>
    <div class="col-xs-5">
        <h3>Process Payment</h3>
        """),_display_(/*10.10*/if(paymentForm.hasGlobalErrors)/*10.41*/ {_display_(Seq[Any](format.raw/*10.43*/("""
            """),format.raw/*11.13*/("""<p class="alert alert-warning">
                """),_display_(/*12.18*/paymentForm/*12.29*/.globalError.message),format.raw/*12.49*/(""";
            </p>
        """)))}),format.raw/*14.10*/("""
        """),_display_(/*15.10*/if(flash.containsKey("error"))/*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
            """),format.raw/*16.13*/("""<p class="alert alert-warning">
                """),_display_(/*17.18*/flash/*17.23*/.get("paymentRequired")),format.raw/*17.46*/("""
            """),format.raw/*18.13*/("""</p>
        """)))}),format.raw/*19.10*/("""


        """),_display_(/*22.10*/helper/*22.16*/.form(action = controllers.routes.PaymentCtrl.paymentSubmit())/*22.78*/ {_display_(Seq[Any](format.raw/*22.80*/("""
            """),_display_(/*23.14*/CSRF/*23.18*/.formField),format.raw/*23.28*/("""

            """),format.raw/*25.13*/("""<div class="form-group">
                """),_display_(/*26.18*/inputText(paymentForm("firstName"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "First Name")),format.raw/*27.81*/("""
            """),format.raw/*28.13*/("""</div>
            <div class="form-group">
                """),_display_(/*30.18*/inputText(paymentForm("lastName"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Last Name")),format.raw/*31.80*/("""
            """),format.raw/*32.13*/("""</div>
            <div class="form-group">
                """),_display_(/*34.18*/inputText(paymentForm("addL1"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Address Line 1")),format.raw/*35.85*/("""
            """),format.raw/*36.13*/("""</div>
            <div class="form-group">
                """),_display_(/*38.18*/inputText(paymentForm("addL2"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Address Line 2")),format.raw/*39.85*/("""
            """),format.raw/*40.13*/("""</div>
            <div class="form-group">
                """),_display_(/*42.18*/inputText(paymentForm("city"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "City")),format.raw/*43.75*/("""
            """),format.raw/*44.13*/("""</div>
            <div class="form-group">
                """),_display_(/*46.18*/inputText(paymentForm("county"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "County")),format.raw/*47.77*/("""
            """),format.raw/*48.13*/("""</div>
            <div class="form-group">
                """),_display_(/*50.18*/inputText(paymentForm("zipCode"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Zip Code")),format.raw/*51.79*/("""
            """),format.raw/*52.13*/("""</div>
            <div class="form-group">
                """),_display_(/*54.18*/inputText(paymentForm("country"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Country")),format.raw/*55.78*/("""
            """),format.raw/*56.13*/("""</div>

            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*60.31*/routes/*60.37*/.ProcessPayCtrl.processpay()),format.raw/*60.65*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                    
                </p>
            </div>
        """)))}),format.raw/*65.10*/("""
        """),format.raw/*66.9*/("""<form action=""""),_display_(/*66.24*/routes/*66.30*/.ShoppingCtrl.placeOrder()),format.raw/*66.56*/("""">
            <script
              src="https://checkout.stripe.com/checkout.js" class="stripe-button"
              data-key="pk_test_PoB5mTsoOUvBptkhXhJX6KG4"
              data-amount="order.getOrderTotal"
              data-name="Bookish Universe"
              data-description="Payment Details"
              data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
              data-locale="auto"
              data-currency="eur">
            </script>
          </form>

          <div class="col-md-6">
            <p class="text-right">
                <a href=""""),_display_(/*81.27*/routes/*81.33*/.ShoppingCtrl.placeOrder()),format.raw/*81.59*/("""" class="btn btn-success btn-sm">
                <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                
            </p>
        </div>
    </div>
    
    
""")))}))
      }
    }
  }

  def render(paymentForm:Form[models.users.Payment],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(paymentForm,user)

  def f:((Form[models.users.Payment],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (paymentForm,user) => apply(paymentForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/payment.scala.html
                  HASH: 8ff501290be41ee6bb6de8ce7566ec3274996a99
                  MATRIX: 651->1|683->27|1055->56|1194->124|1239->122|1266->140|1293->142|1322->163|1361->165|1392->170|1516->267|1556->298|1596->300|1637->313|1713->362|1733->373|1774->393|1833->421|1870->431|1909->461|1949->463|1990->476|2066->525|2080->530|2124->553|2165->566|2210->580|2249->592|2264->598|2335->660|2375->662|2416->676|2429->680|2460->690|2502->704|2571->746|2724->878|2765->891|2853->952|3004->1082|3045->1095|3133->1156|3286->1288|3327->1301|3415->1362|3568->1494|3609->1507|3697->1568|3839->1689|3880->1702|3968->1763|4114->1888|4155->1901|4243->1962|4392->2090|4433->2103|4521->2164|4669->2291|4710->2304|4849->2416|4864->2422|4913->2450|5131->2637|5167->2646|5209->2661|5224->2667|5271->2693|5893->3288|5908->3294|5955->3320
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|38->6|38->6|39->7|42->10|42->10|42->10|43->11|44->12|44->12|44->12|46->14|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|54->22|54->22|54->22|54->22|55->23|55->23|55->23|57->25|58->26|59->27|60->28|62->30|63->31|64->32|66->34|67->35|68->36|70->38|71->39|72->40|74->42|75->43|76->44|78->46|79->47|80->48|82->50|83->51|84->52|86->54|87->55|88->56|92->60|92->60|92->60|97->65|98->66|98->66|98->66|98->66|113->81|113->81|113->81
                  -- GENERATED --
              */
          