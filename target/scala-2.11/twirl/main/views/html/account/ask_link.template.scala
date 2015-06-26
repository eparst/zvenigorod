
package views.html.account

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
object ask_link extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(acceptForm: Form[Account.Accept], newAccount: com.feth.play.module.pa.user.AuthUser):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*6.2*/label/*6.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
	"""),_display_(/*7.3*/_providerIcon(newAccount.getProvider())),format.raw/*7.42*/(""" """),_display_(/*7.44*/Messages("playauthenticate.link.account.question",newAccount)),format.raw/*7.105*/("""
""")))};implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*1.87*/("""

"""),format.raw/*4.75*/("""

"""),format.raw/*8.2*/("""

"""),_display_(/*10.2*/main(Messages("playauthenticate.link.account.title"))/*10.55*/ {_display_(Seq[Any](format.raw/*10.57*/("""

	"""),format.raw/*12.2*/("""<h1>"""),_display_(/*12.7*/Messages("playauthenticate.link.account.title")),format.raw/*12.54*/("""</h1>
	<p>
	"""),_display_(/*14.3*/form(routes.Account.doLink, 'class -> "form-horizontal", 'role -> "form")/*14.76*/ {_display_(Seq[Any](format.raw/*14.78*/("""

            """),_display_(/*16.14*/if(acceptForm.hasGlobalErrors)/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/("""
		        """),format.raw/*17.11*/("""<p class="alert alert-danger">
		          """),_display_(/*18.14*/acceptForm/*18.24*/.globalError.message),format.raw/*18.44*/("""
		     	"""),format.raw/*19.9*/("""</p>
            """)))}),format.raw/*20.14*/("""

	   """),_display_(/*22.6*/inputRadioGroup(
            acceptForm("accept"),
            options = Seq(
            	"true"-> Messages("playauthenticate.link.account.true"),
            	"false"->Messages("playauthenticate.link.account.false")
            ),
            '_label -> label,
            '_showConstraints -> false
        )),format.raw/*30.10*/("""

    """),format.raw/*32.5*/("""<button type="submit" class="btn btn-default">"""),_display_(/*32.52*/Messages("playauthenticate.link.account.ok")),format.raw/*32.96*/("""</button>
	""")))}),format.raw/*33.3*/("""
	"""),format.raw/*34.2*/("""</p>
""")))}),format.raw/*35.2*/("""
"""))}
  }

  def render(acceptForm:Form[Account.Accept],newAccount:com.feth.play.module.pa.user.AuthUser): play.twirl.api.HtmlFormat.Appendable = apply(acceptForm,newAccount)

  def f:((Form[Account.Accept],com.feth.play.module.pa.user.AuthUser) => play.twirl.api.HtmlFormat.Appendable) = (acceptForm,newAccount) => apply(acceptForm,newAccount)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 09 16:44:42 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/ask_link.scala.html
                  HASH: c26ac3c92768ae44cf5b94b5b25455a13d3b9b74
                  MATRIX: 786->1|957->182|969->187|1049->191|1077->194|1136->233|1164->235|1246->296|1279->106|1311->130|1390->86|1419->179|1447->298|1476->301|1538->354|1578->356|1608->359|1639->364|1707->411|1746->424|1828->497|1868->499|1910->514|1949->544|1989->546|2028->557|2099->601|2118->611|2159->631|2195->640|2244->658|2277->665|2609->976|2642->982|2716->1029|2781->1073|2823->1085|2852->1087|2888->1093
                  LINES: 26->1|28->6|28->6|30->6|31->7|31->7|31->7|31->7|32->4|32->4|33->1|35->4|37->8|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|45->16|45->16|46->17|47->18|47->18|47->18|48->19|49->20|51->22|59->30|61->32|61->32|61->32|62->33|63->34|64->35
                  -- GENERATED --
              */
          