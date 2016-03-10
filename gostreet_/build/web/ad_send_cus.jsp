<%-- 
    Document   : ad_send_cus
    Created on : Apr 14, 2015, 5:36:36 PM
    Author     : sachinsir
--%>



<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link href="css/default.css" rel="stylesheet" type="text/css" />
    </head>
    <body>

        <div id="logo-wrap">
            <div id="logo">
                <h1><a href="#">ADMIN PANEL </a></h1>

            </div>
        </div>

        <!-- start header -->
        <div id="header">
            <div id="menu">
                <ul>
                    <li class="current_page_item"><a href="admin.jsp">Home admin</a></li>
                    <li><a href="index.jsp">home</a></li>
                    <li><a href="about_us.jsp">about us</a></li>
                    <li><a href="registration.jsp">registration</a></li>
                    <li><a href="user_log_f.jsp">user login</a></li>
                    <li><a href="admin_login.jsp">admin login</a></li>
                    <li><a href="contact_us.jsp">contact us</a></li>
                    <li class="last"><a href="index.jsp">logout</a></li>
                </ul>
            </div>
        </div>
        <!-- end header -->
        <!-- start page -->
        <div id="wrapper">
            <div id="wrapper-btm">
                <div id="page">
                    <!-- start content -->
                    <div id="content">
                        <div id="banner">&nbsp;</div>
                        <div class="post">
                            <h1 class="title">title </h1>


                        </div>
                        <div style="margin: 0 auto;"><form action="http://localhost:8080/gostreet_/ad_cus_send_msg_serv" method="post">
                                <table cellpadding="10px"> 
                                    <tr>
                                        <td> Enter Subject:</td>
                                        <td><input type="text" name="txtsub"></input></td>
                                    </tr>
                                    <tr>
                                        <td> Enter Message:</td>
                                        <td><textarea name="msgb"></textarea></td>
                                    </tr>
                                     <tr>
                                        <td> </td>
                                        <td><input type="submit"  value="SEND TO ALL"></input></td>
                                    </tr>
                                </table>

                            </form></div>

                    </div>
                </div>
                <!-- end content -->
                <!-- start sidebar -->
                <div id="sidebar">
                    <ul>
                        <li id="search">
                            <h2>Search</h2>
                            <form method="get" action="">
                                <fieldset>
                                    <input type="text" id="s" name="s" value="" />
                                    <input type="submit" id="x" value="Search" />
                                </fieldset>
                            </form>
                        </li>
                        <li>
                            <h2>functionalities</h2>
                            <ul>
                                <li><a href="ad_show_st.jsp">show all store owners</a></li>
                                <li><a href="ad_del_st.jsp">delete store owners</a></li>
                                <li><a href="ad_sh_cus.jsp">show all customers</a></li>
                                <li><a href="ad_del_cus.jsp">delete customers</a></li>
                                <li><a href="ad_send_cus.jsp">send message to customer</a></li>
                                <li><a href="ad_send_st.jsp">send message to store</a></li>

                            </ul>
                        </li>


                    </ul>
                </div>
                <!-- end sidebar -->
                <div style="clear: both;">&nbsp;</div>
            </div>
            <!-- end page -->
        </div>
    </div>
    <!-- start footer -->
    <div id="footer">
        <div id="footer-wrap">
            <p id="legal">(c) 2015 Design by sanil bagzai, shivam soni, rivani patware, ruchi </p>
        </div>
    </div>
    <!-- end footer --></html>

