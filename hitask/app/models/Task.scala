package models

import play.db.anorm._
import play.db.anorm.defaults._
import play.data.validation.Annotations._
import java.util._
import java.util.Date

case class Task(
	id:Pk[Long],
	name:String,
	status:String,
	date:Date){

	def this(name:String){
		this(NotAssigned,name,"TODO",new Date)
	}

	def this(id:Pk[Long],name:String){
		this(id,name,"TODO",new Date)
	}

	def doing = {
		val newTask = new Task(id,name,"DOING",date)
		Task.update(newTask)
	}
}
object Task extends Magic[Task]{
	def todoList = Task.find("where status='TODO' ").list()
}