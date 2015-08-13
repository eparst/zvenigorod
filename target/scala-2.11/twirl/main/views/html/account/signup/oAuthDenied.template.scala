
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object oAuthDenied_Scope0 {
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

class oAuthDenied extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(providerKey: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""

"""),_display_(/*3.2*/main(Messages("playauthenticate.oauth.access.denied.title"))/*3.62*/ {_display_(Seq[Any](format.raw/*3.64*/("""

	"""),format.raw/*5.2*/("""<h1>"""),_display_(/*5.7*/Messages("playauthenticate.oauth.access.denied.title")),format.raw/*5.61*/("""</h1>
	<p>
		"""),_display_(/*7.4*/Messages("playauthenticate.oauth.access.denied.explanation")),format.raw/*7.64*/("""<br/>
	</p>
	<p>
		"""),_display_(/*10.4*/Messages("playauthenticate.oauth.access.denied.alternative")),format.raw/*10.64*/(""" """),format.raw/*10.65*/("""<a href=""""),_display_(/*10.75*/routes/*10.81*/.Application.signup),format.raw/*10.100*/("""">"""),_display_(/*10.103*/Messages("playauthenticate.oauth.access.denied.alternative.cta")),format.raw/*10.167*/("""</a>.
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(providerKey:String): play.twirl.api.HtmlFormat.Appendable = apply(providerKey)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (providerKey) => apply(providerKey)

  def ref: this.type = this

}


}

/**/
object oAuthDenied extends oAuthDenied_Scope0.oAuthDenied
              /*
                  -- GENERATED --
                  DATE: Thu Aug 13 15:34:55 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/signup/oAuthDenied.scala.html
                  HASH: 37eadd570bd353f8cd4761de922a288a7cda5fa1
                  MATRIX: 772->1|888->22|916->25|984->85|1023->87|1052->90|1082->95|1156->149|1195->163|1275->223|1321->243|1402->303|1431->304|1468->314|1483->320|1524->339|1555->342|1641->406|1678->413
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|38->7|38->7|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11
                  -- GENERATED --
              */
          