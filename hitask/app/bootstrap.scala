import play.jobs._
import play.test._

import models._

@OnApplicationStart class Bootstrap extends Job {

    override def doJob {
        if (Task.count().single() == 0) {
            Yaml[List[Task]]("data.yml").foreach {
                Task.create(_)
            }
        }
    }

}