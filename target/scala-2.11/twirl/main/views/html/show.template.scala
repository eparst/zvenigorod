
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
object show extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Post,Form[CommentForm],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: Post, commentForm: Form[CommentForm], randomID: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
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
         <a href=""""),_display_(/*35.20*/routes/*35.26*/.AdminsPosts.delete(post.id)),format.raw/*35.54*/(""""> !delete!</a></p""")))}),format.raw/*35.73*/("""
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
"""))}
  }

  def render(post:Post,commentForm:Form[CommentForm],randomID:String): play.twirl.api.HtmlFormat.Appendable = apply(post,commentForm,randomID)

  def f:((Post,Form[CommentForm],String) => play.twirl.api.HtmlFormat.Appendable) = (post,commentForm,randomID) => apply(post,commentForm,randomID)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 08 14:19:08 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/show.scala.html
                  HASH: 6b7391dd271c48cc1903ca8375c8dadc61edcf0a
                  MATRIX: 745->1|1013->63|1040->186|1074->194|1192->287|1216->303|1254->304|1281->305|1342->340|1385->374|1425->376|1461->385|1527->424|1542->430|1598->465|1641->481|1654->485|1690->500|1729->511|1788->539|1822->547|1861->577|1901->579|1937->588|1999->623|2014->629|2066->660|2109->676|2122->680|2154->691|2193->702|2252->730|2284->735|2325->750|2363->779|2403->781|2437->788|2484->808|2498->813|2534->828|2574->838|2611->849|2660->877|2699->889|2753->934|2801->944|2839->955|2864->971|2903->972|2935->978|2999->1033|3039->1035|3073->1042|3117->1060|3142->1076|3181->1077|3218->1087|3233->1093|3280->1119|3342->1154|3357->1160|3406->1188|3456->1207|3492->1216|3551->1459|3587->1468|3699->1559|3738->1901|3777->1912|3921->2025|3951->2036|3964->2040|4003->2041|4041->2051|4129->2108|4165->2114|4197->2119|4292->2186|4321->2187|4357->2196|4412->2223|4441->2224|4480->2235|4525->2252|4554->2253|4591->2262|4620->2263|4665->2281|4694->2282|4771->2331|4800->2332|4839->2343|4913->2389|4942->2390|4993->2413|5022->2414|5120->2485|5149->2486|5183->2493|5211->2494|5259->2512|5287->2513
                  LINES: 26->1|31->1|32->5|32->5|35->8|35->8|35->8|36->9|37->10|37->10|37->10|38->11|39->12|39->12|39->12|40->13|40->13|40->13|41->14|43->16|44->17|44->17|44->17|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|50->23|51->24|52->25|52->25|52->25|53->26|53->26|53->26|53->26|54->27|56->29|56->29|57->30|57->30|57->30|58->31|58->31|58->31|59->32|59->32|59->32|60->33|61->34|61->34|61->34|61->34|61->34|61->34|62->35|62->35|62->35|62->35|63->36|64->46|64->46|67->49|68->57|69->58|73->62|74->63|74->63|74->63|75->64|76->65|77->66|78->67|79->68|79->68|80->69|80->69|80->69|81->70|81->70|81->70|81->70|81->70|82->71|82->71|84->73|84->73|85->74|86->75|86->75|86->75|86->75|88->77|88->77|89->78|89->78|91->80|92->81
                  -- GENERATED --
              */
          