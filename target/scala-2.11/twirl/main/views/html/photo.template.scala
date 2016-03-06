
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object photo_Scope0 {
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

     object photo_Scope1 {
import models._
import be.objectify.deadbolt.java.views.html._

class photo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Post],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(photos: List[Post], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.34*/(""" """),_display_(/*3.36*/main("photo")/*3.49*/ {_display_(Seq[Any](format.raw/*3.51*/(""" """),format.raw/*3.61*/("""
"""),format.raw/*4.1*/("""</br>
    """),_display_(/*5.6*/if(flash.contains("success"))/*5.35*/ {_display_(Seq[Any](format.raw/*5.37*/("""
        """),format.raw/*6.9*/("""<p>
        """),_display_(/*7.10*/flash/*7.15*/.get("success")),format.raw/*7.30*/("""
        """),format.raw/*8.9*/("""</p>
    """)))}),format.raw/*9.6*/("""
    """),_display_(/*10.6*/subjectPresent()/*10.22*/ {_display_(Seq[Any](format.raw/*10.24*/("""
                """),_display_(/*11.18*/if(user.isAdmin)/*11.34*/{_display_(Seq[Any](format.raw/*11.35*/("""
                    """),format.raw/*12.21*/("""<h4><a href=""""),_display_(/*12.35*/routes/*12.41*/.AdminsPosts.create()),format.raw/*12.62*/("""">Создать</a></h4>
                    <hr>""")))}),format.raw/*13.26*/("""
     """)))}),format.raw/*14.7*/("""
          """),format.raw/*15.11*/("""<table>			    				
   	"""),_display_(/*16.6*/if(photos != null)/*16.24*/{_display_(Seq[Any](format.raw/*16.25*/("""
    """),_display_(/*17.6*/for((post, index) <- photos.zipWithIndex) yield /*17.47*/ {_display_(Seq[Any](format.raw/*17.49*/("""
    	"""),_display_(/*18.7*/if(index % 4 == 0  )/*18.27*/{_display_(Seq[Any](format.raw/*18.28*/("""<tr>""")))}),format.raw/*18.33*/("""
   			"""),format.raw/*19.7*/("""<td>   
   			<a href=""""),_display_(/*20.17*/routes/*20.23*/.Application.show(post.id)),format.raw/*20.49*/("""">
   				"""),_display_(/*21.9*/Html(CdnAssets.changeImageUrl(post.htmlPreview))),format.raw/*21.57*/("""
   			"""),format.raw/*22.7*/("""</a> 
   			"""),_display_(/*23.8*/subjectPresent()/*23.24*/ {_display_(Seq[Any](format.raw/*23.26*/("""              
               """),_display_(/*24.17*/if(user.isAdmin)/*24.33*/{_display_(Seq[Any](format.raw/*24.34*/(""" 
      	         	"""),format.raw/*25.18*/("""<p><a href=""""),_display_(/*25.31*/routes/*25.37*/.AdminsPosts.edit(post.id)),format.raw/*25.63*/("""">Редактировать / </a> 
        	        <a href=""""),_display_(/*26.28*/routes/*26.34*/.AdminsPosts.delete(post.id)),format.raw/*26.62*/("""">Удалить</a></p>
                """)))})))}),format.raw/*27.19*/("""
     	 	"""),format.raw/*28.9*/("""</td>
    	  """),_display_(/*29.9*/if(index % 4 == 3   )/*29.30*/{_display_(Seq[Any](format.raw/*29.31*/("""</tr>""")))}),format.raw/*29.37*/("""
      """)))}),format.raw/*30.8*/("""

    """)))}/*32.6*/else/*32.10*/{_display_(Seq[Any](format.raw/*32.11*/("""
      			"""),format.raw/*33.10*/("""<p>No photos.... </p>
          """)))}),format.raw/*34.12*/("""
          """),format.raw/*35.11*/("""</tr>
          </table>

""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(photos:List[Post],user:User): play.twirl.api.HtmlFormat.Appendable = apply(photos,user)

  def f:((List[Post],User) => play.twirl.api.HtmlFormat.Appendable) = (photos,user) => apply(photos,user)

  def ref: this.type = this

}


}
}

/**/
object photo extends photo_Scope0.photo_Scope1.photo
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 13:58:45 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/photo.scala.html
                  HASH: 648595deb18fe68ef2dccc2b291dc76c598e2f7d
                  MATRIX: 845->66|972->98|1000->100|1021->113|1060->115|1088->125|1115->126|1151->137|1188->166|1227->168|1262->177|1301->190|1314->195|1349->210|1384->219|1423->229|1455->235|1480->251|1520->253|1565->271|1590->287|1629->288|1678->309|1719->323|1734->329|1776->350|1851->394|1888->401|1927->412|1977->436|2004->454|2043->455|2075->461|2132->502|2172->504|2205->511|2234->531|2273->532|2309->537|2343->544|2394->568|2409->574|2456->600|2493->611|2562->659|2596->666|2635->679|2660->695|2700->697|2758->728|2783->744|2822->745|2869->764|2909->777|2924->783|2971->809|3049->860|3064->866|3113->894|3183->930|3219->939|3259->953|3289->974|3328->975|3365->981|3403->989|3428->996|3441->1000|3480->1001|3518->1011|3582->1044|3621->1055|3678->1082
                  LINES: 31->3|36->3|36->3|36->3|36->3|36->3|37->4|38->5|38->5|38->5|39->6|40->7|40->7|40->7|41->8|42->9|43->10|43->10|43->10|44->11|44->11|44->11|45->12|45->12|45->12|45->12|46->13|47->14|48->15|49->16|49->16|49->16|50->17|50->17|50->17|51->18|51->18|51->18|51->18|52->19|53->20|53->20|53->20|54->21|54->21|55->22|56->23|56->23|56->23|57->24|57->24|57->24|58->25|58->25|58->25|58->25|59->26|59->26|59->26|60->27|61->28|62->29|62->29|62->29|62->29|63->30|65->32|65->32|65->32|66->33|67->34|68->35|71->38
                  -- GENERATED --
              */
          