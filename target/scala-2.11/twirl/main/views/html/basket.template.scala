
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.books._


Seq[Any](format.raw/*1.35*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Shopping Basket", customer)/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""
    """),format.raw/*10.5*/("""<div class="row">

        <div class="col-md-12">
            """),_display_(/*13.14*/if(flash.containsKey("success"))/*13.46*/ {_display_(Seq[Any](format.raw/*13.48*/("""
                """),format.raw/*14.17*/("""<div class="alert alert-success">
                    """),_display_(/*15.22*/flash/*15.27*/.get("success")),format.raw/*15.42*/("""
                """),format.raw/*16.17*/("""</div>
            """)))}),format.raw/*17.14*/("""
            """),format.raw/*18.13*/("""<table class="table table-bordered table-hover table-condensed">
                <thead>
                <!-- The header row-->
                <tr>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Description</th>
                    <th>Item Price</th>
                    <th>Total</th>
                    <th>Quantity</th>
                    <th>dec.</th>
                    <th>inc.</th>
                </tr>
                </thead>
                <tbody>
                    """),_display_(/*33.22*/if(customer.getBasket() != null)/*33.54*/ {_display_(Seq[Any](format.raw/*33.56*/("""
                        """),format.raw/*34.25*/("""<!-- Start of For loop - For each p in bookss add a row -->
                        """),_display_(/*35.26*/for(i <- customer.getBasket().getBasketItems()) yield /*35.73*/ {_display_(Seq[Any](format.raw/*35.75*/("""
                        """),format.raw/*36.25*/("""<tr>
                            <td>"""),_display_(/*37.34*/i/*37.35*/.getBook.getTitle),format.raw/*37.52*/("""</td>
                            <td>"""),_display_(/*38.34*/i/*38.35*/.getBook.getAuthor),format.raw/*38.53*/("""</td>
                            <td>"""),_display_(/*39.34*/i/*39.35*/.getBook.getDescription()),format.raw/*39.60*/("""</td>
                            <td>&euro; """),_display_(/*40.41*/("%.2f".format(i.getPrice))),format.raw/*40.68*/("""</td>
                            <td>&euro; """),_display_(/*41.41*/("%.2f".format(i.getItemTotal))),format.raw/*41.72*/("""</td>
                            <td>"""),_display_(/*42.34*/i/*42.35*/.getQuantity()),format.raw/*42.49*/("""</td>
                            <td><a href=""""),_display_(/*43.43*/routes/*43.49*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*43.81*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                            <td><a href=""""),_display_(/*44.43*/routes/*44.49*/.ShoppingCtrl.addOne(i.getId,i.getBook.getId())),format.raw/*44.96*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                        </tr>
                        """)))}),format.raw/*46.26*/("""
                  """)))}),format.raw/*47.20*/("""
                """),format.raw/*48.17*/("""</tbody>
                </table>
                <div class="row">
                    <div class="col-md-12">
                        <p class="text-center"><strong>Basket Total: &euro; """),_display_(/*52.78*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*52.128*/("""</strong></p>
                        <p class="text-center"><strong>Delivery Cost: &euro;2</strong></p>
                        <p class="text-center"><strong>Total Cost: &euro;"""),_display_(/*54.75*/("%.2f".format(customer.getBasket.getBasketTotal+2))),format.raw/*54.127*/("""</strong></p>                        
                    </div>  
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <p class="text-right">
                            <a href=""""),_display_(/*60.39*/routes/*60.45*/.ShoppingCtrl.emptyBasket()),format.raw/*60.72*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                        </p>
                    </div>  
                    <div class="col-md-6">
                        <p class="text-right">
                            <a href=""""),_display_(/*66.39*/routes/*66.45*/.ShoppingCtrl.placeOrder()),format.raw/*66.71*/("""" class="btn btn-success btn-sm">
                            <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                            
                        </p>
                    </div>
                    <br>
                     

                    <div class="col-md-6">
                        <p class="text-right">
                            <a href=""""),_display_(/*76.39*/routes/*76.45*/.PaymentCtrl.payment),format.raw/*76.65*/("""" class="btn btn-primary btn-sm">
                            <span class="glyphicon glyphicon-flag"></span> Submit</a>
                            
                        </p>
                    </div>
                </div>
            </div>
        </div>

        <script>
            function confirmDel() """),format.raw/*86.35*/("""{"""),format.raw/*86.36*/("""
                """),format.raw/*87.17*/("""return confirm('Are you sure?');
            """),format.raw/*88.13*/("""}"""),format.raw/*88.14*/("""
        """),format.raw/*89.9*/("""</script>
        """)))}),format.raw/*90.10*/("""    """))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/basket.scala.html
                  HASH: 7081a4b376a039ddfbceecb1724d1afcf6563aaf
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1189->34|1218->116|1245->117|1316->163|1357->196|1396->198|1428->203|1519->267|1560->299|1600->301|1645->318|1727->373|1741->378|1777->393|1822->410|1873->430|1914->443|2475->977|2516->1009|2556->1011|2609->1036|2721->1121|2784->1168|2824->1170|2877->1195|2942->1233|2952->1234|2990->1251|3056->1290|3066->1291|3105->1309|3171->1348|3181->1349|3227->1374|3300->1420|3348->1447|3421->1493|3473->1524|3539->1563|3549->1564|3584->1578|3659->1626|3674->1632|3727->1664|3860->1770|3875->1776|3943->1823|4092->1941|4143->1961|4188->1978|4404->2167|4476->2217|4682->2396|4756->2448|5035->2700|5050->2706|5098->2733|5468->3076|5483->3082|5530->3108|5943->3494|5958->3500|5999->3520|6341->3834|6370->3835|6415->3852|6488->3897|6517->3898|6553->3907|6603->3926
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|42->10|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|50->18|65->33|65->33|65->33|66->34|67->35|67->35|67->35|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|78->46|79->47|80->48|84->52|84->52|86->54|86->54|92->60|92->60|92->60|98->66|98->66|98->66|108->76|108->76|108->76|118->86|118->86|119->87|120->88|120->88|121->89|122->90
                  -- GENERATED --
              */
          