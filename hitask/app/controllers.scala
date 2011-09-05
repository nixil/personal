package controllers

import play._
import play.mvc._

import models._
import play.db.anorm._

object Application extends Controller {
    
    import views.Application._
    
    def index = {
        val tasks = Task.find("order by date ASC").list()
        html.index("Alex")(tasks)
    }
    
    def save(id:Option[Long]) = {
        val task = params.get("task",classOf[Task])
    }
}
