
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
object password_reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.Signup.PasswordReset],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resetForm: Form[controllers.Signup.PasswordReset]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
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
"""))}
  }

  def render(resetForm:Form[controllers.Signup.PasswordReset]): play.twirl.api.HtmlFormat.Appendable = apply(resetForm)

  def f:((Form[controllers.Signup.PasswordReset]) => play.twirl.api.HtmlFormat.Appendable) = (resetForm) => apply(resetForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 09 16:44:42 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/signup/password_reset.scala.html
                  HASH: ef6150efe9da2e27b893667324aaf6498ceb530e
                  MATRIX: 779->1|925->72|957->96|1036->52|1065->145|1093->148|1156->203|1195->205|1224->208|1254->213|1323->262|1362->275|1452->356|1492->358|1528->368|1566->397|1606->399|1641->407|1710->449|1728->458|1769->478|1803->485|1846->498|1884->509|1986->603|2053->632|2087->639|2143->668|2169->673|2205->682|2230->686|2264->693|2287->695|2317->698|2354->714|2389->719|2422->726|2470->753|2503->759|2577->806|2645->853|2687->865|2716->867|2752->873
                  LINES: 26->1|28->4|28->4|29->1|31->4|33->6|33->6|33->6|35->8|35->8|35->8|37->10|37->10|37->10|39->12|39->12|39->12|41->14|42->15|42->15|42->15|43->16|44->17|46->19|51->24|51->24|52->25|52->25|52->25|52->25|52->25|52->25|52->25|52->25|52->25|53->26|55->28|55->28|57->30|57->30|57->30|58->31|59->32|60->33
                  -- GENERATED --
              */
          