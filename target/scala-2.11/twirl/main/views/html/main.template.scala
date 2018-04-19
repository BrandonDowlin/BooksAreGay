
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Online Shop - """),_display_(/*9.27*/title),format.raw/*9.32*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

        <div class="row">
                <div class="col-sm-8" id="headerImage">
                    <a href=""""),_display_(/*20.31*/routes/*20.37*/.BookCtrl.listBooks(0)),format.raw/*20.59*/(""""><img src="/assets/images/logo.PNG" class="img-responsive" alt="Logo"></a>
                </div>

                <div class="col-sm-4">
                        <ul class="nav nav-pills">
                            """),_display_(/*25.30*/if(user != null)/*25.46*/{_display_(Seq[Any](format.raw/*25.47*/("""
                                """),format.raw/*26.33*/("""<li class="active"><a href=""""),_display_(/*26.62*/controllers/*26.73*/.security.routes.LoginCtrl.logout()),format.raw/*26.108*/("""" class="btn btn-info btn-lg">
                                        <span class="glyphicon glyphicon-user"></span> Logout """),_display_(/*27.96*/user/*27.100*/.getName()),format.raw/*27.110*/(""" 
                                      """),format.raw/*28.39*/("""</a></li>
                            """)))}/*29.31*/else/*29.36*/{_display_(Seq[Any](format.raw/*29.37*/("""
                                """),format.raw/*30.33*/("""<li><a href=""""),_display_(/*30.47*/controllers/*30.58*/.security.routes.LoginCtrl.login()),format.raw/*30.92*/("""" class="btn btn-info btn-lg">
                                        <span class="glyphicon glyphicon-user"></span> Login</a>
                                </li>
                            """)))}),format.raw/*33.30*/(""" 
                            """),_display_(/*34.30*/if(user != null )/*34.47*/{_display_(Seq[Any](format.raw/*34.48*/("""
                                """),_display_(/*35.34*/if(user.isInstanceOf[models.users.Customer])/*35.78*/{_display_(Seq[Any](format.raw/*35.79*/("""
                                """),format.raw/*36.33*/("""<li class="active"><a href=""""),_display_(/*36.62*/routes/*36.68*/.BookCtrl.showWishlist()),format.raw/*36.92*/("""" class="btn btn-info btn-lg">
                                        <span class="glyphicon glyphicon-heart"></span> Wishlist 
                                      </a></li>
                                    """)))}),format.raw/*39.38*/("""
                            """)))}/*40.31*/else/*40.36*/{_display_(Seq[Any](format.raw/*40.37*/("""
                                """),format.raw/*41.33*/("""<li><a href=""""),_display_(/*41.47*/controllers/*41.58*/.security.routes.LoginCtrl.login()),format.raw/*41.92*/("""" class="btn btn-info btn-lg">
                                        <span class="glyphicon glyphicon-heart"></span> Wishlist</a>
                                </li>
                            """)))}),format.raw/*44.30*/("""
                            """),_display_(/*45.30*/if(user != null)/*45.46*/ {_display_(Seq[Any](format.raw/*45.48*/("""
                                """),format.raw/*46.33*/("""<li class="active"><a href=""""),_display_(/*46.62*/routes/*46.68*/.HomeController.myAccount()),format.raw/*46.95*/("""" class="btn btn-info btn-lg">
                                        <span class="glyphicon glyphicon-info-sign"></span> My Account</a>
                                </li>
                            """)))}/*49.31*/else/*49.36*/{_display_(Seq[Any](format.raw/*49.37*/("""
                                """),format.raw/*50.33*/("""<li><a href=""""),_display_(/*50.47*/controllers/*50.58*/.security.routes.LoginCtrl.login()),format.raw/*50.92*/("""" class="btn btn-info btn-lg">
                                        <span class="glyphicon glyphicon-info-sign"></span> My Account</a></li>
                            """)))}),format.raw/*52.30*/("""
                        """),format.raw/*53.25*/("""</ul>
                </div>
            </div>
            <div class="row">
                <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href=""""),_display_(/*60.60*/routes/*60.66*/.BookCtrl.listBooks(0)),format.raw/*60.88*/("""">Bookish Universe</a>
                        </div>
            
                        <ul class="nav navbar-nav">
            
                            <li """),_display_(/*65.34*/if(title=="Books" )/*65.53*/{_display_(Seq[Any](format.raw/*65.54*/("""class="active"""")))}),format.raw/*65.69*/(""">
                                <a href="http://localhost:9000/listBooks?gen=15">Bestsellers</a>
                            </li>
                            <li>
                                <a href="#">Coming Soon</a>
                            </li>
                            <li>
                                <a href="http://localhost:9000/listBooks?gen=16">New Releases</a>
                            </li>
                            <li>
                                <a href="http://localhost:9000/listBooks?gen=17">Sale</a>
                            </li>
   
                        </ul>
                    <!-- Search Form -->
                    <div id="actions">
                    <form class="navbar-form navbar-right" action=""""),_display_(/*81.69*/routes/*81.75*/.BookCtrl.listBooks()),format.raw/*81.96*/("""" method="GET">
                    <input type="search" id="searchbox" title="filter" value="" placeholder="Filter by book title...">
                    
                    <button class="btn btn-default" type="submit">
                    <i class="glyphicon glyphicon-search"></i>
                    </button>

                    </form>
                    </div>           
                </nav>
            </div>

    <container>
        <row>
            <div class="col-md-12">

                """),_display_(/*97.18*/content),format.raw/*97.25*/("""
            """),format.raw/*98.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <div class="footer-wrap">
            <footer class="footer">
                <div class="footer-left-content">
                    <a href="#"><h4>FAQs</h4></a>
                </div>
                <div class="footer-left-content">
                        <a href="#"><h4>Newsletter</h4></a>
                </div>
                <div class="footer-left-content">
                        <a href="#"><h4>Contact Us</h4></a>
                </div>
            <row>
            <div class="footer-right-content">
                <strong>© 2018 Bookish Universe</strong>
            </div>
            </row>
            </footer>
        </div>
    </container>
    <script src=""""),_display_(/*122.19*/routes/*122.25*/.Assets.versioned("javascripts/main.js")),format.raw/*122.65*/(""""></script>
</div>
</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 23:42:53 BST 2018
                  SOURCE: C:/Users/brand/Desktop/BookishUniverse/BookishUniverse-master/app/views/main.scala.html
                  HASH: 5c2326ba6aa06f1295f97cc21db4a02a3dd423dc
                  MATRIX: 970->1|1121->57|1149->59|1270->154|1295->159|1507->344|1522->350|1584->391|1762->542|1777->548|1820->570|2066->789|2091->805|2130->806|2191->839|2247->868|2267->879|2324->914|2477->1040|2491->1044|2523->1054|2591->1094|2649->1134|2662->1139|2701->1140|2762->1173|2803->1187|2823->1198|2878->1232|3104->1427|3162->1458|3188->1475|3227->1476|3288->1510|3341->1554|3380->1555|3441->1588|3497->1617|3512->1623|3557->1647|3802->1861|3851->1892|3864->1897|3903->1898|3964->1931|4005->1945|4025->1956|4080->1990|4310->2189|4367->2219|4392->2235|4432->2237|4493->2270|4549->2299|4564->2305|4612->2332|4836->2538|4849->2543|4888->2544|4949->2577|4990->2591|5010->2602|5065->2636|5268->2808|5321->2833|5639->3124|5654->3130|5697->3152|5889->3317|5917->3336|5956->3337|6002->3352|6793->4116|6808->4122|6850->4143|7387->4653|7415->4660|7456->4673|8235->5424|8251->5430|8313->5470
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|52->20|52->20|52->20|57->25|57->25|57->25|58->26|58->26|58->26|58->26|59->27|59->27|59->27|60->28|61->29|61->29|61->29|62->30|62->30|62->30|62->30|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|68->36|71->39|72->40|72->40|72->40|73->41|73->41|73->41|73->41|76->44|77->45|77->45|77->45|78->46|78->46|78->46|78->46|81->49|81->49|81->49|82->50|82->50|82->50|82->50|84->52|85->53|92->60|92->60|92->60|97->65|97->65|97->65|97->65|113->81|113->81|113->81|129->97|129->97|130->98|154->122|154->122|154->122
                  -- GENERATED --
              */
          