/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;
/**
 *
 * @author sachinsir
 */
@WebServlet(name = "st_update_profile", urlPatterns = {"/st_update_profile"})
public class st_update_profile extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
             HttpSession sess= request.getSession(true);
        String email=(String)sess.getAttribute("uslog");
        String name=request.getParameter("txtnames");
        String city=request.getParameter("txtindores");
            String state=request.getParameter("txtmps");
             int pin= Integer.parseInt(request.getParameter("txtpins"));
          String password=request.getParameter("txtpasss");
         
         int pno= Integer.parseInt(request.getParameter("txtpnos"));
          String add=request.getParameter("txtaddrs");
          String stname=request.getParameter("txtstname");
          String stcat=request.getParameter("txtstcat");
          String stdes=request.getParameter("txtstdes");
          
           Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/godb","root","root");
      Statement st = con.createStatement();
      
       st.execute("update regstore set sname='"+name+"' where semail='"+email+"'");
       st.execute("update regstore set scity='"+city+"' where semail='"+email+"'");
       st.execute("update regstore set sstate='"+state+"' where semail='"+email+"'");
       st.execute("update regstore set spin='"+pin+"' where semail='"+email+"'");
       st.execute("update regstore set spno='"+pno+"' where semail='"+email+"'");
       st.execute("update regstore set saddress='"+add+"' where semail='"+email+"'");
       st.execute("update regstore set store_name='"+stname+"' where semail='"+email+"'");
       st.execute("update regstore set storedes='"+stdes+"' where semail='"+email+"'");
      
      
        }
         catch(Exception e)
        {
            
            out.print(e);
        }
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
