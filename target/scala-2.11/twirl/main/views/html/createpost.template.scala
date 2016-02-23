
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createpost_Scope0 {
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

     object createpost_Scope1 {
import models._

class createpost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(postForm: Form[Post]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


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

"""))
      }
    }
  }

  def render(postForm:Form[Post]): play.twirl.api.HtmlFormat.Appendable = apply(postForm)

  def f:((Form[Post]) => play.twirl.api.HtmlFormat.Appendable) = (postForm) => apply(postForm)

  def ref: this.type = this

}


}
}

/**/
object createpost extends createpost_Scope0.createpost_Scope1.createpost
              /*
                  -- GENERATED --
                  DATE: Mon Feb 22 23:51:38 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/createpost.scala.html
                  HASH: f5628afef1e93f970e27cd81e750541a246fc57a
                  MATRIX: 808->19|925->41|953->43|980->62|1019->64|1048->903|1077->973|1105->974|1146->988|1161->994|1230->1042|1315->1099|1344->1100|1376->1105|1504->1206|1532->1207|1577->1224|1606->1225|1638->1230|1770->1335|1798->1336|1843->1355|1880->1383|1920->1385|1956->1394|2010->1421|2027->1429|2068->1449|2104->1458|2144->1468|2178->1475|2224->1494|2300->1549|2329->1551|2349->1562|2403->1594|2440->1605|2455->1611|2530->1677|2570->1679|2607->1689|2622->1695|2755->1806|2792->1816|2807->1822|2942->1935|2972->1939|2987->1945|3125->2061|3162->2135|3198->2144|3270->2186|3302->2188
                  LINES: 30->3|35->3|35->3|35->3|35->3|37->18|38->19|39->20|39->20|39->20|39->20|41->22|41->22|42->23|44->25|44->25|45->26|45->26|46->27|48->29|48->29|51->32|51->32|51->32|52->33|53->34|53->34|53->34|54->35|55->36|58->39|58->39|58->39|58->39|58->39|58->39|59->40|59->40|59->40|59->40|60->41|60->41|60->41|61->42|61->42|61->42|62->43|62->43|62->43|63->44|64->45|65->46|66->47
                  -- GENERATED --
              */
          