
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
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
"""))
      }
    }
  }

  def render(signupForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Thu Sep 17 13:28:35 UTC 2015
                  SOURCE: /home/play/zvenigorod/app/views/signup.scala.html
                  HASH: 1cca2535eab69c9e9209613781c649227fb301b4
                  MATRIX: 819->1|942->42|974->66|1053->22|1082->115|1110->118|1174->174|1213->176|1243->180|1345->255|1407->296|1539->436|1572->443|1587->449|1676->529|1716->531|1758->546|1797->576|1837->578|1876->589|1947->633|1966->643|2007->663|2043->672|2092->690|2135->706|2285->835|2328->851|2374->876|2417->892|2466->920|2508->934|2582->981|2642->1020|2688->1036|2720->1041|2800->1094|2862->1135|2899->1185|2936->1195|2992->1230|3024->1235|3073->1254
                  LINES: 29->1|33->4|33->4|34->1|36->4|38->6|38->6|38->6|40->8|42->10|42->10|49->17|50->18|50->18|50->18|50->18|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|58->26|61->29|63->31|63->31|65->33|65->33|67->35|67->35|67->35|68->36|69->37|72->40|72->40|73->41|74->42|74->42|75->43|79->47
                  -- GENERATED --
              */
          