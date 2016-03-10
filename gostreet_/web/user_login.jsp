<%-- 
    Document   : index
    Created on : Jun 30, 2015, 6:04:38 PM
    Author     : sachinsir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="description" content="website description" />
        <meta name="keywords" content="website keywords, website keywords" />
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" type="text/css" href="css_u/style.css" />
        <!-- modernizr enables HTML5 elements and feature detects -->
        <script type="text/javascript" src="js_u/modernizr-1.5.min.js"></script>
    </head>

    <body background-image="images_u/menu.png">
        <div id="main">
            <header>
                <div id="logo">
                    <!-- class="logo_colour", allows you to change the colour of the text -->
                    <h1><a href="index.jsp"><span class="logo_colour">Cpe Grace</span> Spa</a></h1>
                </div>
                <nav>
                    <ul class="sf-menu" id="nav">
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="u_about_us.jsp">about us</a></li>
                        <li><a href="u_user_login.jsp">register user</a></li>
                        <li><a href="u_admin_login.jsp">admin login</a></li>
                        <li><a href="u_contact us.jsp">contact us</a></li>
                       
                        
                    </ul>
                </nav>
            </header>
            <div id="site_content">
                <div id="sidebar_container">
                   
                    <div class="sidebar">
                        <h1>Special Offers</h1>
                        <h2>10% Discount</h2>
                        <p>For the month of December 2015, we are offering a 10% discount for all new visitors.</p>
                    </div>
                    <div class="sidebar">
                        <h1>Contact Us</h1>
                        <p>We'd love to hear from you. Call us on-9757350345,email us on-pratiksha@gmail.com</p>
                    </div>
                </div>
                <div id="content">
                    <ul class="slideshow">
                        <li class="show"><img width="706" height="316" src="images_u/1.jpg" alt="image one" /></li>
                        <li><img width="706" height="316" src="images_u/2.jpg" alt="image two" /></li>
                        <li><img width="706" height="316" src="images_u/3.jpg" alt="image three" /></li>
                        <li><img width="706" height="316" src="images_u/4.jpg" alt="image four" /></li>
                        <li><img width="706" height="316" src="images_u/5.jpg" alt="image five" /></li>
                    </ul>
                    <div id="content_item">
                        <h1>Welcome</h1>
                        <p>para 1</p>
                        <p>para 2</p>
                    </div>
                </div>
            </div>
            <footer>
                <p><a href="index.jsp">Home</a> | <a href="u_about_us.jsp">about us</a> | <a href="u_user_login.jsp">user login</a> | <a href="u_admin_login.jsp">Admin login</a> | <a href="u_contact us.jsp">Contact Us</a></p>
                <p>Copyright &copy; pratiksha bansod, hridaya singh, mahima zamindar</p>
            </footer>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
        </div>
        <!-- javascript at the bottom for fast page loading -->
        <script type="text/javascript" src="js_u/jquery.js"></script>
        <script type="text/javascript" src="js_u/jquery.easing-sooper.js"></script>
        <script type="text/javascript" src="js_u/jquery.sooperfish.js"></script>
        <script type="text/javascript" src="js_u/image_fade.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('ul.sf-menu').sooperfish();
            });
        </script>
    </body>
</html>