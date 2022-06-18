package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class all_005ftype_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("               <title>All Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style/cassete_style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <h1> ======ALL===== </h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");

        String driver = "com.mysql.jdbc.Driver";
        String dbName = "MyRetro";
        String url = "jdbc:mysql://localhost/"+dbName+"?";
        String userName = "root";
        String password = "";
        String query = "SELECT id,image,name,stock,price FROM cassete";
        
        Class.forName(driver); //2- load & register driver
        Connection con = DriverManager.getConnection(url,userName,password); //3-establish connection
        Statement st = con.createStatement();//4- create statement
        ResultSet rs = st.executeQuery(query);//5- Execute query
        
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet casseste_page</title>");       
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"CasseteStyle.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet casseste_page at " + request.getContextPath() + "</h1>");
            ///table start here	
           out.println("<TABLE>");
           out.println("<tr>");
           out.println("<th align=\"center\"><strong>PICTURE</strong></th>");
           out.println("<th align=\"center\"><strong>NAME</strong></th>");
           out.println("<th align=\"center\"><strong>STOCK</strong></th>");
           out.println("<th align=\"center\"><strong>PRICE</strong></th>");
           out.println("<th align=\"center\"><strong>RENT</strong></th>");
           out.println("</tr>"); 
           
           while(rs.next()){//6- process the result
                 out.println("<tr>");
                 out.println("<td align=\"center\"> + <img  src="+ rs.getString(2) +"></td>");
                 out.println("<td align=\"center\">" + rs.getString(3) + "</td>");
                 out.println("<td align=\"center\">" + rs.getString(4) + "</td>");
                 out.println("<td align=\"center\"> RM" + rs.getString(5) + "</td>");
                 out.println("<td align=\"center\">");
                 
      out.write("\n");
      out.write("                 <a href=\"index.jsp?id=");
rs.getString(1);
      out.write("\">details</a>\n");
      out.write("                 ");

                 out.println("</td>");
                 
            }

            query = "SELECT id,image,name,stock,price FROM comic";
            rs = st.executeQuery(query);//5- Execute query

              while(rs.next()){//6- process the result
                 out.println("<tr>");
                 out.println("<td align=\"center\"> + <img  src="+ rs.getString(2) +"></td>");
                 out.println("<td align=\"center\">" + rs.getString(3) + "</td>");
                 out.println("<td align=\"center\">" + rs.getString(4) + "</td>");
                 out.println("<td align=\"center\"> RM" + rs.getString(5) + "</td>");
                 out.println("<td align=\"center\">");
                 
      out.write("\n");
      out.write("                 <a href=\"index.jsp?id=");
rs.getString(1);
      out.write("\">details</a>\n");
      out.write("                 ");

                 out.println("</td>");
                 out.println("</tr>");
            }
            out.println("</TABLE>"); 
            //END OF THE TABLE
            out.println("</body>");
            out.println("</html>");
          
      out.write("\n");
      out.write("    </body>\n");
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
