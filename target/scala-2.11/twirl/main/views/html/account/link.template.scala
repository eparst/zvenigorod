
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
object link extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.link.account.title"))/*2.55*/ {_display_(Seq[Any](format.raw/*2.57*/("""
    
    """),format.raw/*4.5*/("""<h1>"""),_display_(/*4.10*/Messages("playauthenticate.link.account.title")),format.raw/*4.57*/("""</h1>
    
    <p>
	"""),_display_(/*7.3*/_providerPartial()),format.raw/*7.21*/("""
    """),format.raw/*8.5*/("""<br/>
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
                  DATE: Tue Jun 30 16:53:12 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/link.scala.html
                  HASH: 694e2d60125f0aff5e2e3363e18ce49848110319
                  MATRIX: 805->2|866->55|905->57|941->67|972->72|1039->119|1085->140|1123->158|1154->163|1200->179
                  LINES: 29->2|29->2|29->2|31->4|31->4|31->4|34->7|34->7|35->8|37->10
                  -- GENERATED --
              */
          