
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(localUser: models.User = null):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(Messages("playauthenticate.profile.title"),"profile")/*5.60*/ {_display_(Seq[Any](format.raw/*5.62*/("""

    """),format.raw/*7.5*/("""<h1>"""),_display_(/*7.10*/Messages("playauthenticate.profile.title")),format.raw/*7.52*/("""</h1>
    <p>
    Your name is """),_display_(/*9.19*/localUser/*9.28*/.name),format.raw/*9.33*/(""" """),format.raw/*9.34*/("""and your email address is """),_display_(/*9.61*/if(!localUser.email)/*9.81*/ {_display_(Seq[Any](format.raw/*9.83*/("""<em>&lt;unknown&gt;</em>.""")))}/*9.110*/else/*9.115*/{_display_(Seq[Any](format.raw/*9.116*/("""
    	"""),_display_(/*10.7*/localUser/*10.16*/.email),format.raw/*10.22*/(""".
	    <i>
	    """),_display_(/*12.7*/if(!localUser.emailValidated && localUser.email)/*12.55*/ {_display_(Seq[Any](format.raw/*12.57*/("""
	      """),format.raw/*13.8*/("""(<a href=""""),_display_(/*13.19*/routes/*13.25*/.Account.verifyEmail),format.raw/*13.45*/("""">unverified - click to verify</a>)
	    """)))}/*14.8*/else/*14.13*/{_display_(Seq[Any](format.raw/*14.14*/("""
	      """),format.raw/*15.8*/("""(verified)
	    """)))}),format.raw/*16.7*/("""</i>
    """)))}),format.raw/*17.6*/("""
    """),format.raw/*18.5*/("""<br />
        """),_display_(/*19.10*/if(localUser.firstName && localUser.lastName)/*19.55*/ {_display_(Seq[Any](format.raw/*19.57*/("""
            """),format.raw/*20.13*/("""Your first name is """),_display_(/*20.33*/localUser/*20.42*/.firstName),format.raw/*20.52*/(""" """),format.raw/*20.53*/("""and your last name is """),_display_(/*20.76*/localUser/*20.85*/.lastName),format.raw/*20.94*/("""
            """),format.raw/*21.13*/("""<br/>
        """)))}),format.raw/*22.10*/("""
    """),_display_(/*23.6*/defining(localUser.getProviders())/*23.40*/ { providers =>_display_(Seq[Any](format.raw/*23.55*/("""
        """),_display_(/*24.10*/if(providers.size() > 0)/*24.34*/ {_display_(Seq[Any](format.raw/*24.36*/("""
        """),_display_(/*25.10*/if(providers.size() ==1)/*25.34*/ {_display_(Seq[Any](format.raw/*25.36*/("""
            """),_display_(/*26.14*/Messages("playauthenticate.profile.providers_one")),format.raw/*26.64*/("""
        """)))}/*27.11*/else/*27.16*/{_display_(Seq[Any](format.raw/*27.17*/("""
            """),_display_(/*28.14*/Messages("playauthenticate.profile.providers_many",providers.size().toString())),format.raw/*28.93*/("""
        """)))}),format.raw/*29.10*/("""
        """),_display_(/*30.10*/for(p <- providers) yield /*30.29*/ {_display_(Seq[Any](format.raw/*30.31*/("""
            """),_display_(/*31.14*/_providerIcon(p)),format.raw/*31.30*/("""
        """)))}),format.raw/*32.10*/("""
        """),format.raw/*33.9*/("""<br/>
        """)))}),format.raw/*34.10*/("""
    """)))}),format.raw/*35.6*/("""

    """),format.raw/*37.5*/("""<br/>
    """),_display_(/*38.6*/currentAuth()/*38.19*/ { auth =>_display_(Seq[Any](format.raw/*38.29*/("""
        """),_display_(/*39.10*/Messages("playauthenticate.profile.logged")),format.raw/*39.53*/(""" """),_display_(/*39.55*/_providerIcon(auth.getProvider())),format.raw/*39.88*/("""<br/>
        """),_display_(/*40.10*/if(auth.expires() != -1)/*40.34*/{_display_(Seq[Any](format.raw/*40.35*/("""
            """),_display_(/*41.14*/Messages("playauthenticate.profile.session", auth.getId(), Application.formatTimestamp(auth.expires()))),format.raw/*41.117*/("""
        """)))}/*42.11*/else/*42.16*/{_display_(Seq[Any](format.raw/*42.17*/("""
            """),_display_(/*43.14*/Messages("playauthenticate.profile.session_endless", auth.getId())),format.raw/*43.80*/("""
        """)))}),format.raw/*44.10*/("""
    """)))}),format.raw/*45.6*/("""
    """),format.raw/*49.12*/("""
 """),format.raw/*50.2*/("""</p>
""")))}),format.raw/*51.2*/("""
"""))
      }
    }
  }

  def render(localUser:models.User): play.twirl.api.HtmlFormat.Appendable = apply(localUser)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (localUser) => apply(localUser)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 01:07:40 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/profile.scala.html
                  HASH: ff47a4fa22079c1eaa986e7388be2d7004b0766a
                  MATRIX: 754->1|923->32|951->79|978->81|1044->139|1083->141|1115->147|1146->152|1208->194|1266->226|1283->235|1308->240|1336->241|1389->268|1417->288|1456->290|1501->317|1514->322|1553->323|1586->330|1604->339|1631->345|1674->362|1731->410|1771->412|1806->420|1844->431|1859->437|1900->457|1960->500|1973->505|2012->506|2047->514|2094->531|2134->541|2166->546|2209->562|2263->607|2303->609|2344->622|2391->642|2409->651|2440->661|2469->662|2519->685|2537->694|2567->703|2608->716|2654->731|2686->737|2729->771|2782->786|2819->796|2852->820|2892->822|2929->832|2962->856|3002->858|3043->872|3114->922|3143->933|3156->938|3195->939|3236->953|3336->1032|3377->1042|3414->1052|3449->1071|3489->1073|3530->1087|3567->1103|3608->1113|3644->1122|3690->1137|3726->1143|3759->1149|3796->1160|3818->1173|3866->1183|3903->1193|3967->1236|3996->1238|4050->1271|4092->1286|4125->1310|4164->1311|4205->1325|4330->1428|4359->1439|4372->1444|4411->1445|4452->1459|4539->1525|4580->1535|4616->1541|4649->1687|4678->1689|4714->1695
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|37->7|37->7|37->7|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|40->10|40->10|40->10|42->12|42->12|42->12|43->13|43->13|43->13|43->13|44->14|44->14|44->14|45->15|46->16|47->17|48->18|49->19|49->19|49->19|50->20|50->20|50->20|50->20|50->20|50->20|50->20|50->20|51->21|52->22|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|57->27|57->27|57->27|58->28|58->28|59->29|60->30|60->30|60->30|61->31|61->31|62->32|63->33|64->34|65->35|67->37|68->38|68->38|68->38|69->39|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|72->42|72->42|72->42|73->43|73->43|74->44|75->45|76->49|77->50|78->51
                  -- GENERATED --
              */
          