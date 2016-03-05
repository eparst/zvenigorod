
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object admin_Scope0 {
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

     object admin_Scope1 {
import models._

class admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Post],List[Post],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(postsAll: List[Post], postsUser: List[Post], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.59*/(""" """),_display_(/*3.61*/main("Admin")/*3.74*/ {_display_(Seq[Any](format.raw/*3.76*/("""
"""),format.raw/*4.1*/("""</br>
    """),_display_(/*5.6*/if(flash.contains("success"))/*5.35*/ {_display_(Seq[Any](format.raw/*5.37*/("""
        """),format.raw/*6.9*/("""<p>
        """),_display_(/*7.10*/flash/*7.15*/.get("success")),format.raw/*7.30*/("""
        """),format.raw/*8.9*/("""</p>
    """)))}),format.raw/*9.6*/("""

    """),format.raw/*11.5*/("""<h4>My posts:</h4>
    <ul>
 """),_display_(/*13.3*/if(postsUser != null)/*13.24*/{_display_(Seq[Any](format.raw/*13.25*/("""
    """),_display_(/*14.6*/for(post <- postsUser) yield /*14.28*/ {_display_(Seq[Any](format.raw/*14.30*/("""
                """),format.raw/*15.17*/("""<li><a href=""""),_display_(/*15.31*/routes/*15.37*/.Application.show(post.id)),format.raw/*15.63*/("""">"""),_display_(/*15.66*/post/*15.70*/.title),format.raw/*15.76*/("""</a>
                       """),_display_(/*16.25*/Html(post.htmlPreview)),format.raw/*16.47*/("""
                """),format.raw/*17.17*/("""<p><a href=""""),_display_(/*17.30*/routes/*17.36*/.AdminsPosts.edit(post.id)),format.raw/*17.62*/("""">edit</a> 
                <a href=""""),_display_(/*18.27*/routes/*18.33*/.AdminsPosts.delete(post.id)),format.raw/*18.61*/("""">delete</a></p></li>
            """)))}),format.raw/*19.14*/("""
        """),format.raw/*20.22*/("""
       """),format.raw/*21.8*/("""<p> <a class="btn" href=""""),_display_(/*21.34*/routes/*21.40*/.AdminsPosts.create()),format.raw/*21.61*/("""">Create new post</a> as """),_display_(/*21.87*/user/*21.91*/.name),format.raw/*21.96*/("""</p>
    """)))}/*22.6*/else/*22.10*/{_display_(Seq[Any](format.raw/*22.11*/("""
      			"""),format.raw/*23.10*/("""<p>No posts.... </p>
          """)))}),format.raw/*24.12*/("""
                  """),format.raw/*25.19*/("""</ul>
                  <hr><hr>
                  		"""),_display_(/*27.22*/if(user.isAdmin)/*27.38*/{_display_(Seq[Any](format.raw/*27.39*/("""
                    """),format.raw/*28.21*/("""<h4>All posts:</h4>
                    <table>
                    <tr>
                    <td>N</td>      				
    				<td>Content</td>
    				<td>ID</td>
    				<td>Author</td>
    				</tr>
					<tr><td colspan="4"><hr></td></tr>					    				
         """),_display_(/*37.11*/if(postsAll != null)/*37.31*/{_display_(Seq[Any](format.raw/*37.32*/("""
    """),_display_(/*38.6*/for((post, index) <- postsAll.zipWithIndex) yield /*38.49*/ {_display_(Seq[Any](format.raw/*38.51*/("""
    """),format.raw/*39.5*/("""<tr>
<td>"""),_display_(/*40.6*/(index + 1)),format.raw/*40.17*/("""</td>
    <td>
    <ul>    
               <li><a href=""""),_display_(/*43.30*/routes/*43.36*/.Application.show(post.id)),format.raw/*43.62*/("""">"""),_display_(/*43.65*/post/*43.69*/.title),format.raw/*43.75*/("""</a>
                       """),_display_(/*44.25*/Html(CdnAssets.changeImageUrl(post.htmlPreview))),format.raw/*44.73*/("""
                """),format.raw/*45.17*/("""<p><a href=""""),_display_(/*45.30*/routes/*45.36*/.AdminsPosts.edit(post.id)),format.raw/*45.62*/("""">edit</a> 
                <a href=""""),_display_(/*46.27*/routes/*46.33*/.AdminsPosts.delete(post.id)),format.raw/*46.61*/("""">delete</a></p></li>
      </ul>
      </td>
    <td>"""),_display_(/*49.10*/post/*49.14*/.id),format.raw/*49.17*/("""</td>      
      <td>"""),_display_(/*50.12*/post/*50.16*/.author.name),format.raw/*50.28*/("""</td>
      </tr>
      	<tr><td colspan="4"><hr></td></tr>
            """)))}),format.raw/*53.14*/("""

    """)))}/*55.6*/else/*55.10*/{_display_(Seq[Any](format.raw/*55.11*/("""
      			"""),format.raw/*56.10*/("""<p>No posts.... </p>
          """)))}),format.raw/*57.12*/("""
          """),format.raw/*58.11*/("""</tr>
          </table>
         """)))}),format.raw/*60.11*/("""
""")))}),format.raw/*61.2*/("""
"""))
      }
    }
  }

  def render(postsAll:List[Post],postsUser:List[Post],user:User): play.twirl.api.HtmlFormat.Appendable = apply(postsAll,postsUser,user)

  def f:((List[Post],List[Post],User) => play.twirl.api.HtmlFormat.Appendable) = (postsAll,postsUser,user) => apply(postsAll,postsUser,user)

  def ref: this.type = this

}


}
}

