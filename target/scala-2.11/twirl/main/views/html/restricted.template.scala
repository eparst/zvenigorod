
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object restricted_Scope0 {
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

class restricted extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(localUser: models.User = null):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main(Messages("playauthenticate.navigation.restricted"), "restricted")/*3.72*/ {_display_(Seq[Any](format.raw/*3.74*/("""
    
    """),format.raw/*5.5*/("""<h1>"""),_display_(/*5.10*/Messages("playauthenticate.navigation.restricted")),format.raw/*5.60*/("""</h1>
    <p>
        """),_display_(/*7.10*/Messages("playauthenticate.restricted.secrets")),format.raw/*7.57*/("""
    """),format.raw/*8.5*/("""</p>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(localUser:models.User): play.twirl.api.HtmlFormat.Appendable = apply(localUser)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (localUser) => apply(localUser)

  def ref: this.type = this

}


}

/**/
object restricted extends restricted_Scope0.restricted
              /*
                  -- GENERATED --
                  DATE: Wed Aug 12 16:48:52 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/restricted.scala.html
                  HASH: 6e79049987481cb4563e4d76987250e5d9dd51ad
                  MATRIX: 760->1|886->32|914->35|992->105|1031->107|1067->117|1098->122|1168->172|1217->195|1284->242|1315->247|1350->253
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|38->7|38->7|39->8|40->9
                  -- GENERATED --
              */
          