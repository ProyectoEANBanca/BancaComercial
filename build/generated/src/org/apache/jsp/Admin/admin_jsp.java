package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


    HttpSession sesion = request.getSession();

    if (sesion.getAttribute("nivel") == null) {
        response.sendRedirect("../login.jsp");

    } else {
        String nivel = sesion.getAttribute("nivel").toString();
        if (!nivel.equals("1")) {
            response.sendRedirect("../login.jsp");
        }
    }



      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/admin.css\"/>\r\n");
      out.write("  \r\n");
      out.write("        <title>DashBoard Cliente</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--\r\n");
      out.write("                <div align=\"right\">\r\n");
      out.write("                    Bienvenido Sr  <p>");
      out.print( sesion.getAttribute("nombre"));
      out.write("</p>\r\n");
      out.write("                    <a href=\"../login.jsp?cerrar=true\">Cerrar Sesion</a>\r\n");
      out.write("                    <hr>\r\n");
      out.write("        \r\n");
      out.write("                </div>-->\r\n");
      out.write("\r\n");
      out.write("        <div id=\"templateContainer\">\r\n");
      out.write("            <nav class=\"navbar navbar-fixed-top alta-theme\" style=\"position:relative;\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"navbar-header\">\r\n");
      out.write("                        <span style=\"float:left; font-size:25px; margin:20px 10px;\">\r\n");
      out.write("                            <b>Bienvenido<p>");
      out.print( sesion.getAttribute("nombre"));
      out.write("</p></b></span>\r\n");
      out.write("                        <a href=\"../login.jsp?cerrar=true\">Cerrar Sesion</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <br/>\r\n");
      out.write("            <h1>Dashboards</h1>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container-fluid alta-theme\">\r\n");
      out.write("                <div class=\"col-md-12 main alta-theme\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row placeholders\">\r\n");
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("                            <div class=\"circular-menu\">\r\n");
      out.write("                                <div class=\"circle\">\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-home fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-facebook fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-twitter fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-linkedin fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-github fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-rss fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-pinterest fa-2x\"></span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button class=\"dashboard-item menu-button\" style=\"background-color:#8561C8;\">\r\n");
      out.write("                                    <span class=\"fa fa-file-text-o\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>Corporate Scorecard</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("                            <div class=\"circular-menu\">\r\n");
      out.write("                                <div class=\"circle\">\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-twitter fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-linkedin fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-rss fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-rss fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-pinterest fa-2x\"></span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button class=\"dashboard-item menu-button\" style=\"background-color:#00B8ED;\">\r\n");
      out.write("                                    <span class=\"fa fa-group\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>Human Resources</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("                            <div class=\"circular-menu\">\r\n");
      out.write("                                <div class=\"circle\">\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-home fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-github fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-rss fa-2x\"></span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button class=\"dashboard-item menu-button\" style=\"background-color:#68C182;\">\r\n");
      out.write("                                    <span class=\"fa fa-line-chart\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>Finance</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("                            <div class=\"circular-menu\">\r\n");
      out.write("                                <div class=\"circle\">\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-home fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-twitter fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-linkedin fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-github fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-rss fa-2x\"></span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button class=\"dashboard-item menu-button\" style=\"background-color:#267DB3;\">\r\n");
      out.write("                                    <span class=\"fa fa-folder-open-o\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>Projects</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("                            <div class=\"circular-menu\">\r\n");
      out.write("                                <div class=\"circle\">\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-home fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-facebook fa-2x\"></span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button class=\"dashboard-item menu-button\" style=\"background-color:#FFB54D;\">\r\n");
      out.write("                                    <span class=\"fa fa-industry\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>Supply Chain</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("                            <div class=\"circular-menu\">\r\n");
      out.write("                                <div class=\"circle\">\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-home fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-github fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-rss fa-2x\"></span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button class=\"dashboard-item menu-button\" style=\"background-color:#989fa8;\">\r\n");
      out.write("                                    <span class=\"fa fa-wrench\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>Operations</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("                            <div class=\"circular-menu\">\r\n");
      out.write("                                <div class=\"circle\">\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-home fa-2x\"></span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button class=\"dashboard-item menu-button\" style=\"background-color:#6DDBDB;\">\r\n");
      out.write("                                    <span class=\"fa fa-shopping-cart\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>Procurement</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("                            <div class=\"circular-menu\">\r\n");
      out.write("                                <div class=\"circle\">\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-home fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-facebook fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-github fa-2x\"></span></a>\r\n");
      out.write("                                    <a href=\"\"><span class=\"fa fa-rss fa-2x\"></span></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button class=\"dashboard-item menu-button\" style=\"background-color:#ED6647;\">\r\n");
      out.write("                                    <span class=\"fa fa-money\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>Sales</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(function () {\r\n");
      out.write("                $('.menu-button').each(function () {\r\n");
      out.write("                    var items = this.parentNode.querySelectorAll('.circle a');\r\n");
      out.write("                    for (var i = 0, l = items.length; i < l; i++) {\r\n");
      out.write("                        items[i].style.left = (50 - 42 * Math.cos(-0.5 * Math.PI - 2 * (1 / l) * i * Math.PI)).toFixed(4) + \"%\";\r\n");
      out.write("                        items[i].style.top = (50 + 42 * Math.sin(-0.5 * Math.PI - 2 * (1 / l) * i * Math.PI)).toFixed(4) + \"%\";\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $('.circular-menu').hover(function () {\r\n");
      out.write("                    this.querySelector('.circle').classList.add('open');\r\n");
      out.write("                    this.querySelector('.menu-button').classList.add('selected');\r\n");
      out.write("                }, function () {\r\n");
      out.write("                    this.querySelector('.circle').classList.remove('open');\r\n");
      out.write("                    this.querySelector('.menu-button').classList.remove('selected');\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
