
package views.txt.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_pt_Scope0 {
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

class password_reset_pt extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""Olá """),_display_(/*1.64*/name),format.raw/*1.68*/(""",


Você ou alguém pediu uma nova palavra passe para a sua conta.
Se não foi você ou não foi sua intenção, pode ignorar esta mensagem.

Se deseja uma nova palavra passe, terá somente que seguir este endereço para criar uma nova palavra passe:
"""),_display_(/*8.2*/url),format.raw/*8.5*/("""

"""),format.raw/*10.1*/("""Obrigado,
A equipa do PlayAuthenticate"""))
      }
    }
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}


}

/**/
object password_reset_pt extends password_reset_pt_Scope0.password_reset_pt
              /*
                  -- GENERATED --
                  DATE: Wed Mar 02 01:02:11 MSK 2016
                  SOURCE: C:/j/2015_10/zvenigorod/app/views/account/email/password_reset_pt.scala.txt
                  HASH: fc7e0c7acaf1e8f124d4984b0c822a95492e6e3b
                  MATRIX: 798->1|949->58|980->63|1004->67|1280->318|1302->321|1333->325
                  LINES: 27->1|32->1|32->1|32->1|39->8|39->8|41->10
                  -- GENERATED --
              */
          