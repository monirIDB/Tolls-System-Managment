package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class counterCash_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<h1>Tolls Rate</h1>\n");
      out.write("<div class=\"row well my-row\" ng-controller=\"vehcileCash\">\n");
      out.write("        <h1>{{tollsRates.length}}</h1>\n");
      out.write("    <div class=\"col-sm-7\" >\n");
      out.write("        <table class=\"table table-striped table-bordered\">\n");
      out.write("            <tr >\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th >Transport Name</th>\n");
      out.write("                <th class=\"text-center\">Rate</th>\n");
      out.write("                <th class=\"text-center\">Actions</th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr ng-repeat=\"tollsRate in tollsRates\">\n");
      out.write("                <td>{{ tollsRate.rateId}}</td>\n");
      out.write("                <td>{{ tollsRate.transportName}}</td>\n");
      out.write("                <td class=\"text-right\">{{ tollsRate.rate | currency }}</td>\n");
      out.write("                <td class=\"text-center\"><a ng-click=\"editTollsRate(tollsRate)\" class=\"button\">Edit</a> | <a ng-click=\"removeTollsRate(tollsRate)\" class=\"button\">Remove</a></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-5\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <form class=\"form-horizontal\" name=\"tollsRateForm\" ng-submit=\"submitRate()\" >\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label col-sm-3\" for=\"vehicleNo\">Transport Name</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input class=\"form-control\" ng-model=\"rateForm.transportName\" id=\"vehicleNo\" name=\"vehicleNo\" placeholder=\"Vehicle No.\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label col-sm-3\" for=\"rate\" >Rate</label>\n");
      out.write("                    <div class=\"col-sm-9\">          \n");
      out.write("                        <input class=\"form-control\" ng-model=\"rateForm.rate\" id=\"rate\" name=\"rate\" placeholder=\"Rate\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">        \n");
      out.write("                    <div class=\"col-sm-offset-2 col-sm-3\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
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
