package controllers

import play._
import play.mvc._
import play.data.validation._

import models._
import play.db.anorm._

object Application extends Controller {
    
    import views.Application._
    
    def index = {
        val tasks = Task.find("order by date DESC").list()
        html.index("Alex")(tasks)
    }
    
    def save(id:Option[Long]) = {
        val task = params.get("task",classOf[Task])
        Validation.valid("task", task)
        if(Validation.hasErrors){
            
        }else{
            id match {
                case Some(id) => Task.update(task)
                case None => Task.create(task)
            }
            Action(index)
        }
    }
}
