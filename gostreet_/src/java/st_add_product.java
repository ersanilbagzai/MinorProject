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
@WebServlet(name = "st_add_product", urlPatterns = {"/st_add_product"})
public class st_add_product extends HttpServlet {

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
           
            String pname=request.getParameter("txtname");
            String ptype=request.getParameter("txttype");
             String pprice=request.getParameter("txtprice");
              String psize=request.getParameter("txtsize");
               String pdes=request.getParameter("txtdes");
                String stid=request.getParameter("stid");
                 String simg=request.getParameter("simg");
                  String bimg=request.getParameter("bimg");
                   Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/godb","root","root");
          Statement st=con.createStatement();
          out.print(stid);
          st.execute("insert into stproducts(pname,pprice,psize,pdes,stid,pimgs,pimgb,ptype)values('"+pname+"','"+pprice+"','"+psize+"','"+pdes+"','"+stid+"','"+simg+"','"+bimg+"','"+ptype+"')");
         out.print("added successfully");
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
