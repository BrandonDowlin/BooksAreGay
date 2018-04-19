
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
/*1.2*/import models.books.Book
/*2.2*/import models.books.Genre
/*3.2*/import models.users.User
/*4.2*/import models.books.Author
/*5.2*/import models.books.Publisher

object updateBook extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[Book],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(id: Long, updateBookForm: Form[Book], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*7.2*/import helper._


Seq[Any](format.raw/*6.52*/("""
"""),_display_(/*8.2*/main("Update book", user)/*8.27*/{_display_(Seq[Any](format.raw/*8.28*/("""
"""),format.raw/*9.1*/("""<p class="lead"> Update Book</p>

"""),_display_(/*11.2*/form(action=routes.AdminBookCtrl.updateBookSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*12.51*/ {_display_(Seq[Any](format.raw/*12.53*/("""
    """),format.raw/*13.33*/("""
    """),_display_(/*14.6*/CSRF/*14.10*/.formField),format.raw/*14.20*/("""
    """),_display_(/*15.6*/inputText(updateBookForm("title"), '_label -> "Title", 'class -> "form-control")),format.raw/*15.86*/("""
    """),_display_(/*16.6*/inputText(updateBookForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*16.98*/("""
        """),_display_(/*17.10*/for((value, name) <- Genre.options) yield /*17.45*/ {_display_(Seq[Any](format.raw/*17.47*/("""
            """),format.raw/*18.13*/("""<input type="checkbox" name="genSelect[]" value=""""),_display_(/*18.63*/value),format.raw/*18.68*/(""""
            """),_display_(/*19.14*/if(Genre.inGenre(value.toLong, id))/*19.49*/ {_display_(Seq[Any](format.raw/*19.51*/("""
                """),format.raw/*20.17*/("""checked
            """)))}),format.raw/*21.14*/("""
            """),format.raw/*22.13*/("""/>"""),_display_(/*22.16*/name),format.raw/*22.20*/("""<br>        
        """)))}),format.raw/*23.10*/("""  
        """),_display_(/*24.10*/select(
            updateBookForm("author.id"),
            options(Author.options), '_label -> "Author", '_default -> "Choose an author",
            '_showConstraints -> false, 'class -> "form-control"

        )),format.raw/*29.10*/("""
        """),_display_(/*30.10*/select(
            updateBookForm("publisher.id"),
            options(Publisher.options), '_label -> "Publisher", '_default -> "Choose a publisher",
            '_showConstraints -> false, 'class -> "form-control"

        )),format.raw/*35.10*/("""
    """),_display_(/*36.6*/inputText(updateBookForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*36.86*/("""
    """),_display_(/*37.6*/inputText(updateBookForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*37.86*/("""
    
    """),format.raw/*39.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Book" class="btn btn-primary">
        <a href=""""),_display_(/*45.19*/routes/*45.25*/.BookCtrl.listBooks(0)),format.raw/*45.47*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*49.3*/("""
""")))}),format.raw/*50.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateBookForm:Form[Book],user:User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateBookForm,user)

  def f:((Long,Form[Book],User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateBookForm,user) => apply(id,updateBookForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 23:27:43 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/bookAdmin/updateBook.scala.html
                  HASH: 71c22d72f3dad4b32d152187d6463c6ac267a44c
                  MATRIX: 661->1|693->27|726->54|758->80|792->108|1145->139|1268->191|1313->189|1340->208|1373->233|1411->234|1438->235|1499->270|1643->405|1683->407|1716->440|1748->446|1761->450|1792->460|1824->466|1925->546|1957->552|2070->644|2107->654|2158->689|2198->691|2239->704|2316->754|2342->759|2384->774|2428->809|2468->811|2513->828|2565->849|2606->862|2636->865|2661->869|2714->891|2753->903|2989->1118|3026->1128|3273->1354|3305->1360|3406->1440|3438->1446|3539->1526|3576->1536|3824->1757|3839->1763|3882->1785|4015->1888|4047->1890
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->6|36->7|39->6|40->8|40->8|40->8|41->9|43->11|44->12|44->12|45->13|46->14|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|53->21|54->22|54->22|54->22|55->23|56->24|61->29|62->30|67->35|68->36|68->36|69->37|69->37|71->39|77->45|77->45|77->45|81->49|82->50
                  -- GENERATED --
              */
          