
package views.txt.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_es_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
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

class password_reset_es extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""Hola """),_display_(/*1.65*/name),format.raw/*1.69*/(""",


Alguien ha solicitado restablecer la contraseña de su cuenta.
Si no ha sido Usted o si no ha sido esta su intención, relájese e ignore este email.

Si lo que quiere es cambiar su contraseña, lo único que necesita hacer es seguir el siguiente enlace:
"""),_display_(/*8.2*/url),format.raw/*8.5*/("""

"""),format.raw/*10.1*/("""Atentamente,
El equipo de PlayAuthenticate
"""))
      }
    }
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}


}

/**/
object password_reset_es extends password_reset_es_Scope0.password_reset_es
              /*
                  -- GENERATED --
                  DATE: Wed Aug 12 16:48:53 MSK 2015
                  SOURCE: C:/Lotus/admin/distr/OS/tmp/Downloads/zvenigorod/zvenigorod/app/views/account/email/password_reset_es.scala.txt
                  HASH: ef98a4cf3f5dcba84c6c2b465d05bb7eae5bb0d2
                  MATRIX: 798->1|949->58|981->64|1005->68|1285->323|1307->326|1336->328
                  LINES: 27->1|32->1|32->1|32->1|39->8|39->8|41->10
                  -- GENERATED --
              */
          