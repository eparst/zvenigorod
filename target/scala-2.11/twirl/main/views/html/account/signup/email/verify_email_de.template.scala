
package views.html.account.signup.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_de_Scope0 {
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

class verify_email_de extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Hey """),_display_(/*2.6*/name),format.raw/*2.10*/(""",
<br />
<br />
<p>
	Du hast dich kürzlich bei PlayAuthenticate registriert.<br />
	<br />
	Folge diesem Link um dein Konto <a href=""""),_display_(/*8.44*/verificationUrl),format.raw/*8.59*/("""">jetzt zu aktivieren</a>.
</p>
<br />
<p>
	Grüße,<br /> 
	<i>Das PlayAuthenticate-Team</i>
</p>"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_de extends verify_email_de_Scope0.verify_email_de
              /*
                  -- GENERATED --
                  DATE: Tue Sep 22 13:52:45 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/signup/email/verify_email_de.scala.html
                  HASH: 22db2f62a0a9154d052f622ae9625e544b201592
                  MATRIX: 807->1|971->70|998->71|1028->76|1052->80|1212->214|1247->229
                  LINES: 27->1|32->1|33->2|33->2|33->2|39->8|39->8
                  -- GENERATED --
              */
          