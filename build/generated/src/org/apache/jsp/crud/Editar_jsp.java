package org.apache.jsp.crud;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Editar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

       //CONECTANOD A LA BASE DE DATOS:
       Connection con;
        String url="jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_45299d59f23971d?zeroDateTimeBehavior=convertToNull";
       String Driver="com.mysql.jdbc.Driver";
       String user="b736df627cfd48";
       String clave="8db75918";
       Class.forName(Driver);
       con=DriverManager.getConnection(url,user,clave);
       //Emnpezamos Listando los Datos de la Tabla Usuario pero de la fila seleccionada
       PreparedStatement ps;
       ResultSet rs;
       int id=Integer.parseInt(request.getParameter("id"));
       ps=con.prepareStatement("select * from persona where Id="+id);
       rs=ps.executeQuery();
       while(rs.next()){
                         
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>Modificar Registro</h1>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <form action=\"\" method=\"post\" class=\"form-control\" style=\"width: 500px; height: 400px\">\r\n");
      out.write("                ID:\r\n");
      out.write("                <input type=\"text\" readonly=\"\" class=\"form-control\" value=\"");
      out.print( rs.getInt("Id"));
      out.write("\"/>\r\n");
      out.write("                 Nombres:\r\n");
      out.write("                <input type=\"text\" name=\"txtNom\" class=\"form-control\" value=\"");
      out.print( rs.getString("Nombres"));
      out.write("\"/><br>\r\n");
      out.write("              \r\n");
      out.write("                DNI:\r\n");
      out.write("                <input type=\"text\" name=\"txtDNI\" class=\"form-control\" value=\"");
      out.print( rs.getString("DNI"));
      out.write("\"/>\r\n");
      out.write("                 <br>\r\n");
      out.write("                <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary btn-lg\"/>\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"principal.jsp\">Regresar</a>\r\n");
      out.write("            </form>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");

    String dni, nom;
       dni=request.getParameter("txtDNI");
       nom=request.getParameter("txtNom");
       if(nom!=null && dni!=null){
           ps=con.prepareStatement("update persona set Nombres='"+nom+"', DNI='"+dni+"'where Id="+id);
           ps.executeUpdate();
           response.sendRedirect("principal.jsp");
       }
       
       

      out.write('\r');
      out.write('\n');
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
