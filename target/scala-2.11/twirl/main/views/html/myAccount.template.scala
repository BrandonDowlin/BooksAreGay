
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

object myAccount extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(u: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.24*/("""

"""),_display_(/*4.2*/main("My Account",u)/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
    """),format.raw/*5.5*/("""<div class="col-sm-2"></div>
    <div class="col-sm-3">
        <h2>My Account</h2>
<div id="details">
<h4><b>Details</b></h4>
"""),_display_(/*10.2*/if(u != null)/*10.15*/ {_display_(Seq[Any](format.raw/*10.17*/("""
    """),format.raw/*11.5*/("""<p>
    <b>Name:</b> """),_display_(/*12.19*/u/*12.20*/.getName),format.raw/*12.28*/(""" """),format.raw/*12.29*/("""<br>
    <b>Email:</b> """),_display_(/*13.20*/u/*13.21*/.getEmail),format.raw/*13.30*/(""" """),format.raw/*13.31*/("""<br>
    <a href=""""),_display_(/*14.15*/routes/*14.21*/.HomeController.updateCustomer(u.getEmail)),format.raw/*14.63*/("""">Edit your details</a>
    </p>
    """)))}),format.raw/*16.6*/("""
    """),format.raw/*17.5*/("""</div>
    </div>
    <div class="col-sm-2"></div>
    <div class="col-sm-3">
    <div id="order">
        <!-- <h4><b>Order</b></h4>
        <p><b><a href=""""),_display_(/*23.25*/controllers/*23.36*/.routes.ShoppingCtrl.viewOrders()),format.raw/*23.69*/("""">View Orders</a> --> <br> 
            <br><br><h4><b>Order</b></h4>
                    <a href="/viewOrders">View Orders</a><br>    
    </div>
</div>
</div>
    <div class="col-sm-3"></div>
""")))}))
      }
    }
  }

  def render(u:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(u)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (u) => apply(u)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/myAccount.scala.html
                  HASH: e38f39e754b8a2c5edaaf7485e4cca9bc6ccf72a
                  MATRIX: 651->1|995->27|1112->49|1140->52|1168->72|1207->74|1238->79|1392->207|1414->220|1454->222|1486->227|1535->249|1545->250|1574->258|1603->259|1654->283|1664->284|1694->293|1723->294|1769->313|1784->319|1847->361|1915->399|1947->404|2132->562|2152->573|2206->606
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|42->10|42->10|42->10|43->11|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|46->14|46->14|46->14|48->16|49->17|55->23|55->23|55->23
                  -- GENERATED --
              */
          