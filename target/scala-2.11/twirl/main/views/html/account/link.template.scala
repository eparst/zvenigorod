
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object link_Scope0 {
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

class link extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.link.account.title"))/*2.55*/ {_display_(Seq[Any](format.raw/*2.57*/("""
    
    """),format.raw/*4.5*/("""<h1>"""),_display_(/*4.10*/Messages("playauthenticate.link.account.title")),format.raw/*4.57*/("""</h1>
    
    <p>
	"""),_display_(/*7.3*/_providerPartial()),format.raw/*7.21*/("""
    """),format.raw/*8.5*/("""<br/>
    </p>
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object link extends link_Scope0.link
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 01:07:40 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/account/link.scala.html
                  HASH: 9352bd2d361bd9a8c26d16d11c31d7d6bb917e43
                  MATRIX: 833->2|894->55|933->57|969->67|1000->72|1067->119|1113->140|1151->158|1182->163|1228->179
                  LINES: 32->2|32->2|32->2|34->4|34->4|34->4|37->7|37->7|38->8|40->10
                  -- GENERATED --
              */
          