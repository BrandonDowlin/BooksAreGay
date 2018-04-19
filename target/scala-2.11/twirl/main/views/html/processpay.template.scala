
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
/*2.2*/import models.users.ProcessPay

object processpay extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.ProcessPay],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(processpayForm: Form[models.users.ProcessPay], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.74*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("ProcessPay", user)/*6.26*/ {_display_(Seq[Any](format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""<p class="lead">ProcessPayment</p>
    <div class="col-xs-5">
        <h3>Process Payment</h3>
        """),_display_(/*10.10*/if(processpayForm.hasGlobalErrors)/*10.44*/ {_display_(Seq[Any](format.raw/*10.46*/("""
            """),format.raw/*11.13*/("""<p class="alert alert-warning">
                """),_display_(/*12.18*/processpayForm/*12.32*/.globalError.message),format.raw/*12.52*/(""";
            </p>
        """)))}),format.raw/*14.10*/("""
        """),_display_(/*15.10*/if(flash.containsKey("error"))/*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
            """),format.raw/*16.13*/("""<p class="alert alert-warning">
                """),_display_(/*17.18*/flash/*17.23*/.get("paymentRequired")),format.raw/*17.46*/("""
            """),format.raw/*18.13*/("""</p>
        """)))}),format.raw/*19.10*/("""


        """),_display_(/*22.10*/helper/*22.16*/.form(action = controllers.routes.ProcessPayCtrl.processpaySubmit())/*22.84*/ {_display_(Seq[Any](format.raw/*22.86*/("""
            """),_display_(/*23.14*/CSRF/*23.18*/.formField),format.raw/*23.28*/("""

            """),format.raw/*25.13*/("""<div class="form-group">
                """),_display_(/*26.18*/inputText(processpayForm("cardholderName"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Name on Card")),format.raw/*27.83*/("""
            """),format.raw/*28.13*/("""</div>
            <div class="form-group">
                """),_display_(/*30.18*/inputText(processpayForm("cardNo"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Card Number")),format.raw/*31.82*/("""
            """),format.raw/*32.13*/("""</div>
            <div class="form-group">
                """),_display_(/*34.18*/inputText(processpayForm("date"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Expiry Date")),format.raw/*35.82*/("""
            """),format.raw/*36.13*/("""</div>
            <div class="form-group">
                """),_display_(/*38.18*/inputText(processpayForm("cCVNum"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "CCV Number")),format.raw/*39.81*/("""
            """),format.raw/*40.13*/("""</div>
            <div class="form-group">
                """),_display_(/*42.18*/inputText(processpayForm("cardType"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Card Type")),format.raw/*43.80*/("""
            """),format.raw/*44.13*/("""</div>
            

            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*49.31*/routes/*49.37*/.ShoppingCtrl.placeOrder()),format.raw/*49.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                    
                </p>
            </div>
        """)))}),format.raw/*54.10*/("""
    """),format.raw/*55.5*/("""</div>
""")))}))
      }
    }
  }

  def render(processpayForm:Form[models.users.ProcessPay],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(processpayForm,user)

  def f:((Form[models.users.ProcessPay],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (processpayForm,user) => apply(processpayForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/processpay.scala.html
                  HASH: f1b61ef73f054b3333132175cca3a4c9710f3f75
                  MATRIX: 651->1|683->27|1064->59|1209->133|1254->131|1281->149|1308->151|1340->175|1379->177|1410->182|1541->286|1584->320|1624->322|1665->335|1741->384|1764->398|1805->418|1864->446|1901->456|1940->486|1980->488|2021->501|2097->550|2111->555|2155->578|2196->591|2241->605|2280->617|2295->623|2372->691|2412->693|2453->707|2466->711|2497->721|2539->735|2608->777|2771->919|2812->932|2900->993|3054->1126|3095->1139|3183->1200|3335->1331|3376->1344|3464->1405|3617->1537|3658->1550|3746->1611|3900->1744|3941->1757|4093->1882|4108->1888|4155->1914|4373->2101|4405->2106
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|38->6|38->6|39->7|42->10|42->10|42->10|43->11|44->12|44->12|44->12|46->14|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|54->22|54->22|54->22|54->22|55->23|55->23|55->23|57->25|58->26|59->27|60->28|62->30|63->31|64->32|66->34|67->35|68->36|70->38|71->39|72->40|74->42|75->43|76->44|81->49|81->49|81->49|86->54|87->55
                  -- GENERATED --
              */
          