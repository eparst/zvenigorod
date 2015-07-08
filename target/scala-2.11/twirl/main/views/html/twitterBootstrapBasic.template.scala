
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
object twitterBootstrapBasic extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*2.1*/("""<div class="form-group """),_display_(/*2.25*/if(elements.hasErrors)/*2.47*/ {_display_(Seq[Any](format.raw/*2.49*/("""has-error""")))}),format.raw/*2.59*/("""">
    <label for=""""),_display_(/*3.18*/elements/*3.26*/.id),format.raw/*3.29*/("""" class="control-label">"""),_display_(/*3.54*/elements/*3.62*/.label),format.raw/*3.68*/("""</label>
    <div class="row">
        <div class=""""),_display_(/*5.22*/elements/*5.30*/.args.toMap.get('inputDivClass).getOrElse("col-md-5")),format.raw/*5.83*/("""">
        """),_display_(/*6.10*/if(elements.input.toString().contains("class="))/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""
        """),_display_(/*7.10*/Html(elements.input.toString().replaceFirst("(class=[\"'])", "$1form-control "))),format.raw/*7.90*/("""
        """)))}/*8.11*/else/*8.16*/{_display_(Seq[Any](format.raw/*8.17*/("""
        """),_display_(/*9.10*/Html(elements.input.toString().replaceFirst("(<\\w+ )", "$1class=\"form-control\" "))),format.raw/*9.95*/("""
        """)))}),format.raw/*10.10*/("""
    """),format.raw/*11.5*/("""</div>
</div>
<span class="help-block text-muted">"""),_display_(/*13.38*/elements/*13.46*/.infos.mkString(", ")),format.raw/*13.67*/("""</span>
"""),_display_(/*14.2*/if(elements.hasErrors)/*14.24*/ {_display_(Seq[Any](format.raw/*14.26*/("""
"""),format.raw/*15.1*/("""<span class="help-block">"""),_display_(/*15.27*/elements/*15.35*/.errors.mkString(", ")),format.raw/*15.57*/("""</span>
""")))}),format.raw/*16.2*/("""
"""),format.raw/*17.1*/("""</div>
"""))}
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 08 10:18:07 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/twitterBootstrapBasic.scala.html
                  HASH: b7f4e4d5ca0f7cd65cd3586d4b56034bfa491b15
                  MATRIX: 753->1|873->33|900->34|950->58|980->80|1019->82|1059->92|1105->112|1121->120|1144->123|1195->148|1211->156|1237->162|1315->214|1331->222|1404->275|1442->287|1498->335|1537->337|1573->347|1673->427|1701->438|1713->443|1751->444|1787->454|1892->539|1933->549|1965->554|2043->605|2060->613|2102->634|2137->643|2168->665|2208->667|2236->668|2289->694|2306->702|2349->724|2388->733|2416->734
                  LINES: 26->1|29->1|30->2|30->2|30->2|30->2|30->2|31->3|31->3|31->3|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|36->8|36->8|36->8|37->9|37->9|38->10|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|43->15|44->16|45->17
                  -- GENERATED --
              */
          