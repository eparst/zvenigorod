
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Post,List[Post],javasape.Sape,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(front: Post, older: List[Post], sape: javasape.Sape):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""
"""),_display_(/*2.2*/main(Messages("playauthenticate.index.title"))/*2.48*/ {_display_(Seq[Any](format.raw/*2.50*/("""
      """),format.raw/*3.7*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron" >
       <!--  <h1>"""),_display_(/*5.19*/Messages("playauthenticate.index.intro")),format.raw/*5.59*/("""</h1>-->
      </div>
      """),_display_(/*7.8*/Messages("Реклама: ")),format.raw/*7.29*/(""" 
"""),_display_(/*8.2*/sape/*8.6*/.getPageLinks(request.uri,request.cookies).render()),format.raw/*8.57*/("""
"""),format.raw/*9.19*/("""
      """),format.raw/*10.7*/("""<!-- Example row of columns -->
      <div class="row">
      """),_display_(/*12.8*/for(i <- 0 to 2) yield /*12.24*/ {_display_(Seq[Any](format.raw/*12.26*/("""
        """),format.raw/*13.9*/("""<div class="col-xs-6 col-sm-4">
        """),_display_(/*14.10*/defining(CdnAssets.changeImageUrl(older.get(i).htmlPreview))/*14.70*/{ prev =>_display_(Seq[Any](format.raw/*14.79*/("""
          		"""),format.raw/*15.13*/("""<h2>"""),_display_(/*15.18*/older/*15.23*/.get(i).title),format.raw/*15.36*/("""</h2>
				<p>"""),_display_(/*16.9*/if(prev != null)/*16.25*/{_display_(_display_(/*16.27*/Html(prev)))}/*16.38*/else/*16.42*/{_display_(Seq[Any](format.raw/*16.43*/("""
							"""),_display_(/*17.9*/defining(CdnAssets.changeImageUrl(older.get(i).content))/*17.65*/{ cont =>_display_(Seq[Any](format.raw/*17.74*/("""
					"""),_display_(/*18.7*/if(cont.length() > 150)/*18.30*/{_display_(Seq[Any](_display_(/*18.32*/Html(cont.substring(1, 150))),format.raw/*18.60*/("""...""")))}/*18.64*/else/*18.68*/{_display_(_display_(/*18.70*/Html(cont)))}),format.raw/*18.81*/("""
				""")))}),format.raw/*19.6*/("""</p>
			""")))}),format.raw/*20.5*/("""
		""")))}),format.raw/*21.4*/("""
          """),format.raw/*22.11*/("""<a class="btn" href=""""),_display_(/*22.33*/routes/*22.39*/.Application.show(older.get(i).id)),format.raw/*22.73*/("""">"""),_display_(/*22.76*/Messages("playauthenticate.index.weite")),format.raw/*22.116*/(""" """),format.raw/*22.117*/("""&raquo;</a></p>
       </div>""")))}),format.raw/*23.15*/("""
      """),format.raw/*24.7*/("""</div>
       <!-- from yabe -->
       """),format.raw/*42.8*/("""
    """),format.raw/*43.5*/("""<div class="older-posts">
        <h3>"""),_display_(/*44.14*/Messages("Другие новости:")),format.raw/*44.41*/("""</h3>
         """),_display_(/*45.11*/for(i <- 3 to 7) yield /*45.27*/ {_display_(Seq[Any](format.raw/*45.29*/("""
         	"""),_display_(/*46.12*/display(older.get(i), mode = "teaser")),format.raw/*46.50*/("""
         """)))}),format.raw/*47.11*/("""        
       """),format.raw/*48.8*/("""</div>"""),format.raw/*54.16*/("""
  """)))}),format.raw/*55.4*/("""
    
"""))
      }
    }
  }

  def render(front:Post,older:List[Post],sape:javasape.Sape): play.twirl.api.HtmlFormat.Appendable = apply(front,older,sape)

  def f:((Post,List[Post],javasape.Sape) => play.twirl.api.HtmlFormat.Appendable) = (front,older,sape) => apply(front,older,sape)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Aug 13 15:34:52 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/index.scala.html
                  HASH: d61a564772db57c9fa641d87e767b460d28eae31
                  MATRIX: 768->1|916->54|944->57|998->103|1037->105|1071->113|1222->238|1282->278|1338->309|1379->330|1408->334|1419->338|1490->389|1519->409|1554->417|1645->482|1677->498|1717->500|1754->510|1823->552|1892->612|1939->621|1981->635|2013->640|2027->645|2061->658|2102->673|2127->689|2157->691|2179->702|2192->706|2231->707|2267->717|2332->773|2379->782|2413->790|2445->813|2484->815|2533->843|2556->847|2569->851|2599->853|2633->864|2670->871|2710->881|2745->886|2785->898|2834->920|2849->926|2904->960|2934->963|2996->1003|3026->1004|3088->1035|3123->1043|3192->1504|3225->1510|3292->1550|3340->1577|3384->1594|3416->1610|3456->1612|3496->1625|3555->1663|3598->1675|3642->1692|3676->1962|3711->1967
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|38->7|38->7|39->8|39->8|39->8|40->9|41->10|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|49->18|49->18|50->19|51->20|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|55->24|57->42|58->43|59->44|59->44|60->45|60->45|60->45|61->46|61->46|62->47|63->48|63->54|64->55
                  -- GENERATED --
              */
          