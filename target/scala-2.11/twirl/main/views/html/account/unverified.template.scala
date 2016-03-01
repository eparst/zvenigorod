
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object unverified_Scope0 {
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

class unverified extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main(Messages("playauthenticate.verify.account.title"))/*1.57*/ {_display_(Seq[Any](format.raw/*1.59*/("""

	"""),format.raw/*3.2*/("""<h1>"""),_display_(/*3.7*/Messages("playauthenticate.verify.account.title")),format.raw/*3.56*/("""</h1>
	<p>
	"""),_display_(/*5.3*/Messages("playauthenticate.verify.account.before")),format.raw/*5.53*/(""" """),format.raw/*5.54*/("""<a href=""""),_display_(/*5.64*/routes/*5.70*/.Account.verifyEmail),format.raw/*5.90*/("""">"""),_display_(/*5.93*/Messages("playauthenticate.verify.account.first")),format.raw/*5.142*/("""</a>.<br/>
	</p>
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object unverified extends unverified_Scope0.unverified
              /*
                  -- GENERATED --
                  DATE: Wed Mar 02 01:26:32 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/account/unverified.scala.html
                  HASH: 6178cf4c9b068dc3471fbee397cbb7e8cd6f2bcb
                  MATRIX: 845->1|908->56|947->58|976->61|1006->66|1075->115|1113->128|1183->178|1211->179|1247->189|1261->195|1301->215|1330->218|1400->267|1447->285
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|36->5|36->5|36->5|36->5|38->7
                  -- GENERATED --
              */
          