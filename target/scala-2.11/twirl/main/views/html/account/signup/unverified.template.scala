
package views.html.account.signup

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
object unverified extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main(Messages("playauthenticate.verify.email.title"))/*1.55*/ {_display_(Seq[Any](format.raw/*1.57*/("""

	"""),format.raw/*3.2*/("""<h1>"""),_display_(/*3.7*/Messages("playauthenticate.verify.email.title")),format.raw/*3.54*/("""</h1>
	<p>
		"""),_display_(/*5.4*/Messages("playauthenticate.verify.email.requirement")),format.raw/*5.57*/("""</br>
		"""),_display_(/*6.4*/Messages("playauthenticate.verify.email.cta")),format.raw/*6.49*/("""
	"""),format.raw/*7.2*/("""<br/>
	
	</p>
""")))}),format.raw/*10.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 15:53:59 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/signup/unverified.scala.html
                  HASH: 4fbf1185ca3c39dda89c1efaa55c3df7d29b2cf7
                  MATRIX: 818->1|879->54|918->56|947->59|977->64|1044->111|1083->125|1156->178|1190->187|1255->232|1283->234|1328->249
                  LINES: 29->1|29->1|29->1|31->3|31->3|31->3|33->5|33->5|34->6|34->6|35->7|38->10
                  -- GENERATED --
              */
          