package org.apache.jsp.Admin.Transferencias3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.bancacomercial.clase.Database.Database;

public final class GrabarTransaccion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>        \r\n");
      out.write("        ");

            {
        //try {
        String vidcliente=request.getParameter("Vcliente");
        String vvalor=request.getParameter("VValor");
        
        String idclientedest=request.getParameter("VclienteD");
//        out.println("datos escogidos "+idcliente + " VLR " + Valor );
//        int vidcliente = Integer.parseInt(idcliente);
//        int vvalor = Integer.parseInt(Valor);
        
//        int vidclientedest = Integer.parseInt(idclientedest);
         //String  idclientedest;
        
       Database db = new Database();
    // nuestro script para la db
        String sql,sql1 = "";
    // una variable de conexion
        Connection con;
        PreparedStatement pst;
    //donde voy a dejar los resultados de la consulta
        ResultSet rs;
         Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getContra());
            // Cliente origen
            sql = "Update users set saldodisponible = saldodisponible - " + vvalor + " where idusuario = " +  vidcliente + ";";
            
            // Cliente destino
            sql1 = "Update users set saldodisponible = saldodisponible + " + vvalor + " where idusuario = " +  idclientedest + ";";
            
            //sql = "Update clientes set producto =  '" + Valor + "' where id_cliente = 55555 ;";
            //preparar la consulta
            pst = con.prepareStatement(sql);
            // rs seria el nivel del usuario
    
            pst.executeUpdate();
            
            //Cliente destino
            pst = con.prepareStatement(sql1);
            // rs seria el nivel del usuario
    
            pst.executeUpdate();
            
            out.println("Consignación registrada con éxito");
       // } catch exception
                        // sql = "Update Transacciones set vlr = "+variablevlr + " WHERE id_cliente ="+variable_idcliente+" AND  ;
                    //else 
                        //error_al_insert;
                        
            //rs = pst.ex
            }
        
      out.write("                                           \r\n");
      out.write("      \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
