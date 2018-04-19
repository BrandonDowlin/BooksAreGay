
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

object listBooks extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[Book],List[Genre],Long,String,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(books: List[Book], genres: List[Genre], genId: Long, filter: String,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.108*/("""

"""),_display_(/*6.2*/main("Books",user)/*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""

    """),format.raw/*8.5*/("""<p class="lead">Book List</p>
    <br>
    <div class="row">
      <div class="col-sm-2">
        <h4>Genres</h4>
        <div class="list-group">
          <a href=""""),_display_(/*14.21*/routes/*14.27*/.BookCtrl.listBooks(0, filter)),format.raw/*14.57*/("""" class="list-group-item">All Genres</a>
          """),_display_(/*15.12*/for(g <- genres) yield /*15.28*/ {_display_(Seq[Any](format.raw/*15.30*/("""
            """),format.raw/*16.13*/("""<a href=""""),_display_(/*16.23*/routes/*16.29*/.BookCtrl.listBooks(g.getId, filter)),format.raw/*16.65*/("""" class="list-group-item">"""),_display_(/*16.92*/g/*16.93*/.getName),format.raw/*16.101*/("""
              """),format.raw/*17.15*/("""<span class="badge">"""),_display_(/*17.36*/g/*17.37*/.getBooks.size()),format.raw/*17.53*/("""</span>
            </a>
          """)))}),format.raw/*19.12*/("""
        """),format.raw/*20.9*/("""</div>
      </div>

      <a href=""""),_display_(/*23.17*/routes/*23.23*/.AdminBookCtrl.addBook()),format.raw/*23.47*/(""""  class="btn btn-sm btn-primary">Add a New Book</a>

      <div class="col-sm-1"></div>
      <div class="col-sm-8">
        """),_display_(/*27.10*/if(flash.containsKey("success"))/*27.42*/ {_display_(Seq[Any](format.raw/*27.44*/("""
          """),format.raw/*28.11*/("""<div class="alert alert-success">
            """),_display_(/*29.14*/flash/*29.19*/.get("success")),format.raw/*29.34*/("""
          """),format.raw/*30.11*/("""</div>
        """)))}),format.raw/*31.10*/("""
  
                    
         
           """),_display_(/*35.13*/for(b<-books) yield /*35.26*/ {_display_(Seq[Any](format.raw/*35.28*/("""
            """),format.raw/*36.13*/("""<div id="book-group">
            """),_display_(/*37.14*/if(env.resource("public/images/bookImages/thumbnails/" + b.getId + ".jpg").isDefined)/*37.99*/ {_display_(Seq[Any](format.raw/*37.101*/("""
              """),format.raw/*38.15*/("""<td><a href=""""),_display_(/*38.29*/routes/*38.35*/.BookCtrl.bookDetails(b.getId)),format.raw/*38.65*/(""""><img src="/assets/images/bookImages/thumbnails/"""),_display_(/*38.115*/(b.getId + ".jpg")),format.raw/*38.133*/(""""/></a></td>
          """)))}/*39.13*/else/*39.18*/{_display_(Seq[Any](format.raw/*39.19*/("""
              """),format.raw/*40.15*/("""<td><a href=""""),_display_(/*40.29*/routes/*40.35*/.BookCtrl.bookDetails(b.getId)),format.raw/*40.65*/(""""><img src="/assets/images/bookImages/thumbnails/noImage.jpg"/></a></td>
          """)))}),format.raw/*41.12*/("""
          """),format.raw/*42.11*/("""<h4 id="bookName">"""),_display_(/*42.30*/b/*42.31*/.getTitle),format.raw/*42.40*/("""</h4>
          <p>
            by """),_display_(/*44.17*/b/*44.18*/.getAuthor.getFname),format.raw/*44.37*/(""" """),_display_(/*44.39*/b/*44.40*/.getAuthor.getLname),format.raw/*44.59*/("""
          """),format.raw/*45.11*/("""</p>
          <h5 id="price">€"""),_display_(/*46.28*/("%.2f".format(b.getPrice))),format.raw/*46.55*/("""</h5>
          <a href=""""),_display_(/*47.21*/routes/*47.27*/.ShoppingCtrl.addToBasket(b.getId)),format.raw/*47.61*/(""""  class="btn btn-sm btn-primary">Add to basket &nbsp;<span class="glyphicon glyphicon-shopping-cart"></span></a><br>
          <a href=""""),_display_(/*48.21*/routes/*48.27*/.BookCtrl.addToWishlist(b.getId)),format.raw/*48.59*/(""""  class="btn btn-sm btn-primary">Add to wishlist <span class="glyphicon glyphicon-heart"></span></a>

           
         </div>
        """)))}),format.raw/*52.10*/("""
         
         """),format.raw/*54.10*/("""<!-- <table class="table table-bordered table-hover table-condensed">   
            <thead>
              <tr>
                <th>ID</th>
                <th>Image</th>
                <th>Title</th>
                <th>Author</th>         
                <th>Description</th>
                <th>Publisher</th>
                <th>Stock</th>
                <th>Price</th>   
              </tr>
            </thead>
      
            <tbody>
              """),_display_(/*69.16*/for(b<-books) yield /*69.29*/ {_display_(Seq[Any](format.raw/*69.31*/("""
                """),format.raw/*70.17*/("""<tr>
                    """),_display_(/*71.22*/if(env.resource("public/images/bookImages/thumbnails/" + b.getId + ".jpg").isDefined)/*71.107*/ {_display_(Seq[Any](format.raw/*71.109*/("""
                      """),format.raw/*72.23*/("""<td><img src="/assets/images/bookImages/thumbnails/"""),_display_(/*72.75*/(b.getId + ".jpg")),format.raw/*72.93*/(""""/></td>
                  """)))}/*73.21*/else/*73.26*/{_display_(Seq[Any](format.raw/*73.27*/("""
                      """),format.raw/*74.23*/("""<td><img src="/assets/images/bookImages/thumbnails/noImage.jpg"/></td>
                  """)))}),format.raw/*75.20*/("""
                  """),format.raw/*76.19*/("""<td class="numeric">"""),_display_(/*76.40*/b/*76.41*/.getId),format.raw/*76.47*/("""</td>
                  <td><a href=""""),_display_(/*77.33*/routes/*77.39*/.BookCtrl.bookDetails(b.getId)),format.raw/*77.69*/("""">
                      """),_display_(/*78.24*/b/*78.25*/.getTitle),format.raw/*78.34*/("""</td>
                     </a>  
                     <td>"""),_display_(/*80.27*/b/*80.28*/.getAuthor.getFname),format.raw/*80.47*/(""" """),_display_(/*80.49*/b/*80.50*/.getAuthor.getLname),format.raw/*80.69*/("""</td>   
                  <td>"""),_display_(/*81.24*/b/*81.25*/.getDescription),format.raw/*81.40*/("""</td>
                  <td>"""),_display_(/*82.24*/b/*82.25*/.getPublisher.getName),format.raw/*82.46*/("""</td>
                  <td  class="numeric">"""),_display_(/*83.41*/b/*83.42*/.getStock),format.raw/*83.51*/("""</td>
                  <td  class="numeric">€ """),_display_(/*84.43*/("%.2f".format(b.getPrice))),format.raw/*84.70*/("""</td>
                  <td><a href=""""),_display_(/*85.33*/routes/*85.39*/.ShoppingCtrl.addToBasket(b.getId)),format.raw/*85.73*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
      
                </tr>
              """)))}),format.raw/*88.16*/("""
            """),format.raw/*89.13*/("""</tbody>
      
          </table> -->
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(books:List[Book],genres:List[Genre],genId:Long,filter:String,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(books,genres,genId,filter,user,env)

  def f:((List[Book],List[Genre],Long,String,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (books,genres,genId,filter,user,env) => apply(books,genres,genId,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/listBooks.scala.html
                  HASH: 4c3679185466a68db369dc5afde1f369bf946b08
                  MATRIX: 651->1|684->28|716->54|1103->80|1305->186|1333->189|1359->207|1398->209|1430->215|1624->382|1639->388|1690->418|1769->470|1801->486|1841->488|1882->501|1919->511|1934->517|1991->553|2045->580|2055->581|2085->589|2128->604|2176->625|2186->626|2223->642|2290->678|2326->687|2390->724|2405->730|2450->754|2604->881|2645->913|2685->915|2724->926|2798->973|2812->978|2848->993|2887->1004|2934->1020|3008->1067|3037->1080|3077->1082|3118->1095|3180->1130|3274->1215|3315->1217|3358->1232|3399->1246|3414->1252|3465->1282|3543->1332|3583->1350|3626->1375|3639->1380|3678->1381|3721->1396|3762->1410|3777->1416|3828->1446|3943->1530|3982->1541|4028->1560|4038->1561|4068->1570|4131->1606|4141->1607|4181->1626|4210->1628|4220->1629|4260->1648|4299->1659|4358->1691|4406->1718|4459->1744|4474->1750|4529->1784|4694->1922|4709->1928|4762->1960|4933->2100|4981->2120|5471->2583|5500->2596|5540->2598|5585->2615|5638->2641|5733->2726|5774->2728|5825->2751|5904->2803|5943->2821|5990->2850|6003->2855|6042->2856|6093->2879|6214->2969|6261->2988|6309->3009|6319->3010|6346->3016|6411->3054|6426->3060|6477->3090|6530->3116|6540->3117|6570->3126|6657->3186|6667->3187|6707->3206|6736->3208|6746->3209|6786->3228|6845->3260|6855->3261|6891->3276|6947->3305|6957->3306|6999->3327|7072->3373|7082->3374|7112->3383|7187->3431|7235->3458|7300->3496|7315->3502|7370->3536|7544->3679|7585->3692
                  LINES: 24->1|25->2|26->3|31->4|36->4|38->6|38->6|38->6|40->8|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|48->16|48->16|48->16|48->16|49->17|49->17|49->17|49->17|51->19|52->20|55->23|55->23|55->23|59->27|59->27|59->27|60->28|61->29|61->29|61->29|62->30|63->31|67->35|67->35|67->35|68->36|69->37|69->37|69->37|70->38|70->38|70->38|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|73->41|74->42|74->42|74->42|74->42|76->44|76->44|76->44|76->44|76->44|76->44|77->45|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|84->52|86->54|101->69|101->69|101->69|102->70|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|106->74|107->75|108->76|108->76|108->76|108->76|109->77|109->77|109->77|110->78|110->78|110->78|112->80|112->80|112->80|112->80|112->80|112->80|113->81|113->81|113->81|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|117->85|117->85|117->85|120->88|121->89
                  -- GENERATED --
              */
          