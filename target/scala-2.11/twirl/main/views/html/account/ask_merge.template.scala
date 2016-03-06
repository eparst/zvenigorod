
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ask_merge_Scope0 {
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

class ask_merge extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(acceptForm: Form[Account.Accept], aUser: com.feth.play.module.pa.user.AuthUser, bUser: com.feth.play.module.pa.user.AuthUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
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
"""))
      }
    }
  }

  def render(acceptForm:Form[Account.Accept],aUser:com.feth.play.module.pa.user.AuthUser,bUser:com.feth.play.module.pa.user.AuthUser): play.twirl.api.HtmlFormat.Appendable = apply(acceptForm,aUser,bUser)

  def f:((Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser) => play.twirl.api.HtmlFormat.Appendable) = (acceptForm,aUser,bUser) => apply(acceptForm,aUser,bUser)

  def ref: this.type = this

}


}

/**/
object ask_merge extends ask_merge_Scope0.ask_merge
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 13:58:46 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/account/ask_merge.scala.html
                  HASH: 13af338348eb203a3f5d52e4031a7f91f6ea32a4
                  MATRIX: 851->1|1070->223|1082->228|1162->232|1190->235|1274->299|1307->147|1339->171|1419->127|1448->220|1476->301|1505->304|1569->359|1609->361|1639->364|1670->369|1740->418|1779->431|1862->505|1902->507|1944->522|1983->552|2023->554|2062->565|2133->609|2152->619|2193->639|2229->648|2278->666|2311->673|2647->988|2680->994|2754->1041|2821->1087|2863->1099|2892->1101|2928->1107
                  LINES: 27->1|31->6|31->6|33->6|34->7|34->7|35->4|35->4|36->1|38->4|40->8|42->10|42->10|42->10|44->12|44->12|44->12|46->14|46->14|46->14|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|54->22|62->30|64->32|64->32|64->32|65->33|66->34|67->35
                  -- GENERATED --
              */
          