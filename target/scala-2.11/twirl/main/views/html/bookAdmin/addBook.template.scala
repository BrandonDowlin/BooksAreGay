
package views.html.bookAdmin

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
/*1.2*/import models.books._
/*2.2*/import models.books.Book
/*3.2*/import models.users.User

object addBook extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Book],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(bookForm: Form[Book], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.36*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Add Book", user)/*7.24*/ {_display_(Seq[Any](format.raw/*7.26*/("""

    """),_display_(/*9.6*/if(flash.containsKey("success"))/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""
        """),format.raw/*10.9*/("""<div class="alert alert-success">
            """),_display_(/*11.14*/flash/*11.19*/.get("success")),format.raw/*11.34*/("""
        """),format.raw/*12.9*/("""</div>
    """)))}),format.raw/*13.6*/("""
    """),_display_(/*14.6*/if(flash.containsKey("failure"))/*14.38*/ {_display_(Seq[Any](format.raw/*14.40*/("""
        """),format.raw/*15.9*/("""<div class="alert alert-success">
            """),_display_(/*16.14*/flash/*16.19*/.get("failure")),format.raw/*16.34*/("""
        """),format.raw/*17.9*/("""</div>
    """)))}),format.raw/*18.6*/(""" 
    """),format.raw/*19.5*/("""<!-- // supposed to give out the message that the add of the book was successfull -->

    <!-- // Need to fix the table of the book for the admin everything is moved one to the side. the id is in title the image is in id ets. 
    also when adding new book completely it moves everything to the opposite side so delete button into update grid and update into price ets. -->

    <p class="lead"> Add a new Book</p>
    """),_display_(/*25.6*/form(action=routes.AdminBookCtrl.addBookSubmit(), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*25.135*/ {_display_(Seq[Any](format.raw/*25.137*/("""
        """),format.raw/*26.37*/("""
        """),_display_(/*27.10*/CSRF/*27.14*/.formField),format.raw/*27.24*/("""
        """),_display_(/*28.10*/inputText(bookForm("title"), '_label -> "Title", 'class -> "form-control")),format.raw/*28.84*/("""
        """),_display_(/*29.10*/inputText(bookForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*29.96*/("""
        """),_display_(/*30.10*/for((value, name) <- Genre.options) yield /*30.45*/ {_display_(Seq[Any](format.raw/*30.47*/("""
            """),format.raw/*31.13*/("""<input type="checkbox" name="genSelect[]" value=""""),_display_(/*31.63*/value),format.raw/*31.68*/(""""
            
            />"""),_display_(/*33.16*/name),format.raw/*33.20*/("""<br>        
        """)))}),format.raw/*34.10*/("""  
        """),_display_(/*35.10*/select(
            bookForm("author.id"),
            options(Author.options), '_label -> "Author", '_default -> "Choose an author",
            '_showConstraints -> false, 'class -> "form-control"

        )),format.raw/*40.10*/("""
        """),_display_(/*41.10*/select(
            bookForm("publisher.id"),
            options(Publisher.options), '_label -> "Publisher", '_default -> "Choose a publisher",
            '_showConstraints -> false, 'class -> "form-control"

        )),format.raw/*46.10*/("""
    """),_display_(/*47.6*/inputText(bookForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*47.80*/("""
    """),_display_(/*48.6*/inputText(bookForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*48.80*/("""

        """),format.raw/*50.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Book" class="btn btn-primary">
            <a href=""""),_display_(/*55.23*/routes/*55.29*/.BookCtrl.listBooks(0)),format.raw/*55.51*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*59.6*/("""
""")))}))
      }
    }
  }

  def render(bookForm:Form[Book],user:User): play.twirl.api.HtmlFormat.Appendable = apply(bookForm,user)

  def f:((Form[Book],User) => play.twirl.api.HtmlFormat.Appendable) = (bookForm,user) => apply(bookForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 23:34:13 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/bookAdmin/addBook.scala.html
                  HASH: 0c68572a8fb71ad5588f89691077ee3b4db5432a
                  MATRIX: 661->1|690->24|722->50|1062->76|1169->112|1214->110|1241->128|1268->130|1298->152|1337->154|1369->161|1409->193|1448->195|1484->204|1558->251|1572->256|1608->271|1644->280|1686->292|1718->298|1759->330|1799->332|1835->341|1909->388|1923->393|1959->408|1995->417|2037->429|2070->435|2517->856|2656->985|2697->987|2734->1024|2771->1034|2784->1038|2815->1048|2852->1058|2947->1132|2984->1142|3091->1228|3128->1238|3179->1273|3219->1275|3260->1288|3337->1338|3363->1343|3420->1373|3445->1377|3498->1399|3537->1411|3767->1620|3804->1630|4045->1850|4077->1856|4172->1930|4204->1936|4299->2010|4336->2020|4604->2261|4619->2267|4662->2289|4810->2407
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|51->19|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|60->28|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|65->33|65->33|66->34|67->35|72->40|73->41|78->46|79->47|79->47|80->48|80->48|82->50|87->55|87->55|87->55|91->59
                  -- GENERATED --
              */
          