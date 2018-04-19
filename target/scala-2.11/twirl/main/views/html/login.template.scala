
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
/*2.2*/import models.users.Login

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Login],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(loginForm: Form[Login], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.38*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Login", user)/*6.21*/ {_display_(Seq[Any](format.raw/*6.23*/("""
    """),format.raw/*7.5*/("""<p class="lead">Book Catalogue</p>
    <div class="col-xs-5">
        <h3>Sign in</h3>
        """),_display_(/*10.10*/if(loginForm.hasGlobalErrors)/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
            """),format.raw/*11.13*/("""<p class="alert alert-warning">
                """),_display_(/*12.18*/loginForm/*12.27*/.globalError.message),format.raw/*12.47*/(""";
            </p>
        """)))}),format.raw/*14.10*/("""

        """),_display_(/*16.10*/if(flash.containsKey("success"))/*16.42*/ {_display_(Seq[Any](format.raw/*16.44*/("""
            """),format.raw/*17.13*/("""<div class="alert alert-success">
              """),_display_(/*18.16*/flash/*18.21*/.get("success")),format.raw/*18.36*/("""
            """),format.raw/*19.13*/("""</div>
          """)))}),format.raw/*20.12*/("""

        """),_display_(/*22.10*/helper/*22.16*/.form(controllers.security.routes.LoginCtrl.loginSubmit())/*22.74*/ {_display_(Seq[Any](format.raw/*22.76*/("""
            """),_display_(/*23.14*/CSRF/*23.18*/.formField),format.raw/*23.28*/("""

            """),format.raw/*25.13*/("""<div class="form-group">
                """),_display_(/*26.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*27.76*/("""
            """),format.raw/*28.13*/("""</div>
            <div class="form-group">
                """),_display_(/*30.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*31.79*/("""
            """),format.raw/*32.13*/("""</div>
            <div class="form-group">
                    <label>Don't have an account? <a href=""""),_display_(/*34.61*/routes/*34.67*/.HomeController.addUser()),format.raw/*34.92*/("""">Join us</a></label><br>
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*37.10*/("""
    """),format.raw/*38.5*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[Login],user:User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[Login],User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/login.scala.html
                  HASH: 8664727958f6bb9092600fbed7f1a724808beaf0
                  MATRIX: 651->1|683->27|1023->54|1132->92|1177->90|1204->108|1231->110|1258->129|1297->131|1328->136|1451->232|1489->261|1529->263|1570->276|1646->325|1664->334|1705->354|1764->382|1802->393|1843->425|1883->427|1924->440|2000->489|2014->494|2050->509|2091->522|2140->540|2178->551|2193->557|2260->615|2300->617|2341->631|2354->635|2385->645|2427->659|2496->701|2638->822|2679->835|2767->896|2919->1027|2960->1040|3091->1144|3106->1150|3152->1175|3315->1307|3347->1312
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|38->6|38->6|39->7|42->10|42->10|42->10|43->11|44->12|44->12|44->12|46->14|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|54->22|54->22|54->22|54->22|55->23|55->23|55->23|57->25|58->26|59->27|60->28|62->30|63->31|64->32|66->34|66->34|66->34|69->37|70->38
                  -- GENERATED --
              */
          