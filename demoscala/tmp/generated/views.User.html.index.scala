
                    package views.User.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object index extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(user:models.User):Html = {
                            try {
                                _display_ {

format.raw/*1.20*/("""

""")+_display_(/*3.2*/main(title="UserIndex")/*3.25*/{format.raw/*3.26*/("""
	<p>用户信息</p>
	<hr>
	<div>
		<p>姓名：""")+_display_(/*7.10*/user/*7.14*/.name)+format.raw/*7.19*/("""</p>
		<p>邮件：""")+_display_(/*8.10*/user/*8.14*/.email)+format.raw/*8.20*/("""</p>
	</div>
""")})}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Thu Sep 01 18:24:59 CST 2011
                    SOURCE: /app/views/User/index.scala.html
                    HASH: 8fa8273e19784b9ca478b7b8d3f2e9839856066a
                    MATRIX: 322->1|447->19|477->24|508->47|527->48|593->88|605->92|630->97|671->112|683->116|709->122
                    LINES: 10->1|14->1|16->3|16->3|16->3|20->7|20->7|20->7|21->8|21->8|21->8
                    -- GENERATED --
                */
            
