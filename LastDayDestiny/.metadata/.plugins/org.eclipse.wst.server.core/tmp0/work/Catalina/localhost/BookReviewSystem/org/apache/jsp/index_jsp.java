/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-09-22 09:54:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\" />\r\n");
      out.write("\r\n");
      out.write("<title>Book Review System</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/960_24_col.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/fonts.css\"\r\n");
      out.write("\tcharset=\"utf-8\" />\r\n");
      out.write("<link href=\"css/validationEngine.jquery.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/forms.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar relTag = \"home\";\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- HEADER START -->\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"dark-nav\">\r\n");
      out.write("\t\t\t<div class=\"container_24\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav-alt\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"><b></b></a>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"grid_12\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container_24\">\r\n");
      out.write("\t\t\t<div class=\"grid_4\">\r\n");
      out.write("\t\t\t\t<img alt=\"logo\" src=\"images/bookreview.png\" class=\"img-logo\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"grid_20\">\r\n");
      out.write("\t\t\t\t<h1 class=\"title\">Book Review System</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"nav-main-container\">\r\n");
      out.write("\t\t\t<div class=\"container_24\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_24\">\r\n");
      out.write("\t\t\t\t\t<ul id=\"topmenunav\" class=\"nav-main\">\r\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"home\" href=\"\"index.jsp\"\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"registration\" href=\"registration.jsp\">Registration</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"help\" href=\"#\">Help</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- HEADER END -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- CONTENTS START -->\r\n");
      out.write("\t<div class=\"container_24\">\r\n");
      out.write("\t\t<div class=\"grid_24\">\r\n");
      out.write("\t\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_6 alpha\">\r\n");
      out.write("\t\t\t\t\t<div class=\"padding_20\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"accordion nav-sidebar\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Login</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"adminlogin.jsp\">Admin</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"userlogin.jsp\">User</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Registration</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"registration.jsp\">Registration</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"grid_16 omega\">\r\n");
      out.write("\t\t\t\t\t<div class=\"padding_20 text-justify\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Welcome</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>The Book Review System invites members of the public to\r\n");
      out.write("\t\t\t\t\t\t\treview books of interest to our readers. The books available for\r\n");
      out.write("\t\t\t\t\t\t\treview, the books already out for review, and the returned\r\n");
      out.write("\t\t\t\t\t\t\treviews may be seen by choosing the appropriate menu selection on\r\n");
      out.write("\t\t\t\t\t\t\tthe left.</p>\r\n");
      out.write("\t\t\t\t\t\t<p>A good review placed in the hands of the reading public by\r\n");
      out.write("\t\t\t\t\t\t\ta competent reviewer is the most effective and least expensive\r\n");
      out.write("\t\t\t\t\t\t\tpublicity/promotion instrument available to the independent\r\n");
      out.write("\t\t\t\t\t\t\tpublisher. But the chances of getting your book reviewed can be\r\n");
      out.write("\t\t\t\t\t\t\tdrastically reduced if you do not understand what you are up\r\n");
      out.write("\t\t\t\t\t\t\tagainst and do not take steps to improve your odds..</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"padding_20 text-justify\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- CONTENTS END -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- FOOTER START -->\r\n");
      out.write("\t<div class=\"dark-nav footer\">\r\n");
      out.write("\t\t<div class=\"container_24\">\r\n");
      out.write("\t\t\t<div class=\"grid_8\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav-alt\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"\"index.jsp\"\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Help</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"grid_8\">\r\n");
      out.write("\t\t\t\t<div class=\"text-center\">Copyright &copy; All Rights Reserved</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"grid_8\">\r\n");
      out.write("\t\t\t\t<div class=\"text-right\">Designed &amp; Developed by Dipak</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- FOOTER START -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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