/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-02 02:19:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class permission_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/view/common/left.jsp", Long.valueOf(1543558058164L));
    _jspx_dependants.put("/WEB-INF/view/common/head.jsp", Long.valueOf(1543482750833L));
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
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/ztree/zTreeStyle.css\">\r\n");
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
      out.write("            <div><a class=\"navbar-brand\" style=\"font-size:32px;\" href=\"#\">众筹平台 - 控制面板</a></div>\r\n");
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
      out.write("\r\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"panel panel-default\">\r\n");
      out.write("                <div class=\"panel-heading\"><i class=\"glyphicon glyphicon-th-list\"></i> 权限菜单列表 <div style=\"float:right;cursor:pointer;\" data-toggle=\"modal\" data-target=\"#myModal\"><i class=\"glyphicon glyphicon-question-sign\"></i></div></div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <ul id=\"treeDemo\" class=\"ztree\"></ul>\r\n");
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
      out.write("                    <h4>没有默认类</h4>\r\n");
      out.write("                    <p>警告框没有默认类，只有基类和修饰类。默认的灰色警告框并没有多少意义。所以您要使用一种有意义的警告类。目前提供了成功、消息、警告或危险。</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"bs-callout bs-callout-info\">\r\n");
      out.write("                    <h4>没有默认类</h4>\r\n");
      out.write("                    <p>警告框没有默认类，只有基类和修饰类。默认的灰色警告框并没有多少意义。所以您要使用一种有意义的警告类。目前提供了成功、消息、警告或危险。</p>\r\n");
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
      out.write("/statics/ztree/jquery.ztree.all-3.5.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("\r\n");
      out.write("        var setting = {\r\n");
      out.write("            view: {\r\n");
      out.write("                selectedMulti: false,\r\n");
      out.write("                addDiyDom: function(treeId, treeNode){\r\n");
      out.write("                    var icoObj = $(\"#\" + treeNode.tId + \"_ico\"); // tId = permissionTree_1, $(\"#permissionTree_1_ico\")\r\n");
      out.write("                    if ( treeNode.icon ) {\r\n");
      out.write("                        icoObj.removeClass(\"button ico_docu ico_open\").addClass(\"fa fa-fw \" + treeNode.icon).css(\"background\",\"\");\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                },\r\n");
      out.write("                addHoverDom: function(treeId, treeNode){\r\n");
      out.write("                    //   <a><span></span></a>\r\n");
      out.write("                    var aObj = $(\"#\" + treeNode.tId + \"_a\"); // tId = permissionTree_1, ==> $(\"#permissionTree_1_a\")\r\n");
      out.write("                    aObj.attr(\"href\", \"javascript:;\");\r\n");
      out.write("                    if (treeNode.editNameFlag || $(\"#btnGroup\"+treeNode.tId).length>0) return;\r\n");
      out.write("                    var s = '<span id=\"btnGroup'+treeNode.tId+'\">';\r\n");
      out.write("                    if ( treeNode.level == 0 ) {\r\n");
      out.write("                        s += '<a class=\"btn btn-info dropdown-toggle btn-xs\" style=\"margin-left:10px;padding-top:0px;\" href=\"#\" >&nbsp;&nbsp;<i class=\"fa fa-fw fa-plus rbg \"></i></a>';\r\n");
      out.write("                    } else if ( treeNode.level == 1 ) {\r\n");
      out.write("                        s += '<a class=\"btn btn-info dropdown-toggle btn-xs\" style=\"margin-left:10px;padding-top:0px;\"  href=\"#\" title=\"修改权限信息\">&nbsp;&nbsp;<i class=\"fa fa-fw fa-edit rbg \"></i></a>';\r\n");
      out.write("                        if (treeNode.children.length == 0) {\r\n");
      out.write("                            s += '<a class=\"btn btn-info dropdown-toggle btn-xs\" style=\"margin-left:10px;padding-top:0px;\" href=\"#\" >&nbsp;&nbsp;<i class=\"fa fa-fw fa-times rbg \"></i></a>';\r\n");
      out.write("                        }\r\n");
      out.write("                        s += '<a class=\"btn btn-info dropdown-toggle btn-xs\" style=\"margin-left:10px;padding-top:0px;\" href=\"#\" >&nbsp;&nbsp;<i class=\"fa fa-fw fa-plus rbg \"></i></a>';\r\n");
      out.write("                    } else if ( treeNode.level == 2 ) {\r\n");
      out.write("                        s += '<a class=\"btn btn-info dropdown-toggle btn-xs\" style=\"margin-left:10px;padding-top:0px;\"  href=\"#\" title=\"修改权限信息\">&nbsp;&nbsp;<i class=\"fa fa-fw fa-edit rbg \"></i></a>';\r\n");
      out.write("                        s += '<a class=\"btn btn-info dropdown-toggle btn-xs\" style=\"margin-left:10px;padding-top:0px;\" href=\"#\">&nbsp;&nbsp;<i class=\"fa fa-fw fa-times rbg \"></i></a>';\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    s += '</span>';\r\n");
      out.write("                    aObj.after(s);\r\n");
      out.write("                },\r\n");
      out.write("                removeHoverDom: function(treeId, treeNode){\r\n");
      out.write("                    $(\"#btnGroup\"+treeNode.tId).remove();\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            async: {\r\n");
      out.write("                enable: true,\r\n");
      out.write("                url:\"tree.txt\",\r\n");
      out.write("                autoParam:[\"id\", \"name=n\", \"level=lv\"]\r\n");
      out.write("            },\r\n");
      out.write("            callback: {\r\n");
      out.write("                onClick : function(event, treeId, json) {\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        //$.fn.zTree.init($(\"#treeDemo\"), setting); //异步访问数据\r\n");
      out.write("\r\n");
      out.write("        var d = [{\"id\":1,\"pid\":0,\"seqno\":0,\"name\":\"系统权限菜单\",\"url\":null,\"icon\":\"fa fa-sitemap\",\"open\":true,\"checked\":false,\"children\":[{\"id\":2,\"pid\":1,\"seqno\":0,\"name\":\"控制面板\",\"url\":\"dashboard.htm\",\"icon\":\"fa fa-desktop\",\"open\":true,\"checked\":false,\"children\":[]},{\"id\":6,\"pid\":1,\"seqno\":1,\"name\":\"消息管理\",\"url\":\"message/index.htm\",\"icon\":\"fa fa-weixin\",\"open\":true,\"checked\":false,\"children\":[]},{\"id\":7,\"pid\":1,\"seqno\":1,\"name\":\"权限管理\",\"url\":\"\",\"icon\":\"fa fa-cogs\",\"open\":true,\"checked\":false,\"children\":[{\"id\":8,\"pid\":7,\"seqno\":1,\"name\":\"用户管理\",\"url\":\"user/index.htm\",\"icon\":\"fa fa-user\",\"open\":true,\"checked\":false,\"children\":[]},{\"id\":9,\"pid\":7,\"seqno\":1,\"name\":\"角色管理\",\"url\":\"role/index.htm\",\"icon\":\"fa fa-graduation-cap\",\"open\":true,\"checked\":false,\"children\":[]},{\"id\":10,\"pid\":7,\"seqno\":1,\"name\":\"许可管理\",\"url\":\"permission/index.htm\",\"icon\":\"fa fa-check-square-o\",\"open\":true,\"checked\":false,\"children\":[]}]},{\"id\":11,\"pid\":1,\"seqno\":1,\"name\":\"资质管理\",\"url\":\"\",\"icon\":\"fa fa-certificate\",\"open\":true,\"checked\":false,\"children\":[{\"id\":12,\"pid\":11,\"seqno\":1,\"name\":\"分类管理\",\"url\":\"cert/type.htm\",\"icon\":\"fa fa-th-list\",\"open\":true,\"checked\":false,\"children\":[]},{\"id\":13,\"pid\":11,\"seqno\":1,\"name\":\"资质管理\",\"url\":\"cert/index.htm\",\"icon\":\"fa fa-certificate\",\"open\":true,\"checked\":false,\"children\":[]}]},{\"id\":15,\"pid\":1,\"seqno\":1,\"name\":\"流程管理\",\"url\":\"process/index.htm\",\"icon\":\"fa fa-random\",\"open\":true,\"checked\":false,\"children\":[]},{\"id\":16,\"pid\":1,\"seqno\":1,\"name\":\"审核管理\",\"url\":\"\",\"icon\":\"fa fa-check-square\",\"open\":true,\"checked\":false,\"children\":[{\"id\":17,\"pid\":16,\"seqno\":1,\"name\":\"实名认证人工审核\",\"url\":\"process/cert.htm\",\"icon\":\"fa fa-check-circle-o\",\"open\":true,\"checked\":false,\"children\":[]}]}]}];\r\n");
      out.write("        $.fn.zTree.init($(\"#treeDemo\"), setting, d);\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
