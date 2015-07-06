
package views.html

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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
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

"""))}
  }

  def render(loginForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 15:53:56 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/login.scala.html
                  HASH: c67baa582c600656e3fc98ace4c9d3762eb03da8
                  MATRIX: 797->1|956->41|988->65|1067->21|1096->114|1123->160|1150->162|1212->216|1251->218|1281->222|1373->287|1434->327|1563->464|1596->471|1611->477|1699->556|1739->558|1777->569|1815->598|1855->600|1895->612|1965->655|1983->664|2024->684|2059->692|2104->706|2142->717|2187->741|2225->752|2418->924|2460->938|2534->985|2593->1023|2789->1191|2861->1241|2903->1253|2935->1258|3011->1308|3072->1348|3107->1396|3141->1404|3197->1439|3231->1447|3266->1473|3328->1497|3367->1509|3389->1522|3429->1524|3472->1539|3528->1568|3540->1571|3636->1645|3667->1648|3729->1688|3776->1704|3814->1712|3846->1717|3895->1736
                  LINES: 28->1|31->4|31->4|32->1|34->4|35->6|36->7|36->7|36->7|38->9|40->11|40->11|47->18|48->19|48->19|48->19|48->19|50->21|50->21|50->21|51->22|52->23|52->23|52->23|53->24|54->25|56->27|56->27|58->29|62->33|64->35|64->35|64->35|66->37|66->37|68->39|69->40|72->43|72->43|73->44|74->45|74->45|75->46|75->46|75->46|76->47|76->47|76->47|77->48|78->49|78->49|78->49|78->49|78->49|79->50|80->51|81->52|85->56
                  -- GENERATED --
              */
          