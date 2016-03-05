
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
        <meta name="description" content="Кинологический центр Симаргл">
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
                    	<li class=""""),_display_(/*39.34*/("active".when(request.path == "/"))),format.raw/*39.70*/(""""><a href=""""),_display_(/*39.82*/routes/*39.88*/.Application.index()),format.raw/*39.108*/("""">"""),_display_(/*39.111*/Messages("playauthenticate.navigation.home")),format.raw/*39.155*/("""</a></li>
                        <li class=""""),_display_(/*40.37*/("active".when(request.path == "/posts/71"))),format.raw/*40.81*/(""""><a href=""""),_display_(/*40.93*/routes/*40.99*/.Application.show(71)),format.raw/*40.120*/("""">О нас</a></li>
                        <li class=""""),_display_(/*41.37*/("active".when(request.path == "/posts/92"))),format.raw/*41.81*/(""""><a href=""""),_display_(/*41.93*/routes/*41.99*/.Application.show(92)),format.raw/*41.120*/("""">Дрессировка</a></li>
                        <li class=""""),_display_(/*42.37*/("active".when(request.path == "/posts/93"))),format.raw/*42.81*/(""""><a href=""""),_display_(/*42.93*/routes/*42.99*/.Application.show(93)),format.raw/*42.120*/("""">Зоогостиница</a></li>
						<li class=""""),_display_(/*43.19*/("active".when(request.path == "/posts/94"))),format.raw/*43.63*/(""""><a href=""""),_display_(/*43.75*/routes/*43.81*/.Application.show(94)),format.raw/*43.102*/("""">Безопасность</a></li>
						<li class=""""),_display_(/*44.19*/("active".when(request.path == "/posts/91"))),format.raw/*44.63*/(""""><a href=""""),_display_(/*44.75*/routes/*44.81*/.Application.show(91)),format.raw/*44.102*/("""">Вольеры</a></li>
						<li class=""""),_display_(/*45.19*/("active".when(request.path == "/photo"))),format.raw/*45.60*/(""""><a href=""""),_display_(/*45.72*/routes/*45.78*/.Application.photo()),format.raw/*45.98*/("""">Фотогалерея</a></li>
                        <li class=""""),_display_(/*46.37*/("active".when(request.path == "/posts/75"))),format.raw/*46.81*/(""""><a href=""""),_display_(/*46.93*/routes/*46.99*/.Application.show(75)),format.raw/*46.120*/("""">Контакты</a></li>
						  <!--<li class=""""),_display_(/*47.25*/("active".when(nav == "restricted"))),format.raw/*47.61*/(""""><a href=""""),_display_(/*47.73*/routes/*47.79*/.Application.restricted()),format.raw/*47.104*/("""">"""),_display_(/*47.107*/Messages("playauthenticate.navigation.restricted")),format.raw/*47.157*/(""" """),format.raw/*47.158*/("""</a></li>-->
                        
                        """),_display_(/*49.26*/subjectNotPresent()/*49.45*/ {_display_(Seq[Any](format.raw/*49.47*/("""
                            """),format.raw/*50.29*/("""<li class=""""),_display_(/*50.41*/("active".when(nav == "signup"))),format.raw/*50.73*/(""""><a href=""""),_display_(/*50.85*/routes/*50.91*/.Application.signup()),format.raw/*50.112*/("""">"""),_display_(/*50.115*/Messages("playauthenticate.navigation.signup")),format.raw/*50.161*/("""</a></li>
                        """)))}),format.raw/*51.26*/("""
                    """),format.raw/*52.21*/("""</ul>
                    """),_display_(/*53.22*/subjectPresentOr()/*53.40*/ {_display_(Seq[Any](format.raw/*53.42*/("""
                        """),format.raw/*54.25*/("""<ul class="nav navbar-nav navbar-right">
                        """),_display_(/*55.26*/defining(Application.getLocalUser(session()))/*55.71*/ { user =>_display_(Seq[Any](format.raw/*55.81*/("""
                            """),format.raw/*56.29*/("""<li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-user"></i> """),_display_(/*57.134*/user/*57.138*/.name),format.raw/*57.143*/(""" """),format.raw/*57.144*/("""<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li class=""""),_display_(/*59.49*/("active".when(nav == "profile"))),format.raw/*59.82*/(""""><a href=""""),_display_(/*59.94*/routes/*59.100*/.Application.profile()),format.raw/*59.122*/("""">"""),_display_(/*59.125*/Messages("playauthenticate.navigation.profile")),format.raw/*59.172*/("""</a></li>
                                    <li><a href=""""),_display_(/*60.51*/routes/*60.57*/.Account.link()),format.raw/*60.72*/("""">"""),_display_(/*60.75*/Messages("playauthenticate.navigation.link_more")),format.raw/*60.124*/("""</a></li>
                                    <li class="divider"></li>
                                    <li><a href=""""),_display_(/*62.51*/routes/*62.57*/.Application.admin()),format.raw/*62.77*/("""">All Posts</a></li>
                                     <li><a href=""""),_display_(/*63.52*/routes/*63.58*/.Application.users()),format.raw/*63.78*/("""">All Users</a></li>
                                    <li class="divider"></li>                                    
                                    <li><a href=""""),_display_(/*65.51*/com/*65.54*/.feth.play.module.pa.controllers.routes.Authenticate.logout()),format.raw/*65.115*/(""""><i class="icon-off"></i> """),_display_(/*65.143*/Messages("playauthenticate.navigation.logout")),format.raw/*65.189*/("""</a></li>
                                </ul>
                            </li>
                        """)))}),format.raw/*68.26*/("""
                        """),format.raw/*69.25*/("""</ul>
                    """)))}/*70.22*/ {_display_(Seq[Any](format.raw/*70.24*/("""
                        """),format.raw/*71.25*/("""<a href=""""),_display_(/*71.35*/routes/*71.41*/.Application.login()),format.raw/*71.61*/("""" class=" navbar-right btn btn-default navbar-btn """),_display_(/*71.112*/("disabled".when(nav == "login"))),format.raw/*71.145*/("""">"""),_display_(/*71.148*/Messages("playauthenticate.navigation.login")),format.raw/*71.193*/("""</a>
                    """)))}),format.raw/*72.22*/("""

                """),format.raw/*74.17*/("""</div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>


        <div class="container">
            """),_display_(/*80.14*/if(flash.contains(Application.FLASH_ERROR_KEY))/*80.61*/ {_display_(Seq[Any](format.raw/*80.63*/("""
                """),format.raw/*81.17*/("""<div class="alert alert-danger" role="alert">
                    <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">
                        Close</span></button>
                    """),_display_(/*84.22*/flash()/*84.29*/.get(Application.FLASH_ERROR_KEY)),format.raw/*84.62*/("""
                """),format.raw/*85.17*/("""</div>
            """)))}),format.raw/*86.14*/("""
            """),_display_(/*87.14*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*87.63*/ {_display_(Seq[Any](format.raw/*87.65*/("""
                """),format.raw/*88.17*/("""<div class="alert alert-success" role="alert">
                    <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">
                        Close</span></button>
                    """),_display_(/*91.22*/flash()/*91.29*/.get(Application.FLASH_MESSAGE_KEY)),format.raw/*91.64*/("""
                """),format.raw/*92.17*/("""</div>
            """)))}),format.raw/*93.14*/("""
            """),_display_(/*94.14*/content),format.raw/*94.21*/("""

            """),format.raw/*96.13*/("""<hr>

            <footer>
                <p>&copy; 2016 Кинологический центр "Симаргл".</p>
                <p>
                    <small> Powered by Eparst<a href="http://med24.ru/index.php?option=com_contact&view=category&catid=12&Itemid=96" target="_blank">
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
                  DATE: Sat Mar 05 17:29:33 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/main.scala.html
                  HASH: 8d1db27c293bc3050a2dc2d5cb84c2de7567d221
                  MATRIX: 755->1|1000->49|1028->156|1055->157|1110->186|1124->192|1151->199|1207->229|1232->234|1300->307|1336->316|1560->535|1596->544|1668->589|1683->595|1743->634|1831->695|1846->701|1899->733|1974->781|1989->787|2065->841|2149->898|2164->904|2243->961|2327->1018|2342->1024|2384->1045|2446->1208|2483->1240|2519->1249|2583->1286|2598->1292|2657->1330|2734->1380|2749->1386|2829->1444|2880->1468|2895->1474|2942->1500|3496->2027|3553->2063|3592->2075|3607->2081|3649->2101|3680->2104|3746->2148|3819->2194|3884->2238|3923->2250|3938->2256|3981->2277|4061->2330|4126->2374|4165->2386|4180->2392|4223->2413|4309->2472|4374->2516|4413->2528|4428->2534|4471->2555|4540->2597|4605->2641|4644->2653|4659->2659|4702->2680|4771->2722|4836->2766|4875->2778|4890->2784|4933->2805|4997->2842|5059->2883|5098->2895|5113->2901|5154->2921|5240->2980|5305->3024|5344->3036|5359->3042|5402->3063|5473->3107|5530->3143|5569->3155|5584->3161|5631->3186|5662->3189|5734->3239|5764->3240|5854->3303|5882->3322|5922->3324|5979->3353|6018->3365|6071->3397|6110->3409|6125->3415|6168->3436|6199->3439|6267->3485|6333->3520|6382->3541|6436->3568|6463->3586|6503->3588|6556->3613|6649->3679|6703->3724|6751->3734|6808->3763|6991->3918|7005->3922|7032->3927|7062->3928|7240->4079|7294->4112|7333->4124|7349->4130|7393->4152|7424->4155|7493->4202|7580->4262|7595->4268|7631->4283|7661->4286|7732->4335|7881->4457|7896->4463|7937->4483|8036->4555|8051->4561|8092->4581|8288->4750|8300->4753|8383->4814|8439->4842|8507->4888|8645->4995|8698->5020|8744->5047|8784->5049|8837->5074|8874->5084|8889->5090|8930->5110|9009->5161|9064->5194|9095->5197|9162->5242|9219->5268|9265->5286|9432->5426|9488->5473|9528->5475|9573->5492|9852->5744|9868->5751|9922->5784|9967->5801|10018->5821|10059->5835|10117->5884|10157->5886|10202->5903|10482->6156|10498->6163|10554->6198|10599->6215|10650->6235|10691->6249|10719->6256|10761->6270
                  LINES: 27->1|33->1|35->5|36->6|37->7|37->7|37->7|39->9|39->9|41->11|42->12|45->15|46->16|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->22|52->23|53->24|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|68->39|68->39|68->39|68->39|68->39|68->39|68->39|69->40|69->40|69->40|69->40|69->40|70->41|70->41|70->41|70->41|70->41|71->42|71->42|71->42|71->42|71->42|72->43|72->43|72->43|72->43|72->43|73->44|73->44|73->44|73->44|73->44|74->45|74->45|74->45|74->45|74->45|75->46|75->46|75->46|75->46|75->46|76->47|76->47|76->47|76->47|76->47|76->47|76->47|76->47|78->49|78->49|78->49|79->50|79->50|79->50|79->50|79->50|79->50|79->50|79->50|80->51|81->52|82->53|82->53|82->53|83->54|84->55|84->55|84->55|85->56|86->57|86->57|86->57|86->57|88->59|88->59|88->59|88->59|88->59|88->59|88->59|89->60|89->60|89->60|89->60|89->60|91->62|91->62|91->62|92->63|92->63|92->63|94->65|94->65|94->65|94->65|94->65|97->68|98->69|99->70|99->70|100->71|100->71|100->71|100->71|100->71|100->71|100->71|100->71|101->72|103->74|109->80|109->80|109->80|110->81|113->84|113->84|113->84|114->85|115->86|116->87|116->87|116->87|117->88|120->91|120->91|120->91|121->92|122->93|123->94|123->94|125->96
                  -- GENERATED --
              */
          