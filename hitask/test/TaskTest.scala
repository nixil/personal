package test.model
import play.test._
import play.db.anorm._

import models._

import org.scalatest.{FlatSpec,BeforeAndAfterEach}
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.Stack

class TaskTest extends UnitFlatSpec with ShouldMatchers with BeforeAndAfterEach {
	
	override def beforeEach() = {
		Fixtures.deleteDatabase()
		Yaml[List[Task]]("test-data.yml").foreach{
			Task.create(_)
		}
	}

	it should "todoList method should work" in {
		Task.todoList.size should be (2)
	}

	it should "test data load" in {
		import SqlParser._

		SQL("select count(*) from Task") as scalar[Long] should be (4)
	}

	"A TODO Task" should "be able to transfer to DOING" in {
		import SqlParser._
		val task = Task.find("where name='火烧赤壁'").single()
		task.doing
		val newStatus = SQL("""
			select status from Task where name={name}
			""").onParams("火烧赤壁") as scalar[String] 
		newStatus should be ("DOING")
	}
}