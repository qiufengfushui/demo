/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-04 01:29:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class member_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"utf-8\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/theme.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        #footer {\r\n");
      out.write("            padding: 15px 0;\r\n");
      out.write("            background: #fff;\r\n");
      out.write("            border-top: 1px solid #ddd;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        #topcontrol {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            z-index: 99;\r\n");
      out.write("            width: 30px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            background: #222;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            right: 14px !important;\r\n");
      out.write("            bottom: 11px !important;\r\n");
      out.write("            border-radius: 3px !important;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #topcontrol:after {\r\n");
      out.write("            /*top: -2px;*/\r\n");
      out.write("            left: 8.5px;\r\n");
      out.write("            content: \"\\f106\";\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-family: FontAwesome;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #topcontrol:hover {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            background: #18ba9b;\r\n");
      out.write("            -webkit-transition: all 0.3s ease-in-out;\r\n");
      out.write("            -moz-transition: all 0.3s ease-in-out;\r\n");
      out.write("            -o-transition: all 0.3s ease-in-out;\r\n");
      out.write("            transition: all 0.3s ease-in-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"navbar-wrapper\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index\" style=\"font-size:32px;\">尚筹网-创意产品众筹平台</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\" style=\"float:right;\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"glyphicon glyphicon-user\"></i> 张三<span class=\"caret\"></span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/member\"><i class=\"glyphicon glyphicon-scale\"></i> 会员中心</a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"glyphicon glyphicon-comment\"></i> 消息</a></li>\r\n");
      out.write("                                <li class=\"divider\"></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index\"><i class=\"glyphicon glyphicon-off\"></i> 退出系统</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row clearfix\">\r\n");
      out.write("        <div class=\"col-sm-3 col-md-3 column\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"thumbnail\" style=\"    border-radius: 0px;\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/img/services-box1.jpg\" class=\"img-thumbnail\" alt=\"\">\r\n");
      out.write("                        <div class=\"caption\" style=\"text-align:center;\">\r\n");
      out.write("                            <h3>\r\n");
      out.write("                                ZhangSan\r\n");
      out.write("                            </h3>\r\n");
      out.write("                            <span class=\"label label-danger\" style=\"cursor:pointer;\" onclick=\"window.location.href='accttype.html'\">未实名认证</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"list-group\">\r\n");
      out.write("                <div class=\"list-group-item active\">\r\n");
      out.write("                    资产总览<span class=\"badge\"><i class=\"glyphicon glyphicon-chevron-right\"></i></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"list-group-item \" style=\"cursor:pointer;\" onclick=\"window.location.href='minecrowdfunding.html'\">\r\n");
      out.write("                    我的众筹<span class=\"badge\"><i class=\"glyphicon glyphicon-chevron-right\"></i></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-9 col-md-9 column\">\r\n");
      out.write("            <blockquote style=\"border-left: 5px solid #f60;color:#f60;padding: 0 0 0 20px;\">\r\n");
      out.write("                <b>\r\n");
      out.write("                    我的钱包\r\n");
      out.write("                </b>\r\n");
      out.write("            </blockquote>\r\n");
      out.write("            <div id=\"main\" style=\"width: 600px;height:400px;\"></div>\r\n");
      out.write("            <blockquote style=\"border-left: 5px solid #f60;color:#f60;padding: 0 0 0 20px;\">\r\n");
      out.write("                <b>\r\n");
      out.write("                    理财\r\n");
      out.write("                </b>\r\n");
      out.write("            </blockquote>\r\n");
      out.write("            <div id=\"main1\" style=\"width: 600px;height:400px;\"></div>\r\n");
      out.write("            <blockquote style=\"border-left: 5px solid #f60;color:#f60;padding: 0 0 0 20px;\">\r\n");
      out.write("                <b>\r\n");
      out.write("                    比例\r\n");
      out.write("                </b>\r\n");
      out.write("            </blockquote>\r\n");
      out.write("            <div id=\"main2\" style=\"width: 600px;height:400px;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\" style=\"margin-top:20px;\">\r\n");
      out.write("    <div class=\"row clearfix\">\r\n");
      out.write("        <div class=\"col-md-12 column\">\r\n");
      out.write("            <div id=\"footer\">\r\n");
      out.write("                <div class=\"footerNav\">\r\n");
      out.write("                    <a rel=\"nofollow\" href=\"http://www.atguigu.com\">关于我们</a> | <a rel=\"nofollow\" href=\"http://www.atguigu.com\">服务条款</a> | <a rel=\"nofollow\" href=\"http://www.atguigu.com\">免责声明</a> | <a rel=\"nofollow\" href=\"http://www.atguigu.com\">网站地图</a> | <a rel=\"nofollow\" href=\"http://www.atguigu.com\">联系我们</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"copyRight\">\r\n");
      out.write("                    Copyright ?2017-2017atguigu.com 版权所有\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/jquery/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/script/docs.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/script/back-to-top.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/script/echarts.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $('#myTab a').click(function (e) {\r\n");
      out.write("        e.preventDefault()\r\n");
      out.write("        $(this).tab('show')\r\n");
      out.write("    })\r\n");
      out.write("    $('#myTab1 a').click(function (e) {\r\n");
      out.write("        e.preventDefault()\r\n");
      out.write("        $(this).tab('show')\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    var myChart = echarts.init(document.getElementById('main'));\r\n");
      out.write("\r\n");
      out.write("    // 指定图表的配置项和数据\r\n");
      out.write("    option = {\r\n");
      out.write("        title: {\r\n");
      out.write("            text: '七日年化收益率(%)'\r\n");
      out.write("        },\r\n");
      out.write("        tooltip: {\r\n");
      out.write("            trigger: 'axis'\r\n");
      out.write("        },\r\n");
      out.write("        legend: {\r\n");
      out.write("            data:['基金','股票']\r\n");
      out.write("        },\r\n");
      out.write("        toolbox: {\r\n");
      out.write("            show: false,\r\n");
      out.write("            feature: {\r\n");
      out.write("                dataZoom: {\r\n");
      out.write("                    yAxisIndex: 'none'\r\n");
      out.write("                },\r\n");
      out.write("                dataView: {readOnly: false},\r\n");
      out.write("                magicType: {type: ['line', 'bar']},\r\n");
      out.write("                restore: {},\r\n");
      out.write("                saveAsImage: {}\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        xAxis:  {\r\n");
      out.write("            type: 'category',\r\n");
      out.write("            boundaryGap: false,\r\n");
      out.write("            data: ['2017-05-16','2017-05-17','2017-05-18','2017-05-19','2017-05-20','2017-05-21','2017-05-22']\r\n");
      out.write("        },\r\n");
      out.write("        yAxis: {\r\n");
      out.write("            type: 'value',\r\n");
      out.write("            axisLabel: {\r\n");
      out.write("                formatter: '{value} '\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        series: [\r\n");
      out.write("            {\r\n");
      out.write("                name:'基金',\r\n");
      out.write("                type:'line',\r\n");
      out.write("                data:[1, 1, 5, 3, 2, 3, 2],\r\n");
      out.write("                markPoint: {\r\n");
      out.write("                    data: [\r\n");
      out.write("                        {type: 'max', name: '最大值'},\r\n");
      out.write("                        {type: 'min', name: '最小值'}\r\n");
      out.write("                    ]\r\n");
      out.write("                },\r\n");
      out.write("                markLine: {\r\n");
      out.write("                    data: [\r\n");
      out.write("                        {type: 'average', name: '平均值'}\r\n");
      out.write("                    ]\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            {\r\n");
      out.write("                name:'股票',\r\n");
      out.write("                type:'line',\r\n");
      out.write("                data:[1, -2, 2, 5, 3, 2, 4],\r\n");
      out.write("                markPoint: {\r\n");
      out.write("                    data: [\r\n");
      out.write("                        {name: '周最低', value: -2, xAxis: 1, yAxis: -1.5}\r\n");
      out.write("                    ]\r\n");
      out.write("                },\r\n");
      out.write("                markLine: {\r\n");
      out.write("                    data: [\r\n");
      out.write("                        {type: 'average', name: '平均值'},\r\n");
      out.write("                        [{\r\n");
      out.write("                            symbol: 'none',\r\n");
      out.write("                            x: '90%',\r\n");
      out.write("                            yAxis: 'max'\r\n");
      out.write("                        }, {\r\n");
      out.write("                            symbol: 'circle',\r\n");
      out.write("                            label: {\r\n");
      out.write("                                normal: {\r\n");
      out.write("                                    position: 'start',\r\n");
      out.write("                                    formatter: '最大值'\r\n");
      out.write("                                }\r\n");
      out.write("                            },\r\n");
      out.write("                            type: 'max',\r\n");
      out.write("                            name: '最高点'\r\n");
      out.write("                        }]\r\n");
      out.write("                    ]\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        ]\r\n");
      out.write("    };\r\n");
      out.write("    myChart.setOption(option);\r\n");
      out.write("    var myChart1 = echarts.init(document.getElementById('main1'));\r\n");
      out.write("\r\n");
      out.write("    // 指定图表的配置项和数据\r\n");
      out.write("    option1 = {\r\n");
      out.write("        color: ['#3398DB'],\r\n");
      out.write("        tooltip : {\r\n");
      out.write("            trigger: 'axis',\r\n");
      out.write("            axisPointer : {            // 坐标轴指示器，坐标轴触发有效\r\n");
      out.write("                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        grid: {\r\n");
      out.write("            left: '3%',\r\n");
      out.write("            right: '4%',\r\n");
      out.write("            bottom: '3%',\r\n");
      out.write("            containLabel: true\r\n");
      out.write("        },\r\n");
      out.write("        xAxis : [\r\n");
      out.write("            {\r\n");
      out.write("                type : 'category',\r\n");
      out.write("                data : ['基金', '票据', '定期理财', '变现贷'],\r\n");
      out.write("                axisTick: {\r\n");
      out.write("                    alignWithLabel: true\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        ],\r\n");
      out.write("        yAxis : [\r\n");
      out.write("            {\r\n");
      out.write("                type : 'value'\r\n");
      out.write("            }\r\n");
      out.write("        ],\r\n");
      out.write("        series : [\r\n");
      out.write("            {\r\n");
      out.write("                name:'直接访问',\r\n");
      out.write("                type:'bar',\r\n");
      out.write("                barWidth: '60%',\r\n");
      out.write("                data:[10, 52, 200, 334, 390, 330, 220]\r\n");
      out.write("            }\r\n");
      out.write("        ]\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    // 使用刚指定的配置项和数据显示图表。\r\n");
      out.write("    myChart1.setOption(option1);\r\n");
      out.write("\r\n");
      out.write("    var myChart2 = echarts.init(document.getElementById('main2'));\r\n");
      out.write("\r\n");
      out.write("    // 指定图表的配置项和数据\r\n");
      out.write("    option2 = {\r\n");
      out.write("        title : {\r\n");
      out.write("            text: '某站点用户访问来源',\r\n");
      out.write("            subtext: '纯属虚构',\r\n");
      out.write("            x:'center'\r\n");
      out.write("        },\r\n");
      out.write("        tooltip : {\r\n");
      out.write("            trigger: 'item',\r\n");
      out.write("            formatter: \"{a} <br/>{b} : {c} ({d}%)\"\r\n");
      out.write("        },\r\n");
      out.write("        legend: {\r\n");
      out.write("            orient: 'vertical',\r\n");
      out.write("            left: 'left',\r\n");
      out.write("            data: ['直接访问','邮件营销','联盟广告','视频广告','搜索引擎']\r\n");
      out.write("        },\r\n");
      out.write("        series : [\r\n");
      out.write("            {\r\n");
      out.write("                name: '访问来源',\r\n");
      out.write("                type: 'pie',\r\n");
      out.write("                radius : '55%',\r\n");
      out.write("                center: ['50%', '60%'],\r\n");
      out.write("                data:[\r\n");
      out.write("                    {value:335, name:'直接访问'},\r\n");
      out.write("                    {value:310, name:'邮件营销'},\r\n");
      out.write("                    {value:234, name:'联盟广告'},\r\n");
      out.write("                    {value:135, name:'视频广告'},\r\n");
      out.write("                    {value:1548, name:'搜索引擎'}\r\n");
      out.write("                ],\r\n");
      out.write("                itemStyle: {\r\n");
      out.write("                    emphasis: {\r\n");
      out.write("                        shadowBlur: 10,\r\n");
      out.write("                        shadowOffsetX: 0,\r\n");
      out.write("                        shadowColor: 'rgba(0, 0, 0, 0.5)'\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        ]\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    // 使用刚指定的配置项和数据显示图表。\r\n");
      out.write("    myChart2.setOption(option2);\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
