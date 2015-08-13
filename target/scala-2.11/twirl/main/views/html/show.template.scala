
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object show_Scope0 {
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

class show extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Post,Form[CommentForm],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: Post, commentForm: Form[CommentForm], randomID: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import be.objectify.deadbolt.java.views.html._
import be.objectify.deadbolt.core.utils.TemplateUtils._

Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*5.1*/("""        """),format.raw/*5.9*/("""<div class="container">
        <div class="jumbotron" >
        </div> <!-- jumbotron --> 
"""),_display_(/*8.2*/main(post.title)/*8.18*/{_display_(Seq[Any](format.raw/*8.19*/("""
"""),format.raw/*9.1*/("""<!--   <ul id="pagination">
      """),_display_(/*10.8*/if(!Option(post previous).isEmpty)/*10.42*/ {_display_(Seq[Any](format.raw/*10.44*/("""
        """),format.raw/*11.9*/("""<li id="previous">
          <a href=""""),_display_(/*12.21*/routes/*12.27*/.Application.show(post.previous.id)),format.raw/*12.62*/("""">
            """),_display_(/*13.14*/post/*13.18*/.previous.title),format.raw/*13.33*/("""
          """),format.raw/*14.11*/("""</a>
         <li>
        """)))}),format.raw/*16.10*/("""
      """),_display_(/*17.8*/if(!Option(post next).isEmpty)/*17.38*/ {_display_(Seq[Any](format.raw/*17.40*/("""
        """),format.raw/*18.9*/("""<li id="next">
          <a href=""""),_display_(/*19.21*/routes/*19.27*/.Application.show(post.next.id)),format.raw/*19.58*/("""">
            """),_display_(/*20.14*/post/*20.18*/.next.title),format.raw/*20.29*/("""
          """),format.raw/*21.11*/("""</a>
         <li>
        """)))}),format.raw/*23.10*/("""
    """),format.raw/*24.5*/("""</ul> -->
    """),_display_(/*25.6*/if(flash.contains("success"))/*25.35*/ {_display_(Seq[Any](format.raw/*25.37*/("""
      """),format.raw/*26.7*/("""<p class="success">"""),_display_(/*26.27*/flash/*26.32*/.get("success")),format.raw/*26.47*/("""</p>
    """)))}),format.raw/*27.6*/("""
    
    """),_display_(/*29.6*/display(post, mode = "full")),format.raw/*29.34*/("""
          """),_display_(/*30.12*/defining(Application.getLocalUser(session()))/*30.57*/ { user =>_display_(Seq[Any](format.raw/*30.67*/("""
         """),_display_(/*31.11*/if(user != null)/*31.27*/{_display_(Seq[Any](format.raw/*31.28*/("""
    """),_display_(/*32.6*/form(routes.Application.postComment(post.id, randomID))/*32.61*/ {_display_(Seq[Any](format.raw/*32.63*/("""
      """),format.raw/*33.7*/("""<fieldset>
      """),_display_(/*34.8*/if(user.isAdmin)/*34.24*/{_display_(Seq[Any](format.raw/*34.25*/("""<a href=""""),_display_(/*34.35*/routes/*34.41*/.AdminsPosts.edit(post.id)),format.raw/*34.67*/("""">edit</a></br>
        <p> <a href=""""),_display_(/*35.23*/routes/*35.29*/.AdminsPosts.delete(post.id)),format.raw/*35.57*/(""""> !delete!</a></p>""")))}),format.raw/*35.77*/("""
        """),format.raw/*36.9*/("""<legend>Post a comment</legend>
"""),format.raw/*46.3*/("""        """),_display_(/*46.12*/textarea(
            commentForm("content"),
            '_label -> "Comment:"
          )),format.raw/*49.12*/("""
          """),format.raw/*57.14*/("""
          """),format.raw/*58.11*/("""<p>
            <input type="submit" value="��������� �����������" />
          </p>
      </fieldset>
      			""")))}),format.raw/*62.11*/("""
      			""")))}/*63.11*/else/*63.15*/{_display_(Seq[Any](format.raw/*63.16*/("""
      			"""),format.raw/*64.10*/("""<p>Posting only for regestered users.... </p>
          """)))}),format.raw/*65.12*/("""
    """)))}),format.raw/*66.6*/("""
    """),format.raw/*67.5*/("""<script type="text/javascript" charset="utf-8">
      $(function() """),format.raw/*68.20*/("""{"""),format.raw/*68.21*/("""
        """),format.raw/*69.9*/("""$('form').click(function() """),format.raw/*69.36*/("""{"""),format.raw/*69.37*/("""
          """),format.raw/*70.11*/("""$('form').expose("""),format.raw/*70.28*/("""{"""),format.raw/*70.29*/("""api: true"""),format.raw/*70.38*/("""}"""),format.raw/*70.39*/(""").load();
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/(""");
        
        if($('form .errors').size()) """),format.raw/*73.38*/("""{"""),format.raw/*73.39*/("""
          """),format.raw/*74.11*/("""alert("Screwd\n");
          $('form').expose("""),format.raw/*75.28*/("""{"""),format.raw/*75.29*/("""api: true, loadSpeed: 0"""),format.raw/*75.52*/("""}"""),format.raw/*75.53*/(""").load();
          $('form input[type=text]').get(0).focus();
        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/("""
      """),format.raw/*78.7*/("""}"""),format.raw/*78.8*/(""");
    </script>
""")))}),format.raw/*80.2*/("""
"""),format.raw/*81.1*/("""</div> <!-- container --> 
"""))
      }
    }
  }

  def render(post:Post,commentForm:Form[CommentForm],randomID:String): play.twirl.api.HtmlFormat.Appendable = apply(post,commentForm,randomID)

  def f:((Post,Form[CommentForm],String) => play.twirl.api.HtmlFormat.Appendable) = (post,commentForm,randomID) => apply(post,commentForm,randomID)

  def ref: this.type = this

}


}

