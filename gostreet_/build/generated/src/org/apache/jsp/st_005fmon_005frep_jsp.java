package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class st_005fmon_005frep_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>STORE</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<link href=\"style_u.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"menu.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<!--[if lt IE 7]>\n");
      out.write("<style type=\"text/css\" media=\"screen\">\n");
      out.write("#menuh{float:none;}\n");
      out.write("body{behavior:url(csshover.htc); font-size:75%;}\n");
      out.write("#menuh ul li{float:left; width: 100%;}\n");
      out.write("#menuh a{height:1%;font:normal 1em/1.6em  helvetica,  \"Trebuchet MS\", arial, sans-serif;}\n");
      out.write("</style>\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"top\">\n");
      out.write("    <h2><a href=\"index.jsp\">homepage</a> | <a href=\"contact_us.jsp\">contact</a></h2>\n");
      out.write("</div>\n");
      out.write("<div id=\"banner\">\n");
      out.write("  <h1> Your Company Name</h1>\n");
      out.write("</div>\n");
      out.write("<div id=\"menuh-container\">\n");
      out.write("  <div id=\"menuh\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"index.jsp\" class=\"top_parent\">Homepage</a> </li>\n");
      out.write("    </ul>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"about_us.jsp\" class=\"top_parent\">About us</a>\n");
      out.write("        \n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("   \n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"registration.jsp\" class=\"top_parent\">Registration</a> </li>\n");
      out.write("    </ul>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"user_log_f.jsp\" class=\"top_parent\">User Login</a> </li>\n");
      out.write("    </ul>\n");
      out.write("       <ul>\n");
      out.write("           <li><a href=\"contact_us.jsp\" class=\"top_parent\">Contact Us</a> </li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"container\">\n");
      out.write("  <div id=\"sidebar\">\n");
      out.write("    <h3>Services</h3>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"user_acc.jsp\">User Account</a></li>\n");
      out.write("        <li><a href=\"st_profile.jsp\">Show my Profile</a></li>\n");
      out.write("        <li><a href=\"st_change_pass.jsp\">Change Password</a></li>\n");
      out.write("        <li><a href=\"st_upd_profie.jsp\">Update Profile</a></li>\n");
      out.write("        <li><a href=\"st_add_item.jsp\">Add Item</a></li>\n");
      out.write("        <li><a href=\"st_del_item.jsp\">Delete Item</a></li>\n");
      out.write("        <li><a href=\"st_offers.jsp\">give offers</a></li>\n");
      out.write("      <li><a href=\"#\">Logout</a></li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("    <h3>Reports</h3>\n");
      out.write("    <ul>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("        <li><a href=\"st_mon_rep.jsp\" class=\"selected\">Monthly Report</a></li>\n");
      out.write("   \n");
      out.write("    </ul>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write(" <div id=\"content\">\n");
      out.write("        \n");
      out.write("      generate report\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">  Gostreet.in &copy; | Design by Sanil Bagzai, Shivam Soni, Rivani Patware, Ruchi Agrawal </div>\n");
      out.write("</body>\n");
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
