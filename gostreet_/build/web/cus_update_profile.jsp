<%-- 
    Document   : cus_update_profile
    Created on : Apr 16, 2015, 11:08:05 AM
    Author     : sachinsir
--%>




<%@page contentType="text/html" pageEncoding="UTF-8" session="true" %>
<%@page import="java.sql.*" %>



<!DOCTYPE html>
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
     
	<link rel="shortcut icon" href="css/images/favicon.ico" />
	<link rel="stylesheet" href="css_c/style.css" type="text/css" media="all" />
	<script src="js_c/jquery-1.6.2.min.js" type="text/javascript" charset="utf-8"></script>
	<!--[if IE 6]>
		<script src="js/DD_belatedPNG-min.js" type="text/javascript" charset="utf-8"></script>
	<![endif]-->
	<script src="js_c/jquery.jcarousel.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js_c/functions.js" type="text/javascript" charset="utf-8"></script>
    </head>
    <body>
        <%
     String email =(String)session.getAttribute("uclog");
                                      Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/godb","root","root");
          
          Statement st = con.createStatement();
         ResultSet rs= st.executeQuery("select * from regcustomer where email='"+email+"'");
          if(rs.next()){
              %>
       
     
        <div id="wrapper">
            <!-- Begin Inner -->
            <div class="inner">
                <!-- Begin Header -->
                <div id="header">
                    <div class="header-inner">
                        <!-- Begin Shell -->
                        <div class="shell">
                            <h1 id="logo"><a class="notext" href="#">World of TShirts</a></h1>
                                                     <!-- Begin Navigation -->
                            
                                  <div id="navigation">  <ul>
                                    <li><a href="index.jsp" title="Home Page"><span>Home</span></a></li>
                                    <li><a href="about_us.jsp" title="About us"><span>About us</span></a></li>
                                    <li><a href="registration.jsp" title="Registration"><span>Registration</span></a></li>
                                    <li><a href="user_log_f.jsp" title="User Login"><span>User Login</span></a></li>
                                    <li><a href="contact_us.jsp" title="Contact Us"><span>Contact us</span></a></li>
                                </ul>
                                
                                <ul><li> <a> <div style="float:left; margin-right:100px;"><span><%=session.getAttribute("uclog")%></span> </div></a></li></ul><% } %>
                             
                                <div class="cl">&nbsp;</div>
                            </div>
                            <!-- End Navigation -->
                            <div class="cl">&nbsp;</div>
                        </div>
                        <!-- End Shell -->
                    </div>
                </div>
                <!-- End Header -->
                <!-- Begin Shell -->
                <div class="shell">
                    <!-- Begin Main -->
                    <div id="main">
                        <!-- Begin Sidebar -->
                        <div id="sidebar">
                            <ul>
                                <!-- Begin Widget -->
                                <li class="widget">
                                    <h2>Categories</h2>
                                    <ul>

                                      
                                        <li><a href="cus_outfit.jsp">Outfit's</a></li>
                                        <li><a href="cus_home_need.jsp">Home Needs</a></li>
                                        <li><a href="cus_accesories.jsp">Accessories</a></li>
                                        <li><a href="cus_electronics.jsp">Electronics</a></li>

                                        <li class="last"><a href="cus_book_mag.jsp">Books And Magzines</a></li>
                                    </ul>
                                </li>

                                <li class="widget">
                                    <h2>Services</h2>
                                    <ul>

                                       <li><a href="cus_acc.jsp">User Account</a></li>
                                        <li><a href="cus_sh_mu_profile.jsp">Show my Profile</a></li>
                                        <li><a href="cus_change_pass.jsp">Change Password</a></li>
                                        <li><a href="cus_update_profile.jsp">Update Profile</a></li>
                                        <li><a href="cus_place_order.jsp">Place Order</a></li>
                                        
                                        <li class="last"><a href="index.jsp">Logout</a></li>
                                    </ul>
                                </li>


                                <!-- End Widget -->
                                <!-- Begin Widget -->
                                <li class="widget">
                                    <h2>Search</h2>
                                    <div id="search">
                                        <form action="#" method="get" accept-charset="utf-8">
                                            <label>Keyword</label>
                                            <input type="text" class="blink" name="keyword" />
                                            <label>Category</label>
                                            <select size="1" name="category">
                                                <option value="default">-- Select Category --</option>
                                                <option value="category1">Outfit's</option>
                                                <option value="category2">home needs</option>
                                                <option value="category3">accessories</option>
                                                <option value="category4">electronics</option>
                                                <option value="category5">books and magzines</option>
                                                
                                            </select>
                                            <div class="price">
                                                <label>Price</label>
                                                <select size="1" name="price">
                                                    <option value="10">10/-</option>
                                                    <option value="20">20/-</option>
                                                    <option value="30">30/-</option>
                                                    <option value="40">40/-</option>
                                                    <option value="50">50/-</option>
                                                    <option value="60">60/-</option>
                                                    <option value="70">70/-</option>
                                                    <option value="80">80/-</option>
                                                    <option value="90">90/-</option>
                                                    <option value="100">100/-</option>
                                                </select>
                                                <label>to:</label>
                                                <select size="1" name="to">
                                                    <option value="50">50/-</option>
                                                    <option value="60">60/-</option>
                                                    <option value="70">70/-</option>
                                                    <option value="80">80/-</option>
                                                    <option value="90">90/-</option>
                                                    <option value="100">100/-</option>
                                                    <option value="200">200/-</option>
                                                    <option value="300">300/-</option>
                                                    <option value="400">400/-</option>
                                                    <option value="500">500/-</option>
                                                </select>
                                                <div class="cl">&nbsp;</div>
                                            </div>
                                            <span class="button"><input type="submit" value="Search" /></span>
                                            <div class="cl">&nbsp;</div>
                                        </form>
                                       
                                    </div>
                                </li>
                                <!-- End Widget -->
                            </ul>
                        </div>
                        <!-- End Sidebar -->
                        <!-- Begin Content -->
                        <div id="content">
                            <!-- Begin Slider -->
                            <div id="slider">
                                <div class="slider-frame">&nbsp;</div>
                                <ul class="slider-items">
                                    <li><img src="css_c/images/sl1.jpg" alt="Slide 1" /></li>
                                    <li><img src="css_c/images/sl2.jpg" alt="Slide 1" /></li>
                                    <li><img src="css_c/images/sl3.jpg" alt="Slide 1" /></li>
                                    <li><img src="css_c/images/sl4.jpg" alt="Slide 1" /></li>
                                   
                                </ul>
                                <div class="cl">&nbsp;</div>
                                <div class="slider-controls">
                                    <ul></ul>
                                    <div class="cl">&nbsp;</div>
                                </div>
                            </div>
                            <!-- End Slider -->
                            <!-- Begin Post -->
                           
                            <!-- End Post -->
                            <!-- Begin Products -->
                           
                            
                            
                             

  <form action="http://localhost:8080/gostreet_/cus_profile_update" method="post">
                        <div  style="margin-top: 30px; height: 400px; width: 500px; margin: 0 auto; border:solid 2px black; border-color: black; ">

                                <table cellspacing="15px" style="margin:0 auto; margin-top: 30px; " >
                                    <tr>
                                        <td>
                                            Enter Name:
                                        </td>
                                        <td> <input type="text" name="txtnamec" value='<%=rs.getString("name")%>'></input></td>
                                    </tr>
                                    <tr>
                                        <td>
                                            Enter Email:
                                        </td>
                                        <td> <input type="text" name="txtemailc" disabled="true" value='<%=rs.getString("email")%>'></input></td> 
                                    </tr>
                                     <tr>
                                        <td>
                                            Enter City:
                                        </td>
                                        <td><input type="text" name="txtc" disabled="true" value='<%=rs.getString("city")%>'></input></td>
                                        <td> <select name="txtindorec" >
                                                <option SELECTED VALUE="indore" >indore </option>
                                               
                                            </select></td>
                                    </tr>
                                   
                                    <tr>
                                        <td>
                                            Enter State:
                                        </td>
                                        <td><input type="text" name="txtstate" disabled="true" value='<%=rs.getString("state")%>'></input></td>
                                        <td> <select name="txtmpc">
                                                <option SELECTED VALUE="Madhya pradesh (m.p)" >Madhya Pradesh (M.P.) </option>
                                               
                                            </select></td>
                                    </tr>
                                     <tr>
                                        <td>
                                            Enter Pincode:
                                        </td>
                                        <td><input type="text" name="txtpinc"  value='<%=rs.getString("pin")%>'> </input> </td>
                                    </tr>
                                    
                                   
                                   
                                   
                                    <tr>
                                        <td>
                                            Enter Phone Number:
                                        </td>
                                        <td><input type="text" name="txtpnoc"  value='<%=rs.getString("pno")%>'> <td> 
                                    </tr> 
                                    <tr>
                                        <td>
                                            Enter Address:
                                        </td>
                                        <td>
                                            <textarea name="txtaddrc"  value='<%=rs.getString("address")%>'></textarea>
                                        </td>

                                    </tr>
                                    
                                   
                                    
                                    <tr>
                                        <td>

                                        </td>
                                        <td>
                                            <input type="submit" value="UPDATE"></input>
                                        </td>
                                    </tr>
                                </table>
                        </div>
                    </form>

                            
                            
                            
                            <!-- End Products -->
                        </div>
                        <!-- End Content -->
                        <div class="cl">&nbsp;</div>
                        <!-- Begin Products Slider -->
                        <div id="pr-slider">
                            <ul>
                               <li><a href="mpsl1.jsp"><img height="128" width="146" src="css_c/images/mpsl1.jpg" alt="" /></a></li>
                            <li><a href="mpsl2.jsp"><img height="128" width="146" src="css_c/images/mpsl2.jpg" alt="" /></a></li>
                            <li><a href="mpsl3.jsp"><img height="128" width="146" src="css_c/images/mpsl3.jpg" alt="" /></a></li>
                            <li><a href="mpsl4.jsp"><img height="128" width="146" src="css_c/images/mpsl4.jpg" alt="" /></a></li>
                            <li><a href="mpsl5.jsp"><img height="128" width="146" src="css_c/images/mpsl5.jpg" alt="" /></a></li>
                            
          
                            <li><a href="mpsl7.jsp"><img height="128" width="146" src="css_c/images/mpsl7.png" alt="" /></a></li>
                           <li><a href="mpsl1.jsp"><img height="128" width="146" src="css_c/images/mpsl1.jpg" alt="" /></a></li>
                            <li><a href="mpsl2.jsp"><img height="128" width="146" src="css_c/images/mpsl2.jpg" alt="" /></a></li>
                            <li><a href="mpsl3.jsp"><img height="128" width="146" src="css_c/images/mpsl3.jpg" alt="" /></a></li>
                            <li><a href="mpsl4.jsp"><img height="128" width="146" src="css_c/images/mpsl4.jpg" alt="" /></a></li>
                            <li><a href="mpsl5.jsp"><img height="128" width="146" src="css_c/images/mpsl5.jpg" alt="" /></a></li>
                            
          
                            <li><a href="mpsl7.jsp"><img height="128" width="146" src="css_c/images/mpsl7.png" alt="" /></a></li>
                            
                            </ul>
                            <div class="cl">&nbsp;</div>
                        </div>
                        <!-- End Products Slider -->
                        <!-- Begin Home Boxes -->
                        <div id="home-boxes">
                            <!-- Begin Box -->
                           
                            <!-- End Box -->
                            <!-- Begin Box -->
                           
                            <!-- End Box -->
                            <!-- Begin Box -->
                            
                            <!-- End Box -->
                            <!-- Begin Box -->
                           
                            <!-- End Box -->
                            <div class="cl">&nbsp;</div>
                        </div>
                        <!-- End Home Boxes -->
                    </div>
                    <!-- End Main -->
                    <!-- Begin Footer -->
                    <div id="footer">
                        <p class="bottom-menu"><a href="index.jsp">Home</a><span>|</span><a href="about_us.jsp">about us</a><span>|</span><a href=registration.jsp">registration</a><span>|</span><a href="user_log_f.jsp">user login</a><span>|</span><a href="contact_us.jsp">contact us</a></p>
                        <p>&copy; 2015 gostreet.in Design by sanil bagzai, shivam soni, rivani patware, ruchi agrawal</p>
                        <div class="cl">&nbsp;</div>
                    </div>
                    <!-- End Footer -->
                </div>
                <!-- End Shell -->
            </div>
            <!-- End Inner -->
        </div>
        <!-- End Wrapper -->
    </body>
</html>


