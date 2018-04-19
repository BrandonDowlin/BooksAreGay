
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

object usersPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.User],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.User], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.85*/("""

"""),_display_(/*3.2*/main("users",user)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""

"""),format.raw/*5.1*/("""<p class="lead">Users Page</p>
<br>
<div class="row">
  <div class="col-sm-2">
  </div>
  
  <div class="col-sm-8">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*13.8*/if(flash.containsKey("success"))/*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""
        """),format.raw/*14.9*/("""<div class="alert alert-success">
          """),_display_(/*15.12*/flash/*15.17*/.get("success")),format.raw/*15.32*/("""
        """),format.raw/*16.9*/("""</div>
      """)))}),format.raw/*17.8*/("""
      """),format.raw/*18.7*/("""<thead>
        <tr>
          <th>Username</th>
          <th>Email</th>
          <th>Role</th>
          """),_display_(/*23.12*/if(user != null)/*23.28*/{_display_(Seq[Any](format.raw/*23.29*/("""
            """),_display_(/*24.14*/if(user.isInstanceOf[models.users.Administrator])/*24.63*/{_display_(Seq[Any](format.raw/*24.64*/("""
            """),format.raw/*25.13*/("""<th colspan="2">Edit</th>
            """)))}),format.raw/*26.14*/("""
          """)))}),format.raw/*27.12*/("""      
        """),format.raw/*28.9*/("""</tr>
      </thead>

      <tbody>
        """),_display_(/*32.10*/for(u<-users) yield /*32.23*/ {_display_(Seq[Any](format.raw/*32.25*/("""
          """),format.raw/*33.11*/("""<tr>
            <td>"""),_display_(/*34.18*/u/*34.19*/.getName),format.raw/*34.27*/("""</td>
            <td>"""),_display_(/*35.18*/u/*35.19*/.getEmail),format.raw/*35.28*/("""</td>
            """),_display_(/*36.14*/if(user != null)/*36.30*/{_display_(Seq[Any](format.raw/*36.31*/("""
            """),_display_(/*37.14*/if(user.isInstanceOf[models.users.Administrator])/*37.63*/{_display_(Seq[Any](format.raw/*37.64*/("""
            
            """),format.raw/*39.13*/("""<td>
                
              <a href=""""),_display_(/*41.25*/routes/*41.31*/.HomeController.updateUser(u.getEmail)),format.raw/*41.69*/("""" class="button xs btn-danger">
                    <span class="glyphicon glyphicon-pencil"></span>
                  
                
              </a>
            </td>        <td>
              <a href=""""),_display_(/*47.25*/routes/*47.31*/.HomeController.deleteUser(u.getEmail)),format.raw/*47.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          """)))}),format.raw/*51.12*/("""
        """)))}),format.raw/*52.10*/("""
          """),format.raw/*53.11*/("""</tr>
        """)))}),format.raw/*54.10*/("""
      """),format.raw/*55.7*/("""</tbody>
    </table>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(users:List[models.users.User],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(users,user,env)

  def f:((List[models.users.User],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (users,user,env) => apply(users,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 21:59:29 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/usersPage.scala.html
                  HASH: e151c1b7a79d3355892191387602fa21fb83b5c1
                  MATRIX: 1008->1|1186->84|1214->87|1240->105|1279->107|1307->109|1525->301|1566->333|1606->335|1642->344|1714->389|1728->394|1764->409|1800->418|1844->432|1878->439|2014->548|2039->564|2078->565|2119->579|2177->628|2216->629|2257->642|2327->681|2370->693|2412->708|2484->753|2513->766|2553->768|2592->779|2641->801|2651->802|2680->810|2730->833|2740->834|2770->843|2816->862|2841->878|2880->879|2921->893|2979->942|3018->943|3072->969|3145->1015|3160->1021|3219->1059|3456->1269|3471->1275|3530->1313|3736->1488|3777->1498|3816->1509|3862->1524|3896->1531
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|50->18|55->23|55->23|55->23|56->24|56->24|56->24|57->25|58->26|59->27|60->28|64->32|64->32|64->32|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|71->39|73->41|73->41|73->41|79->47|79->47|79->47|83->51|84->52|85->53|86->54|87->55
                  -- GENERATED --
              */
          