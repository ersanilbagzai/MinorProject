
<%@page contentType="text/html" pageEncoding="UTF-8" session="true" %>
<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
            String email = (String) session.getAttribute("uslog");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/godb", "root", "root");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from regstore where semail='" + email + "'");
            if (rs.next()) {
        %>


        <div id="top">
            <h2><a href="index.jsp">homepage</a> | <a href="contact_us.jsp">contact</a></h2>
        </div>
        <div id="banner">
            <table style="margin:0 auto; "><tr><td><h1> <%=session.getAttribute("uslog")%>  </h1></td></tr></table>
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
                    <li><a href="#">Logout</a></li>

                </ul>
                <h3>Reports</h3>
                <ul>


                    <li><a href="st_mon_rep.jsp" class="selected">Monthly Report</a></li>

                </ul>

            </div>


            <div id="content" style="margin-top: 25px;">

                <form action="http://localhost:8080/gostreet_/st_update_profile" method="post">
                    <div  style="margin-top: 30px; height: 640px; width: 500px; margin: 0 auto; border:solid 2px black; border-color: black; ">

                        <table cellspacing="15px" style="margin:0 auto; margin-top: 30px; " >
                            <tr>
                                <td>
                                    Enter Name:
                                </td>
                                <td> <input type="text" name="txtnames" value='<%=rs.getString("sname")%>'></input></td>
                            </tr>
                            <tr>
                                <td>
                                    Enter Email:
                                </td>
                                <td> <input type="text" name="txtemails" disabled="true" value='<%=rs.getString("semail")%>'></input></td> 
                            </tr>
                            <tr>
                                <td>
                                    Enter City:
                                </td>
                                <td><input type="text" name="txtc" disabled="true" value='<%=rs.getString("scity")%>'></input></td>
                                <td> <select name="txtindores" >
                                        <option SELECTED VALUE="indore" >indore </option>

                                    </select></td>
                            </tr>

                            <tr>
                                <td>
                                    Enter State:
                                </td>
                                <td><input type="text" name="txtstate" disabled="true" value='<%=rs.getString("sstate")%>'></input></td>
                                <td> <select name="txtmps">
                                        <option SELECTED VALUE="Madhya pradesh (m.p)" >Madhya Pradesh (M.P.) </option>

                                    </select></td>
                            </tr>
                            <tr>
                                <td>
                                    Enter Pincode:
                                </td>
                                <td><input type="text" name="txtpins"  value='<%=rs.getString("spin")%>'> </input> </td>
                            </tr>




                            <tr>
                                <td>
                                    Enter Phone Number:
                                </td>
                                <td><input type="text" name="txtpnos"  value='<%=rs.getString("spno")%>'> </input><td> 
                                        </tr> 
                                        <tr>
                                            <td>
                                                Enter Address:
                                            </td>
                                            <td>
                                                <textarea name="txtaddrs"  value='<%=rs.getString("saddress")%>'></textarea>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td>
                                                Enter Store Name:
                                            </td>
                                            <td><input type="text" name="txtstname"  value='<%=rs.getString("store_name")%>'></input> <td> 
                                                    </tr> 
                                                    <tr>
                                                        <td>
                                                            Enter Store Category:
                                                        </td>
                                                        <td> <input type="text" name="txtstcat" disabled="true"  value='<%=rs.getString("storecat")%>'></input> <td> 
                                                                </tr> 
                                                                <tr>
                                                                    <td>
                                                                        Enter Store Description:
                                                                    </td>
                                                                    <td><input type="text" name="txtstdes"  value='<%=rs.getString("storedes")%>'></input> <td> 
                                                                            </tr> 



                                                                            <tr>
                                                                                <td>

                                                                                </td>
                                                                                <td>
                                                                                    <input type="submit" value="UPDATE"></input>
                                                                                </td>
                                                                            </tr>
                                                                            </table>
                                                                            </div><% }%>
                                                                            </form>

                                                                            </div>



                                                                            </div>
                                                                            <div id="footer">  Gostreet.in &copy; | Design by Sanil Bagzai, Shivam Soni, Rivani Patware, Ruchi Agrawal </div>
                                                                            </body>
                                                                            </html>
