
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

object wishlist extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.books._


Seq[Any](format.raw/*1.62*/("""


"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Wishlist", customer)/*8.28*/ {_display_(Seq[Any](format.raw/*8.30*/("""
    """),format.raw/*9.5*/("""<div class="row">

        <div class="col-md-12">
            """),_display_(/*12.14*/if(flash.containsKey("success"))/*12.46*/ {_display_(Seq[Any](format.raw/*12.48*/("""
                """),format.raw/*13.17*/("""<div class="alert alert-success">
                    """),_display_(/*14.22*/flash/*14.27*/.get("success")),format.raw/*14.42*/("""
                """),format.raw/*15.17*/("""</div>
            """)))}),format.raw/*16.14*/("""
        """),format.raw/*17.9*/("""</div>
    </div>
    <div class="col-sm-3"></div>
    <div class="col-sm-6">
        <h2>My Wishlist</h2>

        """),_display_(/*23.10*/for(b<-customer.getWishlist.getWishlistItems) yield /*23.55*/ {_display_(Seq[Any](format.raw/*23.57*/("""
            """),format.raw/*24.13*/("""<div id="book-group">
            """),_display_(/*25.14*/if(env.resource("public/images/bookImages/thumbnails/" + b.getId + ".jpg").isDefined)/*25.99*/ {_display_(Seq[Any](format.raw/*25.101*/("""
              """),format.raw/*26.15*/("""<td><img src="/assets/images/bookImages/thumbnails/"""),_display_(/*26.67*/(b.getId + ".jpg")),format.raw/*26.85*/(""""/></td>
          """)))}/*27.13*/else/*27.18*/{_display_(Seq[Any](format.raw/*27.19*/("""
              """),format.raw/*28.15*/("""<td><img src="/assets/images/bookImages/thumbnails/noImage.jpg"/></td>
          """)))}),format.raw/*29.12*/("""
          """),format.raw/*30.11*/("""<h4 id="bookName">"""),_display_(/*30.30*/b/*30.31*/.getTitle),format.raw/*30.40*/("""</h4>
          <p>
            by """),_display_(/*32.17*/b/*32.18*/.getAuthor.getFname),format.raw/*32.37*/(""" """),_display_(/*32.39*/b/*32.40*/.getAuthor.getLname),format.raw/*32.59*/("""
          """),format.raw/*33.11*/("""</p>
          <h5 id="price">€"""),_display_(/*34.28*/("%.2f".format(b.getPrice))),format.raw/*34.55*/("""</h5>
          <a href=""""),_display_(/*35.21*/routes/*35.27*/.ShoppingCtrl.addToBasket(b.getId)),format.raw/*35.61*/(""""  class="btn btn-sm btn-primary">Add to basket</a>
          <a href=""""),_display_(/*36.21*/routes/*36.27*/.BookCtrl.removeFromWishlist(b.getId)),format.raw/*36.64*/(""""  class="btn btn-sm btn-danger">Remove from wishlist</a>

           
         </div>
        """)))}),format.raw/*40.10*/("""

    """),format.raw/*42.5*/("""</div>
    <div class="col-sm-3"></div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(customer,env)

  def f:((models.users.Customer,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (customer,env) => apply(customer,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/wishlist.scala.html
                  HASH: a8726755f613835c63576c3865d8105113e98d9a
                  MATRIX: 987->1|1120->65|1156->95|1188->121|1239->61|1268->143|1295->145|1329->171|1368->173|1399->178|1490->242|1531->274|1571->276|1616->293|1698->348|1712->353|1748->368|1793->385|1844->405|1880->414|2024->531|2085->576|2125->578|2166->591|2228->626|2322->711|2363->713|2406->728|2485->780|2524->798|2563->819|2576->824|2615->825|2658->840|2771->922|2810->933|2856->952|2866->953|2896->962|2959->998|2969->999|3009->1018|3038->1020|3048->1021|3088->1040|3127->1051|3186->1083|3234->1110|3287->1136|3302->1142|3357->1176|3456->1248|3471->1254|3529->1291|3656->1387|3689->1393
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|40->8|40->8|41->9|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|49->17|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|61->29|62->30|62->30|62->30|62->30|64->32|64->32|64->32|64->32|64->32|64->32|65->33|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|72->40|74->42
                  -- GENERATED --
              */
          