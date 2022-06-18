/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(name = "AD_insert_item", urlPatterns = {"/AD_insert_item"})
public class AD_insert_item extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String type=request.getParameter("type");
            String id=request.getParameter("id");
            String image=request.getParameter("image");
            String nama=request.getParameter("name");
            String price=request.getParameter("price");
            String des=request.getParameter("des");
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AD_insert_item</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AD_insert_item at " + request.getContextPath() + "</h1>");
             out.println(type);
              out.println(id);
               out.println(image);
                out.println(nama);
                 out.println(price);
                  out.println(des);
                  
                  
                  String driverName = "com.mysql.jdbc.Driver";
         String dbName = "myretro";
         String url = "jdbc:mysql://localhost/"+dbName+"?";
         String userName = "root";
         String Password = "";

      PreparedStatement ps = null;
try{
    
        Class.forName(driverName);
         Connection con = DriverManager.getConnection(url,userName,Password);
         
         String query ="UPDATE "+type+" SET description=?,name=?,image=?,price=? WHERE id='"+id+"'";
         
         ps = con.prepareStatement(query);
         ps.setString(1,des);
         ps.setString(2,nama);
         ps.setString(3,image);
         ps.setDouble(4,Double.parseDouble(price));
       
         int i = ps.executeUpdate();
         if(i>0)
             {
                RequestDispatcher rd= request.getRequestDispatcher("./AD_ItemPage.jsp");
                rd.forward(request,response);
                out.println("<script>alert(\"Update Successfully\")</script>");
}
else
{
RequestDispatcher rd= request.getRequestDispatcher("./AD_ItemPage.jsp");
                rd.forward(request,response);
                out.println("<script>alert(\"There is a problem in updating Record\")</script>");
}
}
catch (SQLException query)
{
request.setAttribute("error", query);
out.println(query);
}
            out.println("</body>");
            out.println("</html>");
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AD_insert_item.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AD_insert_item.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AD_insert_item.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AD_insert_item.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
