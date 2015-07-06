
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
object password_forgot extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[providers.MyUsernamePasswordAuthProvider.MyIdentity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(emailForm: Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
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
"""))}
  }

  def render(emailForm:Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]): play.twirl.api.HtmlFormat.Appendable = apply(emailForm)

  def f:((Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]) => play.twirl.api.HtmlFormat.Appendable) = (emailForm) => apply(emailForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 15:36:05 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/signup/password_forgot.scala.html
                  HASH: 431ae0b57dc0e4a032264aef78900013d7345961
                  MATRIX: 799->1|964->91|996->115|1075->71|1104->164|1132->167|1196->223|1235->225|1264->228|1294->233|1364->283|1403->296|1490->374|1530->376|1572->391|1610->420|1650->422|1689->433|1760->477|1778->486|1819->506|1855->515|1904->533|1937->540|1982->564|2015->570|2089->617|2159->665|2201->677|2230->679|2266->685
                  LINES: 26->1|28->4|28->4|29->1|31->4|33->6|33->6|33->6|35->8|35->8|35->8|37->10|37->10|37->10|39->12|39->12|39->12|40->13|41->14|41->14|41->14|42->15|43->16|45->18|45->18|47->20|47->20|47->20|48->21|49->22|50->23
                  -- GENERATED --
              */
          