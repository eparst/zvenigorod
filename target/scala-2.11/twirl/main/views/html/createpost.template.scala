
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
import models._
/**/
object createpost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(postForm: Form[Post]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.24*/(""" """),_display_(/*3.26*/main("Create post")/*3.45*/ {_display_(Seq[Any](format.raw/*3.47*/("""

"""),format.raw/*18.3*/("""
"""),format.raw/*19.70*/("""
"""),format.raw/*20.1*/("""<script src=""""),_display_(/*20.15*/routes/*20.21*/.Assets.at("javascripts/tinymce/tinymce.min.js")),format.raw/*20.69*/(""""></script>
<script type="text/javascript">
tinymce.init("""),format.raw/*22.14*/("""{"""),format.raw/*22.15*/("""
    """),format.raw/*23.5*/("""selector: "textarea#content",
    plugins : 'media autolink link image lists charmap print preview'
 """),format.raw/*25.2*/("""}"""),format.raw/*25.3*/(""");
 tinymce.init("""),format.raw/*26.15*/("""{"""),format.raw/*26.16*/("""
    """),format.raw/*27.5*/("""selector: "textarea#htmlPreview",
    plugins : 'media autolink link image lists charmap print preview'
 """),format.raw/*29.2*/("""}"""),format.raw/*29.3*/(""");
</script>

    """),_display_(/*32.6*/if(postForm.hasGlobalErrors)/*32.34*/ {_display_(Seq[Any](format.raw/*32.36*/("""
        """),format.raw/*33.9*/("""<p class="error">
        """),_display_(/*34.10*/postForm/*34.18*/.globalError.message),format.raw/*34.38*/("""
        """),format.raw/*35.9*/("""</p>
    """)))}),format.raw/*36.6*/("""


    """),format.raw/*39.5*/("""<h3 class="uk-h3">"""),_display_(/*39.24*/Messages("playauthenticate.posts.CreateNewBlogPost_as")),format.raw/*39.79*/(""" """),_display_(/*39.81*/Application/*39.92*/.getLocalUser(session).firstName),format.raw/*39.124*/("""</h3>
    """),_display_(/*40.6*/helper/*40.12*/.form(action = routes.AdminsPosts.save(), 'id -> "createpostForm")/*40.78*/ {_display_(Seq[Any](format.raw/*40.80*/("""
        """),_display_(/*41.10*/helper/*41.16*/.textarea(postForm("title"), '_label -> Messages("playauthenticate.posts.title"), 'cols -> "100", 'rows -> "2")),format.raw/*41.127*/("""
        """),_display_(/*42.10*/helper/*42.16*/.textarea(postForm("content"), '_label -> Messages("playauthenticate.posts.text"), 'cols -> "100", 'rows -> "18")),format.raw/*42.129*/("""
		"""),_display_(/*43.4*/helper/*43.10*/.textarea(postForm("htmlPreview"), '_label -> Messages("playauthenticate.posts.prev"), 'cols -> "100", 'rows -> "7")),format.raw/*43.126*/("""
        """),format.raw/*44.74*/("""
        """),format.raw/*45.9*/("""<input type="submit" value="Submit">
    """)))}),format.raw/*46.6*/("""
""")))}),format.raw/*47.2*/("""

"""))}
  }

  def render(postForm:Form[Post]): play.twirl.api.HtmlFormat.Appendable = apply(postForm)

  def f:((Form[Post]) => play.twirl.api.HtmlFormat.Appendable) = (postForm) => apply(postForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 01 14:37:46 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/createpost.scala.html
                  HASH: 63629b0b2b88e6f73deec330e499e04649e228b4
                  MATRIX: 747->19|857->41|885->43|912->62|951->64|980->903|1009->973|1037->974|1078->988|1093->994|1162->1042|1247->1099|1276->1100|1308->1105|1436->1206|1464->1207|1509->1224|1538->1225|1570->1230|1702->1335|1730->1336|1775->1355|1812->1383|1852->1385|1888->1394|1942->1421|1959->1429|2000->1449|2036->1458|2076->1468|2110->1475|2156->1494|2232->1549|2261->1551|2281->1562|2335->1594|2372->1605|2387->1611|2462->1677|2502->1679|2539->1689|2554->1695|2687->1806|2724->1816|2739->1822|2874->1935|2904->1939|2919->1945|3057->2061|3094->2135|3130->2144|3202->2186|3234->2188
                  LINES: 26->3|29->3|29->3|29->3|29->3|31->18|32->19|33->20|33->20|33->20|33->20|35->22|35->22|36->23|38->25|38->25|39->26|39->26|40->27|42->29|42->29|45->32|45->32|45->32|46->33|47->34|47->34|47->34|48->35|49->36|52->39|52->39|52->39|52->39|52->39|52->39|53->40|53->40|53->40|53->40|54->41|54->41|54->41|55->42|55->42|55->42|56->43|56->43|56->43|57->44|58->45|59->46|60->47
                  -- GENERATED --
              */
          