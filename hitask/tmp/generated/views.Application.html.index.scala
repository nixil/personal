
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
        <div style="text-align:right">
            <div>
                <form action="/Application/save" method="GET" id="formNewTask">
                    <span class="taskCategory">全部</span>
                    <span class="taskCategory" style="background-color:YELLOW">待办</span>
                    <span class="taskCategory" style="background-color:GREEN">进行中</span>
                    <span class="taskCategory" style="background-color:GREY">已完成</span>
                    <input id="inputTaskName" type="text" name="task.name" />
                    <input id="" type="hidden" name="task.status" value="TODO">
                    <input type="submit" value="新建" />
                </form>
            </div>
        </div>
        <table width="100%">
            <tr>
                <td>
                    <ul class="task todo">
                    """)+_display_(/*25.22*/tasks/*25.27*/.map/*25.31*/{ t =>format.raw/*25.37*/("""
                        <li>
                            <div class="task """)+_display_(/*27.47*/t/*27.48*/.status)+format.raw/*27.55*/("""">
                                <span class="title">""")+_display_(/*28.54*/t/*28.55*/.name)+format.raw/*28.60*/("""</span>
                                <br>
                                <span>""")+_display_(/*30.40*/t/*30.41*/.date.format("EEEE',' MMMM dd',' yyyy"))+format.raw/*30.80*/("""</span>
                            </div>
                        </li>
                    """)})+format.raw/*33.22*/("""
                    </ul>
                </td>
            </tr>
        </table>

       
    </div>  
</div>
""")})+format.raw/*42.2*/("""
<script type="text/javascript">
$(document).ready(function() """)+format.raw("""{""")+format.raw/*44.31*/("""
    //TODO something here
""")+format.raw("""}""")+format.raw/*46.2*/(""");
</script>""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Mon Sep 05 20:04:45 CST 2011
                    SOURCE: /app/views/Application/index.scala.html
                    HASH: e3252dcc8fb549d974253715bac23aaf23e34db0
                    MATRIX: 329->1|479->44|507->47|540->72|560->74|713->201|737->205|1684->1125|1698->1130|1711->1134|1736->1140|1839->1216|1849->1217|1877->1224|1960->1280|1970->1281|1996->1286|2107->1370|2117->1371|2177->1410|2300->1504|2442->1618|2552->1681|2626->1709
                    LINES: 10->1|14->1|16->3|16->3|16->3|19->6|19->6|38->25|38->25|38->25|38->25|40->27|40->27|40->27|41->28|41->28|41->28|43->30|43->30|43->30|46->33|55->42|57->44|59->46
                    -- GENERATED --
                */
            