/**/
object show extends show_Scope0.show
              /*
                  -- GENERATED --
                  DATE: Thu Aug 13 12:42:58 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/show.scala.html
                  HASH: 56067228423b01b13a6e156be916ab81880e2666
                  MATRIX: 766->1|1041->63|1068->186|1102->194|1220->287|1244->303|1282->304|1309->305|1370->340|1413->374|1453->376|1489->385|1555->424|1570->430|1626->465|1669->481|1682->485|1718->500|1757->511|1816->539|1850->547|1889->577|1929->579|1965->588|2027->623|2042->629|2094->660|2137->676|2150->680|2182->691|2221->702|2280->730|2312->735|2353->750|2391->779|2431->781|2465->788|2512->808|2526->813|2562->828|2602->838|2639->849|2688->877|2727->889|2781->934|2829->944|2867->955|2892->971|2931->972|2963->978|3027->1033|3067->1035|3101->1042|3145->1060|3170->1076|3209->1077|3246->1087|3261->1093|3308->1119|3373->1157|3388->1163|3437->1191|3488->1211|3524->1220|3583->1463|3619->1472|3731->1563|3770->1905|3809->1916|3953->2029|3983->2040|3996->2044|4035->2045|4073->2055|4161->2112|4197->2118|4229->2123|4324->2190|4353->2191|4389->2200|4444->2227|4473->2228|4512->2239|4557->2256|4586->2257|4623->2266|4652->2267|4697->2285|4726->2286|4803->2335|4832->2336|4871->2347|4945->2393|4974->2394|5025->2417|5054->2418|5152->2489|5181->2490|5215->2497|5243->2498|5291->2516|5319->2517
                  LINES: 27->1|34->1|35->5|35->5|38->8|38->8|38->8|39->9|40->10|40->10|40->10|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|46->16|47->17|47->17|47->17|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|53->23|54->24|55->25|55->25|55->25|56->26|56->26|56->26|56->26|57->27|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|64->34|64->34|64->34|64->34|64->34|64->34|65->35|65->35|65->35|65->35|66->36|67->46|67->46|70->49|71->57|72->58|76->62|77->63|77->63|77->63|78->64|79->65|80->66|81->67|82->68|82->68|83->69|83->69|83->69|84->70|84->70|84->70|84->70|84->70|85->71|85->71|87->73|87->73|88->74|89->75|89->75|89->75|89->75|91->77|91->77|92->78|92->78|94->80|95->81
                  -- GENERATED --
              */
          