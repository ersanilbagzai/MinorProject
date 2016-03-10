package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mp2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/original.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=orig>\n");
      out.write("            <div>\n");
      out.write("                <img src=\"css/images/mp2.jpg\"></img>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=origin>\n");
      out.write("                <table>\n");
      out.write("                    <tr><td>Specification -\n");
      out.write("                           <pre>\n");
      out.write("Product Name - LG G3 \n");
      out.write("Color - Royal Gold\n");
      out.write("network - \n");
      out.write("          Dual Sim\n");
      out.write("          2G/3G/4G (quad band)\n");
      out.write("          LTE(50mbps/10mbps)\n");
      out.write("          HSPA+(30mbps/3mbps)\n");
      out.write("screen - \n");
      out.write("         HD IPS display 5 inch(1080*1920)\n");
      out.write("         ppi(420 pixel/inches)\n");
      out.write("Processor - \n");
      out.write("         CPU - 2.3 GHz Qualcomm SnapDragon\n");
      out.write("         GPU - Adreno(TM) 405 @ 550 MHz\n");
      out.write("Memory - \n");
      out.write("         RAM - 2GB DDR3 \n");
      out.write("         ROM - 16GB (12.8GB for user)\n");
      out.write("Battery - 2700 mAh\n");
      out.write("                            </pre></td></tr>\n");
      out.write("                    <tr><td>\n");
      out.write("                            <form action=\"https://www.paypal.com/cgi-bin/webscr\" method=\"post\" target=\"_top\">\n");
      out.write("                                <input type=\"hidden\" name=\"cmd\" value=\"_s-xclick\">\n");
      out.write("                                <input type=\"hidden\" name=\"hosted_button_id\" value=\"BNHDPJ23H3PFE\">\n");
      out.write("                                <input type=\"image\" src=\"css/images/buy_now.png\" border=\"0\" name=\"submit\">\n");
      out.write("                                <img alt=\"\" border=\"0\" src=\"https://www.paypal.com/en_US/i/scr/pixel.gif\" height=\"20px\" width=\"50px\">\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> \n");
      out.write("                            <form action=\"https://www.paypal.com/cgi-bin/webscr\" method=\"post\" target=\"paypal\">\n");
      out.write("                                <input type=\"hidden\" name=\"cmd\" value=\"_s-xclick\">\n");
      out.write("                                <input type=\"hidden\" name=\"hosted_button_id\" value=\"LB9RXFJ8P5SHU\">\n");
      out.write("                                <input type=\"image\" src=\"css/images/add_cart.gif\" border=\"0\" name=\"submit\">\n");
      out.write("                                <img alt=\"\" border=\"0\" src=\"https://www.paypal.com/en_US/i/scr/pixel.gif\" width=\"1\" height=\"1\">\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> \n");
      out.write("                            <form target=\"paypal\" action=\"https://www.paypal.com/cgi-bin/webscr\" method=\"post\" ><input type=\"hidden\" name=\"cmd\" value=\"_cart\"><input type=\"hidden\" name=\"business\" value=\"\"><input type=\"hidden\" name=\"display\" value=\"1\"><input type=\"image\" src=\"css/images/view_cart.gif\"\" border=\"0\" name=\"submit\"><img alt=\"\" border=\"0\" src=\"https://www.paypalobjects.com/en_US/i/scr/pixel.gif\" width=\"1\" height=\"1\"></form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
