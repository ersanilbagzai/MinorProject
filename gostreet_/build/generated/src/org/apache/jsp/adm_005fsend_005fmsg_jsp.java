package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adm_005fsend_005fmsg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <link href=\"css/default.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"logo-wrap\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <h1><a href=\"#\">ADMIN PANEL </a></h1>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- start header -->\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"current_page_item\"><a href=\"admin.jsp\">Homepage</a></li>\n");
      out.write("                    <li><a href=\"http://localhost:8080/gostreet_/adm_contact.jsp\">Contact/partners</a></li>\n");
      out.write("                   \n");
      out.write("                    <li class=\"last\"><a href=\"#\">logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end header -->\n");
      out.write("        <!-- start page -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <div id=\"wrapper-btm\">\n");
      out.write("                <div id=\"page\">\n");
      out.write("                    <!-- start content -->\n");
      out.write("                    <div id=\"content\">\n");
      out.write("                        <div id=\"banner\">&nbsp;</div>\n");
      out.write("                        <div class=\"post\">\n");
      out.write("                            <h1 class=\"title\">title </h1>\n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div>add content here</div>\n");
      out.write("                       \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end content -->\n");
      out.write("                    <!-- start sidebar -->\n");
      out.write("                    <div id=\"sidebar\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li id=\"search\">\n");
      out.write("                                <h2>Search</h2>\n");
      out.write("                                <form method=\"get\" action=\"\">\n");
      out.write("                                    <fieldset>\n");
      out.write("                                        <input type=\"text\" id=\"s\" name=\"s\" value=\"\" />\n");
      out.write("                                        <input type=\"submit\" id=\"x\" value=\"Search\" />\n");
      out.write("                                    </fieldset>\n");
      out.write("                                </form>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <h2>functionalities</h2>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"http://localhost:8080/gostreet_/adm_show_all_user.jsp\">show all users</a></li>\n");
      out.write("                                    <li><a href=\"http://localhost:8080/gostreet_/adm_delet_user.jsp\">delete users</a></li>\n");
      out.write("                                    <li><a href=\"http://localhost:8080/gostreet_/adm_send_msg.jsp\">send message to all</a></li>\n");
      out.write("                                   \n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end sidebar -->\n");
      out.write("                    <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end page -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- start footer -->\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <div id=\"footer-wrap\">\n");
      out.write("                <p id=\"legal\">(c) 2015 Design by sanil bagzai, shivam soni, rivani patware, ruchi </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end footer --></html>\n");
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
