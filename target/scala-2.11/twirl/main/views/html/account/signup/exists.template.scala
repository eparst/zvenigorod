
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
object exists extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.user.exists.title"))/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
	"""),format.raw/*3.2*/("""<h1>"""),_display_(/*3.7*/Messages("playauthenticate.user.exists.title")),format.raw/*3.53*/("""</h1>
	<p>"""),_display_(/*4.6*/Messages("playauthenticate.user.exists.message")),format.raw/*4.54*/("""</p>
""")))}),format.raw/*5.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 14:37:47 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/signup/exists.scala.html
                  HASH: 9eb2bb83eebeadbfcba9d90aa8374c7d3cae5f34
                  MATRIX: 814->2|874->54|913->56|941->58|971->63|1037->109|1073->120|1141->168|1176->174
                  LINES: 29->2|29->2|29->2|30->3|30->3|30->3|31->4|31->4|32->5
                  -- GENERATED --
              */
          