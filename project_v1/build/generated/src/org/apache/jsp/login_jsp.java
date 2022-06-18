package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style/index.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/icomoon/style.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    \n");
      out.write("    <!-- Style -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    <title>Login Page</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("         <script>\n");
      out.write("            function validateform(){\n");
      out.write("                var username=document.loginForm.username.value;\n");
      out.write("                var password =document.loginForm.userpass.value;\n");
      out.write("                 \n");
      out.write("                if(username===null||username===\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please Fill the Username Fill\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else if(password===null||password===\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please Enter your password\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("            <header>\n");
      out.write("                <h1><b><i>MyRetro's</i></b>  Store</h1>\n");
      out.write("                <div class=\"header_menu\">\n");
      out.write("                    <a href=\"#\">Sign-in</a> | \n");
      out.write("                    <a href=\"cart.html\">Cart</a> | \n");
      out.write("                    <a href=\"#\">My orders</a> \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("  <div class=\"d-lg-flex half\">\n");
      out.write("    <div class=\"bg order-1 order-md-2\" style=\"background-image: url('images/retro.png');\"></div>\n");
      out.write("    <div class=\"contents order-2 order-md-1\">\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row align-items-center justify-content-center\">\n");
      out.write("          <div class=\"col-md-7\">\n");
      out.write("            <h3>Login to <strong>MyRetro</strong></h3>\n");
      out.write("            <p class=\"mb-4\">We bring you to old lanes memories. Item that make your heart familiar.</p>\n");
      out.write("            <form action=\"login_validation\" method=\"post\" name=\"loginForm\" id=\"loginForm\" class=\"loin_form\" onsubmit=\"return  validateform()\">\n");
      out.write("              <div class=\"form-group first\">\n");
      out.write("                <label for=\"username\">Username</label>\n");
      out.write("                <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"your-email@gmail.com\" id=\"username\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group last mb-3\">\n");
      out.write("                <label for=\"password\">Password</label>\n");
      out.write("                <input type=\"password\" name=\"userpass\" class=\"form-control\" placeholder=\"Your Password\" id=\"password\">\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <div class=\"d-flex mb-5 align-items-center\">\n");
      out.write("                <label class=\"control control--checkbox mb-0\"><span class=\"caption\">Remember me</span>\n");
      out.write("                  <input type=\"checkbox\" checked=\"checked\"/>\n");
      out.write("                  <div class=\"control__indicator\"></div>\n");
      out.write("                </label>\n");
      out.write("                <span class=\"ml-auto\"><a href=\"register_page.jsp\" class=\"forgot-pass\">Register</a></span> \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <input type=\"submit\" value=\"Log In\" class=\"btn btn-block btn-primary\">\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <footer>Copyright &copy; <b><i>MyRetro's@UTM</i></b>  Store</footer>\n");
      out.write("  </body>\n");
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
