
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
object editpost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(postId: Long, postForm: Form[Post]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.38*/(""" """),_display_(/*3.40*/main("Edit post")/*3.57*/ {_display_(Seq[Any](format.raw/*3.59*/("""

 """),format.raw/*17.3*/("""
"""),format.raw/*18.70*/("""
"""),format.raw/*19.1*/("""<script src=""""),_display_(/*19.15*/routes/*19.21*/.Assets.at("javascripts/tinymce/tinymce.min.js")),format.raw/*19.69*/(""""></script>
<script type="text/javascript">
tinymce.init("""),format.raw/*21.14*/("""{"""),format.raw/*21.15*/("""
    """),format.raw/*22.5*/("""selector: "textarea#content",
    plugins : 'media autolink link image lists charmap print preview code'    
 """),format.raw/*24.2*/("""}"""),format.raw/*24.3*/(""");
  tinymce.init("""),format.raw/*25.16*/("""{"""),format.raw/*25.17*/("""
    """),format.raw/*26.5*/("""selector: "textarea#htmlPreview",
    plugins : 'media autolink link image lists charmap print preview'
 """),format.raw/*28.2*/("""}"""),format.raw/*28.3*/(""");
</script>
    """),_display_(/*30.6*/if(postForm.hasGlobalErrors)/*30.34*/ {_display_(Seq[Any](format.raw/*30.36*/("""
        """),format.raw/*31.9*/("""<p class="error">
        """),_display_(/*32.10*/postForm/*32.18*/.globalError.message),format.raw/*32.38*/("""
        """),format.raw/*33.9*/("""</p>
    """)))}),format.raw/*34.6*/("""

    """),format.raw/*36.5*/("""<h3 class="uk-h3">Edit post</h3>
    """),_display_(/*37.6*/helper/*37.12*/.form(action = routes.AdminsPosts.update(postId))/*37.61*/ {_display_(Seq[Any](format.raw/*37.63*/("""

        """),_display_(/*39.10*/helper/*39.16*/.textarea(postForm("title"), '_label -> Messages("playauthenticate.posts.title"), 'cols -> "100", 'rows -> "2")),format.raw/*39.127*/("""
        """),_display_(/*40.10*/helper/*40.16*/.textarea(postForm("content"), 'id -> "content", '_label -> "Text")),format.raw/*40.83*/(""" """),format.raw/*40.139*/("""
        """),_display_(/*41.10*/helper/*41.16*/.textarea(postForm("htmlPreview"), '_label -> Messages("playauthenticate.posts.prev"), 'cols -> "100", 'rows -> "7")),format.raw/*41.132*/("""
        """),format.raw/*42.24*/("""
        """),format.raw/*43.9*/("""<input type="hidden" name="id" value=""""),_display_(/*43.48*/postId),format.raw/*43.54*/("""" />

        <div>
            <input type="submit" value="Save this post"> or
            <a href=""""),_display_(/*47.23*/routes/*47.29*/.Application.admin()),format.raw/*47.49*/("""" class="btn">Cancel</a>
        </div>
    """)))}),format.raw/*49.6*/("""

""")))}),format.raw/*51.2*/("""
"""))}
  }

  def render(postId:Long,postForm:Form[Post]): play.twirl.api.HtmlFormat.Appendable = apply(postId,postForm)

  def f:((Long,Form[Post]) => play.twirl.api.HtmlFormat.Appendable) = (postId,postForm) => apply(postId,postForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 15:53:56 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/editpost.scala.html
                  HASH: 5db420d19d014d36b1d628a9ca73206af977c7f6
                  MATRIX: 750->19|874->55|902->57|927->74|966->76|996->914|1025->984|1053->985|1094->999|1109->1005|1178->1053|1263->1110|1292->1111|1324->1116|1461->1226|1489->1227|1535->1245|1564->1246|1596->1251|1728->1356|1756->1357|1800->1375|1837->1403|1877->1405|1913->1414|1967->1441|1984->1449|2025->1469|2061->1478|2101->1488|2134->1494|2198->1532|2213->1538|2271->1587|2311->1589|2349->1600|2364->1606|2497->1717|2534->1727|2549->1733|2637->1800|2667->1856|2704->1866|2719->1872|2857->1988|2894->2012|2930->2021|2996->2060|3023->2066|3152->2168|3167->2174|3208->2194|3283->2239|3316->2242
                  LINES: 26->3|29->3|29->3|29->3|29->3|31->17|32->18|33->19|33->19|33->19|33->19|35->21|35->21|36->22|38->24|38->24|39->25|39->25|40->26|42->28|42->28|44->30|44->30|44->30|45->31|46->32|46->32|46->32|47->33|48->34|50->36|51->37|51->37|51->37|51->37|53->39|53->39|53->39|54->40|54->40|54->40|54->40|55->41|55->41|55->41|56->42|57->43|57->43|57->43|61->47|61->47|61->47|63->49|65->51
                  -- GENERATED --
              */
          