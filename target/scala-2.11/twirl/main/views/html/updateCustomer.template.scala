
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

object updateCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String, updateCustomerForm: Form[models.users.Customer], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.88*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update Customer",user)/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<p class="lead">Update Customer</p>
    <div class="col-xs-5">
    """),_display_(/*7.6*/form(action=routes.HomeController.updateCustomerSubmit(id), 
    'class -> "form-horizontal")/*8.33*/{_display_(Seq[Any](format.raw/*8.34*/("""
        """),format.raw/*9.37*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""

        """),_display_(/*12.10*/inputText(updateCustomerForm("name"), '_label -> "Username", 'class -> "form-control")),format.raw/*12.96*/("""
        """),_display_(/*13.10*/inputText(updateCustomerForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*13.94*/("""
        """),_display_(/*14.10*/inputText(updateCustomerForm("street1"), '_label -> "Address", 'class -> "form-control")),format.raw/*14.98*/("""
        """),_display_(/*15.10*/inputText(updateCustomerForm("street2"), '_label -> "Town", 'class -> "form-control")),format.raw/*15.95*/("""
        """),_display_(/*16.10*/inputText(updateCustomerForm("town"), '_label -> "Country", 'class -> "form-control")),format.raw/*16.95*/("""
        """),_display_(/*17.10*/inputText(updateCustomerForm("postCode"), '_label -> "Post Code", 'class -> "form-control")),format.raw/*17.101*/("""

        """),_display_(/*19.10*/inputPassword(updateCustomerForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*19.104*/("""

        """),format.raw/*21.9*/("""<div class="actions">
                <input type="submit" value="Update details" class="btn btn-primary">
                <a href=""""),_display_(/*23.27*/routes/*23.33*/.HomeController.myAccount()),format.raw/*23.60*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
            """)))}),format.raw/*27.14*/("""
        """)))}),format.raw/*28.10*/("""
        
        
        
"""),format.raw/*32.1*/("""</div>
"""))
      }
    }
  }

  def render(id:String,updateCustomerForm:Form[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateCustomerForm,user)

  def f:((String,Form[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateCustomerForm,user) => apply(id,updateCustomerForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/updateCustomer.scala.html
                  HASH: 4a8ada43cc49157e1c47e9668c694afcdc75929a
                  MATRIX: 1003->1|1162->89|1207->87|1234->105|1261->107|1297->135|1336->137|1367->142|1460->210|1561->303|1599->304|1635->341|1672->351|1685->355|1716->365|1754->376|1861->462|1898->472|2003->556|2040->566|2149->654|2186->664|2292->749|2329->759|2435->844|2472->854|2585->945|2623->956|2739->1050|2776->1060|2936->1193|2951->1199|2999->1226|3168->1364|3209->1374|3264->1402
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|40->8|40->8|41->9|42->10|42->10|42->10|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|51->19|51->19|53->21|55->23|55->23|55->23|59->27|60->28|64->32
                  -- GENERATED --
              */
          