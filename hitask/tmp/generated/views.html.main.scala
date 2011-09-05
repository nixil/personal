
                    package views.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object main extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(title:String = "Welcome To HiTask")(body: => Html):Html = {
                            try {
                                _display_ {

format.raw/*1.53*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>""")+_display_(/*6.17*/title)+format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href="""")+_display_(/*7.54*/asset("public/stylesheets/main.css"))+format.raw/*7.90*/("""">
        <link rel="shortcut icon" type="image/png" href="""")+_display_(/*8.59*/asset("public/images/favicon.png"))+format.raw/*8.93*/("""">
    </head>
    <body>
        <div id="wrapper">
        """)+_display_(/*12.10*/body)+format.raw/*12.14*/("""
        </div>
        <script src="http://cdn.jquerytools.org/1.2.5/jquery.tools.min.js"></script>
    </body>
</html>
""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Mon Sep 05 11:08:43 CST 2011
                    SOURCE: /app/views/main.scala.html
                    HASH: c548b445a91e36b00836761474ee4a8ba1d34cab
                    MATRIX: 316->1|474->52|552->104|577->109|665->171|721->207|808->268|862->302|951->364|976->368
                    LINES: 10->1|14->1|19->6|19->6|20->7|20->7|21->8|21->8|25->12|25->12
                    -- GENERATED --
                */
            
