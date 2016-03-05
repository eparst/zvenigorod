
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_change_Scope0 {
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

class password_change extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.Account.PasswordChange],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(changeForm: Form[controllers.Account.PasswordChange]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
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
"""))
      }
    }
  }

  def render(changeForm:Form[controllers.Account.PasswordChange]): play.twirl.api.HtmlFormat.Appendable = apply(changeForm)

  def f:((Form[controllers.Account.PasswordChange]) => play.twirl.api.HtmlFormat.Appendable) = (changeForm) => apply(changeForm)

  def ref: this.type = this

}


}

/**/
object password_change extends password_change_Scope0.password_change
              /*
                  -- GENERATED --
                  DATE: Wed Mar 02 03:01:31 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/account/password_change.scala.html
                  HASH: 8ebd460af0b285a1d050267e63e360dd027365f2
                  MATRIX: 807->1|963->75|995->99|1074->55|1103->148|1131->151|1195->207|1234->209|1263->212|1293->217|1363->267|1402->280|1490->359|1530->361|1566->371|1605->401|1645->403|1681->412|1750->454|1769->464|1810->484|1844->491|1887->504|1920->511|1969->539|2002->545|2076->592|2146->640|2188->652|2217->654|2253->660
                  LINES: 27->1|31->4|31->4|32->1|34->4|36->6|36->6|36->6|38->8|38->8|38->8|40->10|40->10|40->10|42->12|42->12|42->12|43->13|44->14|44->14|44->14|45->15|46->16|48->18|48->18|50->20|50->20|50->20|51->21|52->22|53->23
                  -- GENERATED --
              */
          