/**/
object admin extends admin_Scope0.admin_Scope1.admin
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 01:05:17 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/admin.scala.html
                  HASH: 29607209c00d492cda0887b06a33a8d03a439c43
                  MATRIX: 809->19|961->76|989->78|1010->91|1049->93|1076->94|1112->105|1149->134|1188->136|1223->145|1262->158|1275->163|1310->178|1345->187|1384->197|1417->203|1473->233|1503->254|1542->255|1574->261|1612->283|1652->285|1697->302|1738->316|1753->322|1800->348|1830->351|1843->355|1870->361|1926->390|1969->412|2014->429|2054->442|2069->448|2116->474|2181->512|2196->518|2245->546|2311->581|2348->603|2383->611|2436->637|2451->643|2493->664|2546->690|2559->694|2585->699|2613->709|2626->713|2665->714|2703->724|2766->756|2813->775|2894->829|2919->845|2958->846|3007->867|3294->1127|3323->1147|3362->1148|3394->1154|3453->1197|3493->1199|3525->1204|3561->1214|3593->1225|3677->1282|3692->1288|3739->1314|3769->1317|3782->1321|3809->1327|3865->1356|3934->1404|3979->1421|4019->1434|4034->1440|4081->1466|4146->1504|4161->1510|4210->1538|4292->1593|4305->1597|4329->1600|4379->1623|4392->1627|4425->1639|4529->1712|4554->1719|4567->1723|4606->1724|4644->1734|4707->1766|4746->1777|4812->1812|4844->1814
                  LINES: 30->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|41->9|43->11|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|47->15|47->15|47->15|47->15|48->16|48->16|49->17|49->17|49->17|49->17|50->18|50->18|50->18|51->19|52->20|53->21|53->21|53->21|53->21|53->21|53->21|53->21|54->22|54->22|54->22|55->23|56->24|57->25|59->27|59->27|59->27|60->28|69->37|69->37|69->37|70->38|70->38|70->38|71->39|72->40|72->40|75->43|75->43|75->43|75->43|75->43|75->43|76->44|76->44|77->45|77->45|77->45|77->45|78->46|78->46|78->46|81->49|81->49|81->49|82->50|82->50|82->50|85->53|87->55|87->55|87->55|88->56|89->57|90->58|92->60|93->61
                  -- GENERATED --
              */
          