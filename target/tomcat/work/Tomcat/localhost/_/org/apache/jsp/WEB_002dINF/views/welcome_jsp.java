/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-02 08:17:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/main.css", Long.valueOf(1508173503985L));
    _jspx_dependants.put("/WEB-INF/views/js.js", Long.valueOf(1507819337430L));
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t\t\t<title>Rollbar Example</title>\n");
      out.write("\t\t\t\t <style type=\"text/css\">\n");
      out.write("\t\t\t\t    \t\t\t");
      out.write("div.boxed {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    border: 1px solid rgb(3, 3, 10);\r\n");
      out.write("  background: rgb(47, 64, 95);\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(" div.customBox{\r\n");
      out.write("    width: 50%;\r\n");
      out.write("     padding-top: 50px;\r\n");
      out.write("    padding-right: 30px;\r\n");
      out.write("    padding-bottom: 50px;\r\n");
      out.write("    padding-left: 80px;\r\n");
      out.write("    background: rgb(243, 244, 245);\r\n");
      out.write("    \r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  .popup {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    -webkit-user-select: none;\r\n");
      out.write("    -moz-user-select: none;\r\n");
      out.write("    -ms-user-select: none;\r\n");
      out.write("    user-select: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("/* The actual popup */\r\n");
      out.write(".popup .popuptext {\r\n");
      out.write("    visibility: hidden;\r\n");
      out.write("    width: 160px;\r\n");
      out.write("    background-color: #555;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    border-radius: 6px;\r\n");
      out.write("    padding: 8px 0;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("    bottom: 125%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    margin-left: -80px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Popup arrow */\r\n");
      out.write(".popup .popuptext::after {\r\n");
      out.write("    content: \"\";\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 100%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    margin-left: -5px;\r\n");
      out.write("    border-width: 5px;\r\n");
      out.write("    border-style: solid;\r\n");
      out.write("    border-color: #555 transparent transparent transparent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Toggle this class - hide and show the popup */\r\n");
      out.write(".popup .show {\r\n");
      out.write("    visibility: visible;\r\n");
      out.write("    -webkit-animation: fadeIn 1s;\r\n");
      out.write("    animation: fadeIn 1s;\r\n");
      out.write("}\r\n");
      out.write("\n");
      out.write("\t\t\t\t </style>\n");
      out.write("\t\t\t\t <script type=\"text/javascript\">\n");
      out.write("\t    \t\t\t");
      out.write("function myFunction() {\r\n");
      out.write("                var popup = document.getElementById(\"myPopup\");\r\n");
      out.write("                popup.classList.toggle(\"show\");\r\n");
      out.write("            }");
      out.write("\n");
      out.write("\t\t\t\t </script>\n");
      out.write("\t</head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"boxed\">\n");
      out.write("            <img src=\"rollbarlogo.png\" alt=\"Smiley face\" height=\"42\" width=\"42\">\n");
      out.write("        </div>\n");
      out.write("        <center>\n");
      out.write("\t\t        <div class=\"customBox\">\n");
      out.write("\t\t                <center><h1>Rollbar Java Notifier Example</h1></center><br>\n");
      out.write("\t\t\t\t\t\t<form action=\"/spring-mvc/createException\" method=\"POST\">\n");
      out.write("\t\t\t\t\t\t\t\t<center>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input style=\"height:50px;width:200px\" type=\"submit\"  value=\"Throw an error\" />\n");
      out.write("\t\t\t\t\t\t\t\t</center>\n");
      out.write("\t\t\t\t\t\t</form>          \n");
      out.write("\t\t        </div>\n");
      out.write("        </center>      \n");
      out.write("\t</body>\n");
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
