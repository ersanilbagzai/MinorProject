package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class cus_005fhome_005fneed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("     \n");
      out.write("\t<link rel=\"shortcut icon\" href=\"css/images/favicon.ico\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css_c/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("\t<script src=\"js_c/jquery-1.6.2.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("\t<!--[if IE 6]>\n");
      out.write("\t\t<script src=\"js/DD_belatedPNG-min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\t<script src=\"js_c/jquery.jcarousel.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("\t<script src=\"js_c/functions.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

     String email =(String)session.getAttribute("uclog");
                                      Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/godb","root","root");
          
          Statement st = con.createStatement();
         ResultSet rs= st.executeQuery("select * from regcustomer where email='"+email+"'");
          if(rs.next()){
              
      out.write("\n");
      out.write("       \n");
      out.write("     \n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <!-- Begin Inner -->\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <!-- Begin Header -->\n");
      out.write("                <div id=\"header\">\n");
      out.write("                    <div class=\"header-inner\">\n");
      out.write("                        <!-- Begin Shell -->\n");
      out.write("                        <div class=\"shell\">\n");
      out.write("                            <h1 id=\"logo\"><a class=\"notext\" href=\"#\">World of TShirts</a></h1>\n");
      out.write("                                                     <!-- Begin Navigation -->\n");
      out.write("                            \n");
      out.write("                                  <div id=\"navigation\">  <ul>\n");
      out.write("                                    <li><a href=\"index.jsp\" title=\"Home Page\"><span>Home</span></a></li>\n");
      out.write("                                    <li><a href=\"about_us.jsp\" title=\"About us\"><span>About us</span></a></li>\n");
      out.write("                                    <li><a href=\"registration.jsp\" title=\"Registration\"><span>Registration</span></a></li>\n");
      out.write("                                    <li><a href=\"user_log_f.jsp\" title=\"User Login\"><span>User Login</span></a></li>\n");
      out.write("                                    <li><a href=\"contact_us.jsp\" title=\"Contact Us\"><span>Contact us</span></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                \n");
      out.write("                                <ul><li> <a> <div style=\"float:left; margin-right:100px;\"><span>");
      out.print(session.getAttribute("uclog"));
      out.write("</span> </div></a></li></ul> ");
 }  
      out.write("\n");
      out.write("                              \n");
      out.write("                                <div class=\"cl\">&nbsp;</div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Navigation -->\n");
      out.write("                            <div class=\"cl\">&nbsp;</div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Shell -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- End Header -->\n");
      out.write("                <!-- Begin Shell -->\n");
      out.write("                <div class=\"shell\">\n");
      out.write("                    <!-- Begin Main -->\n");
      out.write("                    <div id=\"main\">\n");
      out.write("                        <!-- Begin Sidebar -->\n");
      out.write("                        <div id=\"sidebar\">\n");
      out.write("                            <ul>\n");
      out.write("                                <!-- Begin Widget -->\n");
      out.write("                                <li class=\"widget\">\n");
      out.write("                                    <h2>Categories</h2>\n");
      out.write("                                    <ul>\n");
      out.write("\n");
      out.write("                                       \n");
      out.write("                                        <li><a href=\"cus_outfit.jsp\">Outfit's</a></li>\n");
      out.write("                                        <li><a href=\"cus_home_need.jsp\">Home Needs</a></li>\n");
      out.write("                                        <li><a href=\"cus_accesories.jsp\">Accesories</a></li>\n");
      out.write("                                        <li><a href=\"cus_electronics.jsp\">Electronics</a></li>\n");
      out.write("\n");
      out.write("                                        <li class=\"last\"><a href=\"cus_book_mag.jsp\">Books And Magzines</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"widget\">\n");
      out.write("                                    <h2>Services</h2>\n");
      out.write("                                    <ul>\n");
      out.write("\n");
      out.write("                                       <li><a href=\"cus_acc.jsp\">User Account</a></li>\n");
      out.write("                                        <li><a href=\"cus_sh_mu_profile.jsp\">Show my Profile</a></li>\n");
      out.write("                                        <li><a href=\"cus_change_pass.jsp\">Change Password</a></li>\n");
      out.write("                                        <li><a href=\"cus_update_profile.jsp\">Update Profile</a></li>\n");
      out.write("                                        <li><a href=\"cus_place_order.jsp\">Place Order</a></li>\n");
      out.write("                                        \n");
      out.write("                                        <li class=\"last\"><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <!-- End Widget -->\n");
      out.write("                                <!-- Begin Widget -->\n");
      out.write("                                <li class=\"widget\">\n");
      out.write("                                    <h2>Search</h2>\n");
      out.write("                                    <div id=\"search\">\n");
      out.write("                                        <form action=\"#\" method=\"get\" accept-charset=\"utf-8\">\n");
      out.write("                                            <label>Keyword</label>\n");
      out.write("                                            <input type=\"text\" class=\"blink\" name=\"keyword\" />\n");
      out.write("                                            <label>Category</label>\n");
      out.write("                                            <select size=\"1\" name=\"category\">\n");
      out.write("                                                <option value=\"default\">-- Select Category --</option>\n");
      out.write("                                                <option value=\"category1\">Outfit's</option>\n");
      out.write("                                                <option value=\"category2\">home needs</option>\n");
      out.write("                                                <option value=\"category3\">accessories</option>\n");
      out.write("                                                <option value=\"category4\">electronics</option>\n");
      out.write("                                                <option value=\"category5\">books and magzines</option>\n");
      out.write("                                                \n");
      out.write("                                            </select>\n");
      out.write("                                            <div class=\"price\">\n");
      out.write("                                                <label>Price</label>\n");
      out.write("                                                <select size=\"1\" name=\"price\">\n");
      out.write("                                                    <option value=\"10\">10/-</option>\n");
      out.write("                                                    <option value=\"20\">20/-</option>\n");
      out.write("                                                    <option value=\"30\">30/-</option>\n");
      out.write("                                                    <option value=\"40\">40/-</option>\n");
      out.write("                                                    <option value=\"50\">50/-</option>\n");
      out.write("                                                    <option value=\"60\">60/-</option>\n");
      out.write("                                                    <option value=\"70\">70/-</option>\n");
      out.write("                                                    <option value=\"80\">80/-</option>\n");
      out.write("                                                    <option value=\"90\">90/-</option>\n");
      out.write("                                                    <option value=\"100\">100/-</option>\n");
      out.write("                                                </select>\n");
      out.write("                                                <label>to:</label>\n");
      out.write("                                                <select size=\"1\" name=\"to\">\n");
      out.write("                                                    <option value=\"50\">50/-</option>\n");
      out.write("                                                    <option value=\"60\">60/-</option>\n");
      out.write("                                                    <option value=\"70\">70/-</option>\n");
      out.write("                                                    <option value=\"80\">80/-</option>\n");
      out.write("                                                    <option value=\"90\">90/-</option>\n");
      out.write("                                                    <option value=\"100\">100/-</option>\n");
      out.write("                                                    <option value=\"200\">200/-</option>\n");
      out.write("                                                    <option value=\"300\">300/-</option>\n");
      out.write("                                                    <option value=\"400\">400/-</option>\n");
      out.write("                                                    <option value=\"500\">500/-</option>\n");
      out.write("                                                </select>\n");
      out.write("                                                <div class=\"cl\">&nbsp;</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <span class=\"button\"><input type=\"submit\" value=\"Search\" /></span>\n");
      out.write("                                            <div class=\"cl\">&nbsp;</div>\n");
      out.write("                                        </form>\n");
      out.write("                                       \n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- End Widget -->\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Sidebar -->\n");
      out.write("                        <!-- Begin Content -->\n");
      out.write("                        <div id=\"content\">\n");
      out.write("                            <!-- Begin Slider -->\n");
      out.write("                            <div id=\"slider\">\n");
      out.write("                                <div class=\"slider-frame\">&nbsp;</div>\n");
      out.write("                                <ul class=\"slider-items\">\n");
      out.write("                                    <li><img src=\"css_c/images/sl1.jpg\" alt=\"Slide 1\" /></li>\n");
      out.write("                                    <li><img src=\"css_c/images/sl2.jpg\" alt=\"Slide 1\" /></li>\n");
      out.write("                                    <li><img src=\"css_c/images/sl3.jpg\" alt=\"Slide 1\" /></li>\n");
      out.write("                                    <li><img src=\"css_c/images/sl4.jpg\" alt=\"Slide 1\" /></li>\n");
      out.write("                                   \n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"cl\">&nbsp;</div>\n");
      out.write("                                <div class=\"slider-controls\">\n");
      out.write("                                    <ul></ul>\n");
      out.write("                                    <div class=\"cl\">&nbsp;</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Slider -->\n");
      out.write("                            <!-- Begin Post -->\n");
      out.write("                           \n");
      out.write("                            <!-- End Post -->\n");
      out.write("                            <!-- Begin Products -->\n");
      out.write("                            ");
   Statement st1 = con.createStatement();
         ResultSet rs1= st1.executeQuery("select * from stproducts where ptype='home needs'");
                           while(rs1.next())
       {     
      out.write("\n");
      out.write("                            <div id=\"products\">\n");
      out.write("                                <div class=\"product\">\n");
      out.write("                                    <img height=\"234\" width=\"238\" src=\"");
      out.print(rs1.getString("pimgb"));
      out.write("\" alt=\"\" />\n");
      out.write("                                    <div class=\"pr-info\">\n");
      out.write("                                        <h4>");
      out.print(rs1.getString("pname"));
      out.write("</h4>\n");
      out.write("                                        <p>");
      out.print(rs1.getString("pdes"));
      out.write(" </p>\n");
      out.write("                                        <span class=\"pr-price\"><span>");
      out.print(rs1.getString("pprice"));
      out.write("</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div> ");
if(rs1.next()){
      out.write("\n");
      out.write("                                <div class=\"product\">\n");
      out.write("                                    <img height=\"234\" width=\"238\" src=\"");
      out.print(rs1.getString("pimgb"));
      out.write("\n");
      out.write("                                        <h4>");
      out.print(rs1.getString("pname"));
      out.write("</h4>\n");
      out.write("                                        <p>");
      out.print(rs1.getString("pdes"));
      out.write(" </p>\n");
      out.write("                                        <span class=\"pr-price\"><span>");
      out.print(rs1.getString("pprice"));
      out.write("</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div> ");
 } 
      out.write("\n");
      out.write("                                ");
if(rs1.next()){
      out.write("\n");
      out.write("                                <div class=\"product last\">\n");
      out.write("                                    <img height=\"234\" width=\"238\" src=\"");
      out.print(rs1.getString("pimgb"));
      out.write("\" alt=\"\" />\n");
      out.write("                                    <div class=\"pr-info\">\n");
      out.write("                                        <h4>");
      out.print(rs1.getString("pname"));
      out.write("</h4>\n");
      out.write("                                        <p>");
      out.print(rs1.getString("pdes"));
      out.write("t</p>\n");
      out.write("                                        <span class=\"pr-price\"><span>");
      out.print(rs1.getString("pprice"));
      out.write("</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>");
 } 
      out.write("\n");
      out.write("                                <div class=\"cl\">&nbsp;</div>\n");
      out.write("                            </div>");
 } 
      out.write("\n");
      out.write("                            <!-- End Products -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Content -->\n");
      out.write("                        <div class=\"cl\">&nbsp;</div>\n");
      out.write("                        <!-- Begin Products Slider -->\n");
      out.write("                        <div id=\"pr-slider\">\n");
      out.write("                            <ul>\n");
      out.write("                               <li><a href=\"mpsl1.jsp\"><img height=\"128\" width=\"146\" src=\"css_c/images/mpsl1.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"mpsl2.jsp\"><img height=\"128\" width=\"146\" src=\"css_c/images/mpsl2.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"mpsl3.jsp\"><img height=\"128\" width=\"146\" src=\"css_c/images/mpsl3.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"mpsl4.jsp\"><img height=\"128\" width=\"146\" src=\"css_c/images/mpsl4.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"mpsl5.jsp\"><img height=\"128\" width=\"146\" src=\"css_c/images/mpsl5.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            \n");
      out.write("          \n");
      out.write("                            <li><a href=\"mpsl7.jsp\"><img height=\"128\" width=\"146\" src=\"css_c/images/mpsl7.png\" alt=\"\" /></a></li>\n");
      out.write("                           <li><a href=\"mpsl1.jsp\"><img height=\"128\" width=\"146\" src=\"css_c/images/mpsl1.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"mpsl2.jsp\"><img height=\"128\" width=\"146\" src=\"css_c/images/mpsl2.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"mpsl3.jsp\"><img height=\"128\" width=\"146\" src=\"css_c/images/mpsl3.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"mpsl4.jsp\"><img height=\"128\" width=\"146\" src=\"css_c/images/mpsl4.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            <li><a href=\"mpsl5.jsp\"><img height=\"128\" width=\"146\" src=\"css_c/images/mpsl5.jpg\" alt=\"\" /></a></li>\n");
      out.write("                            \n");
      out.write("          \n");
      out.write("                            <li><a href=\"mpsl7.jsp\"><img height=\"128\" width=\"146\" src=\"css_c/images/mpsl7.png\" alt=\"\" /></a></li>\n");
      out.write("                            \n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"cl\">&nbsp;</div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Products Slider -->\n");
      out.write("                        <!-- Begin Home Boxes -->\n");
      out.write("                        <div id=\"home-boxes\">\n");
      out.write("                            <!-- Begin Box -->\n");
      out.write("                           \n");
      out.write("                            <!-- End Box -->\n");
      out.write("                            <!-- Begin Box -->\n");
      out.write("                           \n");
      out.write("                            <!-- End Box -->\n");
      out.write("                            <!-- Begin Box -->\n");
      out.write("                            \n");
      out.write("                            <!-- End Box -->\n");
      out.write("                            <!-- Begin Box -->\n");
      out.write("                           \n");
      out.write("                            <!-- End Box -->\n");
      out.write("                            <div class=\"cl\">&nbsp;</div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Home Boxes -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Main -->\n");
      out.write("                    <!-- Begin Footer -->\n");
      out.write("                    <div id=\"footer\">\n");
      out.write("                        <p class=\"bottom-menu\"><a href=\"index.jsp\">Home</a><span>|</span><a href=\"about_us.jsp\">about us</a><span>|</span><a href=registration.jsp\">registration</a><span>|</span><a href=\"user_log_f.jsp\">user login</a><span>|</span><a href=\"contact_us.jsp\">contact us</a></p>\n");
      out.write("                        <p>&copy; 2015 gostreet.in Design by sanil bagzai, shivam soni, rivani patware, ruchi agrawal</p>\n");
      out.write("                        <div class=\"cl\">&nbsp;</div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Footer -->\n");
      out.write("                </div>\n");
      out.write("                <!-- End Shell -->\n");
      out.write("            </div>\n");
      out.write("            <!-- End Inner -->\n");
      out.write("        </div>\n");
      out.write("        <!-- End Wrapper -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
