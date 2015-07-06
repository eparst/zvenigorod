
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Post,List[Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(front: Post, older: List[Post]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/main(Messages("playauthenticate.index.title"))/*2.48*/ {_display_(Seq[Any](format.raw/*2.50*/("""
      """),format.raw/*3.7*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron" >
       <!--  <h1>"""),_display_(/*5.19*/Messages("playauthenticate.index.intro")),format.raw/*5.59*/("""</h1>
        <p>"""),_display_(/*6.13*/Messages("playauthenticate.index.intro_2")),format.raw/*6.55*/(""" """),format.raw/*6.56*/("""<br/>"""),_display_(/*6.62*/Messages("playauthenticate.index.intro_3")),format.raw/*6.104*/("""</p>-->
        <!-- <img src="http://zv-cdn.appspot.com/static/zv/templates/siteground-j15-93/images/headerimg960.png" class="img-responsive">
         -->
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div class="col-xs-6 col-sm-4">
          <h2>"""),_display_(/*14.16*/older/*14.21*/.get(0).title),format.raw/*14.34*/("""</h2>
       <p>"""),_display_(/*15.12*/if(older.get(0).htmlPreview != null)/*15.48*/{_display_(_display_(/*15.50*/Html(older.get(0).htmlPreview)))}/*15.81*/else/*15.85*/{_display_(Seq[Any](_display_(/*15.87*/Html(older.get(0).content.substring(1, 150))),format.raw/*15.131*/("""...""")))}),format.raw/*15.135*/("""</p>
          <a class="btn" href=""""),_display_(/*16.33*/routes/*16.39*/.Application.show(older.get(0).id)),format.raw/*16.73*/("""">"""),_display_(/*16.76*/Messages("playauthenticate.index.weite")),format.raw/*16.116*/(""" """),format.raw/*16.117*/("""&raquo;</a></p>
        </div>
        <div class="col-xs-6 col-sm-4">
          <h2>"""),_display_(/*19.16*/older/*19.21*/.get(1).title),format.raw/*19.34*/("""</h2>
<p>"""),_display_(/*20.5*/if(older.get(1).htmlPreview != null)/*20.41*/{_display_(_display_(/*20.43*/Html(older.get(1).htmlPreview)))}/*20.74*/else/*20.78*/{_display_(Seq[Any](format.raw/*20.79*/("""
"""),_display_(/*21.2*/if(older.get(1).content.length() > 150)/*21.41*/{_display_(Seq[Any](_display_(/*21.43*/Html(older.get(1).content.substring(1, 150))),format.raw/*21.87*/("""...""")))}/*21.91*/else/*21.95*/{_display_(_display_(/*21.97*/Html(older.get(1).content)))}),format.raw/*21.124*/("""
""")))}),format.raw/*22.2*/("""</p>
          <a class="btn" href=""""),_display_(/*23.33*/routes/*23.39*/.Application.show(older.get(1).id)),format.raw/*23.73*/("""">"""),_display_(/*23.76*/Messages("playauthenticate.index.weite")),format.raw/*23.116*/(""" """),format.raw/*23.117*/("""&raquo;</a></p>
       </div>
        <div class="col-xs-6 col-sm-4">
          <h2>"""),_display_(/*26.16*/older/*26.21*/.get(2).title),format.raw/*26.34*/("""</h2>
<p>"""),_display_(/*27.5*/if(older.get(2).htmlPreview != null)/*27.41*/{_display_(_display_(/*27.43*/Html(older.get(2).htmlPreview)))}/*27.74*/else/*27.78*/{_display_(Seq[Any](format.raw/*27.79*/("""
"""),_display_(/*28.2*/if(older.get(2).content.length() > 150)/*28.41*/{_display_(Seq[Any](_display_(/*28.43*/Html(older.get(2).content.substring(1, 150))),format.raw/*28.87*/("""...""")))}/*28.91*/else/*28.95*/{_display_(_display_(/*28.97*/Html(older.get(2).content)))}),format.raw/*28.124*/("""
""")))}),format.raw/*29.2*/("""</p>
          <a class="btn" href=""""),_display_(/*30.33*/routes/*30.39*/.Application.show(older.get(2).id)),format.raw/*30.73*/("""">"""),_display_(/*30.76*/Messages("playauthenticate.index.weite")),format.raw/*30.116*/(""" """),format.raw/*30.117*/("""&raquo;</a></p>
        </div>
      </div>
       <!-- from yabe -->
        """),_display_(/*34.10*/Option(front)/*34.23*/.map/*34.27*/ { front =>_display_(Seq[Any](format.raw/*34.38*/("""
    """),format.raw/*35.5*/("""<!--  """),_display_(/*35.12*/display(front, mode = "home")),format.raw/*35.41*/(""" """),format.raw/*35.42*/("""-->
    
    """),_display_(/*37.6*/Option(older)/*37.19*/.filterNot(_.isEmpty).map/*37.44*/{ posts =>_display_(Seq[Any](format.raw/*37.54*/(""" 
      """),format.raw/*38.7*/("""<div class="older-posts">
        <h3>������<span class="from">�������</span></h3>
        """),_display_(/*40.10*/posts/*40.15*/.map/*40.19*/ { post =>_display_(Seq[Any](format.raw/*40.29*/("""
          """),_display_(/*41.12*/display(post, mode = "teaser")),format.raw/*41.42*/("""
        """)))}),format.raw/*42.10*/("""
       """),format.raw/*43.8*/("""</div>
    """)))}),format.raw/*44.6*/("""
  """)))}/*45.4*/.getOrElse/*45.14*/ {_display_(Seq[Any](format.raw/*45.16*/("""
    """),format.raw/*46.5*/("""<div class="empty">
      There is currently nothing to read here
    </div>
    
  """)))}),format.raw/*50.4*/("""
  """)))}),format.raw/*51.4*/("""
    
"""))}
  }

  def render(front:Post,older:List[Post]): play.twirl.api.HtmlFormat.Appendable = apply(front,older)

  def f:((Post,List[Post]) => play.twirl.api.HtmlFormat.Appendable) = (front,older) => apply(front,older)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jul 06 15:53:56 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/index.scala.html
                  HASH: 448aab7d7a5435b0b3ad99614ece865a18e51d2a
                  MATRIX: 732->1|852->33|879->35|933->81|972->83|1005->90|1154->213|1214->253|1258->271|1320->313|1348->314|1380->320|1443->362|1758->650|1772->655|1806->668|1850->685|1895->721|1925->723|1967->754|1980->758|2019->760|2085->804|2121->808|2185->845|2200->851|2255->885|2285->888|2347->928|2377->929|2490->1015|2504->1020|2538->1033|2574->1043|2619->1079|2649->1081|2691->1112|2704->1116|2743->1117|2771->1119|2819->1158|2858->1160|2923->1204|2946->1208|2959->1212|2989->1214|3040->1241|3072->1243|3136->1280|3151->1286|3206->1320|3236->1323|3298->1363|3328->1364|3440->1449|3454->1454|3488->1467|3524->1477|3569->1513|3599->1515|3641->1546|3654->1550|3693->1551|3721->1553|3769->1592|3808->1594|3873->1638|3896->1642|3909->1646|3939->1648|3990->1675|4022->1677|4086->1714|4101->1720|4156->1754|4186->1757|4248->1797|4278->1798|4384->1877|4406->1890|4419->1894|4468->1905|4500->1910|4534->1917|4584->1946|4613->1947|4653->1961|4675->1974|4709->1999|4757->2009|4792->2017|4911->2109|4925->2114|4938->2118|4986->2128|5025->2140|5076->2170|5117->2180|5152->2188|5194->2200|5216->2204|5235->2214|5275->2216|5307->2221|5422->2306|5456->2310
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|33->5|33->5|34->6|34->6|34->6|34->6|34->6|42->14|42->14|42->14|43->15|43->15|43->15|43->15|43->15|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->16|44->16|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|49->21|49->21|49->21|49->21|50->22|51->23|51->23|51->23|51->23|51->23|51->23|54->26|54->26|54->26|55->27|55->27|55->27|55->27|55->27|55->27|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|57->29|58->30|58->30|58->30|58->30|58->30|58->30|62->34|62->34|62->34|62->34|63->35|63->35|63->35|63->35|65->37|65->37|65->37|65->37|66->38|68->40|68->40|68->40|68->40|69->41|69->41|70->42|71->43|72->44|73->45|73->45|73->45|74->46|78->50|79->51
                  -- GENERATED --
              */
          