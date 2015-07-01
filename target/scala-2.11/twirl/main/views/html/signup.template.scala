
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
object signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapBasic.f) }};
Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*4.75*/("""

"""),_display_(/*6.2*/main(Messages("playauthenticate.signup.title"),"signup")/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""

  """),format.raw/*8.3*/("""<div class="row">
    <div class="col-xs-12 col-sm-6 col-md-8">
      <h1>"""),_display_(/*10.12*/Messages("playauthenticate.signup.title")),format.raw/*10.53*/("""</h1>
    </div>
  </div>

  <div id="signup" class="row">

    <div class="col-xs-6 col-md-4">
        """),format.raw/*17.45*/("""
    	"""),_display_(/*18.7*/helper/*18.13*/.form(routes.Application.doSignup, 'class -> "form-horizontal", 'role -> "form")/*18.93*/ {_display_(Seq[Any](format.raw/*18.95*/("""

            """),_display_(/*20.14*/if(signupForm.hasGlobalErrors)/*20.44*/ {_display_(Seq[Any](format.raw/*20.46*/("""
		        """),format.raw/*21.11*/("""<p class="alert alert-danger">
		          """),_display_(/*22.14*/signupForm/*22.24*/.globalError.message),format.raw/*22.44*/("""
		     	"""),format.raw/*23.9*/("""</p>
            """)))}),format.raw/*24.14*/("""

             """),_display_(/*26.15*/inputText(
                signupForm("name"),
                '_label -> Messages("playauthenticate.signup.name")
             )),format.raw/*29.15*/("""

             """),_display_(/*31.15*/_emailPartial(signupForm)),format.raw/*31.40*/("""

             """),_display_(/*33.15*/_passwordPartial(signupForm)),format.raw/*33.43*/("""

            """),format.raw/*35.13*/("""<button type="submit" class="btn btn-default">"""),_display_(/*35.60*/Messages("playauthenticate.signup.now")),format.raw/*35.99*/("""</button>
    	""")))}),format.raw/*36.7*/("""
    """),format.raw/*37.5*/("""</div>

    <div class="col-xs-6 col-md-4">
        """),_display_(/*40.10*/Messages("playauthenticate.signup.oauth")),format.raw/*40.51*/("""
        """),format.raw/*41.50*/("""
        """),_display_(/*42.10*/_providerPartial(skipCurrent=false)),format.raw/*42.45*/("""
    """),format.raw/*43.5*/("""</div>

  </div>

""")))}),format.raw/*47.2*/("""
"""))}
  }

  def render(signupForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 14:04:45 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/signup.scala.html
                  HASH: 94940792122fec22716e64262cd113500486f18d
                  MATRIX: 798->1|914->42|946->66|1025->22|1054->115|1082->118|1146->174|1185->176|1215->180|1317->255|1379->296|1511->436|1544->443|1559->449|1648->529|1688->531|1730->546|1769->576|1809->578|1848->589|1919->633|1938->643|1979->663|2015->672|2064->690|2107->706|2257->835|2300->851|2346->876|2389->892|2438->920|2480->934|2554->981|2614->1020|2660->1036|2692->1041|2772->1094|2834->1135|2871->1185|2908->1195|2964->1230|2996->1235|3045->1254
                  LINES: 28->1|30->4|30->4|31->1|33->4|35->6|35->6|35->6|37->8|39->10|39->10|46->17|47->18|47->18|47->18|47->18|49->20|49->20|49->20|50->21|51->22|51->22|51->22|52->23|53->24|55->26|58->29|60->31|60->31|62->33|62->33|64->35|64->35|64->35|65->36|66->37|69->40|69->40|70->41|71->42|71->42|72->43|76->47
                  -- GENERATED --
              */
          