package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"row my-row text-center login-img-body\" ng-controller=\"tollsAdminLoginCtrl\">\n");
      out.write("<div class=\"col-sm-4\" ></div>\n");
      out.write("    <div class=\"col-sm-4\" >\n");
      out.write("\n");
      out.write("        <form class=\"login-form form-group\" ng-submit=\"submitLoginFrom()\" > \n");
      out.write("            <div class=\"login-wrap\">\n");
      out.write("                <p class=\"login-img\"><i class=\"fa fa-lock fa-lg\" style=\"font-size:72px; color: #262626\"></i></p>\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <span class=\"input-group-addon\"><i class=\"fa fa-user-circle\" style=\"font-size:28px; color: #262626\"></i></span>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" required ng-model=\"tollsLoginForm.loginId\" placeholder=\"User Name\" autofocus>\n");
      out.write("                </div><br/>\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <span class=\"input-group-addon\"><i class=\"fa fa-key\" style=\"font-size:28px; color: #262626\"></i></span>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" required ng-model=\"tollsLoginForm.loginPassword\" placeholder=\"Password\">\n");
      out.write("                </div>\n");
      out.write("                <label class=\"checkbox\">\n");
      out.write("                    <input type=\"checkbox\" value=\"remember-me\"> Remember me\n");
      out.write("                </label>\n");
      out.write("                <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">Login</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("\n");
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
