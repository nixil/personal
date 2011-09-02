
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object login extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(title:String = "")(implicit flash:play.mvc.Scope.Flash):Html = {
                            try {
                                _display_ {

format.raw/*1.58*/("""
""")+_display_(/*2.2*/main(title = "请登录")/*2.21*/{format.raw/*2.22*/("""
<div>
        <span>""")+_display_(/*4.16*/title)+format.raw/*4.21*/("""</span>
        """)+_display_(/*5.10*/if(flash.get("error"))/*5.32*/ {format.raw/*5.34*/("""
            <p style="color:#c00">
                """)+_display_(/*7.18*/flash/*7.23*/.get("error"))+format.raw/*7.36*/("""
            </p>
        """)})+format.raw/*9.10*/("""
        <form action="""")+_display_(/*10.24*/action(controllers.Application.welcome))+format.raw/*10.63*/("""" method="GET">
                <p>
                        <label for="username">UserName:</label>
                        <input type="text" name="username" />
                </p>
                <p>
                        <label for="password">Password:</label>
                        <input type="password" name="password" />
                </p>
                <p>
                        <input id="submit" type="submit" value="LetMeIn" />
                </p>    
        </form>
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
                    DATE: Thu Sep 01 15:18:29 CST 2011
                    SOURCE: /app/views/Application/login.scala.html
                    HASH: 10279a8bade55e88bc8ec695dc20e2c4bd63b3bd
                    MATRIX: 329->1|492->57|519->59|546->78|565->79|613->101|638->106|681->123|711->145|731->147|810->200|823->205|856->218|911->245|962->269|1022->308
                    LINES: 10->1|14->1|15->2|15->2|15->2|17->4|17->4|18->5|18->5|18->5|20->7|20->7|20->7|22->9|23->10|23->10
                    -- GENERATED --
                */
            
