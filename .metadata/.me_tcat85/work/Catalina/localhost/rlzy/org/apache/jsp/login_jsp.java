/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2019-12-31 14:03:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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

String path = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t    <style type=\"text/css\">\r\n");
      out.write("\t\tbody {\r\n");
      out.write("\t\t\tmargin-left: 0px;\r\n");
      out.write("\t\t\tmargin-top: 0px;\r\n");
      out.write("\t\t\tmargin-right: 0px;\r\n");
      out.write("\t\t\tmargin-bottom: 0px;\r\n");
      out.write("\t\t\tbackground-color: #1D3647;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.login_top_bg {background-image: url(");
      out.print(path );
      out.write("/img/login-top-bg.gif);background-repeat: repeat-x;}\r\n");
      out.write("\t\t.body {\r\n");
      out.write("\t\t\tbackground-color: #EEF2FB;\r\n");
      out.write("\t\t\tleft: 0px;\r\n");
      out.write("\t\t\ttop: 0px;\r\n");
      out.write("\t\t\tright: 0px;\r\n");
      out.write("\t\t\tbottom: 0px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.login-buttom-bg {\r\n");
      out.write("\t\t\tbackground-image: url(");
      out.print(path );
      out.write("/img/login-buttom-bg.gif);\r\n");
      out.write("\t\t\tbackground-repeat: repeat-x;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.login-buttom-txt {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 10px;\r\n");
      out.write("\t\t\tcolor: #ABCAD3;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\tline-height: 20px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.login_txt {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tcolor: white;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.Submit {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tcolor: #629DAE;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\tbackground-image: url(");
      out.print(path );
      out.write("/img/Submit_bg.gif);\r\n");
      out.write("\t\t\tbackground-repeat: repeat-x;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.login_bg {\r\n");
      out.write("\t\t\tbackground-image: url(");
      out.print(path );
      out.write("/img/login_bg.jpg);\r\n");
      out.write("\t\t\tbackground-repeat: repeat-x;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.login_bg2 {\r\n");
      out.write("\t\t\tbackground-image: url(");
      out.print(path );
      out.write("/img/login-content-bg.gif);\r\n");
      out.write("\t\t\tbackground-repeat: no-repeat;\r\n");
      out.write("\t\t\tbackground-position: right;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.admin_txt {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tcolor: #FFFFFF;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\theight: 38px;\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\tposition: 固定;\r\n");
      out.write("\t\t\tline-height: 38px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.login_txt_bt {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 25px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tcolor: #666666;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.admin_topbg {\r\n");
      out.write("\t\t\tbackground-image: url(");
      out.print(path );
      out.write("/img/top-right.gif);\r\n");
      out.write("\t\t\tbackground-repeat: repeat-x;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.txt_bt {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\tcolor: #000000;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.left_topbg {\r\n");
      out.write("\t\t\tbackground-image: url(");
      out.print(path );
      out.write("/img/content-bg.gif);\r\n");
      out.write("\t\t\tbackground-repeat: repeat-x;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.admin_toptxt {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tcolor: #4A8091;\r\n");
      out.write("\t\t\theight: 18px;\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\toverflow: hidden;\r\n");
      out.write("\t\t\tposition: 固定;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.left_bt {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 14px;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\tcolor: #395a7b;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.left_bt2 {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\tcolor: #333333;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.titlebt {\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 26px;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\tcolor: #000000;\r\n");
      out.write("\t\t\tbackground-image: url(");
      out.print(path );
      out.write("/img/top_bt.jpg);\r\n");
      out.write("\t\t\tbackground-repeat: no-repeat;\r\n");
      out.write("\t\t\tdisplay: block;\r\n");
      out.write("\t\t\ttext-indent: 15px;\r\n");
      out.write("\t\t\tpadding-top: 5px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.left_txt {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tcolor: #666666;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.left_txt2 {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tcolor: #000000;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.nowtable {\r\n");
      out.write("\t\t\tbackground-color: #e1e5ee;\r\n");
      out.write("\t\t\tborder-top-width: 1px;\r\n");
      out.write("\t\t\tborder-right-width: 1px;\r\n");
      out.write("\t\t\tborder-bottom-width: 1px;\r\n");
      out.write("\t\t\tborder-left-width: 1px;\r\n");
      out.write("\t\t\tborder-top-style: solid;\r\n");
      out.write("\t\t\tborder-top-color: #bfc4ca;\r\n");
      out.write("\t\t\tborder-right-color: #bfc4ca;\r\n");
      out.write("\t\t\tborder-bottom-color: #bfc4ca;\r\n");
      out.write("\t\t\tborder-left-color: #bfc4ca;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.left_txt3 {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tcolor: #003366;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t.left_ts {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\tcolor: #FF6600;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.line_table {\r\n");
      out.write("\t\t\tborder: 1px solid #CCCCCC;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.sec1 {\r\n");
      out.write("\t\t\tCURSOR: hand;\r\n");
      out.write("\t\t\tCOLOR: #000000;\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tborder: 1px solid #B5D0D9;\r\n");
      out.write("\t\t\tbackground-image: url(");
      out.print(path );
      out.write("/img/right_smbg.jpg);\r\n");
      out.write("\t\t\tbackground-repeat: repeat-x;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.sec2 {\r\n");
      out.write("\t\t\tFONT-WEIGHT: bold;\r\n");
      out.write("\t\t\tCURSOR: hand;\r\n");
      out.write("\t\t\tCOLOR: #000000;\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tbackground-color: #e2e7ed;\r\n");
      out.write("\t\t\tborder: 1px solid #e2e7ed;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.main_tab {\r\n");
      out.write("\t\t\tCOLOR: #000000;\r\n");
      out.write("\t\t\tBACKGROUND-COLOR: #e2e7ed;\r\n");
      out.write("\t\t\tborder: 1px solid #e2e7ed;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.MM a {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 26px;\r\n");
      out.write("\t\t\tcolor: #666666;\r\n");
      out.write("\t\t\tbackground-image: url(");
      out.print(path );
      out.write("/img/menu_bg.gif);\r\n");
      out.write("\t\t\tbackground-repeat: no-repeat;\r\n");
      out.write("\t\t\tlist-style-type: none;\r\n");
      out.write("\t\t\tlist-style-image: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\ta:link {\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tcolor: #333333;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\ta:hover {\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tcolor: #666666;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\ta:visited {\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\tcolor: #333333;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t.MM a:link {\r\n");
      out.write("\t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\tline-height: 26px;\r\n");
      out.write("\t\t\tcolor: #666666;\r\n");
      out.write("\t\t\tbackground-image: url(");
      out.print(path );
      out.write("/img/menu_bg.gif);\r\n");
      out.write("\t\t\tbackground-repeat: no-repeat;\r\n");
      out.write("\t\t\tlist-style-type: none;\r\n");
      out.write("\t\t\tlist-style-image: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<script type='text/javascript' src='");
      out.print(path );
      out.write("/dwr/interface/loginService.js'></script>\r\n");
      out.write("        <script type='text/javascript' src='");
      out.print(path );
      out.write("/dwr/engine.js'></script>\r\n");
      out.write("        <script type='text/javascript' src='");
      out.print(path );
      out.write("/dwr/util.js'></script>\r\n");
      out.write("        \r\n");
      out.write("\t\t<script language=\"javascript\">\r\n");
      out.write("\t\tfunction check1()\r\n");
      out.write("\t\t{                                                                                         \r\n");
      out.write("\t\t     if(document.ThisForm.userName.value==\"\")\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t \talert(\"请输入用户名\");\r\n");
      out.write("\t\t\t\tdocument.ThisForm.userName.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t if(document.ThisForm.userPw.value==\"\")\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t \talert(\"请输入密码\");\r\n");
      out.write("\t\t\t\tdocument.ThisForm.userPw.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t if(document.ThisForm.userType.value==\"-1\")\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t \talert(\"请选择登陆身份\");\r\n");
      out.write("\t\t\t\tdocument.ThisForm.userType.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t document.getElementById(\"indicator\").style.display=\"block\";\r\n");
      out.write("\t\t\t loginService.login(document.ThisForm.userName.value,document.ThisForm.userPw.value,document.ThisForm.userType.value,callback);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction callback(data)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t    document.getElementById(\"indicator\").style.display=\"none\";\r\n");
      out.write("\t\t    if(data==\"no\")\r\n");
      out.write("\t\t    {\r\n");
      out.write("\t\t        alert(\"用户名或密码错误\");\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    if(data==\"yes\")\r\n");
      out.write("\t\t    {\r\n");
      out.write("\t\t        alert(\"通过验证,系统登录成功\");\r\n");
      out.write("\t\t        window.location.href=\"");
      out.print(path );
      out.write("/loginSuccess.jsp\";\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t}\r\n");
      out.write("\t    </script>\r\n");
      out.write("<script>\"undefined\"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:\"4038\",secure:\"4047\"},c={nonSecure:\"http://\",secure:\"https://\"},r={nonSecure:\"127.0.0.1\",secure:\"gapdebug.local.genuitec.com\"},n=\"https:\"===window.location.protocol?\"secure\":\"nonSecure\";script=e.createElement(\"script\"),script.type=\"text/javascript\",script.async=!0,script.src=c[n]+r[n]+\":\"+t[n]+\"/codelive-assets/bundle.js\",e.getElementsByTagName(\"head\")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>\r\n");
      out.write("<body data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-131\" data-genuitec-path=\"/rlzy/WebRoot/login.jsp\">\r\n");
      out.write("<table width=\"100%\" height=\"166\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-131\" data-genuitec-path=\"/rlzy/WebRoot/login.jsp\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"42\" valign=\"top\">\r\n");
      out.write("       <table width=\"100%\" height=\"42\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"login_top_bg\">\r\n");
      out.write("\t      <tr>\r\n");
      out.write("\t        <td width=\"1%\" height=\"21\">&nbsp;</td>\r\n");
      out.write("\t        <td height=\"42\">&nbsp;</td>\r\n");
      out.write("\t        <td width=\"17%\">&nbsp;</td>\r\n");
      out.write("\t      </tr>\r\n");
      out.write("       </table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td valign=\"top\">\r\n");
      out.write("     <table width=\"100%\" height=\"532\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"login_bg\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"49%\" align=\"right\"><table width=\"91%\" height=\"532\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"login_bg2\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"138\" valign=\"top\"><table width=\"89%\" height=\"427\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"149\">&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"80\" align=\"right\" valign=\"top\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"198\" align=\"right\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"35%\">&nbsp;</td>\r\n");
      out.write("                      <td height=\"25\" colspan=\"2\" class=\"left_txt\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td>&nbsp;</td>\r\n");
      out.write("                      <td height=\"25\" colspan=\"2\" class=\"left_txt\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td>&nbsp;</td>\r\n");
      out.write("                      <td height=\"25\" colspan=\"2\" class=\"left_txt\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td>&nbsp;</td>\r\n");
      out.write("                      <td width=\"30%\" height=\"40\"></td>\r\n");
      out.write("                      <td width=\"35%\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  </table></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"1%\" >&nbsp;</td>\r\n");
      out.write("        <td width=\"50%\" valign=\"bottom\"><table width=\"100%\" height=\"59\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"4%\">&nbsp;</td>\r\n");
      out.write("              <td width=\"96%\" height=\"38\"><span class=\"login_txt_bt\">企业员工信息管理系统</span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>&nbsp;</td>\r\n");
      out.write("              <td height=\"21\"><table cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\" id=\"table211\" height=\"328\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td height=\"164\" colspan=\"2\" align=\"middle\">\r\n");
      out.write("                        <FORM name=\"ThisForm\" action=\"");
      out.print(path );
      out.write("/adminLogin.action\" method=post>\r\n");
      out.write("                        <table cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\" height=\"143\" id=\"table212\">\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td width=\"13%\" height=\"38\" class=\"top_hui_text\"><span class=\"login_txt\">用户名：&nbsp;&nbsp; </span></td>\r\n");
      out.write("                            <td height=\"38\" colspan=\"2\" class=\"top_hui_text\"><input name=\"userName\" class=\"editbox4\" value=\"\" size=\"20\">                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td width=\"13%\" height=\"35\" class=\"top_hui_text\"><span class=\"login_txt\"> 密 码： &nbsp;&nbsp; </span></td>\r\n");
      out.write("                            <td height=\"35\" colspan=\"2\" class=\"top_hui_text\"><input class=\"editbox4\" type=\"password\" size=\"20\" name=\"userPw\">\r\n");
      out.write("                              <img src=\"");
      out.print(path );
      out.write("/img/luck.gif\" width=\"19\" height=\"18\"> </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td width=\"13%\" height=\"35\" ><span class=\"login_txt\">登录身份：</span></td>\r\n");
      out.write("                            <td height=\"35\" colspan=\"2\" class=\"top_hui_text\">\r\n");
      out.write("                                 <select class=\"INPUT_text\" name=\"userType\">\r\n");
      out.write("                                     <option value=\"-1\">请选择</option>\r\n");
      out.write("\t                                 <option value=\"0\">管理员</option>\r\n");
      out.write("\t                                 <option value=\"1\">员&nbsp;&nbsp;&nbsp;工</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t </select>\r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td height=\"35\" >&nbsp;</td>\r\n");
      out.write("                            <td width=\"80%\" height=\"35\" >\r\n");
      out.write("                                <input name=\"button\" type=\"button\" id=\"Submit\" value=\"登 陆\" onClick=\"check1()\"> \r\n");
      out.write("                                <input name=\"cs\" type=\"reset\" class=\"button\" id=\"cs\" value=\"重 置\">\r\n");
      out.write("                                <img id=\"indicator\" src=\"");
      out.print(path );
      out.write("/img/loading.gif\" style=\"display:none\"/>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td width=\"20%\"></td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                        <br>\r\n");
      out.write("                    </form></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td width=\"433\" height=\"164\" align=\"right\" valign=\"bottom\"></td>\r\n");
      out.write("                    <td width=\"57\" align=\"right\" valign=\"bottom\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("              </table></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("          </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
