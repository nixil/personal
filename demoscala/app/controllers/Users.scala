package controllers

import play._
import play.mvc._
import models._

object Users extends Controller {

        import views.User._

        def index(name:Option[String], email:Option[String]) = {
                val _name = name.getOrElse("Anonymous")
                val _email = email.getOrElse("Anonymous@xxx.com")
                val user = new User(_name,_email)
                html.index(user)
        }

        @Before def logRequest = {
                println("New Request coming in...")
        }

        @After def afterAction = {
                println("Responding...")
        }
}