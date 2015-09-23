
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editpost_Scope0 {
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

     object editpost_Scope1 {
import models._

class editpost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(postId: Long, postForm: Form[Post]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


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
"""))
      }
    }
  }

  def render(postId:Long,postForm:Form[Post]): play.twirl.api.HtmlFormat.Appendable = apply(postId,postForm)

  def f:((Long,Form[Post]) => play.twirl.api.HtmlFormat.Appendable) = (postId,postForm) => apply(postId,postForm)

  def ref: this.type = this

}


}
}

/**/
object editpost extends editpost_Scope0.editpost_Scope1.editpost
              /*
                  -- GENERATED --
                  DATE: Tue Sep 22 13:52:43 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/editpost.scala.html
                  HASH: 05133fa371ebe6466fa1f8289b5b8e6dcf0ba460
                  MATRIX: 807->19|938->55|966->57|991->74|1030->76|1060->914|1089->984|1117->985|1158->999|1173->1005|1242->1053|1327->1110|1356->1111|1388->1116|1525->1226|1553->1227|1599->1245|1628->1246|1660->1251|1792->1356|1820->1357|1864->1375|1901->1403|1941->1405|1977->1414|2031->1441|2048->1449|2089->1469|2125->1478|2165->1488|2198->1494|2262->1532|2277->1538|2335->1587|2375->1589|2413->1600|2428->1606|2561->1717|2598->1727|2613->1733|2701->1800|2731->1856|2768->1866|2783->1872|2921->1988|2958->2012|2994->2021|3060->2060|3087->2066|3216->2168|3231->2174|3272->2194|3347->2239|3380->2242
                  LINES: 30->3|35->3|35->3|35->3|35->3|37->17|38->18|39->19|39->19|39->19|39->19|41->21|41->21|42->22|44->24|44->24|45->25|45->25|46->26|48->28|48->28|50->30|50->30|50->30|51->31|52->32|52->32|52->32|53->33|54->34|56->36|57->37|57->37|57->37|57->37|59->39|59->39|59->39|60->40|60->40|60->40|60->40|61->41|61->41|61->41|62->42|63->43|63->43|63->43|67->47|67->47|67->47|69->49|71->51
                  -- GENERATED --
              */
          