<%-- 
    Document   : accesories
    Created on : Apr 10, 2015, 8:46:01 PM
    Author     : sachinsir
--%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
        <link rel="stylesheet" href="css/original.css" type="text/css" media="all" />
        <!--[if lte IE 6]><link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" /><![endif]-->
        <script src="js/jquery-1.4.1.min.js" type="text/javascript"></script>
        <script src="js/jquery.jcarousel.pack.js" type="text/javascript"></script>
        <script src="js/jquery-func.js" type="text/javascript"></script>
    </head>
    <body>
        <!-- Shell -->
        <div class="shell">
            <!-- Header -->
            <div id="header">
                <h1 id="logo"><a href="#">GoStreet.in</a></h1>
                <!-- Cart -->
                <!-- End Cart -->
                <!-- Navigation -->
                <div id="navigation">
                    <ul>
                        <li><a href="index.jsp" class="active">Home</a></li>
                        <li><a href="about_us.jsp">About Us</a></li>
                        <li><a href="registration.jsp">Registration</a></li>
                        <li><a href="user_log_f.jsp">User Login</a></li>
                        <li><a href="admin_login.jsp">Admin Login</a></li>
                        <li><a href="contact_us.jsp">Contact us</a></li>
                    </ul>
                </div>
                <!-- End Navigation -->
            </div>
            <!-- End Header -->
            <!-- Main -->
            <div id="main">
                <div class="cl">&nbsp;</div>
                <!-- Content -->
                <div id="content">
                    <!-- Content Slider -->
                    <div id="slider" class="box">
                        <div id="slider-holder">
                            <ul>
                                <li><a href="sl2.jsp"><img src="css/images/sl1.jpg" alt="" /></a></li>
                                <li><a href="sl2.jsp"><img src="css/images/sl2.jpg" alt="" /></a></li>
                                <li><a href="sl3.jsp"><img src="css/images/sl3.jpg" alt="" /></a></li>
                                <li><a href="sl4.jsp"><img src="css/images/sl4.jpg" alt="" /></a></li>
                            </ul>
                        </div>
                        <div id="slider-nav"> <a href="#" class="active">1</a> <a href="#">2</a> <a href="#">3</a> <a href="#">4</a> </div>
                    </div>
                    <!-- End Content Slider -->
                    <!-- Products -->
                    <div class="products">
                        <div class="cl">&nbsp;</div>
                        <ul>
                            <li> <a href="mp1.jsp"><img height="383" width="231" src="css/images/a1.jpg" alt="" /></a>
                                <div class="product-info">
                                    <h3>TITAN</h3>
                                    <div class="product-desc">
                                        <p> <b><h4>COUPLE WATCH</h4></b></p>


                                        <strong class="price">4000/- </strong> </div>
                                </div>
                            </li>
                            <li> <a href="mp2.jsp"><img height="383" width="231" src="css/images/a2.jpg" alt="" /></a>
                                <div class="product-info">
                                    <h3>LEVIS</h3>
                                    <div class="product-desc">
                                        <p><b><h4>LEATHER BELT</h4></b></p>


                                        <strong class="price">3800/-</strong> </div>
                                </div>
                            </li>
                            <li class="last"> <a href="mp3.jsp"><img height="383" width="231" src="css/images/a3.jpg" alt="" /></a>
                                <div class="product-info">
                                    <h3>TANISHQ</h3>
                                    <div class="product-desc">
                                        <p><h4>JWELLERY SET</h4></p>

                                        <strong class="price">9999/-</strong> </div>
                                </div>
                            </li>
                        </ul>
                        <div class="cl">&nbsp;</div>
                    </div>
                    <!-- End Products -->
                </div>
                <!-- End Content -->
                <!-- Sidebar -->
                <div id="sidebar">
                    <!-- Search -->
                    <div class="box search">
                        <h2>Search by <span></span></h2>
                        <div class="box-content">
                            <form action="#" method="post">
                                <label>Keyword</label>
                                <input type="text" class="field" />
                                <label>Category</label>
                                <select class="field">
                                    <option value="">-- Select Category --</option>
                                </select>
                                <div class="inline-field">
                                    <label>Price</label>
                                    <select class="field small-field">
                                        <option value="">10/-</option>
                                    </select>
                                    <label>to:</label>
                                    <select class="field small-field">
                                        <option value="">50/-</option>
                                    </select>
                                </div>
                                <input type="submit" class="search-submit" value="Search" />

                            </form>
                        </div>
                    </div>
                    <!-- End Search -->
                    <!-- Categories -->
                    <div class="box categories">
                        <h2>Categories <span></span></h2>
                        <div class="box-content">
                            <ul>
                                <li><a href="outfit.jsp">Outfit's</a></li>
                                <li><a href="home_need.jsp">Home Needs</a></li>
                                <li><a href="accesories.jsp">Accesories</a></li>
                                <li><a href="electronics.jsp">Electronics</a></li>

                                <li class="last"><a href="book_mag.jsp">Books And Magzines</a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- End Categories -->
                </div>
                <!-- End Sidebar -->
                <div class="cl">&nbsp;</div>
            </div>
            <!-- End Main -->
            <!-- Side Full -->
            <div class="side-full">
                <!-- More Products -->
                <div class="more-products">
                    <div class="more-products-holder">
                        <ul>
                            <li><a href="mpsl1.jsp"><img src="css/images/mpsl1.jpg" alt="" /></a></li>
                            <li><a href="mpsl2.jsp"><img src="css/images/mpsl2.jpg" alt="" /></a></li>
                            <li><a href="mpsl3.jsp"><img src="css/images/mpsl3.jpg" alt="" /></a></li>
                            <li><a href="mpsl4.jsp"><img src="css/images/mpsl4.jpg" alt="" /></a></li>
                            <li><a href="mpsl5.jsp"><img src="css/images/mpsl5.jpg" alt="" /></a></li>
                            <li><a href="mpsl6.jsp"><img src="css/images/mpsl6.jpg" alt="" /></a></li>
                            <li><a href="mpsl7.jsp"><img src="css/images/mpsl7.png" alt="" /></a></li>
                            <li><a href="mpsl8.jsp"><img src="css/images/mpsl8.jpg" alt="" /></a></li>
                            <li><a href="mpsl9.jsp"><img src="css/images/mpsl9.jpg" alt="" /></a></li>
                            <li><a href="mpsl10.jsp"><img src="css/images/mpsl10.jpg" alt="" /></a></li>
                            <li><a href="mpsl11.jsp"><img src="css/images/mpsl11.jpg" alt="" /></a></li>
                            <li><a href="mpsl12.jsp"><img src="css/images/mpsl12.jpg" alt="" /></a></li>
                            <li><a href="mpsl13.jsp"><img src="css/images/mpsl13.jpg" alt="" /></a></li>
                            <li><a href="mpsl14.jsp"><img src="css/images/mpsl14.jpg" alt="" /></a></li>
                            <li><a href="mpsl15.jsp"><img src="css/images/mpsl15.jpg" alt="" /></a></li>
                            <li><a href="mpsl16.jsp"><img src="css/images/mpsl16.jpg" alt="" /></a></li>
                            <li><a href="mpsl17.jsp"><img src="css/images/mpsl17.jpg" alt="" /></a></li>
                            <li><a href="mpsl18.jsp"><img src="css/images/mpsl18.jpg" alt="" /></a></li>
                            <li><a href="mpsl19.jsp"><img src="css/images/mpsl19.jpg" alt="" /></a></li>
                            <li><a href="mpsl20.jsp"><img src="css/images/mpsl20.jpg" alt="" /></a></li>

                        </ul>
                    </div>
                    <div class="more-nav"> <a href="#" class="prev">previous</a> <a href="#" class="next">next</a> </div>
                </div>
                <!-- End More Products -->
                <!-- Text Cols -->

                <!-- End Side Full -->
                <!-- Footer -->
                <div id="footer">


                    <p style="margin-left:230px;"> &copy;Gostreet.in Design by sanil bagzai, shivam soni, rivani patware, ruchi agrawal </p>
                </div>
                <!-- End Footer -->
            </div>
            <!-- End Shell -->
    </body>
</html>