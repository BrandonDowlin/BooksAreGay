
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

object updateUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String, updateUserForm: Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.80*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update User",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Update User</p>
    <div class="col-xs-5">
    """),_display_(/*7.6*/form(action=routes.HomeController.updateUserSubmit(id), 
    'class -> "form-horizontal")/*8.33*/{_display_(Seq[Any](format.raw/*8.34*/("""
        """),format.raw/*9.37*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""

        """),_display_(/*12.10*/inputText(updateUserForm("name"), '_label -> "Username", 'class -> "form-control")),format.raw/*12.92*/("""
        """),_display_(/*13.10*/inputText(updateUserForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*13.90*/("""

        """),_display_(/*15.10*/inputPassword(updateUserForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*15.100*/("""
            """)))}),format.raw/*16.14*/("""
        """)))}),format.raw/*17.10*/("""
        
        
        """),format.raw/*20.9*/("""<div class="actions">
            <input type="submit" value="Update User" class="btn btn-primary">
            <a href=""""),_display_(/*22.23*/routes/*22.29*/.HomeController.usersPage()),format.raw/*22.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
</div>
"""))
      }
    }
  }

  def render(id:String,updateUserForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateUserForm,user)

  def f:((String,Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateUserForm,user) => apply(id,updateUserForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/updateUser.scala.html
                  HASH: 6de4cdc8e957818b5993bf2bcd303425fcc1c030
                  MATRIX: 995->1|1146->81|1191->79|1218->97|1245->99|1277->123|1316->125|1347->130|1436->194|1533->283|1571->284|1607->321|1644->331|1657->335|1688->345|1726->356|1829->438|1866->448|1967->528|2005->539|2117->629|2162->643|2203->653|2257->680|2406->802|2421->808|2469->835
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|40->8|40->8|41->9|42->10|42->10|42->10|44->12|44->12|45->13|45->13|47->15|47->15|48->16|49->17|52->20|54->22|54->22|54->22
                  -- GENERATED --
              */
          