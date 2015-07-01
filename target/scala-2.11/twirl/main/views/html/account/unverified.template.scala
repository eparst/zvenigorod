
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
object unverified extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main(Messages("playauthenticate.verify.account.title"))/*1.57*/ {_display_(Seq[Any](format.raw/*1.59*/("""

	"""),format.raw/*3.2*/("""<h1>"""),_display_(/*3.7*/Messages("playauthenticate.verify.account.title")),format.raw/*3.56*/("""</h1>
	<p>
	"""),_display_(/*5.3*/Messages("playauthenticate.verify.account.before")),format.raw/*5.53*/(""" """),format.raw/*5.54*/("""<a href=""""),_display_(/*5.64*/routes/*5.70*/.Account.verifyEmail),format.raw/*5.90*/("""">"""),_display_(/*5.93*/Messages("playauthenticate.verify.account.first")),format.raw/*5.142*/("""</a>.<br/>
	</p>
""")))}),format.raw/*7.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 14:37:47 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/unverified.scala.html
                  HASH: f9ac6b960543a760966b326895339aee89ad061e
                  MATRIX: 811->1|874->56|913->58|942->61|972->66|1041->115|1079->128|1149->178|1177->179|1213->189|1227->195|1267->215|1296->218|1366->267|1413->285
                  LINES: 29->1|29->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|33->5|33->5|33->5|33->5|35->7
                  -- GENERATED --
              */
          