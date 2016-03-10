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
@WebServlet(name = "cus_profile_update", urlPatterns = {"/cus_profile_update"})
public class cus_profile_update extends HttpServlet {

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
        String email=(String)sess.getAttribute("uclog");
            
            String name=request.getParameter("txtnamec");
         // String email=request.getParameter("txtemailc");
           String city=request.getParameter("txtindorec");
            String state=request.getParameter("txtmpc");
             int pin= Integer.parseInt(request.getParameter("txtpinc"));
          String password=request.getParameter("txtpassc");
         
         int pno= Integer.parseInt(request.getParameter("txtpnoc"));
          String add=request.getParameter("txtaddrc");
            
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/godb","root","root");
      Statement st = con.createStatement();
          // PreparedStatement p=con.prepareStatement("update regcustomer set name='"+name+"',city='"+city+"',state='"+state+"',pin='"+pin+"',pno='"+pno+"',address='"+add+"' where email='"+email+"'");
          //  Statement st=con.createStatement();
    //  st.execute("update regcustomer set name='"+name+"',city='"+city+"',state='"+state+"',pin="+pin+",pno='"+pno+"',address='"+add+"' where email='"+email+"'");
      // sql=update regcustomer set name='"+name+"',city='"+city+"',state='"+state+"',pin="+pin+",pno='"+pno+"',address='"+add+"' where email='"+email+"'; 
       //out.println("done................");
     //  out.println(email);
       //  out.println(b);
        st.execute("update regcustomer set name='"+name+"' where email='"+email+"'"); 
         st.execute("update regcustomer set pno='"+pno+"' where email='"+email+"'"); 
          st.execute("update regcustomer set pin='"+pin+"' where email='"+email+"'"); 
           st.execute("update regcustomer set city='"+city+"' where email='"+email+"'"); 
            st.execute("update regcustomer set state='"+state+"' where email='"+email+"'"); 
             st.execute("update regcustomer set address='"+add+"' where email='"+email+"'"); 
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
