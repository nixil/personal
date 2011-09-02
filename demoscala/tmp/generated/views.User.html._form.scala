
                    package views.User.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object _form extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(firstName:String):Html = {
                            try {
                                _display_ {

format.raw/*1.20*/("""
<form>
    <p>
        <label for="firstName">姓</label>
        <input name="firstName" value="""")+_display_(/*5.41*/firstName)+format.raw/*5.50*/(""""></input>
    </p>
</form>""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Thu Sep 01 16:11:59 CST 2011
                    SOURCE: /app/views/User/_form.scala.html
                    HASH: 3eb6f25c00f2e60e8b058d4d309bc3ff10f69cb2
                    MATRIX: 322->1|447->19|574->120|603->129
                    LINES: 10->1|14->1|18->5|18->5
                    -- GENERATED --
                */
            
