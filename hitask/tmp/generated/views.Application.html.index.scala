
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object index extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(user:String="无名氏")(tasks:Seq[models.Task]):Html = {
                            try {
                                _display_ {

format.raw/*1.45*/("""

""")+_display_(/*3.2*/main("Welcome To HiTask")/*3.27*/ {format.raw/*3.29*/("""
<div id="container" style="text-align:center">
    <h1>Hello,Alex. Welcome To HiTask</h1>
    <h2 style="text-align:left"><u>""")+_display_(/*6.37*/user)+format.raw/*6.41*/("""的任务列表</u></h2>
    <div id="content" style="width:800px">
        <div>
            <div>
                <span class="taskCategory">全部</span>
                <span class="taskCategory" style="background-color:YELLOW">待办</span>
                <span class="taskCategory" style="background-color:GREEN">进行中</span>
                <span class="taskCategory" style="background-color:GREY">已完成</span>
            </div>
        </div>

        <table width="100%">
            <tr>
                <td>
                    <ul class="task todo">
                    """)+_display_(/*21.22*/tasks/*21.27*/.map/*21.31*/{ t =>format.raw/*21.37*/("""
                        <li>
                            <div class="task """)+_display_(/*23.47*/t/*23.48*/.status)+format.raw/*23.55*/("""">
                                <span class="title">""")+_display_(/*24.54*/t/*24.55*/.name)+format.raw/*24.60*/("""</span>
                                <br>
                                <span>""")+_display_(/*26.40*/t/*26.41*/.date.format("EEEE',' MMMM dd',' yyyy"))+format.raw/*26.80*/("""</span>
                            </div>
                        </li>
                    """)})+format.raw/*29.22*/("""
                    </ul>
                </td>
            </tr>
        </table>
    </div>  
</div>
""")})+format.raw/*36.2*/("""
<script type="text/javascript">
$(document).ready(function() """)+format.raw("""{""")+format.raw/*38.31*/("""
    //TODO something here
""")+format.raw("""}""")+format.raw/*40.2*/(""");
</script>""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Mon Sep 05 11:17:25 CST 2011
                    SOURCE: /app/views/Application/index.scala.html
                    HASH: bc6be27bffa1cad7eb583ff082d55fcb5e56ff8b
                    MATRIX: 329->1|479->44|507->47|540->72|560->74|713->201|737->205|1327->768|1341->773|1354->777|1379->783|1482->859|1492->860|1520->867|1603->923|1613->924|1639->929|1750->1013|1760->1014|1820->1053|1943->1147|2076->1252|2186->1315|2260->1343
                    LINES: 10->1|14->1|16->3|16->3|16->3|19->6|19->6|34->21|34->21|34->21|34->21|36->23|36->23|36->23|37->24|37->24|37->24|39->26|39->26|39->26|42->29|49->36|51->38|53->40
                    -- GENERATED --
                */
            
