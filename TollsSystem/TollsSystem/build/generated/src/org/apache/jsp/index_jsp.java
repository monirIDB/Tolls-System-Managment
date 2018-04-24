package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/hedertop.jsp");
    _jspx_dependants.add("/dropdownmenu.jsp");
    _jspx_dependants.add("/carosol.jsp");
    _jspx_dependants.add("/routing.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html ng-app=\"tollsApp\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tolls Management System</title>\n");
      out.write("        \n");
      out.write("        <link href=\"resources/bootstrap/css/animate.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <link href=\"resources/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <link href=\"resources/bootstrap/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <link href=\"resources/bootstrap/css/bootstrap-dropdownhover.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <!--<link href=\"resources/css/elegant-icons-style.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        \n");
      out.write("        <link href=\"resources/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <link href=\"resources/bootstrap/css/ihover.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <link href=\"resources/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"container-fluid header-top\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6 my-logo\">\n");
      out.write("                    <img class=\"img img-circle\" src=\"resources/img/logo.png\" alt=\"Logo\"/>\n");
      out.write("                    <h3>BD Toll System</h3>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-6 my-link\">\n");
      out.write("                    <a href=\"#\" target=\"blank\">\n");
      out.write("                        <i class=\"fa fa-facebook-square\" style=\"font-size:48px; color: #0a72a5\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#\" target=\"blank\">\n");
      out.write("                        <i class=\"fa fa-twitter-square\" style=\"font-size:48px; color: #0a72a5\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#\" target=\"blank\">\n");
      out.write("                        <i class=\"fa fa-google-plus-square\" style=\"font-size:48px; color: #0a72a5\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>");
      out.write('\n');
      out.write("<nav class=\"navbar navbar-inverse my-dropdown\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\">BD Toll System</a>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li ><a id=\"home\" href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li><a id=\"vehicleRegistration\" href=\"#vehicleReg.jsp\">Registration</a></li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a class=\"dropdown-toggle\" id=\"login\" data-toggle=\"dropdown\" data-hover=\"dropdown\" href=\"#login.jsp\">Employee\n");
      out.write("                    <span class=\"caret\"></span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                    <li><a id=\"tollsCounter\" href=\"#tollsCounter.jsp\">Counter 1</a></li>\n");
      out.write("                    <li><a href=\"#\">Counter 2</a></li>\n");
      out.write("                    <li><a href=\"#\">Counter 1</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-hover=\"dropdown\" href=\"#\"> Admin\n");
      out.write("                    <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                    <li><a id=\"tollsRate\" href=\"#tollsRate.jsp\">Tolls Rate</a></li>\n");
      out.write("                    <li><a href=\"#\">Counter 2</a></li>\n");
      out.write("                    <li><a href=\"#\">Counter 1</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("            <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write('\n');
      out.write('\n');
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
      out.write("            <img src=\"resources/img/toll1.jpg\" alt=\"Toll\" width=\"460\" height=\"345\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("                <h3>Chania</h3>\n");
      out.write("                <p>The atmosphere in Chania has a touch of Florence and Venice.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"item\">\n");
      out.write("            <img src=\"resources/img/toll2.jpg\" alt=\"Toll\" width=\"460\" height=\"345\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("                <h3>Chania</h3>\n");
      out.write("                <p>The atmosphere in Chania has a touch of Florence and Venice.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"item\">\n");
      out.write("            <img src=\"resources/img/toll3.jpg\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("                <h3>Flowers</h3>\n");
      out.write("                <p>Beatiful flowers in Kolymbari, Crete.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"item\">\n");
      out.write("            <img src=\"resources/img/toll4.jpg\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("                <h3>Flowers</h3>\n");
      out.write("                <p>Beatiful flowers in Kolymbari, Crete.</p>\n");
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
      out.write('\n');
      out.write("<div id=\"ruting\" ng-view></div>");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row text-center\">\n");
      out.write("\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("\n");
      out.write("        <!-- normal -->\n");
      out.write("        <div class=\"ih-item circle effect2 left_to_right\"><a href=\"#\">\n");
      out.write("                <div class=\"img\"><img src=\"resources/img/footer/4.jpg\" alt=\"img\"></div>\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <h3>Heading here</h3>\n");
      out.write("                    <p>Description goes here</p>\n");
      out.write("                </div></a></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("\n");
      out.write("        <!-- normal -->\n");
      out.write("        <div class=\"ih-item circle effect3 bottom_to_top\"><a href=\"#\">\n");
      out.write("                <div class=\"img\"><img src=\"resources/img/footer/4.jpg\" alt=\"img\"></div>\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <h3>Heading here</h3>\n");
      out.write("                    <p>Description goes here</p>\n");
      out.write("                </div></a></div>\n");
      out.write("        <!-- end normal -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("\n");
      out.write("        <!-- normal -->\n");
      out.write("        <div class=\"ih-item circle effect4 left_to_right\"><a href=\"#\">\n");
      out.write("                <div class=\"img\"><img src=\"resources/img/footer/4.jpg\" alt=\"img\"></div>\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <h3>Heading here</h3>\n");
      out.write("                    <p>Description goes here</p>\n");
      out.write("                </div></a></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("\n");
      out.write("        <!-- normal -->\n");
      out.write("        <div class=\"ih-item circle effect6 scale_down_up\"><a href=\"#\">\n");
      out.write("                <div class=\"img\"><img src=\"resources/img/footer/4.jpg\" alt=\"img\"></div>\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <h3>Heading here</h3>\n");
      out.write("                    <p>Description goes here</p>\n");
      out.write("                </div></a></div>\n");
      out.write("        <!-- end normal -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("\n");
      out.write("        <!-- normal -->\n");
      out.write("        <div class=\"ih-item circle effect10 bottom_to_top\"><a href=\"#\">\n");
      out.write("                <div class=\"img\"><img src=\"resources/img/footer/4.jpg\" alt=\"img\"></div>\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <h3>Heading here</h3>\n");
      out.write("                    <p>Description goes here</p>\n");
      out.write("                </div></a></div>\n");
      out.write("        <!-- end normal -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"resources/bootstrap/js/jquery-3.1.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"resources/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"resources/bootstrap/js/bootstrap-checkbox.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"resources/bootstrap/js/bootstrap-dropdownhover.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-route.js\"></script>\n");
      out.write("<!--<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-resource.js\"></script>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"resources/js/myJS.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"resources/js/myAngular.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"resources/js/controller.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"resources/js/resources.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
