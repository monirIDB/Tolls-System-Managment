package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carosol_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\n");
      out.write("        <div class=\"item active\">\n");
      out.write("            <img src=\"resources/img/tolls1.png\" alt=\"Toll\" width=\"460\" height=\"345\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("                <h3>Bangladesh</h3>\n");
      out.write("                <p>Beautiful BD tolls system</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"item\">\n");
      out.write("            <img src=\"resources/img/tolls2.png\" alt=\"Toll\" width=\"460\" height=\"345\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("                <h3>Contract</h3>\n");
      out.write("                <p>+88-01815-319013</p>\n");
      out.write("                <p>+88-01815-319013</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"item\">\n");
      out.write("            <img src=\"resources/img/tolls3.png\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("                <h3>Help</h3>\n");
      out.write("                <p>Any complex Software developed</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"item\">\n");
      out.write("            <img src=\"resources/img/tolls4.png\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("                <h3>Dhaka</h3>\n");
      out.write("                <p>Bangladesh</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("        <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("        <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
