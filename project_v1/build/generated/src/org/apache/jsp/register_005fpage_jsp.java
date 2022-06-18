package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Lora:ital,wght@1,600&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <script src=\"https://kit.fontawesome.com/a81368914c.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    \n");
      out.write("    <!-- Style -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    <title>Register Page</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("         <script>\n");
      out.write("            function validateform(){\n");
      out.write("                var fullname=document.RegisterForm.fullname.value;\n");
      out.write("                var aemail=document.RegisterForm.email.value;\n");
      out.write("                var username=document.RegisterForm.username.value;\n");
      out.write("                var password =document.RegisterForm.password.value;\n");
      out.write("                var repassword=document.RegisterForm.repassword.value;\n");
      out.write("                var address=document.RegisterForm.address.value;\n");
      out.write("                var contact=document.RegisterForm.contact.value;\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                if(fullname===null||fullname===\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please Fill the Fullname Fill\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else if(aemail===null||aemail===\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please Enter your email\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                 else if(username===null||username===\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please Enter your username\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else if(password===null||password===\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please Enter your password\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else if(repassword===null||repassword===\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please Reenter password \");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else if(address===null||address===\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please Enter your Address \");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else if(contact===null||contact===\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please Enter your Contact no\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else if(password!==repassword)\n");
      out.write("                {\n");
      out.write("                    alert(\"Password do not match!Please reenter again\");\n");
      out.write("                    document.RegisterForm.repassword.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("               \n");
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
      out.write("    <div class=\"bg order-1 order-md-2\" style=\"background-image: url('images/logo2.png');\"></div>\n");
      out.write("    <div class=\"contents order-1 order-md-2\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("  <h1>MyRetro Register Form:</h1>\n");
      out.write("  <div class=\"card\">\n");
      out.write("   <div class=\"card-body\">\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    <form action=\"register_servlet\" method=\"post\" name=\"RegisterForm\" onsubmit=\"return  validateform()\">\n");
      out.write("\n");
      out.write("     <div class=\"form-group row\">\n");
      out.write("      <label for=\"firstName\" class=\"col-sm-2 col-form-label\">Full\n");
      out.write("       Name</label>\n");
      out.write("      <div class=\"col-sm-7\">\n");
      out.write("       <input type=\"text\" class=\"form-control\" name=\"fullname\"\n");
      out.write("        placeholder=\"Enter first name\">\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     <div class=\"form-group row\">\n");
      out.write("      <label for=\"lastName\" class=\"col-sm-2 col-form-label\">Email</label>\n");
      out.write("      <div class=\"col-sm-7\">\n");
      out.write("       <input type=\"text\" class=\"form-control\" name=\"email\"\n");
      out.write("        placeholder=\"Enter last name\">\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     <div class=\" form-group row\">\n");
      out.write("      <label for=\"lastName\" class=\"col-sm-2 col-form-label\">User\n");
      out.write("       Name</label>\n");
      out.write("      <div class=\"col-sm-7\">\n");
      out.write("       <input type=\"text\" class=\"form-control\" name=\"username\"\n");
      out.write("        placeholder=\"Enter user name\">\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     <div class=\"form-group row\">\n");
      out.write("      <label for=\"lastName\" class=\"col-sm-2 col-form-label\">Password</label>\n");
      out.write("      <div class=\"col-sm-7\">\n");
      out.write("       <input type=\"password\" class=\"form-control\" name=\"password\"\n");
      out.write("        placeholder=\"Enter Password\">\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("        \n");
      out.write("     <div class=\"form-group row\">\n");
      out.write("      <label for=\"lastName\" class=\"col-sm-2 col-form-label\">reEnter Password</label>\n");
      out.write("      <div class=\"col-sm-7\">\n");
      out.write("       <input type=\"password\" class=\"form-control\" name=\"repassword\"\n");
      out.write("        placeholder=\"reEnter Password\">\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     <div class=\"form-group row\">\n");
      out.write("      <label for=\"lastName\" class=\"col-sm-2 col-form-label\">Address</label>\n");
      out.write("      <div class=\"col-sm-7\">\n");
      out.write("       <input type=\"text\" class=\"form-control\" name=\"address\"\n");
      out.write("        placeholder=\"Enter Address\">\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     <div class=\"form-group row\">\n");
      out.write("      <label for=\"contact\" class=\"col-sm-2 col-form-label\">Contact\n");
      out.write("       No</label>\n");
      out.write("      <div class=\"col-sm-7\">\n");
      out.write("       <input type=\"text\" class=\"form-control\" name=\"contact\"\n");
      out.write("        placeholder=\"Enter Contact Number\">\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("    </form>\n");
      out.write("   </div>\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
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
