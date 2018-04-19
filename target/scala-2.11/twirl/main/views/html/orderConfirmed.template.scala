
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.books._


Seq[Any](format.raw/*1.69*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Order Confirmation", customer)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 
        """),format.raw/*20.9*/("""<h1>Your Order is On The Way: </h1>
		<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
                <th>Title</th>
                <th>Author</th>
                <th>Description</th>
                <th>Publisher</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*35.18*/if(order != null)/*35.35*/ {_display_(Seq[Any](format.raw/*35.37*/("""
                    """),format.raw/*36.21*/("""<!-- Start of For loop - For each p in books add a row -->
                    """),_display_(/*37.22*/for(i <- order.getItems) yield /*37.46*/ {_display_(Seq[Any](format.raw/*37.48*/("""
                    """),format.raw/*38.21*/("""<tr>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getBook.getTitle),format.raw/*39.48*/("""</td>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getBook.getAuthor),format.raw/*40.49*/("""</td>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getBook.getDescription),format.raw/*41.54*/("""</td>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getBook.getPublisher),format.raw/*42.52*/("""</td>
                        <td>&euro; """),_display_(/*43.37*/("%.2f".format(i.getPrice))),format.raw/*43.64*/("""</td>
                        <td>"""),_display_(/*44.30*/i/*44.31*/.getQuantity()),format.raw/*44.45*/("""</td>
                        <td>&euro; """),_display_(/*45.37*/("%.2f".format(i.getItemTotal))),format.raw/*45.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*47.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*48.16*/("""
			"""),format.raw/*49.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-center"><strong>Delivery Cost: &euro;2</strong></p>
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*54.68*/("%.2f".format(order.getOrderTotal+2))),format.raw/*54.106*/("""</strong></p>
            </div>  
            <a href=""""),_display_(/*56.23*/routes/*56.29*/.BookCtrl.listBooks()),format.raw/*56.50*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart" ></span>Continue Shopping</a>
  
        </div>
        </div>
</div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(customer,order)

  def f:((models.users.Customer,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (customer,order) => apply(customer,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/orderConfirmed.scala.html
                  HASH: 8a57a8f8aa007dcc08379ae3a974e996937eab80
                  MATRIX: 998->1|1138->72|1174->102|1206->128|1257->68|1286->150|1313->151|1384->197|1428->233|1467->235|1497->238|1570->285|1611->317|1651->319|1684->325|1755->369|1769->374|1805->389|1838->395|1878->405|1915->415|2351->824|2377->841|2417->843|2466->864|2573->944|2613->968|2653->970|2702->991|2763->1025|2773->1026|2811->1043|2873->1078|2883->1079|2922->1097|2984->1132|2994->1133|3038->1156|3100->1191|3110->1192|3152->1213|3221->1255|3269->1282|3331->1317|3341->1318|3376->1332|3445->1374|3497->1405|3581->1458|3652->1498|3683->1502|3942->1734|4002->1772|4086->1829|4101->1835|4143->1856
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|67->35|67->35|67->35|68->36|69->37|69->37|69->37|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|76->44|76->44|76->44|77->45|77->45|79->47|80->48|81->49|86->54|86->54|88->56|88->56|88->56
                  -- GENERATED --
              */
          