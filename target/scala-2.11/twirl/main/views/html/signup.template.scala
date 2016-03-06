
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

   """),format.raw/*17.45*/("""
    """),format.raw/*40.6*/(""" """),format.raw/*40.7*/("""<div class="col-xs-12 col-sm-6 col-md-8">
        """),_display_(/*41.10*/Messages("playauthenticate.signup.oauth")),format.raw/*41.51*/("""
        """),format.raw/*42.50*/("""
        """),_display_(/*43.10*/_providerPartial(skipCurrent=false)),format.raw/*43.45*/("""
    """),format.raw/*44.5*/("""</div>

  </div>

""")))}),format.raw/*48.2*/("""
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
                  DATE: Sun Mar 06 13:58:45 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/signup.scala.html
                  HASH: 87b4cc92d173e2eba34b0776a20558d8ed1b156d
                  MATRIX: 821->1|944->42|976->66|1055->22|1084->115|1112->118|1176->174|1215->176|1245->180|1347->255|1409->296|1500->438|1532->1094|1560->1095|1638->1146|1700->1187|1737->1237|1774->1247|1830->1282|1862->1287|1911->1306
                  LINES: 29->1|33->4|33->4|34->1|36->4|38->6|38->6|38->6|40->8|42->10|42->10|48->17|49->40|49->40|50->41|50->41|51->42|52->43|52->43|53->44|57->48
                  -- GENERATED --
              */
          