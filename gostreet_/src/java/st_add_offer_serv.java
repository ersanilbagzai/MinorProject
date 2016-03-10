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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.http.HttpSession;

//import java.util.*;
/**
 *
 * @author sachinsir
 */
@WebServlet(name = "st_add_offer_serv", urlPatterns = {"/st_add_offer_serv"})
public class st_add_offer_serv extends HttpServlet {

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
        
           // out.print("amit");
            HttpSession sess= request.getSession(true);
        String email=(String)sess.getAttribute("uslog");
        
           String offer=request.getParameter("txtoffer");
           // out.print("amit");
          
           Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/godb","root","root");
          DateFormat df=new SimpleDateFormat("dd/mm/yyyy");
         Calendar cal=Calendar.getInstance();
         String dat=df.format(cal.getTime());
          DateFormat df1=new SimpleDateFormat("HH:mm");
         Calendar cal1=Calendar.getInstance();
        
   String tim=df1.format(cal1.getTime());
          Statement st=con.createStatement();
          //  st.execute("insert into regstore(sname,semail,scity,sstate,spin,spassword,spno,saddress,store_name,storecat,storedes)values('"+name+"','"+email+"','"+city+"','"+state+"','"+pin+"','"+password+"','"+pno+"','"+add+"','"+sname+"','"+scat+"','"+sdes+"')");
        
        
  ResultSet rs = st.executeQuery("select * from  regstore where semail='"+email+"'");
     if(rs.next()){ 
         
         
          Statement st1=con.createStatement();

         
  String stname=rs.getString("Store_name");
  out.print(offer);
     out.print(df.format(cal.getTime()));  out.print(tim);  out.print(stname);
    
     st1.execute("insert into stoffer(offer,date,time,store_name)values('"+offer+"','"+dat+"','"+tim+"','"+stname+"')");
     }
         
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
