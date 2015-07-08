
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
object no_token_or_invalid extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.token.error.title"))/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
	"""),format.raw/*3.2*/("""<h1>"""),_display_(/*3.7*/Messages("playauthenticate.token.error.title")),format.raw/*3.53*/("""</h1>
	<p>"""),_display_(/*4.6*/Messages("playauthenticate.token.error.message")),format.raw/*4.54*/("""</p>
""")))}),format.raw/*5.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 08 14:19:09 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/signup/no_token_or_invalid.scala.html
                  HASH: 95cd33e930c5cdf291b9a0871d5cb371304a9a6b
                  MATRIX: 827->2|887->54|926->56|954->58|984->63|1050->109|1086->120|1154->168|1189->174
                  LINES: 29->2|29->2|29->2|30->3|30->3|30->3|31->4|31->4|32->5
                  -- GENERATED --
              */
          