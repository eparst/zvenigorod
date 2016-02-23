
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
       """),format.raw/*5.58*/("""
      """),format.raw/*6.7*/("""</div>
     """),format.raw/*9.17*/("""
		"""),_display_(/*10.4*/Html(front.getContent)),format.raw/*10.26*/("""
      """),format.raw/*11.7*/("""<!-- Example row of columns -->
      <div class="row">
     """),format.raw/*13.42*/("""
      """),_display_(/*14.8*/for(i <- 1 to 3) yield /*14.24*/ {_display_(Seq[Any](format.raw/*14.26*/("""
        """),format.raw/*15.9*/("""<div class="col-xs-6 col-sm-4">
        """),_display_(/*16.10*/defining(CdnAssets.changeImageUrl(older.get(i).htmlPreview))/*16.70*/{ prev =>_display_(Seq[Any](format.raw/*16.79*/("""
          		"""),format.raw/*17.13*/("""<h2>"""),_display_(/*17.18*/older/*17.23*/.get(i).title),format.raw/*17.36*/("""</h2>
				<p>"""),_display_(/*18.9*/if(prev != null)/*18.25*/{_display_(_display_(/*18.27*/Html(prev)))}/*18.38*/else/*18.42*/{_display_(Seq[Any](format.raw/*18.43*/("""
							"""),_display_(/*19.9*/defining(CdnAssets.changeImageUrl(older.get(i).content))/*19.65*/{ cont =>_display_(Seq[Any](format.raw/*19.74*/("""
					"""),_display_(/*20.7*/if(cont.length() > 150)/*20.30*/{_display_(Seq[Any](_display_(/*20.32*/Html(cont.substring(1, 150))),format.raw/*20.60*/("""...""")))}/*20.64*/else/*20.68*/{_display_(_display_(/*20.70*/Html(cont)))}),format.raw/*20.81*/("""
				""")))}),format.raw/*21.6*/("""</p>
			""")))}),format.raw/*22.5*/("""
		""")))}),format.raw/*23.4*/("""
          """),format.raw/*24.11*/("""<a class="btn" href=""""),_display_(/*24.33*/routes/*24.39*/.Application.show(older.get(i).id)),format.raw/*24.73*/("""">"""),_display_(/*24.76*/Messages("playauthenticate.index.weite")),format.raw/*24.116*/(""" """),format.raw/*24.117*/("""&raquo;</a></p>
       </div>""")))}),format.raw/*25.15*/("""
      """),format.raw/*26.7*/("""</div>
       <!-- from yabe -->
       """),format.raw/*56.16*/("""
  """)))}),format.raw/*57.4*/("""
    
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
                  DATE: Tue Feb 23 02:06:51 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/index.scala.html
                  HASH: ba4eb46b6777b8e4e9a369ce2d5e453b8d79eabb
                  MATRIX: 768->1|916->54|944->57|998->103|1037->105|1071->113|1212->277|1246->285|1286->400|1317->405|1360->427|1395->435|1486->534|1521->543|1553->559|1593->561|1630->571|1699->613|1768->673|1815->682|1857->696|1889->701|1903->706|1937->719|1978->734|2003->750|2033->752|2055->763|2068->767|2107->768|2143->778|2208->834|2255->843|2289->851|2321->874|2360->876|2409->904|2432->908|2445->912|2475->914|2509->925|2546->932|2586->942|2621->947|2661->959|2710->981|2725->987|2780->1021|2810->1024|2872->1064|2902->1065|2964->1096|2999->1104|3069->2019|3104->2024
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|37->6|38->9|39->10|39->10|40->11|42->13|43->14|43->14|43->14|44->15|45->16|45->16|45->16|46->17|46->17|46->17|46->17|47->18|47->18|47->18|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|49->20|49->20|49->20|49->20|49->20|50->21|51->22|52->23|53->24|53->24|53->24|53->24|53->24|53->24|53->24|54->25|55->26|57->56|58->57
                  -- GENERATED --
              */
          