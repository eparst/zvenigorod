
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object exists_Scope0 {
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

class exists extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main(Messages("playauthenticate.user.exists.title"))/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
	"""),format.raw/*3.2*/("""<h1>"""),_display_(/*3.7*/Messages("playauthenticate.user.exists.title")),format.raw/*3.53*/("""</h1>
	<p>"""),_display_(/*4.6*/Messages("playauthenticate.user.exists.message")),format.raw/*4.54*/("""</p>
""")))}),format.raw/*5.2*/("""
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
object exists extends exists_Scope0.exists
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 13:58:46 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/account/signup/exists.scala.html
                  HASH: 02d7f48d45ec098396f8cdef04a595486c09c5eb
                  MATRIX: 844->2|904->54|943->56|971->58|1001->63|1067->109|1103->120|1171->168|1206->174
                  LINES: 32->2|32->2|32->2|33->3|33->3|33->3|34->4|34->4|35->5
                  -- GENERATED --
              */
          