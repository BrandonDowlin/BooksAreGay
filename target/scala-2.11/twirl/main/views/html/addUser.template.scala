
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

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add User",user)/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""
    """),format.raw/*5.5*/("""<p class="lead">Join Us</p>
    <div class="col-xs-5">

    """),_display_(/*8.6*/form(action=routes.HomeController.addUserSubmit(), 
    'class -> "form-horizontal")/*9.33*/{_display_(Seq[Any](format.raw/*9.34*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""
        """),_display_(/*12.10*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.82*/("""
        """),_display_(/*13.10*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*13.84*/("""

        """),_display_(/*15.10*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*15.94*/("""
        
        """),format.raw/*17.9*/("""<div class="actions">
            <input type="submit" value="Add User" class="btn btn-primary">
            <a href=""""),_display_(/*19.23*/routes/*19.29*/.HomeController.usersPage()),format.raw/*19.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*23.6*/("""
"""),format.raw/*24.1*/("""</div>
""")))}))
      }
    }
  }

  def render(userForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/addUser.scala.html
                  HASH: 3483763237496feff38cd62237cfdf88e2ac264c
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1246->102|1285->104|1316->109|1402->170|1494->254|1532->255|1569->292|1606->302|1619->306|1650->316|1687->326|1780->398|1817->408|1912->482|1950->493|2055->577|2100->595|2246->714|2261->720|2309->747|2457->865|2485->866
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|40->8|41->9|41->9|42->10|43->11|43->11|43->11|44->12|44->12|45->13|45->13|47->15|47->15|49->17|51->19|51->19|51->19|55->23|56->24
                  -- GENERATED --
              */
          