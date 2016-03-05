
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
  """),format.raw/*10.40*/("""
    """),format.raw/*11.5*/("""<div class="col-xs-12 col-sm-6 col-md-8">
      <h1>"""),_display_(/*12.12*/Messages("playauthenticate.login.title")),format.raw/*12.52*/("""</h1>
    </div>
  </div>

  <div id="login" class="row">
 """),format.raw/*19.43*/("""
   """),format.raw/*43.37*/("""
  """),format.raw/*44.3*/("""<div class="col-xs-12 col-sm-6 col-md-8">
      """),_display_(/*45.8*/Messages("playauthenticate.login.oauth")),format.raw/*45.48*/("""
      """),format.raw/*46.48*/("""
      """),_display_(/*47.8*/_providerPartial(skipCurrent=false)),format.raw/*47.43*/("""
      """),_display_(/*48.8*/providerAvailable("basic")/*48.34*/ { available: Boolean =>_display_(Seq[Any](format.raw/*48.58*/("""
          """),_display_(/*49.12*/if(available)/*49.25*/ {_display_(Seq[Any](format.raw/*49.27*/("""
              """),format.raw/*50.15*/("""<br>
              <a href=""""),_display_(/*51.25*/com/*51.28*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("basic")),format.raw/*51.102*/("""">"""),_display_(/*51.105*/Messages("playauthenticate.login.basic")),format.raw/*51.145*/("""</a>
          """)))}),format.raw/*52.12*/("""
      """)))}),format.raw/*53.8*/("""
    """),format.raw/*54.5*/("""</div>

  </div>

""")))}),format.raw/*58.2*/("""

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
                  DATE: Sun Mar 06 01:00:18 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/login.scala.html
                  HASH: b99290adb9bd28e609e07ed2daf83e7e0f1900b3
                  MATRIX: 819->1|985->41|1017->65|1096->21|1125->114|1152->160|1179->162|1241->216|1280->218|1310->222|1358->279|1390->284|1470->337|1531->377|1618->517|1650->1357|1680->1360|1755->1409|1816->1449|1851->1497|1885->1505|1941->1540|1975->1548|2010->1574|2072->1598|2111->1610|2133->1623|2173->1625|2216->1640|2272->1669|2284->1672|2380->1746|2411->1749|2473->1789|2520->1805|2558->1813|2590->1818|2639->1837
                  LINES: 29->1|34->4|34->4|35->1|37->4|38->6|39->7|39->7|39->7|41->9|42->10|43->11|44->12|44->12|49->19|50->43|51->44|52->45|52->45|53->46|54->47|54->47|55->48|55->48|55->48|56->49|56->49|56->49|57->50|58->51|58->51|58->51|58->51|58->51|59->52|60->53|61->54|65->58
                  -- GENERATED --
              */
          