
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _providerPartial_Scope0 {
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

class _providerPartial extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(skipCurrent: Boolean = true):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<script type="text/javascript">
function askOpenID(url) """),format.raw/*6.25*/("""{"""),format.raw/*6.26*/("""
	"""),format.raw/*7.2*/("""var openid = prompt("Please enter your OpenID:", "yourname.myopenid.com");
	if(openid) """),format.raw/*8.13*/("""{"""),format.raw/*8.14*/("""
		"""),format.raw/*9.3*/("""window.location.href = url + "?p=" + encodeURIComponent(openid);
	"""),format.raw/*10.2*/("""}"""),format.raw/*10.3*/("""
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""
"""),format.raw/*12.1*/("""</script>
<ul class="providers">
	"""),_display_(/*14.3*/forProviders(skipCurrent)/*14.28*/ { p =>_display_(Seq[Any](format.raw/*14.35*/("""
		"""),format.raw/*15.3*/("""<li>
		"""),_display_(/*16.4*/if(p.getKey() == "openid")/*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
			"""),format.raw/*17.4*/("""<a href="javascript:void(0);" onclick="askOpenID('"""),_display_(/*17.55*/p/*17.56*/.getUrl()),format.raw/*17.65*/("""');">
		""")))}/*18.5*/else/*18.10*/{_display_(Seq[Any](format.raw/*18.11*/("""
			"""),format.raw/*19.4*/("""<a href=""""),_display_(/*19.14*/p/*19.15*/.getUrl()),format.raw/*19.24*/("""">
		""")))}),format.raw/*20.4*/("""
		"""),_display_(/*21.4*/_providerIcon(p.getKey())),format.raw/*21.29*/("""</a>
		</li>
	""")))}),format.raw/*23.3*/("""
"""),format.raw/*24.1*/("""</ul>"""))
      }
    }
  }

  def render(skipCurrent:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(skipCurrent)

  def f:((Boolean) => play.twirl.api.HtmlFormat.Appendable) = (skipCurrent) => apply(skipCurrent)

  def ref: this.type = this

}


}

/**/
object _providerPartial extends _providerPartial_Scope0._providerPartial
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 13:40:57 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/_providerPartial.scala.html
                  HASH: 7595736edc0f0ad2c104fbc93d331b12b1006a7d
                  MATRIX: 768->1|935->30|963->77|990->78|1073->134|1101->135|1129->137|1243->224|1271->225|1300->228|1393->294|1421->295|1449->296|1477->297|1505->298|1566->333|1600->358|1645->365|1675->368|1709->376|1744->402|1784->404|1815->408|1893->459|1903->460|1933->469|1960->479|1973->484|2012->485|2043->489|2080->499|2090->500|2120->509|2156->515|2186->519|2232->544|2277->559|2305->560
                  LINES: 27->1|32->1|34->4|35->5|36->6|36->6|37->7|38->8|38->8|39->9|40->10|40->10|41->11|41->11|42->12|44->14|44->14|44->14|45->15|46->16|46->16|46->16|47->17|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|49->19|50->20|51->21|51->21|53->23|54->24
                  -- GENERATED --
              */
          