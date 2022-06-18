package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <meta name=\"description\" content=\"Coral - Onepage portfolio Template\">\n");
      out.write("    <meta name=\"author\" content=\"esrat\">\n");
      out.write("\n");
      out.write("    <!-- Fontawseom Icon CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/all.css\">\n");
      out.write("\n");
      out.write("    <!-- Theme CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\n");
      out.write("\n");
      out.write("    <title>Coral-Onepage Portfolio Template</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("    <!-- NAVBAR\n");
      out.write("    ================================================= -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark navbar-togglable  fixed-top \" id=\"mainNav\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <!-- Brand -->\n");
      out.write("            <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">\n");
      out.write("                <h2>MyRetro</h2>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <!-- Toggler -->\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon-bar\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <!-- Collapse -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                <!-- Links -->\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link js-scroll-trigger\" href=\"#page-top\">\n");
      out.write("                            Home\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link js-scroll-trigger\" href=\"#testimonial\">\n");
      out.write("                            Profile\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- / .navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- / .container -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- HERO\n");
      out.write("    ================================================== -->\n");
      out.write("    <section class=\"section section-top section-full\">\n");
      out.write("\n");
      out.write("        <!-- Cover -->\n");
      out.write("        <div class=\"bg-cover\" style=\"background-image: url(assets/img/retrostyle.jpg);\"></div>\n");
      out.write("\n");
      out.write("        <!-- Overlay -->\n");
      out.write("        <div class=\"bg-overlay\"></div>\n");
      out.write("        <!-- Content -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-center align-items-center\">\n");
      out.write("                <div class=\"col-md-10 col-lg-7 \">\n");
      out.write("                    <div class=\"banner-content\">\n");
      out.write("                        <!-- Preheading -->\n");
      out.write("                        <p class=\"text-white text-uppercase text-center text-xs\">\n");
      out.write("                            Meet <span>John Doe</span>\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <!-- Heading -->\n");
      out.write("                        <h1 class=\"text-white text-center mb-4 display-4 font-weight-bold\">\n");
      out.write("                            I am a UI/UX Designer <br>& Developer\n");
      out.write("                        </h1>\n");
      out.write("\n");
      out.write("                        <!-- Subheading -->\n");
      out.write("                        <p class=\"lead text-white text-center mb-5\">\n");
      out.write("                            Having 3 years plus experience in design and develop area. I do html template conversion and wordpress theme development too. Have any project on mind or any query about project, feel free to contact.\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                        <!-- Button -->\n");
      out.write("                        <p class=\"text-center mb-0\" >\n");
      out.write("                            <a href=\"#\" target=\"_blank\" class=\"btn btn-primary \">\n");
      out.write("                                Contact Now\n");
      out.write("                            </a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- / .row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- / .container -->\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Testimonial\n");
      out.write("    ================================================== -->\n");
      out.write("    <section class=\"section bg-dark\" id=\"testimonial\">\n");
      out.write("            <div class=\"carousel slide\" id=\"review-slider\" data-ride=\"carousel\">\n");
      out.write("               <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#review-slider\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#review-slider\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#review-slider\" data-slide-to=\"2\"></li>\n");
      out.write("              </ol>\n");
      out.write("               <div class=\"caousel-inner\">\n");
      out.write("                   <div class=\"container\">\n");
      out.write("                         <div class=\"row\">\n");
      out.write("                           <div class=\"col-lg-8 m-auto\">\n");
      out.write("                            <div class=\"carousel-item active text-center test-content\">\n");
      out.write("                                <div class=\"client-img\">\n");
      out.write("                                    <img src=\"assets/img/review/tes-1.jpg\" alt=\"\" class=\"img-fluid \">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <p class=\"lead\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium illum suscipit, quam quas fuga illo cupiditate labore eveniet, officia in modi eum consequuntur quis alias delectus hic? Delectus, molestias eaque.</p>\n");
      out.write("\n");
      out.write("                                <div class=\"client-text\">\n");
      out.write("                                    <h3>John Martin</h3>\n");
      out.write("                                    <h6>Senior Developer</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                             <div class=\"carousel-item text-center test-content\">\n");
      out.write("                                <div class=\"client-img\">\n");
      out.write("                                    <img src=\"assets/img/review/tes-2.jpeg\" alt=\"\" class=\"img-fluid \">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <p class=\"lead\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium illum suscipit, quam quas fuga illo cupiditate labore eveniet, officia in modi eum consequuntur quis alias delectus hic? Delectus, molestias eaque.</p>\n");
      out.write("\n");
      out.write("                                <div class=\"client-text\">\n");
      out.write("                                    <h3>John Martin</h3>\n");
      out.write("                                    <h6>Senior Developer</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                              <div class=\"carousel-item text-center test-content\">\n");
      out.write("\n");
      out.write("                                <div class=\"client-img\">\n");
      out.write("                                    <img src=\"assets/img/review/tes-3.jpeg\" alt=\"\" class=\"img-fluid \">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <p class=\"lead\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium illum suscipit, quam quas fuga illo cupiditate labore eveniet, officia in modi eum consequuntur quis alias delectus hic? Delectus, molestias eaque.</p>\n");
      out.write("\n");
      out.write("                                <div class=\"client-text\">\n");
      out.write("                                    <h3>John Martin</h3>\n");
      out.write("                                    <h6>Senior Developer</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- FOOTER\n");
      out.write("    ================================================== -->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <footer>Copyright &copy; <b><i>MyRetro's@UTM</i></b>  Store</footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    <!-- JAVASCRIPT\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Global JS -->\n");
      out.write("    <script src=\"assets/libs/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/libs/bootstrap/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Plugin JavaScript -->\n");
      out.write("    <script src=\"assets/js/jquery.easing.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/ajax-contact.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Theme JS -->\n");
      out.write("    <script src=\"assets/js/theme.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
