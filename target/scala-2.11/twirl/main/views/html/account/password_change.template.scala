
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
object password_change extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.Account.PasswordChange],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(changeForm: Form[controllers.Account.PasswordChange]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*4.75*/("""

"""),_display_(/*6.2*/main(Messages("playauthenticate.change.password.title"))/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""

	"""),format.raw/*8.2*/("""<h1>"""),_display_(/*8.7*/Messages("playauthenticate.change.password.title")),format.raw/*8.57*/("""</h1>
	<p>
	"""),_display_(/*10.3*/form(routes.Account.doChangePassword, 'class -> "form-inline", 'role -> "form")/*10.82*/ {_display_(Seq[Any](format.raw/*10.84*/("""

       """),_display_(/*12.9*/if(changeForm.hasGlobalErrors)/*12.39*/ {_display_(Seq[Any](format.raw/*12.41*/("""
        """),format.raw/*13.9*/("""<p class="alert alert-danger">
          """),_display_(/*14.12*/changeForm/*14.22*/.globalError.message),format.raw/*14.42*/("""
     	"""),format.raw/*15.7*/("""</p>
       """)))}),format.raw/*16.9*/("""

	   """),_display_(/*18.6*/_passwordPartial(changeForm)),format.raw/*18.34*/("""

    """),format.raw/*20.5*/("""<button type="submit" class="btn btn-default">"""),_display_(/*20.52*/Messages("playauthenticate.change.password.cta")),format.raw/*20.100*/("""</button>
	""")))}),format.raw/*21.3*/("""
	"""),format.raw/*22.2*/("""</p>
""")))}),format.raw/*23.2*/("""
"""))}
  }

  def render(changeForm:Form[controllers.Account.PasswordChange]): play.twirl.api.HtmlFormat.Appendable = apply(changeForm)

  def f:((Form[controllers.Account.PasswordChange]) => play.twirl.api.HtmlFormat.Appendable) = (changeForm) => apply(changeForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 14:19:12 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/password_change.scala.html
                  HASH: f6eb98f0d5f1836bfadbb6b03eb5b3e4388f9c3d
                  MATRIX: 775->1|924->75|956->99|1035->55|1064->148|1092->151|1156->207|1195->209|1224->212|1254->217|1324->267|1363->280|1451->359|1491->361|1527->371|1566->401|1606->403|1642->412|1711->454|1730->464|1771->484|1805->491|1848->504|1881->511|1930->539|1963->545|2037->592|2107->640|2149->652|2178->654|2214->660
                  LINES: 26->1|28->4|28->4|29->1|31->4|33->6|33->6|33->6|35->8|35->8|35->8|37->10|37->10|37->10|39->12|39->12|39->12|40->13|41->14|41->14|41->14|42->15|43->16|45->18|45->18|47->20|47->20|47->20|48->21|49->22|50->23
                  -- GENERATED --
              */
          