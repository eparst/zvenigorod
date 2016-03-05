
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ask_link_Scope0 {
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

class ask_link extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(acceptForm: Form[Account.Accept], newAccount: com.feth.play.module.pa.user.AuthUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
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
"""))
      }
    }
  }

  def render(acceptForm:Form[Account.Accept],newAccount:com.feth.play.module.pa.user.AuthUser): play.twirl.api.HtmlFormat.Appendable = apply(acceptForm,newAccount)

  def f:((Form[Account.Accept],com.feth.play.module.pa.user.AuthUser) => play.twirl.api.HtmlFormat.Appendable) = (acceptForm,newAccount) => apply(acceptForm,newAccount)

  def ref: this.type = this

}


}

/**/
object ask_link extends ask_link_Scope0.ask_link
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 01:00:18 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/account/ask_link.scala.html
                  HASH: 4879e4cd4a49f6bb4e658a9e87a954337345e88e
                  MATRIX: 811->1|989->182|1001->187|1081->191|1109->194|1168->233|1196->235|1278->296|1311->106|1343->130|1422->86|1451->179|1479->298|1508->301|1570->354|1610->356|1640->359|1671->364|1739->411|1778->424|1860->497|1900->499|1942->514|1981->544|2021->546|2060->557|2131->601|2150->611|2191->631|2227->640|2276->658|2309->665|2641->976|2674->982|2748->1029|2813->1073|2855->1085|2884->1087|2920->1093
                  LINES: 27->1|31->6|31->6|33->6|34->7|34->7|34->7|34->7|35->4|35->4|36->1|38->4|40->8|42->10|42->10|42->10|44->12|44->12|44->12|46->14|46->14|46->14|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|54->22|62->30|64->32|64->32|64->32|65->33|66->34|67->35
                  -- GENERATED --
              */
          