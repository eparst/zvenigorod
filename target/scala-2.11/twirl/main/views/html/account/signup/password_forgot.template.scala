
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_forgot_Scope0 {
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

class password_forgot extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[providers.MyUsernamePasswordAuthProvider.MyIdentity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(emailForm: Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*4.75*/("""

"""),_display_(/*6.2*/main(Messages("playauthenticate.password.forgot.title"))/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""

	"""),format.raw/*8.2*/("""<h1>"""),_display_(/*8.7*/Messages("playauthenticate.password.forgot.title")),format.raw/*8.57*/("""</h1>
	<p>
	"""),_display_(/*10.3*/form(routes.Signup.doForgotPassword, 'class -> "form-inline", 'role -> "form")/*10.81*/ {_display_(Seq[Any](format.raw/*10.83*/("""

            """),_display_(/*12.14*/if(emailForm.hasGlobalErrors)/*12.43*/ {_display_(Seq[Any](format.raw/*12.45*/("""
		        """),format.raw/*13.11*/("""<p class="alert alert-danger">
		          """),_display_(/*14.14*/emailForm/*14.23*/.globalError.message),format.raw/*14.43*/("""
		     	"""),format.raw/*15.9*/("""</p>
            """)))}),format.raw/*16.14*/("""

	   """),_display_(/*18.6*/_emailPartial(emailForm)),format.raw/*18.30*/("""

    """),format.raw/*20.5*/("""<button type="submit" class="btn btn-default">"""),_display_(/*20.52*/Messages("playauthenticate.password.forgot.cta")),format.raw/*20.100*/("""</button>
	""")))}),format.raw/*21.3*/("""
	"""),format.raw/*22.2*/("""</p>
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(emailForm:Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]): play.twirl.api.HtmlFormat.Appendable = apply(emailForm)

  def f:((Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]) => play.twirl.api.HtmlFormat.Appendable) = (emailForm) => apply(emailForm)

  def ref: this.type = this

}


}

/**/
object password_forgot extends password_forgot_Scope0.password_forgot
              /*
                  -- GENERATED --
                  DATE: Wed Mar 02 03:01:32 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/account/signup/password_forgot.scala.html
                  HASH: b464021dd851f99967f3eb248c9167eb39da218f
                  MATRIX: 831->1|1003->91|1035->115|1114->71|1143->164|1171->167|1235->223|1274->225|1303->228|1333->233|1403->283|1442->296|1529->374|1569->376|1611->391|1649->420|1689->422|1728->433|1799->477|1817->486|1858->506|1894->515|1943->533|1976->540|2021->564|2054->570|2128->617|2198->665|2240->677|2269->679|2305->685
                  LINES: 27->1|31->4|31->4|32->1|34->4|36->6|36->6|36->6|38->8|38->8|38->8|40->10|40->10|40->10|42->12|42->12|42->12|43->13|44->14|44->14|44->14|45->15|46->16|48->18|48->18|50->20|50->20|50->20|51->21|52->22|53->23
                  -- GENERATED --
              */
          