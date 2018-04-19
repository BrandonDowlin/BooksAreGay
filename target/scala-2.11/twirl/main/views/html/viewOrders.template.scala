
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,List[models.shopping.ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, orders: List[models.shopping.ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.books._


Seq[Any](format.raw/*1.76*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Order", customer)/*9.25*/ {_display_(Seq[Any](format.raw/*9.27*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
        """)))}),format.raw/*19.10*/("""
        
        """),_display_(/*21.10*/for(order <- orders) yield /*21.30*/ {_display_(Seq[Any](format.raw/*21.32*/("""
            """),format.raw/*22.13*/("""<p>Order Number: """),_display_(/*22.31*/order/*22.36*/.getId),format.raw/*22.42*/("""</p>
            <p>Order Date: """),_display_(/*23.29*/order/*23.34*/.getOrderDateString),format.raw/*23.53*/("""</p>
    
            <table class="table table-bordered table-hover table-condensed">
                <thead>
                <!-- The header row-->
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Total</th>
                </tr>
                </thead>
                <tbody>
                    """),_display_(/*37.22*/if(order != null)/*37.39*/ {_display_(Seq[Any](format.raw/*37.41*/("""
                        """),format.raw/*38.25*/("""<!-- Start of For loop - For each p in products add a row -->
                        """),_display_(/*39.26*/for(i <- order.getItems) yield /*39.50*/ {_display_(Seq[Any](format.raw/*39.52*/("""
                        """),format.raw/*40.25*/("""<tr>
                            <td>"""),_display_(/*41.34*/i/*41.35*/.getBook.getTitle),format.raw/*41.52*/("""</td>
                            <td>"""),_display_(/*42.34*/i/*42.35*/.getBook.getDescription),format.raw/*42.58*/("""</td>
                            <td>&euro; """),_display_(/*43.41*/("%.2f".format(i.getPrice))),format.raw/*43.68*/("""</td>
                            <td>"""),_display_(/*44.34*/i/*44.35*/.getQuantity()),format.raw/*44.49*/("""</td>
                            <td>&euro; """),_display_(/*45.41*/("%.2f".format(i.getItemTotal))),format.raw/*45.72*/("""</td>
                        </tr>
                        """)))}),format.raw/*47.26*/("""<!-- End of For loop -->
                  """)))}),format.raw/*48.20*/("""
                """),format.raw/*49.17*/("""</tbody>
            </table>
            <div class="row">
                <div class="col-md-12">
                    <p class="text-right"><strong>Order Total: &euro; """),_display_(/*53.72*/("%.2f".format(order.getOrderTotal))),format.raw/*53.108*/("""</strong></p>
                </div>  
            </div>
    
            <a href=""""),_display_(/*57.23*/routes/*57.29*/.ShoppingCtrl.cancelOrder(order.getId)),format.raw/*57.67*/("""" class="btn btn-primary">Cancel Order</a>
            <br>
            <br>
        """)))}),format.raw/*60.10*/("""
    """),format.raw/*61.5*/("""</div>
</div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,orders:List[models.shopping.ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(customer,orders)

  def f:((models.users.Customer,List[models.shopping.ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (customer,orders) => apply(customer,orders)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/viewOrders.scala.html
                  HASH: 47daf04fc832fa15827d2354fad8c1d84198c0dc
                  MATRIX: 1000->1|1147->79|1183->109|1215->135|1266->75|1295->157|1322->158|1393->204|1424->227|1463->229|1493->232|1566->279|1607->311|1647->313|1680->319|1751->363|1765->368|1801->383|1834->389|1881->405|1927->424|1963->444|2003->446|2044->459|2089->477|2103->482|2130->488|2190->521|2204->526|2244->545|2717->991|2743->1008|2783->1010|2836->1035|2950->1122|2990->1146|3030->1148|3083->1173|3148->1211|3158->1212|3196->1229|3262->1268|3272->1269|3316->1292|3389->1338|3437->1365|3503->1404|3513->1405|3548->1419|3621->1465|3673->1496|3765->1557|3840->1601|3885->1618|4083->1789|4141->1825|4253->1910|4268->1916|4327->1954|4444->2040|4476->2045
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|53->21|53->21|53->21|54->22|54->22|54->22|54->22|55->23|55->23|55->23|69->37|69->37|69->37|70->38|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|76->44|76->44|76->44|77->45|77->45|79->47|80->48|81->49|85->53|85->53|89->57|89->57|89->57|92->60|93->61
                  -- GENERATED --
              */
          