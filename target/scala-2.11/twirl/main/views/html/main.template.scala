
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, nav: String = "")(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import be.objectify.deadbolt.java.views.html._
import be.objectify.deadbolt.core.utils.TemplateUtils._

Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang=""""),_display_(/*7.14*/lang()/*7.20*/.code()),format.raw/*7.27*/("""">
    <head>
        <title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Play with Play! Framework 2.0">
        <meta name="author" content="The Play">
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
"""))}
  }

  def render(title:String,nav:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,nav)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 15:36:05 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/main.scala.html
                  HASH: 967a96598fb24b612f48836cc0e748dd7d6889cb
                  MATRIX: 734->1|972->49|1000->156|1027->157|1082->186|1096->192|1123->199|1179->229|1204->234|1480->505|1516->514|1588->559|1603->565|1663->604|1751->665|1766->671|1819->703|1894->751|1909->757|1985->811|2069->868|2084->874|2163->931|2247->988|2262->994|2304->1015|2366->1178|2403->1210|2439->1219|2503->1256|2518->1262|2577->1300|2654->1350|2669->1356|2749->1414|2800->1438|2815->1444|2862->1470|3416->1997|3463->2023|3502->2035|3517->2041|3558->2061|3589->2064|3655->2108|3728->2154|3795->2200|3834->2212|3850->2218|3893->2239|3949->2267|3966->2274|3993->2279|4048->2307|4105->2343|4144->2355|4159->2361|4205->2386|4581->2735|4636->2769|4675->2781|4690->2787|4733->2808|4835->2883|4890->2917|4929->2929|4944->2935|4987->2956|5096->3038|5151->3072|5190->3084|5205->3090|5247->3111|5462->3299|5519->3335|5558->3347|5573->3353|5620->3378|5651->3381|5723->3431|5753->3432|6112->3764|6169->3800|6208->3812|6223->3818|6267->3840|6350->3896|6407->3932|6446->3944|6461->3950|6504->3971|6569->4009|6626->4045|6665->4057|6680->4063|6722->4084|6914->4249|6942->4268|6982->4270|7039->4299|7078->4311|7131->4343|7170->4355|7185->4361|7228->4382|7259->4385|7327->4431|7393->4466|7442->4487|7502->4520|7529->4538|7569->4540|7622->4565|7715->4631|7769->4676|7817->4686|7874->4715|8057->4870|8071->4874|8098->4879|8128->4880|8306->5031|8360->5064|8399->5076|8415->5082|8459->5104|8490->5107|8559->5154|8646->5214|8661->5220|8697->5235|8727->5238|8798->5287|8947->5409|8962->5415|9003->5435|9198->5603|9210->5606|9293->5667|9349->5695|9417->5741|9555->5848|9608->5873|9654->5900|9694->5902|9747->5927|9784->5937|9799->5943|9840->5963|9919->6014|9974->6047|10005->6050|10072->6095|10129->6121|10175->6139|10342->6279|10398->6326|10438->6328|10483->6345|10762->6597|10778->6604|10832->6637|10877->6654|10928->6674|10969->6688|11027->6737|11067->6739|11113->6756|11394->7009|11411->7016|11468->7051|11514->7068|11566->7088|11608->7102|11637->7109|11680->7123
                  LINES: 26->1|30->1|32->5|33->6|34->7|34->7|34->7|36->9|36->9|42->15|43->16|43->16|43->16|43->16|44->17|44->17|44->17|45->18|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->22|49->23|50->24|50->24|50->24|50->24|51->25|51->25|51->25|52->26|52->26|52->26|65->39|65->39|65->39|65->39|65->39|65->39|65->39|66->40|66->40|66->40|66->40|66->40|66->40|66->40|66->40|67->41|67->41|67->41|67->41|67->41|71->45|71->45|71->45|71->45|71->45|72->46|72->46|72->46|72->46|72->46|73->47|73->47|73->47|73->47|73->47|77->51|77->51|77->51|77->51|77->51|77->51|77->51|77->51|81->55|81->55|81->55|81->55|81->55|82->56|82->56|82->56|82->56|82->56|83->57|83->57|83->57|83->57|83->57|87->61|87->61|87->61|88->62|88->62|88->62|88->62|88->62|88->62|88->62|88->62|89->63|90->64|92->66|92->66|92->66|93->67|94->68|94->68|94->68|95->69|96->70|96->70|96->70|96->70|98->72|98->72|98->72|98->72|98->72|98->72|98->72|99->73|99->73|99->73|99->73|99->73|101->75|101->75|101->75|103->77|103->77|103->77|103->77|103->77|106->80|107->81|108->82|108->82|109->83|109->83|109->83|109->83|109->83|109->83|109->83|109->83|110->84|112->86|118->92|118->92|118->92|119->93|122->96|122->96|122->96|123->97|124->98|125->99|125->99|125->99|126->100|129->103|129->103|129->103|130->104|131->105|132->106|132->106|134->108
                  -- GENERATED --
              */
          