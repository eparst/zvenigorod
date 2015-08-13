
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import com.feth.play.module.pa.views.html._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*4.75*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main(Messages("playauthenticate.login.title"),"login")/*7.56*/ {_display_(Seq[Any](format.raw/*7.58*/("""

  """),format.raw/*9.3*/("""<div class="row">
    <div class="col-xs-6 col-sm-4">
      <h1>"""),_display_(/*11.12*/Messages("playauthenticate.login.title")),format.raw/*11.52*/("""</h1>
    </div>
  </div>

  <div id="login" class="row">

    <div class="col-xs-6 col-sm-4">
      """),format.raw/*18.43*/("""
    	"""),_display_(/*19.7*/helper/*19.13*/.form(routes.Application.doLogin, 'class -> "form-horizontal", 'role -> "form")/*19.92*/ {_display_(Seq[Any](format.raw/*19.94*/("""

        """),_display_(/*21.10*/if(loginForm.hasGlobalErrors)/*21.39*/ {_display_(Seq[Any](format.raw/*21.41*/("""
          	"""),format.raw/*22.12*/("""<p class="alert alert-danger">
	          """),_display_(/*23.13*/loginForm/*23.22*/.globalError.message),format.raw/*23.42*/("""
	     	"""),format.raw/*24.8*/("""</p>
        """)))}),format.raw/*25.10*/("""

        """),_display_(/*27.10*/_emailPartial(loginForm)),format.raw/*27.34*/("""

        """),_display_(/*29.10*/inputPassword(
          loginForm("password"),
          '_showConstraints -> false,
          '_label -> Messages("playauthenticate.login.password.placeholder")
        )),format.raw/*33.10*/("""

            """),format.raw/*35.13*/("""<button type="submit" class="btn btn-default">"""),_display_(/*35.60*/Messages("playauthenticate.login.now")),format.raw/*35.98*/("""</button>

        <a href="javascript:void(0);" onclick="window.location.href = jsRoutes.controllers.Signup.forgotPassword($('#email').val() || null).absoluteURL();">"""),_display_(/*37.158*/Messages("playauthenticate.login.forgot.password")),format.raw/*37.208*/("""</a>

    	""")))}),format.raw/*39.7*/("""
    """),format.raw/*40.5*/("""</div>

   <div class="col-xs-6 col-sm-4">
      """),_display_(/*43.8*/Messages("playauthenticate.login.oauth")),format.raw/*43.48*/("""
      """),format.raw/*44.48*/("""
      """),_display_(/*45.8*/_providerPartial(skipCurrent=false)),format.raw/*45.43*/("""
      """),_display_(/*46.8*/providerAvailable("basic")/*46.34*/ { available: Boolean =>_display_(Seq[Any](format.raw/*46.58*/("""
          """),_display_(/*47.12*/if(available)/*47.25*/ {_display_(Seq[Any](format.raw/*47.27*/("""
              """),format.raw/*48.15*/("""<br>
              <a href=""""),_display_(/*49.25*/com/*49.28*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("basic")),format.raw/*49.102*/("""">"""),_display_(/*49.105*/Messages("playauthenticate.login.basic")),format.raw/*49.145*/("""</a>
          """)))}),format.raw/*50.12*/("""
      """)))}),format.raw/*51.8*/("""
    """),format.raw/*52.5*/("""</div>

  </div>

""")))}),format.raw/*56.2*/("""

"""))
      }
    }
  }

  def render(loginForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu Aug 13 12:42:58 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/login.scala.html
                  HASH: 483b531e95eb918fdaf5fbc90d90a304ff398aa4
                  MATRIX: 819->1|985->41|1017->65|1096->21|1125->114|1152->160|1179->162|1241->216|1280->218|1310->222|1402->287|1463->327|1592->464|1625->471|1640->477|1728->556|1768->558|1806->569|1844->598|1884->600|1924->612|1994->655|2012->664|2053->684|2088->692|2133->706|2171->717|2216->741|2254->752|2447->924|2489->938|2563->985|2622->1023|2818->1191|2890->1241|2932->1253|2964->1258|3040->1308|3101->1348|3136->1396|3170->1404|3226->1439|3260->1447|3295->1473|3357->1497|3396->1509|3418->1522|3458->1524|3501->1539|3557->1568|3569->1571|3665->1645|3696->1648|3758->1688|3805->1704|3843->1712|3875->1717|3924->1736
                  LINES: 29->1|34->4|34->4|35->1|37->4|38->6|39->7|39->7|39->7|41->9|43->11|43->11|50->18|51->19|51->19|51->19|51->19|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|59->27|59->27|61->29|65->33|67->35|67->35|67->35|69->37|69->37|71->39|72->40|75->43|75->43|76->44|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|80->48|81->49|81->49|81->49|81->49|81->49|82->50|83->51|84->52|88->56
                  -- GENERATED --
              */
          