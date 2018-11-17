package org.apache.jsp.crud;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"../css/bootstrap.min.css \" rel=\"stylesheet\" type=\"text/css\"/>     \r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"margin-top: 30px\">      \r\n");
      out.write("        ");

            //CONECTANOD A LA BASE DE DATOS:
            Connection con;
             String url="jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_45299d59f23971d?zeroDateTimeBehavior=convertToNull";
       String Driver="com.mysql.jdbc.Driver";
       String user="b736df627cfd48";
       String clave="8db75918";
            Class.forName(Driver);
            con = DriverManager.getConnection(url, user, clave);
            PreparedStatement ps;
            //Emnpezamos Listando los Datos de la Tabla Usuario
            Statement smt;
            ResultSet rs;
            smt = con.createStatement();
            rs = smt.executeQuery("select * from persona");
            //Creamo la Tabla:     
        
      out.write("\r\n");
      out.write("        <div class=\"container\">            \r\n");
      out.write("            <button type=\"button\" class=\"btn btn-success btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\"> Agregar Nuevo Cliente</button>\r\n");
      out.write("            <div style=\"padding-left: 800px\">                  \r\n");
      out.write("                <input type=\"text\" class=\"form-control\" value=\"Buscar\"/>                            \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>  \r\n");
      out.write("              \r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"container\">               \r\n");
      out.write("            <!--<a  class=\"btn btn-success\" href=\"Agregar.jsp\">Nuevo Registro</a> Esto es Cuando se Crea un nuevo Archivo Agregar.jsp -->         \r\n");
      out.write("             <table class=\"table table-bordered\"  id=\"tablaDatos\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"text-center\">Id</th>\r\n");
      out.write("                            <th>Nombres</th>\r\n");
      out.write("                            <th class=\"text-center\">DNI</th>\r\n");
      out.write("                            <th class=\"text-center\">Acciones</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody id=\"tbodys\">\r\n");
      out.write("                        ");

                            while (rs.next()) {
                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"text-center\">");
      out.print( rs.getInt("Id"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( rs.getString("Nombres"));
      out.write("</td>\r\n");
      out.write("                            <td class=\"text-center\">");
      out.print( rs.getString("DNI"));
      out.write("</td>\r\n");
      out.write("                            <td class=\"text-center\">\r\n");
      out.write("                                \r\n");
      out.write("                                <!-- <input type=\"hidden\" value=\"<//%= rs.getInt(\"Id_Usuario\")%>\" id=\"Editar\"/>\r\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#myModal1\" value=\"Editar\"/>  -->\r\n");
      out.write("                                <a href=\"Editar.jsp?id=");
      out.print( rs.getInt("Id"));
      out.write("\" class=\"btn btn-primary\">Editar</a>\r\n");
      out.write("                                <a href=\"Delete.jsp?id=");
      out.print( rs.getInt("Id"));
      out.write("\" class=\"btn btn-danger\">Delete</a>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>        \r\n");
      out.write("        <div class=\"container\">          \r\n");
      out.write("            <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("                <div class=\"modal-dialog\" role=\"document\" style=\"z-index: 9999; width: 450px\">\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <div class=\"modal-header\">                            \r\n");
      out.write("                            <h4 class=\"modal-title\" id=\"myModalLabel\">Agregar Registro</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("                            <form action=\"\" method=\"post\">\r\n");
      out.write("                                <label>Nombres:</label> \r\n");
      out.write("                                <input type=\"text\" name=\"txtNom\" class=\"form-control\"/><br>\r\n");
      out.write("                                <label>DNI:</label> \r\n");
      out.write("                                <input type=\"text\" name=\"txtDNI\" class=\"form-control\"/>                                      \r\n");
      out.write("                                <div class=\"modal-footer\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>                            \r\n");
      out.write("                                    <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

                String dni, nom;
                nom = request.getParameter("txtNom");
                dni = request.getParameter("txtDNI");
                if (nom != null && dni != null) {
                    ps = con.prepareStatement("insert into persona(Nombres, DNI)values('" + nom + "','" + dni + "')");
                    ps.executeUpdate();
                    response.sendRedirect("principal.jsp");

                }
            
      out.write("\r\n");
      out.write("        </div>        \r\n");
      out.write("        <script src=\"../js/jquery.js\" type=\"text/javascript\"></script>             \r\n");
      out.write("        <script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>        \r\n");
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
