package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class def_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!--[if lte IE 6]><link rel=\"stylesheet\" href=\"css/ie6.css\" type=\"text/css\" media=\"all\" /><![endif]-->\n");
      out.write("        <script src=\"js/jquery-1.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.jcarousel.pack.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-func.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("     </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Shell -->\n");
      out.write("        <div class=\"shell\">\n");
      out.write("            <!-- Header -->\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <h1 id=\"logo\"><a href=\"#\">GoStreet.in</a></h1>\n");
      out.write("                <!-- Cart -->\n");
      out.write("                <!-- End Cart -->\n");
      out.write("                <!-- Navigation -->\n");
      out.write("                <div id=\"navigation\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"http://localhost:8080/gostreet_/index.jsp\" class=\"active\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">About Us</a></li>\n");
      out.write("                        <li><a href=\"http://localhost:8080/gostreet_/registration.jsp\">Registration</a></li>\n");
      out.write("                        <li><a href=\"#\">User Login</a></li>\n");
      out.write("                        <li><a href=\"#\">Admin Login</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- End Navigation -->\n");
      out.write("            </div>\n");
      out.write("            <!-- End Header -->\n");
      out.write("            <!-- Main -->\n");
      out.write("            <div id=\"main\">\n");
      out.write("                <div class=\"cl\">&nbsp;</div>\n");
      out.write("                <!-- Content -->\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    <!-- Content Slider -->\n");
      out.write("                    <div id=\"slider\" class=\"box\">\n");
      out.write("                        <div id=\"slider-holder\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"><img src=\"css/images/slide1.jpg\" alt=\"\" /></a></li>\n");
      out.write("                                <li><a href=\"#\"><img src=\"css/images/slide1.jpg\" alt=\"\" /></a></li>\n");
      out.write("                                <li><a href=\"#\"><img src=\"css/images/slide1.jpg\" alt=\"\" /></a></li>\n");
      out.write("                                <li><a href=\"#\"><img src=\"css/images/slide1.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"slider-nav\"> <a href=\"#\" class=\"active\">1</a> <a href=\"#\">2</a> <a href=\"#\">3</a> <a href=\"#\">4</a> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Content Slider -->\n");
      out.write("                    <!-- Products -->\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <table cellspacing=\"20px\" style=\"margin:0 auto; margin-top: 200px;\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"button\" name=\"\" value=\"CUSTOMER'S LOGIN\"></td>\n");
      out.write("                            <td><input type=\"button\" name=\"b2\" value=\"STORE LOGIN\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>     \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <!-- End Products -->\n");
      out.write("                </div>\n");
      out.write("                <!-- End Content -->\n");
      out.write("                <!-- Sidebar -->\n");
      out.write("                <div id=\"sidebar\">\n");
      out.write("                    <!-- Search -->\n");
      out.write("                    <div class=\"box search\">\n");
      out.write("                        <h2>Search by <span></span></h2>\n");
      out.write("                        <div class=\"box-content\">\n");
      out.write("                            <form action=\"#\" method=\"post\">\n");
      out.write("                                <label>Keyword</label>\n");
      out.write("                                <input type=\"text\" class=\"field\" />\n");
      out.write("                                <label>Category</label>\n");
      out.write("                                <select class=\"field\">\n");
      out.write("                                    <option value=\"\">-- Select Category --</option>\n");
      out.write("                                </select>\n");
      out.write("                                <div class=\"inline-field\">\n");
      out.write("                                    <label>Price</label>\n");
      out.write("                                    <select class=\"field small-field\">\n");
      out.write("                                        <option value=\"\">$10</option>\n");
      out.write("                                    </select>\n");
      out.write("                                    <label>to:</label>\n");
      out.write("                                    <select class=\"field small-field\">\n");
      out.write("                                        <option value=\"\">$50</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"submit\" class=\"search-submit\" value=\"Search\" />\n");
      out.write("                                \n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Search -->\n");
      out.write("                    <!-- Categories -->\n");
      out.write("                    <div class=\"box categories\">\n");
      out.write("                        <h2>Categories <span></span></h2>\n");
      out.write("                        <div class=\"box-content\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Cloths</a></li>\n");
      out.write("                                <li><a href=\"#\">Gifts</a></li>\n");
      out.write("                                <li><a href=\"#\">Jewelery</a></li>\n");
      out.write("                                <li><a href=\"#\">Electronics</a></li>\n");
      out.write("                            \n");
      out.write("                                <li class=\"last\"><a href=\"#\">Books</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Categories -->\n");
      out.write("                </div>\n");
      out.write("                <!-- End Sidebar -->\n");
      out.write("                <div class=\"cl\">&nbsp;</div>\n");
      out.write("            </div>\n");
      out.write("            <!-- End Main -->\n");
      out.write("            <!-- Side Full -->\n");
      out.write("            <div class=\"side-full\">\n");
      out.write("                <!-- More Products -->\n");
      out.write("                <div class=\"more-products\">\n");
      out.write("                    <div class=\"more-products-holder\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small1.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small2.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small3.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small4.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small5.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small6.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small7.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small1.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small2.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small3.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small4.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small5.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small6.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small7.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small1.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small2.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small3.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small4.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small5.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"css/images/small6.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li class=\"last\"><a href=\"#\"><img src=\"css/images/small7.jpg\" alt=\"\" /></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"more-nav\"> <a href=\"#\" class=\"prev\">previous</a> <a href=\"#\" class=\"next\">next</a> </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- End More Products -->\n");
      out.write("                <!-- Text Cols -->\n");
      out.write("               \n");
      out.write("            <!-- End Side Full -->\n");
      out.write("            <!-- Footer -->\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 <p style=\"margin-left:350px;\"> &copy;Gostreet.in Design by <a href=\"\">Zaison Tech</a> </p>\n");
      out.write("            </div>\n");
      out.write("            <!-- End Footer -->\n");
      out.write("        </div>\n");
      out.write("        <!-- End Shell -->\n");
      out.write("        </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
