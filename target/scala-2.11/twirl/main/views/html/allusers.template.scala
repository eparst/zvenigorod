
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object allusers_Scope0 {
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

     object allusers_Scope1 {
import models._

class allusers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[User],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(usersAll: List[User], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.36*/(""" """),_display_(/*3.38*/main("Admin")/*3.51*/ {_display_(Seq[Any](format.raw/*3.53*/("""

    """),_display_(/*5.6*/if(flash.contains("success"))/*5.35*/ {_display_(Seq[Any](format.raw/*5.37*/("""
        """),format.raw/*6.9*/("""<p>
        """),_display_(/*7.10*/flash/*7.15*/.get("success")),format.raw/*7.30*/("""
        """),format.raw/*8.9*/("""</p>
    """)))}),format.raw/*9.6*/("""

    """),format.raw/*11.5*/("""<h4>Users:</h4>
			<table>
    				
         """),_display_(/*14.11*/if(usersAll != null)/*14.31*/{_display_(Seq[Any](format.raw/*14.32*/("""
    """),_display_(/*15.6*/for((user, index) <- usersAll.zipWithIndex) yield /*15.49*/ {_display_(Seq[Any](format.raw/*15.51*/("""
	"""),format.raw/*16.2*/("""<tr>
	<td>"""),_display_(/*17.7*/(index + 1)),format.raw/*17.18*/("""</td>
    <td> &nbsp;Login: """),_display_(/*18.24*/user/*18.28*/.name),format.raw/*18.33*/("""; &nbsp;</td>
    <td> &nbsp;ID: """),_display_(/*19.21*/user/*19.25*/.id),format.raw/*19.28*/("""; &nbsp;</td>      
    <td> &nbsp;Email: """),_display_(/*20.24*/user/*20.28*/.email),format.raw/*20.34*/("""; &nbsp;</td>
    <td>
     """),_display_(/*22.7*/for(p <- user.getProviders()) yield /*22.36*/ {_display_(Seq[Any](format.raw/*22.38*/("""
            """),_display_(/*23.14*/_providerIcon(p)),format.raw/*23.30*/("""
        """)))}),format.raw/*24.10*/("""</td>
    <td> &nbsp;isAdmin: """),_display_(/*25.26*/user/*25.30*/.isAdmin),format.raw/*25.38*/("""; &nbsp;</td>
      </tr>
      	<tr><td colspan="6"><hr></td></tr>
		  </tr>
          </table>
            """)))}),format.raw/*30.14*/("""

    """)))}/*32.6*/else/*32.10*/{_display_(Seq[Any](format.raw/*32.11*/("""
      			"""),format.raw/*33.10*/("""<p>No users.... </p>
          """)))}),format.raw/*34.12*/("""
        
""")))}),format.raw/*36.2*/("""

"""))
      }
    }
  }

  def render(usersAll:List[User],user:User): play.twirl.api.HtmlFormat.Appendable = apply(usersAll,user)

  def f:((List[User],User) => play.twirl.api.HtmlFormat.Appendable) = (usersAll,user) => apply(usersAll,user)

  def ref: this.type = this

}


}
}

/**/
object allusers extends allusers_Scope0.allusers_Scope1.allusers
              /*
                  -- GENERATED --
                  DATE: Sun Mar 06 13:58:45 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/allusers.scala.html
                  HASH: 094264b77d69c252740de596c352c86308d8c3d4
                  MATRIX: 807->19|936->53|964->55|985->68|1024->70|1056->77|1093->106|1132->108|1167->117|1206->130|1219->135|1254->150|1289->159|1328->169|1361->175|1434->221|1463->241|1502->242|1534->248|1593->291|1633->293|1662->295|1699->306|1731->317|1787->346|1800->350|1826->355|1887->389|1900->393|1924->396|1994->439|2007->443|2034->449|2089->478|2134->507|2174->509|2215->523|2252->539|2293->549|2351->580|2364->584|2393->592|2534->702|2559->709|2572->713|2611->714|2649->724|2712->756|2753->767
                  LINES: 30->3|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|41->9|43->11|46->14|46->14|46->14|47->15|47->15|47->15|48->16|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|54->22|54->22|54->22|55->23|55->23|56->24|57->25|57->25|57->25|62->30|64->32|64->32|64->32|65->33|66->34|68->36
                  -- GENERATED --
              */
          