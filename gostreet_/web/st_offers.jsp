<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8" session="true" %>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@page import=" java.text.DateFormat"%>
<%@ page import="java.text.SimpleDateFormat"%>
<html>
    <head>
        <title>STORE</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <link href="style_u.css" rel="stylesheet" type="text/css" />
        <link href="menu.css" rel="stylesheet" type="text/css" />
        <!--[if lt IE 7]>
        <style type="text/css" media="screen">
        #menuh{float:none;}
        body{behavior:url(csshover.htc); font-size:75%;}
        #menuh ul li{float:left; width: 100%;}
        #menuh a{height:1%;font:normal 1em/1.6em  helvetica,  "Trebuchet MS", arial, sans-serif;}
        </style>
        <![endif]-->
    </head>
    <body>
        <%
         String email =(String)session.getAttribute("uslog");
                                          Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/godb","root","root");
          
              DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
         Calendar cal=Calendar.getInstance();
         out.print(df.format(cal.getTime()));
          DateFormat df1=new SimpleDateFormat("HH:mm");
         Calendar cal1=Calendar.getInstance();
         
              Statement st = con.createStatement();
             ResultSet rs= st.executeQuery("select * from regstore where semail='"+email+"'");
              if(rs.next()){
        %>
        <div id="top">
            <h2><a href="index.jsp">homepage</a> | <a href="contact_us.jsp">contact</a></h2>
        </div>
        <div id="banner">
            <h1> Your Company Name</h1>
        </div>
        <div id="menuh-container">
            <div id="menuh">
                <ul>
                    <li><a href="index.jsp" class="top_parent">Homepage</a> </li>
                </ul>
                <ul>
                    <li><a href="about_us.jsp" class="top_parent">About us</a>

                    </li>
                </ul>

                <ul>
                    <li><a href="registration.jsp" class="top_parent">Registration</a> </li>
                </ul>
                <ul>
                    <li><a href="user_log_f.jsp" class="top_parent">User Login</a> </li>
                </ul>
                <ul>
                    <li><a href="contact_us.jsp" class="top_parent">Contact Us</a> </li>
                </ul>
            </div>
        </div>
        <div id="container">
            <div id="sidebar">
                <h3>Services</h3>
                <ul>
                    <li><a href="user_acc.jsp">User Account</a></li>
                    <li><a href="st_profile.jsp">Show my Profile</a></li>
                    <li><a href="st_change_pass.jsp">Change Password</a></li>
                    <li><a href="st_upd_profie.jsp">Update Profile</a></li>
                    <li><a href="st_add_item.jsp">Add Item</a></li>
                    <li><a href="st_del_item.jsp">Delete Item</a></li>
                    <li><a href="st_offers.jsp">give offers</a></li>
                    <li><a href="index.jsp">Logout</a></li>

                </ul>
                <h3>Reports</h3>
                <ul>


                    <li><a href="st_mon_rep.jsp" class="selected">Monthly Report</a></li>

                </ul>

            </div>
            <div id="content" style="margin-top: 100px;">

                <form action="http://localhost:8080/gostreet_/st_add_offer_serv" method="post">
                    <div  style="margin-top: 30px; height: 300px; width: 400px; margin: 0 auto; border:solid 2px black; border-color: black; "> 

                        <table cellspacing="15px" style="margin:0 auto; margin-top: 30px; " >
                            <tr>
                                <td>
                                    Enter Offer(discount percentage):
                                </td>
                                <td> <textarea name="txtoffer"></textarea></td>
                            </tr>
                            <tr>
                                <td>
                                    Store Name:
                                </td>
                                <td><%=rs.getString("store_name")%></td> 
                            </tr>


                            <tr>
                                <td>
                                    Enter Date:
                                </td>
                                <td>
                                    <%=df.format(cal.getTime())%>
                                </td>

                            </tr>
                            <tr>
                                <td>
                                    Enter Time:
                                </td>
                                <td>
                                  <%=df1.format(cal.getTime())%><%} %>
                                </td>

                            </tr>





                            <tr>
                                <td>

                                </td>
                                <td>
                                    <input type="submit" value="SUBMIT"></input>
                                </td>
                            </tr>
                        </table>
                    </div>
                </form>

            </div>

        </div>
        <div id="footer">  Gostreet.in &copy; | Design by Sanil Bagzai, Shivam Soni, Rivani Patware, Ruchi Agrawal </div>
    </body>
</html>
