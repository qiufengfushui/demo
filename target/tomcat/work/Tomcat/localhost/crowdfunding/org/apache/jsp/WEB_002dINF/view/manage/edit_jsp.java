/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-04 01:40:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/view/manage/common/left.jsp", Long.valueOf(1543558058164L));
    _jspx_dependants.put("/WEB-INF/view/manage/common/head.jsp", Long.valueOf(1543886460798L));
  }

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

      out.write('\r');
      out.write('\n');
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
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/main.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/css/doc.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .tree li {\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            cursor:pointer;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <div><a class=\"navbar-brand\" style=\"font-size:32px;\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/main\">众筹平台 - 控制面板</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li style=\"padding-top:8px;\">\r\n");
      out.write("                    <div class=\"btn-group\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default btn-success dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                            <i class=\"glyphicon glyphicon-user\"></i> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userSession.userCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <span class=\"caret\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"glyphicon glyphicon-cog\"></i> 个人设置</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"glyphicon glyphicon-comment\"></i> 消息</a></li>\r\n");
      out.write("                            <li class=\"divider\"></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index\"><i class=\"glyphicon glyphicon-off\"></i> 退出系统</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li style=\"margin-left:10px;padding-top:8px;\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default btn-danger\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-question-sign\"></span> 帮助\r\n");
      out.write("                    </button>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <form class=\"navbar-form navbar-right\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"查询\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    .tree li {\r\n");
      out.write("        list-style-type: none;\r\n");
      out.write("        cursor:pointer;\r\n");
      out.write("    }\r\n");
      out.write("    .tree-closed {\r\n");
      out.write("        height : 40px;\r\n");
      out.write("    }\r\n");
      out.write("    .tree-expanded {\r\n");
      out.write("        height : auto;\r\n");
      out.write("    }\r\n");
      out.write("    .tree li {\r\n");
      out.write("        list-style-type: none;\r\n");
      out.write("        cursor:pointer;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"col-sm-3 col-md-2 sidebar\">\r\n");
      out.write("    <div class=\"tree\">\r\n");
      out.write("        <ul style=\"padding-left:0px;\" class=\"list-group\">\r\n");
      out.write("            <li class=\"list-group-item tree-closed\" >\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/main\"><i class=\"glyphicon glyphicon-dashboard\"></i> 控制面板</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-group-item\">\r\n");
      out.write("                <span><i class=\"glyphicon glyphicon glyphicon-tasks\"></i> 权限管理 <span class=\"badge\" style=\"float:right\">3</span></span>\r\n");
      out.write("                <ul style=\"margin-top:10px;\">\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user\"><i class=\"glyphicon glyphicon-user\"></i> 用户维护</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/role\"><i class=\"glyphicon glyphicon-king\"></i> 角色维护</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/permission\" style=\"color:red;\"><i class=\"glyphicon glyphicon-lock\"></i> 许可维护</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-group-item tree-closed\">\r\n");
      out.write("                <span><i class=\"glyphicon glyphicon-ok\"></i> 业务审核 <span class=\"badge\" style=\"float:right\">3</span></span>\r\n");
      out.write("                <ul style=\"margin-top:10px;display:none;\">\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/auth_cert\"><i class=\"glyphicon glyphicon-check\"></i> 实名认证审核</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/auth_adv\"><i class=\"glyphicon glyphicon-check\"></i> 广告审核</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/auth_project\"><i class=\"glyphicon glyphicon-check\"></i> 项目审核</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-group-item tree-closed\">\r\n");
      out.write("                <span><i class=\"glyphicon glyphicon-th-large\"></i> 业务管理 <span class=\"badge\" style=\"float:right\">7</span></span>\r\n");
      out.write("                <ul style=\"margin-top:10px;display:none;\">\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/cert\"><i class=\"glyphicon glyphicon-picture\"></i> 资质维护</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/type\"><i class=\"glyphicon glyphicon-equalizer\"></i> 分类管理</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/process\"><i class=\"glyphicon glyphicon-random\"></i> 流程管理</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/advertisement\"><i class=\"glyphicon glyphicon-hdd\"></i> 广告管理</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/message\"><i class=\"glyphicon glyphicon-comment\"></i> 消息模板</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/project_type\"><i class=\"glyphicon glyphicon-list\"></i> 项目分类</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li style=\"height:30px;\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/tag\"><i class=\"glyphicon glyphicon-tags\"></i> 项目标签</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"list-group-item tree-closed\" >\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/param\"><i class=\"glyphicon glyphicon-list-alt\"></i> 参数管理</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/jquery/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $(\".list-group-item\").click(function(){\r\n");
      out.write("            // jquery对象的回调方法中的this关键字为DOM对象\r\n");
      out.write("            // $(DOM) ==> JQuery\r\n");
      out.write("            if ( $(this).find(\"ul\") ) { // 3 li\r\n");
      out.write("                $(this).toggleClass(\"tree-closed\");\r\n");
      out.write("                if ($(this).hasClass(\"tree-closed\") ) {\r\n");
      out.write("                    $(\"ul\", this).hide(\"fast\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    $(\"ul\", this).show(\"fast\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\r\n");
      out.write("            <ol class=\"breadcrumb\">\r\n");
      out.write("                <li><a href=\"#\">首页</a></li>\r\n");
      out.write("                <li><a href=\"#\">数据列表</a></li>\r\n");
      out.write("                <li class=\"active\">修改</li>\r\n");
      out.write("            </ol>\r\n");
      out.write("            <div class=\"panel panel-default\">\r\n");
      out.write("                <div class=\"panel-heading\">表单数据<div style=\"float:right;cursor:pointer;\" data-toggle=\"modal\" data-target=\"#myModal\"><i class=\"glyphicon glyphicon-question-sign\"></i></div></div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <form role=\"form\" id=\"userInfo\">\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"userCode\">登陆账号</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"userCode\" value=\"\" readonly>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"userName\">用户名称</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"userName\" value=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"email\">邮箱地址</label>\r\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"email\" value=\"\">\r\n");
      out.write("                                <p class=\"help-block label label-warning\">请输入合法的邮箱地址, 格式为： xxxx@xxxx.com</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-success\" onclick=\"modifyUser()\"><i class=\"glyphicon glyphicon-edit\"></i> 修改</button>\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-danger\" onclick=\"reset()\"><i class=\"glyphicon glyphicon-refresh\"></i> 重置</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">帮助</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"bs-callout bs-callout-info\">\r\n");
      out.write("                    <h4>测试标题1</h4>\r\n");
      out.write("                    <p>测试内容1，测试内容1，测试内容1，测试内容1，测试内容1，测试内容1</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"bs-callout bs-callout-info\">\r\n");
      out.write("                    <h4>测试标题2</h4>\r\n");
      out.write("                    <p>测试内容2，测试内容2，测试内容2，测试内容2，测试内容2，测试内容2</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            -->\r\n");
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
      out.write("/statics/layer/layer.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    function modifyUser(){\r\n");
      out.write("        //修改函数\r\n");
      out.write("        var userCode = $(\"#userCode\").val()\r\n");
      out.write("        var userName = $(\"#userName\").val()\r\n");
      out.write("        var email = $(\"#email\").val()\r\n");
      out.write("        var reg = new RegExp(\"^[a-z0-9]+([._\\\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$\"); //邮箱格式\r\n");
      out.write("        if(userCode == \"\"){\r\n");
      out.write("            layer.msg(\"登录账户不能为空，请输入！\",{time:1500,icon:5,shift:6},function () {\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if(userName == \"\"){\r\n");
      out.write("            layer.msg(\"用户名称不能为空，请输入！\",{time:1500,icon:5,shift:6},function () {\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if(email == \"\"){\r\n");
      out.write("            layer.msg(\"邮箱不能为空，请输入！\",{time:1500,icon:5,shift:6},function () {\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("            return;\r\n");
      out.write("        }else if(!reg.test(email)){\r\n");
      out.write("            layer.msg(\"邮箱格式不正确，请重新输入！\",{time:1500,icon:5,shift:6},function () {\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var data = {\r\n");
      out.write("            id : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("            userCode : $(\"#userCode\").val(),\r\n");
      out.write("            userName : $(\"#userName\").val(),\r\n");
      out.write("            email : $(\"#email\").val()\r\n");
      out.write("        }\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type : \"post\",\r\n");
      out.write("            url  : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/modifyUser\",\r\n");
      out.write("            data : data,\r\n");
      out.write("            dataType : \"json\",\r\n");
      out.write("            beforeSend : function () {\r\n");
      out.write("                layerIndex = layer.msg(\"处理中\",{icon:16});\r\n");
      out.write("            },\r\n");
      out.write("            success : function (result) {\r\n");
      out.write("                layer.close(layerIndex)\r\n");
      out.write("                if(result.success){\r\n");
      out.write("                    layer.msg(\"修改成功！\",{time:1000,icon:6,shift:5},function () {\r\n");
      out.write("                    })\r\n");
      out.write("                }else{\r\n");
      out.write("                    layer.msg(\"修改失败，请联系管理员！\",{time:1000,icon:5,shift:6},function () {\r\n");
      out.write("                    })\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("    function reset(){\r\n");
      out.write("        //重置函数\r\n");
      out.write("        $(\"#userCode\").val(\"\")\r\n");
      out.write("        $(\"#userName\").val(\"\")\r\n");
      out.write("        $(\"#email\").val(\"\")\r\n");
      out.write("    }\r\n");
      out.write("    function queryUserInfo(){\r\n");
      out.write("        //查询用户信息并展示\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type : \"post\",\r\n");
      out.write("            url  : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/userInfo\",\r\n");
      out.write("            data : {\r\n");
      out.write("                id : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("'\r\n");
      out.write("            },\r\n");
      out.write("            dataType : \"json\",\r\n");
      out.write("            beforeSend : function () {\r\n");
      out.write("                layerIndex = layer.msg(\"处理中\",{icon:16});\r\n");
      out.write("            },\r\n");
      out.write("            success : function (result) {\r\n");
      out.write("                layer.close(layerIndex)\r\n");
      out.write("                var object = result.object\r\n");
      out.write("                $(\"#userCode\").val(object.userCode)\r\n");
      out.write("                $(\"#userName\").val(object.userName)\r\n");
      out.write("                $(\"#email\").val(object.email)\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("    queryUserInfo()\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
