package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/login.js\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/materialize.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/materialize.js\"/>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <title>JLogin</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"body\"></div>\r\n");
      out.write("        <div class=\"grad\"></div>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <div>Banca<span>Com</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"login\" >\r\n");
      out.write("            <form action=\"SERVLOGIN\" method=\"POST\">\r\n");
      out.write("                <label class=\"entrada\">Usuario</label><br>\r\n");
      out.write("\r\n");
      out.write("                <input  type=\"text\" placeholder=\"Usuario\" name=\"txtusuario\" ><br>\r\n");
      out.write("\r\n");
      out.write("                <label class=\"entrada\">Contraseña</label><br>\r\n");
      out.write("                <input  type=\"password\" placeholder=\"password\" name=\"txtcontr\"><br>\r\n");
      out.write("                <input class=\"btn-floating btn-large pulse\" type=\"submit\" name=\"btnIniciar\" value=\"Login\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

            // los datos que recibe la vista del servlets
            HttpSession sesion = request.getSession();
            int nivel = 0;

            // validar el nivel del servlet
            if (request.getAttribute("nivel") != null) {
                // este valor nos llega como objeto y hat que pasarla a Integer
                nivel = (Integer) request.getAttribute("nivel");
                if (nivel == 1) {

                    // aqui vamos a crear la variale la session
                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                    sesion.setAttribute("nivel", nivel);
                    //si es adminstrador lo redirecionamos a la pagina del administrador
                    response.sendRedirect("Admin/admin.jsp");

                }

                if (nivel == 2) {

                    // aqui vamos a crear la variale la session
                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                    sesion.setAttribute("nivel", nivel);
                    //si es adminstrador lo redirecionamos a la pagina del administrador
                    response.sendRedirect("Admin/usuario.jsp");

                }
            }

            if (request.getParameter("cerrar") != null) {
                session.invalidate();
                //sesion.invalidate();
            }


        
      out.write("\r\n");
      out.write("\r\n");
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
