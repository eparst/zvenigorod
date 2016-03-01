
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_Scope0 {
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

class password_reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.Signup.PasswordReset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resetForm: Form[controllers.Signup.PasswordReset]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*4.75*/("""

"""),_display_(/*6.2*/main(Messages("playauthenticate.password.reset.title"))/*6.57*/ {_display_(Seq[Any](format.raw/*6.59*/("""

	"""),format.raw/*8.2*/("""<h1>"""),_display_(/*8.7*/Messages("playauthenticate.password.reset.title")),format.raw/*8.56*/("""</h1>
	<p>
	"""),_display_(/*10.3*/form(routes.Signup.doResetPassword, 'class -> "form-horizontal", 'role -> "form")/*10.84*/ {_display_(Seq[Any](format.raw/*10.86*/("""

       """),_display_(/*12.9*/if(resetForm.hasGlobalErrors)/*12.38*/ {_display_(Seq[Any](format.raw/*12.40*/("""

     	"""),format.raw/*14.7*/("""<p class="alert alert-danger">
          """),_display_(/*15.12*/resetForm/*15.21*/.globalError.message),format.raw/*15.41*/("""
     	"""),format.raw/*16.7*/("""</p>
       """)))}),format.raw/*17.9*/("""

        """),_display_(/*19.10*/input(
   			resetForm("token"),
   			'_label -> "",
   			'_showConstraints -> false

   		)/*24.7*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*24.36*/("""
		    """),format.raw/*25.7*/("""<input type="hidden" value=""""),_display_(/*25.36*/value),format.raw/*25.41*/("""" name=""""),_display_(/*25.50*/name),format.raw/*25.54*/("""" id=""""),_display_(/*25.61*/id),format.raw/*25.63*/("""" """),_display_(/*25.66*/toHtmlArgs(args)),format.raw/*25.82*/(""">
		""")))}),format.raw/*26.4*/("""

	   """),_display_(/*28.6*/_passwordPartial(resetForm)),format.raw/*28.33*/("""

    """),format.raw/*30.5*/("""<button type="submit" class="btn btn-default">"""),_display_(/*30.52*/Messages("playauthenticate.password.reset.cta")),format.raw/*30.99*/("""</button>
	""")))}),format.raw/*31.3*/("""
	"""),format.raw/*32.2*/("""</p>
""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(resetForm:Form[controllers.Signup.PasswordReset]): play.twirl.api.HtmlFormat.Appendable = apply(resetForm)

  def f:((Form[controllers.Signup.PasswordReset]) => play.twirl.api.HtmlFormat.Appendable) = (resetForm) => apply(resetForm)

  def ref: this.type = this

}


}

/**/
object password_reset extends password_reset_Scope0.password_reset
              /*
                  -- GENERATED --
                  DATE: Wed Mar 02 01:26:32 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/account/signup/password_reset.scala.html
                  HASH: b0f9416e0bd4f4780a6ed48b9be2b62b2cda7f42
                  MATRIX: 810->1|963->72|995->96|1074->52|1103->145|1131->148|1194->203|1233->205|1262->208|1292->213|1361->262|1400->275|1490->356|1530->358|1566->368|1604->397|1644->399|1679->407|1748->449|1766->458|1807->478|1841->485|1884->498|1922->509|2024->603|2091->632|2125->639|2181->668|2207->673|2243->682|2268->686|2302->693|2325->695|2355->698|2392->714|2427->719|2460->726|2508->753|2541->759|2615->806|2683->853|2725->865|2754->867|2790->873
                  LINES: 27->1|31->4|31->4|32->1|34->4|36->6|36->6|36->6|38->8|38->8|38->8|40->10|40->10|40->10|42->12|42->12|42->12|44->14|45->15|45->15|45->15|46->16|47->17|49->19|54->24|54->24|55->25|55->25|55->25|55->25|55->25|55->25|55->25|55->25|55->25|56->26|58->28|58->28|60->30|60->30|60->30|61->31|62->32|63->33
                  -- GENERATED --
              */
          