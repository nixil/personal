
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object welcome extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(username:String):Html = {
                            try {
                                _display_ {

format.raw/*1.19*/("""

""")+_display_(/*3.2*/main(username)/*3.16*/ {format.raw/*3.18*/("""
    
   	<h1>Hello """)+_display_(/*5.16*/username)+format.raw/*5.24*/("""</h1>

   	<a href="""")+_display_(/*7.15*/action(controllers.Application.index _))+format.raw/*7.54*/("""">home</a>
    
""")})+format.raw/*9.2*/("""	""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Thu Sep 01 17:17:20 CST 2011
                    SOURCE: /app/views/Application/welcome.scala.html
                    HASH: d6904d4f26d5f97aa2e40eb2f026fb61d83c81f7
                    MATRIX: 331->1|455->18|485->23|507->37|527->39|576->62|604->70|653->93|712->132|758->151
                    LINES: 10->1|14->1|16->3|16->3|16->3|18->5|18->5|20->7|20->7|22->9
                    -- GENERATED --
                */
            
