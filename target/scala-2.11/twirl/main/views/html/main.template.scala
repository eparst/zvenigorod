
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, nav: String = "")(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import be.objectify.deadbolt.java.views.html._
import be.objectify.deadbolt.core.utils.TemplateUtils._

Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang=""""),_display_(/*7.14*/lang()/*7.20*/.code()),format.raw/*7.27*/("""">
    <head>
        <title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>

        <meta charset="utf-8">"""),format.raw/*11.64*/("""
        """),format.raw/*12.9*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="About Zvenigorod Dutkovo">
        <meta name="author" content="Eparst">
        """),format.raw/*15.32*/("""
        """),format.raw/*16.9*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.at("stylesheets/uikit.min.css")),format.raw/*16.99*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.at("images/favicon.png")),format.raw/*17.97*/("""">
        <script type="text/javascript" src=""""),_display_(/*18.46*/routes/*18.52*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*18.106*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*19.46*/routes/*19.52*/.WebJarAssets.at(WebJarAssets.locate("bootstrap.min.js"))),format.raw/*19.109*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*20.46*/routes/*20.52*/.Application.jsRoutes),format.raw/*20.73*/("""" defer="defer"></script>
        """),format.raw/*22.96*/("""
        """),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""<script type="text/javascript" src=""""),_display_(/*24.46*/routes/*24.52*/.Assets.at("javascripts/uikit.min.js")),format.raw/*24.90*/(""""></script>
        <link rel="stylesheet" href=""""),_display_(/*25.39*/routes/*25.45*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.css"))),format.raw/*25.103*/("""">
        <link href=""""),_display_(/*26.22*/routes/*26.28*/.Assets.at("css/main.css")),format.raw/*26.54*/("""" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-default navbar-fixed-top navbar-inverse" role="navigation">
            <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->


                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                    	<li class=""""),_display_(/*39.34*/("active".when(nav == ""))),format.raw/*39.60*/(""""><a href=""""),_display_(/*39.72*/routes/*39.78*/.Application.index()),format.raw/*39.98*/("""">"""),_display_(/*39.101*/Messages("playauthenticate.navigation.home")),format.raw/*39.145*/("""</a></li>
                        <li class=""""),_display_(/*40.37*/("active".when("request.path" == "/posts/53"))),format.raw/*40.83*/(""""><a href=""""),_display_(/*40.95*/routes/*40.101*/.Application.show(53)),format.raw/*40.122*/("""">Государственный заказник """),_display_(/*40.150*/request/*40.157*/.path),format.raw/*40.162*/("""</a></li>
						<li class=""""),_display_(/*41.19*/("active".when(nav == "restricted"))),format.raw/*41.55*/(""""><a href=""""),_display_(/*41.67*/routes/*41.73*/.Application.restricted()),format.raw/*41.98*/("""">Поиск</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon"></i>Медвижимость звенигорода<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                        			<li class=""""),_display_(/*45.40*/("active".when(nav == "show(71)"))),format.raw/*45.74*/(""""><a href=""""),_display_(/*45.86*/routes/*45.92*/.Application.show(71)),format.raw/*45.113*/("""">Карта кадастрового учета</a></li>
                        			<li class=""""),_display_(/*46.40*/("active".when(nav == "show(72)"))),format.raw/*46.74*/(""""><a href=""""),_display_(/*46.86*/routes/*46.92*/.Application.show(72)),format.raw/*46.113*/("""">Кадастровая стоимость земель в районе Звенигорода</a></li>
									<li class=""""),_display_(/*47.22*/("active".when(nav == "show(53)"))),format.raw/*47.56*/(""""><a href=""""),_display_(/*47.68*/routes/*47.74*/.Application.show(53)),format.raw/*47.95*/("""">Карта Звенигорода (Быдло-вариант)
</a></li>                        
                                </ul>
                            </li>						
                        <!--<li class=""""),_display_(/*51.41*/("active".when(nav == "restricted"))),format.raw/*51.77*/(""""><a href=""""),_display_(/*51.89*/routes/*51.95*/.Application.restricted()),format.raw/*51.120*/("""">"""),_display_(/*51.123*/Messages("playauthenticate.navigation.restricted")),format.raw/*51.173*/(""" """),format.raw/*51.174*/("""</a></li>-->
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon"></i>Развлечения<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                        			<li class=""""),_display_(/*55.40*/("active".when(nav == "restricted"))),format.raw/*55.76*/(""""><a href=""""),_display_(/*55.88*/routes/*55.94*/.Application.show(128)),format.raw/*55.116*/("""">Клипы</a></li>
                        			<li class=""""),_display_(/*56.40*/("active".when(nav == "restricted"))),format.raw/*56.76*/(""""><a href=""""),_display_(/*56.88*/routes/*56.94*/.Application.show(15)),format.raw/*56.115*/("""">Пэсни</a></li>
									<li class=""""),_display_(/*57.22*/("active".when(nav == "restricted"))),format.raw/*57.58*/(""""><a href=""""),_display_(/*57.70*/routes/*57.76*/.Application.show(19)),format.raw/*57.97*/("""">Галерея</a></li>                        
                                </ul>
                            </li>
                        
                        """),_display_(/*61.26*/subjectNotPresent()/*61.45*/ {_display_(Seq[Any](format.raw/*61.47*/("""
                            """),format.raw/*62.29*/("""<li class=""""),_display_(/*62.41*/("active".when(nav == "signup"))),format.raw/*62.73*/(""""><a href=""""),_display_(/*62.85*/routes/*62.91*/.Application.signup()),format.raw/*62.112*/("""">"""),_display_(/*62.115*/Messages("playauthenticate.navigation.signup")),format.raw/*62.161*/("""</a></li>
                        """)))}),format.raw/*63.26*/("""
                    """),format.raw/*64.21*/("""</ul>
Поиск
                    """),_display_(/*66.22*/subjectPresentOr()/*66.40*/ {_display_(Seq[Any](format.raw/*66.42*/("""
                        """),format.raw/*67.25*/("""<ul class="nav navbar-nav navbar-right">
                        """),_display_(/*68.26*/defining(Application.getLocalUser(session()))/*68.71*/ { user =>_display_(Seq[Any](format.raw/*68.81*/("""
                            """),format.raw/*69.29*/("""<li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-user"></i> """),_display_(/*70.134*/user/*70.138*/.name),format.raw/*70.143*/(""" """),format.raw/*70.144*/("""<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li class=""""),_display_(/*72.49*/("active".when(nav == "profile"))),format.raw/*72.82*/(""""><a href=""""),_display_(/*72.94*/routes/*72.100*/.Application.profile()),format.raw/*72.122*/("""">"""),_display_(/*72.125*/Messages("playauthenticate.navigation.profile")),format.raw/*72.172*/("""</a></li>
                                    <li><a href=""""),_display_(/*73.51*/routes/*73.57*/.Account.link()),format.raw/*73.72*/("""">"""),_display_(/*73.75*/Messages("playauthenticate.navigation.link_more")),format.raw/*73.124*/("""</a></li>
                                    <li class="divider"></li>
                                    <li><a href=""""),_display_(/*75.51*/routes/*75.57*/.Application.admin()),format.raw/*75.77*/("""">My Posts</a></li>
                                    <li class="divider"></li>                                    
                                    <li><a href=""""),_display_(/*77.51*/com/*77.54*/.feth.play.module.pa.controllers.routes.Authenticate.logout()),format.raw/*77.115*/(""""><i class="icon-off"></i> """),_display_(/*77.143*/Messages("playauthenticate.navigation.logout")),format.raw/*77.189*/("""</a></li>
                                </ul>
                            </li>
                        """)))}),format.raw/*80.26*/("""
                        """),format.raw/*81.25*/("""</ul>
                    """)))}/*82.22*/ {_display_(Seq[Any](format.raw/*82.24*/("""
                        """),format.raw/*83.25*/("""<a href=""""),_display_(/*83.35*/routes/*83.41*/.Application.login()),format.raw/*83.61*/("""" class=" navbar-right btn btn-default navbar-btn """),_display_(/*83.112*/("disabled".when(nav == "login"))),format.raw/*83.145*/("""">"""),_display_(/*83.148*/Messages("playauthenticate.navigation.login")),format.raw/*83.193*/("""</a>
                    """)))}),format.raw/*84.22*/("""

                """),format.raw/*86.17*/("""</div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>


        <div class="container">
            """),_display_(/*92.14*/if(flash.contains(Application.FLASH_ERROR_KEY))/*92.61*/ {_display_(Seq[Any](format.raw/*92.63*/("""
                """),format.raw/*93.17*/("""<div class="alert alert-danger" role="alert">
                    <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">
                        Close</span></button>
                    """),_display_(/*96.22*/flash()/*96.29*/.get(Application.FLASH_ERROR_KEY)),format.raw/*96.62*/("""
                """),format.raw/*97.17*/("""</div>
            """)))}),format.raw/*98.14*/("""
            """),_display_(/*99.14*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*99.63*/ {_display_(Seq[Any](format.raw/*99.65*/("""
                """),format.raw/*100.17*/("""<div class="alert alert-success" role="alert">
                    <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">
                        Close</span></button>
                    """),_display_(/*103.22*/flash()/*103.29*/.get(Application.FLASH_MESSAGE_KEY)),format.raw/*103.64*/("""
                """),format.raw/*104.17*/("""</div>
            """)))}),format.raw/*105.14*/("""
            """),_display_(/*106.14*/content),format.raw/*106.21*/("""

            """),format.raw/*108.13*/("""<hr>

            <footer>
                <p>&copy;
                    2003-2015 Звенигород. Дютьково.</p>
                <p>
                    <small> Powered by Eparst<a href="http://med24.ru" target="_blank">
                        med24.ru</a> &middot;
                        </small></p>
            </footer>
        </div> <!-- /container -->

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,nav:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,nav)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun Feb 21 18:04:51 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/main.scala.html
                  HASH: 1f0ac342bbcb1533f8915d65a9fa1116f1415673
                  MATRIX: 755->1|1000->49|1028->156|1055->157|1110->186|1124->192|1151->199|1207->229|1232->234|1300->307|1336->316|1556->531|1592->540|1664->585|1679->591|1739->630|1827->691|1842->697|1895->729|1970->777|1985->783|2061->837|2145->894|2160->900|2239->957|2323->1014|2338->1020|2380->1041|2442->1204|2479->1236|2515->1245|2579->1282|2594->1288|2653->1326|2730->1376|2745->1382|2825->1440|2876->1464|2891->1470|2938->1496|3492->2023|3539->2049|3578->2061|3593->2067|3634->2087|3665->2090|3731->2134|3804->2180|3871->2226|3910->2238|3926->2244|3969->2265|4025->2293|4042->2300|4069->2305|4124->2333|4181->2369|4220->2381|4235->2387|4281->2412|4657->2761|4712->2795|4751->2807|4766->2813|4809->2834|4911->2909|4966->2943|5005->2955|5020->2961|5063->2982|5172->3064|5227->3098|5266->3110|5281->3116|5323->3137|5538->3325|5595->3361|5634->3373|5649->3379|5696->3404|5727->3407|5799->3457|5829->3458|6188->3790|6245->3826|6284->3838|6299->3844|6343->3866|6426->3922|6483->3958|6522->3970|6537->3976|6580->3997|6645->4035|6702->4071|6741->4083|6756->4089|6798->4110|6990->4275|7018->4294|7058->4296|7115->4325|7154->4337|7207->4369|7246->4381|7261->4387|7304->4408|7335->4411|7403->4457|7469->4492|7518->4513|7578->4546|7605->4564|7645->4566|7698->4591|7791->4657|7845->4702|7893->4712|7950->4741|8133->4896|8147->4900|8174->4905|8204->4906|8382->5057|8436->5090|8475->5102|8491->5108|8535->5130|8566->5133|8635->5180|8722->5240|8737->5246|8773->5261|8803->5264|8874->5313|9023->5435|9038->5441|9079->5461|9274->5629|9286->5632|9369->5693|9425->5721|9493->5767|9631->5874|9684->5899|9730->5926|9770->5928|9823->5953|9860->5963|9875->5969|9916->5989|9995->6040|10050->6073|10081->6076|10148->6121|10205->6147|10251->6165|10418->6305|10474->6352|10514->6354|10559->6371|10838->6623|10854->6630|10908->6663|10953->6680|11004->6700|11045->6714|11103->6763|11143->6765|11189->6782|11470->7035|11487->7042|11544->7077|11590->7094|11642->7114|11684->7128|11713->7135|11756->7149
                  LINES: 27->1|33->1|35->5|36->6|37->7|37->7|37->7|39->9|39->9|41->11|42->12|45->15|46->16|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->22|52->23|53->24|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|68->39|68->39|68->39|68->39|68->39|68->39|68->39|69->40|69->40|69->40|69->40|69->40|69->40|69->40|69->40|70->41|70->41|70->41|70->41|70->41|74->45|74->45|74->45|74->45|74->45|75->46|75->46|75->46|75->46|75->46|76->47|76->47|76->47|76->47|76->47|80->51|80->51|80->51|80->51|80->51|80->51|80->51|80->51|84->55|84->55|84->55|84->55|84->55|85->56|85->56|85->56|85->56|85->56|86->57|86->57|86->57|86->57|86->57|90->61|90->61|90->61|91->62|91->62|91->62|91->62|91->62|91->62|91->62|91->62|92->63|93->64|95->66|95->66|95->66|96->67|97->68|97->68|97->68|98->69|99->70|99->70|99->70|99->70|101->72|101->72|101->72|101->72|101->72|101->72|101->72|102->73|102->73|102->73|102->73|102->73|104->75|104->75|104->75|106->77|106->77|106->77|106->77|106->77|109->80|110->81|111->82|111->82|112->83|112->83|112->83|112->83|112->83|112->83|112->83|112->83|113->84|115->86|121->92|121->92|121->92|122->93|125->96|125->96|125->96|126->97|127->98|128->99|128->99|128->99|129->100|132->103|132->103|132->103|133->104|134->105|135->106|135->106|137->108
                  -- GENERATED --
              */
          