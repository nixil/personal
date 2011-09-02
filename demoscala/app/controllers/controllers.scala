package controllers

import play._
import play.mvc._

object Application extends Controller {
    
    import views.Application._
    
    def index(name:Option[String]) = {
        val user = name.map("Hello " + _ +"!").getOrElse("无名氏")
        html index (user + "Your Scala application is ready!")
    }
    
    def login = {
        html login "Welcome, Please Login"
    }

    def welcome = {
      val username = params get "username"
      val pwd = params get "password"
      if(username == pwd){
        html welcome "Welcome "+username
      }else{
        flash += ("error" -> "Oops, username should be the same as password")
        Action(login)
      }
    }

    def json = Json("{message: 'Hello world'}")
}
