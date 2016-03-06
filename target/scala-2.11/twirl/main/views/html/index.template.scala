
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
     """),format.raw/*6.15*/("""
     """),format.raw/*9.17*/("""
		"""),_display_(/*10.4*/Html(front.getContent)),format.raw/*10.26*/("""
      """),format.raw/*11.7*/("""<!-- Example row of columns -->
      <div class="row">
     """),format.raw/*13.42*/("""
     """),format.raw/*25.17*/("""
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
                  DATE: Sun Mar 06 13:40:57 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/index.scala.html
                  HASH: 85c80b33afa4601cfb4c544be3adf45579bf819b
                  MATRIX: 768->1|916->54|944->57|998->103|1037->105|1071->113|1178->291|1212->400|1243->405|1286->427|1321->435|1412->534|1447->1100|1482->1108|1552->2023|1587->2028
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->6|36->9|37->10|37->10|38->11|40->13|41->25|42->26|44->56|45->57
                  -- GENERATED --
              */
          