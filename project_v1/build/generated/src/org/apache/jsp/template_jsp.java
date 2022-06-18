package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   \n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("    <title>PAGE TITLE</title>\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"style/try.css\">\n");
      out.write("    <!-- Favicon icon -->\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"images/favicon.png\">\n");
      out.write("    <!-- Custom Stylesheet -->\n");
      out.write("    <link href=\"css/style_1.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!--*******************\n");
      out.write("        Preloader start\n");
      out.write("    ********************-->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <svg class=\"circular\" viewBox=\"25 25 50 50\">\n");
      out.write("                <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"3\" stroke-miterlimit=\"10\" />\n");
      out.write("            </svg>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--*******************\n");
      out.write("        Preloader end\n");
      out.write("    ********************-->\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <!--**********************************\n");
      out.write("        Main wrapper start\n");
      out.write("    ***********************************-->\n");
      out.write("    <div id=\"main-wrapper\">\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Nav header start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div class=\"nav-header\">\n");
      out.write("            <div class=\"brand-logo\">\n");
      out.write("                <a href=\"index.html\">\n");
      out.write("                    <b class=\"logo-abbr\"><img src=\"images/logo.png\" alt=\"\"> </b>\n");
      out.write("                    <span class=\"logo-compact\"><img src=\"./images/logo-compact.png\" alt=\"\"></span>\n");
      out.write("                    <span class=\"brand-title\">\n");
      out.write("                        <img src=\"images/logo-text.png\" alt=\"\">\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Nav header end\n");
      out.write("        ***********************************-->\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Header start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div class=\"header\">    \n");
      out.write("            <div class=\"header-content clearfix\">\n");
      out.write("                \n");
      out.write("                <div class=\"nav-control\">\n");
      out.write("                    <div class=\"hamburger\">\n");
      out.write("                        <span class=\"toggle-icon\"><i class=\"icon-menu\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header-right\">\n");
      out.write("                    <ul class=\"clearfix\">\n");
      out.write("                        \n");
      out.write("                        <li class=\"icons dropdown d-none d-md-flex\">\n");
      out.write("                            <a href=\"javascript:void(0)\" class=\"log-user\"  data-toggle=\"dropdown\">\n");
      out.write("                                <span>");

                                        String hello=(String) session.getAttribute("hello");
                                        out.println(hello);
                                        
      out.write("</span>  <i class=\"fa fa-angle-down f-s-14\" aria-hidden=\"true\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"drop-down dropdown-language animated fadeIn  dropdown-menu\">\n");
      out.write("                                <div class=\"dropdown-content-body\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"./profile\">Profile</a></li>\n");
      out.write("                                        <li><a href=\"./login.jsp\">Logout</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                      \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Header end ti-comment-alt\n");
      out.write("        ***********************************-->\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Sidebar start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div class=\"nk-sidebar\">           \n");
      out.write("            <div class=\"nk-nav-scroll\">\n");
      out.write("                <ul class=\"metismenu\" id=\"menu\">\n");
      out.write("                    <li class=\"nav-label\">Dashboard</li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\"></i><span class=\"nav-text\">Dashboard</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"#\">Home</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-label\"><a href=\"#\">Cart</a></li>\n");
      out.write("                  \n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                        <span class=\"nav-text\">PickUp</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./PickUpForm.jsp\">Pickup Form</a></li>\n");
      out.write("                            <li><a href=\"./PickupDetail.jsp\">Pickup Details</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("              \n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                         <span class=\"nav-text\">Rent Item</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./dvd_servlet\">DVD</a></li>\n");
      out.write("                            <li><a href=\"./cassete_servlet\">CASSETTE</a></li>\n");
      out.write("                            <li><a href=\"./comic_servlet\">COMIC/BOOK</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-label\"><a href=\"./status_servlet\">Rental Status</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       <div class=\"content-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <h1>=============</h1>\n");
      out.write("            </div>\n");
      out.write("            <!-- #/ container -->\n");
      out.write("                    \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <footer>Copyright &copy; <b><i>MyRetro's@UTM</i></b>  Store</footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Footer end\n");
      out.write("        ***********************************-->\n");
      out.write("    </div>\n");
      out.write("    <!--**********************************\n");
      out.write("        Main wrapper end\n");
      out.write("    ***********************************-->\n");
      out.write("\n");
      out.write("    <!--**********************************\n");
      out.write("        Scripts\n");
      out.write("    ***********************************-->\n");
      out.write("    <script src=\"plugins/common/common.min.js\"></script>\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\n");
      out.write("    <script src=\"js/settings.js\"></script>\n");
      out.write("    <script src=\"js/gleek.js\"></script>\n");
      out.write("    <script src=\"js/styleSwitcher.js\"></script>\n");
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
