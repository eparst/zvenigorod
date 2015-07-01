
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
object ask_merge extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(acceptForm: Form[Account.Accept], aUser: com.feth.play.module.pa.user.AuthUser, bUser: com.feth.play.module.pa.user.AuthUser):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*6.2*/label/*6.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
	"""),_display_(/*7.3*/Messages("playauthenticate.merge.accounts.question",aUser,bUser)),format.raw/*7.67*/("""
""")))};implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*1.128*/("""

"""),format.raw/*4.75*/("""

"""),format.raw/*8.2*/("""

"""),_display_(/*10.2*/main(Messages("playauthenticate.merge.accounts.title"))/*10.57*/ {_display_(Seq[Any](format.raw/*10.59*/("""

	"""),format.raw/*12.2*/("""<h1>"""),_display_(/*12.7*/Messages("playauthenticate.merge.accounts.title")),format.raw/*12.56*/("""</h1>
	<p>
	"""),_display_(/*14.3*/form(routes.Account.doMerge, 'class -> "form-horizontal", 'role -> "form")/*14.77*/ {_display_(Seq[Any](format.raw/*14.79*/("""

            """),_display_(/*16.14*/if(acceptForm.hasGlobalErrors)/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/("""
		        """),format.raw/*17.11*/("""<p class="alert alert-danger">
		          """),_display_(/*18.14*/acceptForm/*18.24*/.globalError.message),format.raw/*18.44*/("""
		     	"""),format.raw/*19.9*/("""</p>
            """)))}),format.raw/*20.14*/("""

	   """),_display_(/*22.6*/inputRadioGroup(
            acceptForm("accept"),
            options = Seq(
            	"true"-> Messages("playauthenticate.merge.accounts.true"),
            	"false"->Messages("playauthenticate.merge.accounts.false")
            ),
            '_label -> label,
            '_showConstraints -> false
        )),format.raw/*30.10*/("""

    """),format.raw/*32.5*/("""<button type="submit" class="btn btn-default">"""),_display_(/*32.52*/Messages("playauthenticate.merge.accounts.ok")),format.raw/*32.98*/("""</button>
	""")))}),format.raw/*33.3*/("""
	"""),format.raw/*34.2*/("""</p>
""")))}),format.raw/*35.2*/("""
"""))}
  }

  def render(acceptForm:Form[Account.Accept],aUser:com.feth.play.module.pa.user.AuthUser,bUser:com.feth.play.module.pa.user.AuthUser): play.twirl.api.HtmlFormat.Appendable = apply(acceptForm,aUser,bUser)

  def f:((Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser) => play.twirl.api.HtmlFormat.Appendable) = (acceptForm,aUser,bUser) => apply(acceptForm,aUser,bUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 13:23:00 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/ask_merge.scala.html
                  HASH: b58a822996214c680056e80e7657032dc38bc0a3
                  MATRIX: 825->1|1037->223|1049->228|1129->232|1157->235|1241->299|1274->147|1306->171|1386->127|1415->220|1443->301|1472->304|1536->359|1576->361|1606->364|1637->369|1707->418|1746->431|1829->505|1869->507|1911->522|1950->552|1990->554|2029->565|2100->609|2119->619|2160->639|2196->648|2245->666|2278->673|2614->988|2647->994|2721->1041|2788->1087|2830->1099|2859->1101|2895->1107
                  LINES: 26->1|28->6|28->6|30->6|31->7|31->7|32->4|32->4|33->1|35->4|37->8|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|45->16|45->16|46->17|47->18|47->18|47->18|48->19|49->20|51->22|59->30|61->32|61->32|61->32|62->33|63->34|64->35
                  -- GENERATED --
              */
          