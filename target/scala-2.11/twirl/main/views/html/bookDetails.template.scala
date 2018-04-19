
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
/*1.2*/import models.books.Genre
/*2.2*/import models.books.Book
/*3.2*/import models.users.User

object bookDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Book,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(b: Book,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.48*/("""


"""),_display_(/*7.2*/main("Book", user)/*7.20*/ {_display_(Seq[Any](format.raw/*7.22*/("""
  """),format.raw/*8.3*/("""<link href=""""),_display_(/*8.16*/routes/*8.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.63*/("""" rel="stylesheet" />
  <div class="col-sm-2"></div>

  """),_display_(/*11.4*/if(flash.containsKey("success"))/*11.36*/ {_display_(Seq[Any](format.raw/*11.38*/("""
    """),format.raw/*12.5*/("""<div class="alert alert-success">
      """),_display_(/*13.8*/flash/*13.13*/.get("success")),format.raw/*13.28*/("""
    """),format.raw/*14.5*/("""</div>
  """)))}),format.raw/*15.4*/("""

  """),format.raw/*17.3*/("""<div class="col-sm-10">
    <div class="bookDetails">
      <div class="book-item">
        """),_display_(/*20.10*/if(env.resource("public/images/bookImages/" + b.getId + ".jpg").isDefined)/*20.84*/ {_display_(Seq[Any](format.raw/*20.86*/("""
            """),format.raw/*21.13*/("""<img src="/assets/images/bookImages/"""),_display_(/*21.50*/(b.getId + ".jpg")),format.raw/*21.68*/(""""/>
        """)))}/*22.11*/else/*22.16*/{_display_(Seq[Any](format.raw/*22.17*/("""
            """),format.raw/*23.13*/("""<img src="/assets/images/bookImages/noImage.jpg"/>
        """)))}),format.raw/*24.10*/("""
        """),format.raw/*25.9*/("""<h2>"""),_display_(/*25.14*/b/*25.15*/.getTitle),format.raw/*25.24*/("""</h2><br>
        <h4>by <b>"""),_display_(/*26.20*/b/*26.21*/.getAuthor.getFname),format.raw/*26.40*/(""" """),_display_(/*26.42*/b/*26.43*/.getAuthor.getLname),format.raw/*26.62*/("""</b> | """),_display_(/*26.70*/b/*26.71*/.getPublisher.getName),format.raw/*26.92*/("""</h4>
        <br>
        <p><b>Genre: </b> """),_display_(/*28.28*/for(g <- b.getGenres) yield /*28.49*/ {_display_(_display_(/*28.52*/g/*28.53*/.getName))}),format.raw/*28.62*/("""</p><br>
        <p><b>Description</b><br>
          """),_display_(/*30.12*/b/*30.13*/.getDescription),format.raw/*30.28*/("""
        """),format.raw/*31.9*/("""</p><br>
      </div>

        <div class="book-price">
          <h3 id="pricse" style="color:palevioletred">€"""),_display_(/*35.57*/("%.2f".format(b.getPrice))),format.raw/*35.84*/("""</h3>
          """),_display_(/*36.12*/if(user != null)/*36.28*/{_display_(Seq[Any](format.raw/*36.29*/("""
            """),_display_(/*37.14*/if(user.isInstanceOf[models.users.Administrator])/*37.63*/{_display_(Seq[Any](format.raw/*37.64*/("""
              """),format.raw/*38.15*/("""<a href=""""),_display_(/*38.25*/routes/*38.31*/.AdminBookCtrl.updateBook(b.getId)),format.raw/*38.65*/("""" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-pencil"></span> Edit </a>
              <a href=""""),_display_(/*39.25*/routes/*39.31*/.AdminBookCtrl.deleteBook(b.getId)),format.raw/*39.65*/("""" class="btn btn-default btn-xs" onclick="return confirmDel()"><span class="glyphicon glyphicon-trash"></span> Delete</a>
            """)))}/*40.15*/else/*40.20*/{_display_(Seq[Any](format.raw/*40.21*/("""
              """),_display_(/*41.16*/if(b.getStock > 0)/*41.34*/{_display_(Seq[Any](format.raw/*41.35*/("""
                """),format.raw/*42.17*/("""<a href=""""),_display_(/*42.27*/routes/*42.33*/.ShoppingCtrl.addToBasket(b.getId)),format.raw/*42.67*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span> Add to Basket</a>
                <a href=""""),_display_(/*43.27*/routes/*43.33*/.BookCtrl.addToWishlist(b.getId)),format.raw/*43.65*/("""" class="btn btn-default btn-xs-"><span class="glyphicon glyphicon-heart"></span> Add to Wishlist</a>
              """)))}/*44.17*/else/*44.22*/{_display_(Seq[Any](format.raw/*44.23*/("""
                """),format.raw/*45.17*/("""<a class="btn btn-warning btn-xs"><span class="glyphicon-shopping-cart"></span>Out of Stock</a>
                <a href=""""),_display_(/*46.27*/routes/*46.33*/.BookCtrl.addToWishlist(b.getId)),format.raw/*46.65*/("""" class="btn btn-default btn-xs-"><span class="glyphicon glyphicon-heart"></span> Add to Wishlist</a>
              """)))}),format.raw/*47.16*/("""
            """)))}),format.raw/*48.14*/("""
          """)))}/*49.13*/else/*49.18*/{_display_(Seq[Any](format.raw/*49.19*/("""
            """),_display_(/*50.14*/if(b.getStock > 0)/*50.32*/ {_display_(Seq[Any](format.raw/*50.34*/("""
              """),format.raw/*51.15*/("""<a href=""""),_display_(/*51.25*/routes/*51.31*/.ShoppingCtrl.addToBasket(b.getId)),format.raw/*51.65*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span> Add to Basket</a>
              <a href=""""),_display_(/*52.25*/controllers/*52.36*/.security.routes.LoginCtrl.login()),format.raw/*52.70*/("""" class="btn btn-default btn-xs-"><span class="glyphicon glyphicon-heart"></span> Add to Wishlist</a>
            """)))}/*53.15*/else/*53.20*/{_display_(Seq[Any](format.raw/*53.21*/("""
              """),format.raw/*54.15*/("""<a class="btn btn-warning btn-xs"><span class="glyphicon-shopping-cart"></span>Out of Stock</a>
              <a href=""""),_display_(/*55.25*/controllers/*55.36*/.security.routes.LoginCtrl.login()),format.raw/*55.70*/("""" class="btn btn-default btn-xs-"><span class="glyphicon glyphicon-heart"></span> Add to Wishlist</a>
            """)))}),format.raw/*56.14*/("""
          """)))}),format.raw/*57.12*/("""
          
        """),format.raw/*59.9*/("""</div>
      
    </div>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(b:Book,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(b,user,env)

  def f:((Book,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (b,user,env) => apply(b,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/bookDetails.scala.html
                  HASH: 1c475b51c952a51a33292b1163dce2bcc77866ba
                  MATRIX: 651->1|684->28|716->54|1075->80|1216->126|1245->130|1271->148|1310->150|1339->153|1378->166|1392->172|1453->213|1536->270|1577->302|1617->304|1649->309|1716->350|1730->355|1766->370|1798->375|1838->385|1869->389|1989->482|2072->556|2112->558|2153->571|2217->608|2256->626|2288->640|2301->645|2340->646|2381->659|2472->719|2508->728|2540->733|2550->734|2580->743|2636->772|2646->773|2686->792|2715->794|2725->795|2765->814|2800->822|2810->823|2852->844|2925->890|2962->911|2993->914|3003->915|3035->924|3116->978|3126->979|3162->994|3198->1003|3337->1115|3385->1142|3429->1159|3454->1175|3493->1176|3534->1190|3592->1239|3631->1240|3674->1255|3711->1265|3726->1271|3781->1305|3924->1421|3939->1427|3994->1461|4148->1597|4161->1602|4200->1603|4243->1619|4270->1637|4309->1638|4354->1655|4391->1665|4406->1671|4461->1705|4622->1839|4637->1845|4690->1877|4826->1995|4839->2000|4878->2001|4923->2018|5072->2140|5087->2146|5140->2178|5288->2295|5333->2309|5364->2322|5377->2327|5416->2328|5457->2342|5484->2360|5524->2362|5567->2377|5604->2387|5619->2393|5674->2427|5833->2559|5853->2570|5908->2604|6042->2720|6055->2725|6094->2726|6137->2741|6284->2861|6304->2872|6359->2906|6505->3021|6548->3033|6595->3053
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|40->8|40->8|40->8|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|49->17|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|56->24|57->25|57->25|57->25|57->25|58->26|58->26|58->26|58->26|58->26|58->26|58->26|58->26|58->26|60->28|60->28|60->28|60->28|60->28|62->30|62->30|62->30|63->31|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|78->46|78->46|78->46|79->47|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|87->55|88->56|89->57|91->59
                  -- GENERATED --
              */
          