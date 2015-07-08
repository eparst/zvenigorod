
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
object admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Post],List[Post],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(postsAll: List[Post], postsUser: List[Post], user: User):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

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
                       """),_display_(/*44.25*/Html(post.htmlPreview)),format.raw/*44.47*/("""
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
"""))}
  }

  def render(postsAll:List[Post],postsUser:List[Post],user:User): play.twirl.api.HtmlFormat.Appendable = apply(postsAll,postsUser,user)

  def f:((List[Post],List[Post],User) => play.twirl.api.HtmlFormat.Appendable) = (postsAll,postsUser,user) => apply(postsAll,postsUser,user)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 08 10:18:05 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/admin.scala.html
                  HASH: 2b73d051fc547694674d8f35e3400de6c64919e6
                  MATRIX: 758->19|903->76|931->78|952->91|991->93|1018->94|1054->105|1091->134|1130->136|1165->145|1204->158|1217->163|1252->178|1287->187|1326->197|1359->203|1415->233|1445->254|1484->255|1516->261|1554->283|1594->285|1639->302|1680->316|1695->322|1742->348|1772->351|1785->355|1812->361|1868->390|1911->412|1956->429|1996->442|2011->448|2058->474|2123->512|2138->518|2187->546|2253->581|2290->603|2325->611|2378->637|2393->643|2435->664|2488->690|2501->694|2527->699|2555->709|2568->713|2607->714|2645->724|2708->756|2755->775|2836->829|2861->845|2900->846|2949->867|3236->1127|3265->1147|3304->1148|3336->1154|3395->1197|3435->1199|3467->1204|3503->1214|3535->1225|3619->1282|3634->1288|3681->1314|3711->1317|3724->1321|3751->1327|3807->1356|3850->1378|3895->1395|3935->1408|3950->1414|3997->1440|4062->1478|4077->1484|4126->1512|4208->1567|4221->1571|4245->1574|4295->1597|4308->1601|4341->1613|4445->1686|4470->1693|4483->1697|4522->1698|4560->1708|4623->1740|4662->1751|4728->1786|4760->1788
                  LINES: 26->3|29->3|29->3|29->3|29->3|30->4|31->5|31->5|31->5|32->6|33->7|33->7|33->7|34->8|35->9|37->11|39->13|39->13|39->13|40->14|40->14|40->14|41->15|41->15|41->15|41->15|41->15|41->15|41->15|42->16|42->16|43->17|43->17|43->17|43->17|44->18|44->18|44->18|45->19|46->20|47->21|47->21|47->21|47->21|47->21|47->21|47->21|48->22|48->22|48->22|49->23|50->24|51->25|53->27|53->27|53->27|54->28|63->37|63->37|63->37|64->38|64->38|64->38|65->39|66->40|66->40|69->43|69->43|69->43|69->43|69->43|69->43|70->44|70->44|71->45|71->45|71->45|71->45|72->46|72->46|72->46|75->49|75->49|75->49|76->50|76->50|76->50|79->53|81->55|81->55|81->55|82->56|83->57|84->58|86->60|87->61
                  -- GENERATED --
              */
          