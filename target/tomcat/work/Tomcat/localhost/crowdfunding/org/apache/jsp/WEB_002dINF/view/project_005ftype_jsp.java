/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-11-30 05:53:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class project_005ftype_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/view/common/left.jsp", Long.valueOf(1543557136871L));
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
      out.write("    <style>\r\n");
      out.write("        .tree li {\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            cursor:pointer;\r\n");
      out.write("        }\r\n");
      out.write("        table tbody tr:nth-child(odd){background:#F4F4F4;}\r\n");
      out.write("        table tbody td:nth-child(even){color:#C00;}\r\n");
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
      out.write("\r\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\r\n");
      out.write("            <div class=\"panel panel-default\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <h3 class=\"panel-title\"><i class=\"glyphicon glyphicon-th\"></i> 数据列表</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <form class=\"form-inline\" role=\"form\" style=\"float:left;\">\r\n");
      out.write("                        <div class=\"form-group has-feedback\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <div class=\"input-group-addon\">查询条件</div>\r\n");
      out.write("                                <input class=\"form-control has-success\" type=\"text\" placeholder=\"请输入查询条件\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-warning\"><i class=\"glyphicon glyphicon-search\"></i> 查询</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-danger\" style=\"float:right;margin-left:10px;\"><i class=\" glyphicon glyphicon-remove\"></i> 删除</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" style=\"float:right;\" onclick=\"window.location.href='form.html'\"><i class=\"glyphicon glyphicon-plus\"></i> 新增</button>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <hr style=\"clear:both;\">\r\n");
      out.write("                    <div class=\"table-responsive\">\r\n");
      out.write("                        <table class=\"table  table-bordered\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                            <tr >\r\n");
      out.write("                                <th width=\"30\">#</th>\r\n");
      out.write("                                <th width=\"30\"><input type=\"checkbox\"></th>\r\n");
      out.write("                                <th width=\"300\">分类名称</th>\r\n");
      out.write("                                <th>简介</th>\r\n");
      out.write("                                <th width=\"100\">操作</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>1</td>\r\n");
      out.write("                                <td><input type=\"checkbox\"></td>\r\n");
      out.write("                                <td>科技</td>\r\n");
      out.write("                                <td>xxxxx</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary btn-xs\"><i class=\" glyphicon glyphicon-pencil\"></i></button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-danger btn-xs\"><i class=\" glyphicon glyphicon-remove\"></i></button>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>2</td>\r\n");
      out.write("                                <td><input type=\"checkbox\"></td>\r\n");
      out.write("                                <td>农业</td>\r\n");
      out.write("                                <td>xxxxx</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary btn-xs\"><i class=\" glyphicon glyphicon-pencil\"></i></button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-danger btn-xs\"><i class=\" glyphicon glyphicon-remove\"></i></button>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>3</td>\r\n");
      out.write("                                <td><input type=\"checkbox\"></td>\r\n");
      out.write("                                <td>电子</td>\r\n");
      out.write("                                <td>xxxxx</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary btn-xs\"><i class=\" glyphicon glyphicon-pencil\"></i></button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-danger btn-xs\"><i class=\" glyphicon glyphicon-remove\"></i></button>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/jquery/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_Path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/statics/script/docs.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $(\".list-group-item\").click(function(){\r\n");
      out.write("            if ( $(this).find(\"ul\") ) {\r\n");
      out.write("                $(this).toggleClass(\"tree-closed\");\r\n");
      out.write("                if ( $(this).hasClass(\"tree-closed\") ) {\r\n");
      out.write("                    $(\"ul\", this).hide(\"fast\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    $(\"ul\", this).show(\"fast\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
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
