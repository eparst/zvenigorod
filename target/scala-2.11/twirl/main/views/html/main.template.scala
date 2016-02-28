
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
                    	<li class=""""),_display_(/*39.34*/("active".when(nav == ""))),format.raw/*39.60*/(""""><a href=""""),_display_(/*39.72*/routes/*39.78*/.Application.index()),format.raw/*39.98*/("""">"""),_display_(/*39.101*/Messages("playauthenticate.navigation.home")),format.raw/*39.145*/("""</a></li>
                        <li class=""""),_display_(/*40.37*/("active".when("request.path" == "/posts/71"))),format.raw/*40.83*/(""""><a href=""""),_display_(/*40.95*/routes/*40.101*/.Application.show(71)),format.raw/*40.122*/("""">О нас</a></li>
                        <li class=""""),_display_(/*41.37*/("active".when("request.path" == "/posts/92"))),format.raw/*41.83*/(""""><a href=""""),_display_(/*41.95*/routes/*41.101*/.Application.show(92)),format.raw/*41.122*/("""">Дрессировка</a></li>
                        <li class=""""),_display_(/*42.37*/("active".when("request.path" == "/posts/93"))),format.raw/*42.83*/(""""><a href=""""),_display_(/*42.95*/routes/*42.101*/.Application.show(93)),format.raw/*42.122*/("""">Зоогостиница</a></li>
						<li class=""""),_display_(/*43.19*/("active".when("request.path" == "/posts/94"))),format.raw/*43.65*/(""""><a href=""""),_display_(/*43.77*/routes/*43.83*/.Application.show(94)),format.raw/*43.104*/("""">Безопасность</a></li>
						<li class=""""),_display_(/*44.19*/("active".when("request.path" == "/posts/91"))),format.raw/*44.65*/(""""><a href=""""),_display_(/*44.77*/routes/*44.83*/.Application.show(91)),format.raw/*44.104*/("""">Вольеры</a></li>
						<li class=""""),_display_(/*45.19*/("active".when("request.path" == "/posts/11"))),format.raw/*45.65*/(""""><a href=""""),_display_(/*45.77*/routes/*45.83*/.Application.show(11)),format.raw/*45.104*/("""">Фотогалерея</a></li>
                        <li class=""""),_display_(/*46.37*/("active".when("request.path" == "/posts/75"))),format.raw/*46.83*/(""""><a href=""""),_display_(/*46.95*/routes/*46.101*/.Application.show(75)),format.raw/*46.122*/("""">Контакты</a></li>
						  <!--<li class=""""),_display_(/*47.25*/("active".when(nav == "restricted"))),format.raw/*47.61*/(""""><a href=""""),_display_(/*47.73*/routes/*47.79*/.Application.restricted()),format.raw/*47.104*/("""">"""),_display_(/*47.107*/Messages("playauthenticate.navigation.restricted")),format.raw/*47.157*/(""" """),format.raw/*47.158*/("""</a></li>-->
                            
                        
                        """),_display_(/*50.26*/subjectNotPresent()/*50.45*/ {_display_(Seq[Any](format.raw/*50.47*/("""
                            """),format.raw/*51.29*/("""<li class=""""),_display_(/*51.41*/("active".when(nav == "signup"))),format.raw/*51.73*/(""""><a href=""""),_display_(/*51.85*/routes/*51.91*/.Application.signup()),format.raw/*51.112*/("""">"""),_display_(/*51.115*/Messages("playauthenticate.navigation.signup")),format.raw/*51.161*/("""</a></li>
                        """)))}),format.raw/*52.26*/("""
                    """),format.raw/*53.21*/("""</ul>
                    """),_display_(/*54.22*/subjectPresentOr()/*54.40*/ {_display_(Seq[Any](format.raw/*54.42*/("""
                        """),format.raw/*55.25*/("""<ul class="nav navbar-nav navbar-right">
                        """),_display_(/*56.26*/defining(Application.getLocalUser(session()))/*56.71*/ { user =>_display_(Seq[Any](format.raw/*56.81*/("""
                            """),format.raw/*57.29*/("""<li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-user"></i> """),_display_(/*58.134*/user/*58.138*/.name),format.raw/*58.143*/(""" """),format.raw/*58.144*/("""<span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li class=""""),_display_(/*60.49*/("active".when(nav == "profile"))),format.raw/*60.82*/(""""><a href=""""),_display_(/*60.94*/routes/*60.100*/.Application.profile()),format.raw/*60.122*/("""">"""),_display_(/*60.125*/Messages("playauthenticate.navigation.profile")),format.raw/*60.172*/("""</a></li>
                                    <li><a href=""""),_display_(/*61.51*/routes/*61.57*/.Account.link()),format.raw/*61.72*/("""">"""),_display_(/*61.75*/Messages("playauthenticate.navigation.link_more")),format.raw/*61.124*/("""</a></li>
                                    <li class="divider"></li>
                                    <li><a href=""""),_display_(/*63.51*/routes/*63.57*/.Application.admin()),format.raw/*63.77*/("""">My Posts</a></li>
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
                  DATE: Sun Feb 28 19:14:11 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/main.scala.html
                  HASH: d8e8fa7efa2a065bd8d123372387dd92ee38f880
                  MATRIX: 755->1|1000->49|1028->156|1055->157|1110->186|1124->192|1151->199|1207->229|1232->234|1300->307|1336->316|1560->535|1596->544|1668->589|1683->595|1743->634|1831->695|1846->701|1899->733|1974->781|1989->787|2065->841|2149->898|2164->904|2243->961|2327->1018|2342->1024|2384->1045|2446->1208|2483->1240|2519->1249|2583->1286|2598->1292|2657->1330|2734->1380|2749->1386|2829->1444|2880->1468|2895->1474|2942->1500|3496->2027|3543->2053|3582->2065|3597->2071|3638->2091|3669->2094|3735->2138|3808->2184|3875->2230|3914->2242|3930->2248|3973->2269|4053->2322|4120->2368|4159->2380|4175->2386|4218->2407|4304->2466|4371->2512|4410->2524|4426->2530|4469->2551|4538->2593|4605->2639|4644->2651|4659->2657|4702->2678|4771->2720|4838->2766|4877->2778|4892->2784|4935->2805|4999->2842|5066->2888|5105->2900|5120->2906|5163->2927|5249->2986|5316->3032|5355->3044|5371->3050|5414->3071|5485->3115|5542->3151|5581->3163|5596->3169|5643->3194|5674->3197|5746->3247|5776->3248|5895->3340|5923->3359|5963->3361|6020->3390|6059->3402|6112->3434|6151->3446|6166->3452|6209->3473|6240->3476|6308->3522|6374->3557|6423->3578|6477->3605|6504->3623|6544->3625|6597->3650|6690->3716|6744->3761|6792->3771|6849->3800|7032->3955|7046->3959|7073->3964|7103->3965|7281->4116|7335->4149|7374->4161|7390->4167|7434->4189|7465->4192|7534->4239|7621->4299|7636->4305|7672->4320|7702->4323|7773->4372|7922->4494|7937->4500|7978->4520|8173->4688|8185->4691|8268->4752|8324->4780|8392->4826|8530->4933|8583->4958|8629->4985|8669->4987|8722->5012|8759->5022|8774->5028|8815->5048|8894->5099|8949->5132|8980->5135|9047->5180|9104->5206|9150->5224|9317->5364|9373->5411|9413->5413|9458->5430|9737->5682|9753->5689|9807->5722|9852->5739|9903->5759|9944->5773|10002->5822|10042->5824|10087->5841|10367->6094|10383->6101|10439->6136|10484->6153|10535->6173|10576->6187|10604->6194|10646->6208
                  LINES: 27->1|33->1|35->5|36->6|37->7|37->7|37->7|39->9|39->9|41->11|42->12|45->15|46->16|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->22|52->23|53->24|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|68->39|68->39|68->39|68->39|68->39|68->39|68->39|69->40|69->40|69->40|69->40|69->40|70->41|70->41|70->41|70->41|70->41|71->42|71->42|71->42|71->42|71->42|72->43|72->43|72->43|72->43|72->43|73->44|73->44|73->44|73->44|73->44|74->45|74->45|74->45|74->45|74->45|75->46|75->46|75->46|75->46|75->46|76->47|76->47|76->47|76->47|76->47|76->47|76->47|76->47|79->50|79->50|79->50|80->51|80->51|80->51|80->51|80->51|80->51|80->51|80->51|81->52|82->53|83->54|83->54|83->54|84->55|85->56|85->56|85->56|86->57|87->58|87->58|87->58|87->58|89->60|89->60|89->60|89->60|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|92->63|92->63|92->63|94->65|94->65|94->65|94->65|94->65|97->68|98->69|99->70|99->70|100->71|100->71|100->71|100->71|100->71|100->71|100->71|100->71|101->72|103->74|109->80|109->80|109->80|110->81|113->84|113->84|113->84|114->85|115->86|116->87|116->87|116->87|117->88|120->91|120->91|120->91|121->92|122->93|123->94|123->94|125->96
                  -- GENERATED --
              */
          