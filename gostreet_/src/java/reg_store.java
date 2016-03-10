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
/**
 *
 * @author sachinsir
 */
@WebServlet(name = "reg_store", urlPatterns = {"/reg_store"})
public class reg_store extends HttpServlet {

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
           String name=request.getParameter("txtnames");
          String email=request.getParameter("txtemails");
           String city=request.getParameter("txtindores");
            String state=request.getParameter("txtmps");
             int pin= Integer.parseInt(request.getParameter("txtpins"));
          String password=request.getParameter("txtpasss");
         
          int pno=Integer.parseInt(request.getParameter("txtpnos")); 
          String add=request.getParameter("txtaddrs");
            String sname=request.getParameter("txtsnames");
              String scat=request.getParameter("txtcats");
                String sdes=request.getParameter("txtdess");
            
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/godb","root","root");
          Statement st=con.createStatement();
          st.execute("insert into regstore(sname,semail,scity,sstate,spin,spassword,spno,saddress,store_name,storecat,storedes)values('"+name+"','"+email+"','"+city+"','"+state+"','"+pin+"','"+password+"','"+pno+"','"+add+"','"+sname+"','"+scat+"','"+sdes+"')");
         out.println("done................");
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
                    