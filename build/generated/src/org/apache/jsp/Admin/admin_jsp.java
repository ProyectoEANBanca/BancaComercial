package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bancacomercial.clase.Database.Modelo;
import hibernate.*;
import java.util.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!--https://docs.oracle.com/javaee/5/jstl/1.1/docs/tlddocs/c/tld-summary.html-->\r\n");
      out.write("\r\n");
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
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("        <!-- font awesome -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.13/css/all.css\" integrity=\"sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp\" crossorigin=\"anonymous\"/>\r\n");
      out.write("        <!--Import Google Icon Font-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/usuario.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../js/admin.js\"/>\r\n");
      out.write("\r\n");
      out.write("        <title>DashBoard Cliente</title>\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            header{\r\n");
      out.write("                background: url(img/inicio.jpg);\r\n");
      out.write("                background-color: yellow;\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                background-position: center;\r\n");
      out.write("                min-height: 1000px;\r\n");
      out.write("            }\r\n");
      out.write("            @media screen and (max-width: 670px){\r\n");
      out.write("                header{\r\n");
      out.write("                    min-height: 500px;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            .section{\r\n");
      out.write("                padding-top: 4vw;\r\n");
      out.write("                padding-bottom: 4vw;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs .indicator{\r\n");
      out.write("                background-color: #1a237e;\r\n");
      out.write("            }\r\n");
      out.write("            .tabs .tab a:focus, .tabs .tab a:focus.active{\r\n");
      out.write("                background: transparent;\r\n");
      out.write("            }\r\n");
      out.write("            .color{\r\n");
      out.write("                color: #1a237e;\r\n");
      out.write("            }\r\n");
      out.write("            .brand-logo{\r\n");
      out.write("                color: #1a237e !important;\r\n");
      out.write("            }\r\n");
      out.write("            .usuario{\r\n");
      out.write("                color:tomato;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("\r\n");
      out.write("        <!-- navbar -->\r\n");
      out.write("        <header>\r\n");
      out.write("            <img src=\"\">\r\n");
      out.write("            <nav class=\"nav-wrapper transparent\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"chip\">\r\n");
      out.write("                        <i class=\"fas fa-child\">Administrador@</i>\r\n");
      out.write("                        ");
      out.print( sesion.getAttribute("nombre"));
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("<!--                    <a href=\"#\" class=\"brand-logo color \">Bienvenido ");
      out.print( sesion.getAttribute("nombre"));
      out.write("</a>-->\r\n");
      out.write("                    <a href=\"#\" class=\"sidenav-trigger\" data-target=\"mobile-menu\">\r\n");
      out.write("                        <i class=\"material-icons\">menu</i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("                        <li><a class=\"color\"  href=\"#photos\">Servicios</a></li>\r\n");
      out.write("                        <li><a class=\"color\" href=\"#services\">Plataforma</a></li>\r\n");
      out.write("                        <li><a class=\"color\" href=\"#contact\">Nostros</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <li><a href=\"../index.html\" class=\"tooltipped btn-floating btn-small indigo darken-4\" data-position=\"bottom\" data-tooltip=\"Inicio\">\r\n");
      out.write("                                <i class=\"fas fa-users\"></i>\r\n");
      out.write("                            </a></li>\r\n");
      out.write("                        <li><a href=\"../login.jsp?cerrar=true\" class=\"tooltipped btn-floating btn-small indigo darken-4\" data-position=\"bottom\" data-tooltip=\"Cerra Sesion\">\r\n");
      out.write("                                <i class=\"fas fa-sitemap\"></i>\r\n");
      out.write("                            </a></li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"sidenav grey lighten-2\" id=\"mobile-menu\">\r\n");
      out.write("                        <li><a href=\"#\">Photo's</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Services</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"progress\">\r\n");
      out.write("                        <div class=\"indeterminate\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--Aqui vamos agregar las grid para los modulos--> \r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("                <main>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <!--reportes jasper-->\r\n");
      out.write("                    \r\n");
      out.write("                    <a href=\"../Admin/report1.html\" style=\"text-align: center; color: #000\" target=\"_blank\"> <h4>Reportes</h4> </a>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </main>\r\n");
      out.write("                <section>\r\n");
      out.write("                    <table cellpadding=\"2\" cellspacing=\"2\" border=\"1\">\r\n");
      out.write("                        <!--\r\n");
      out.write("                                                private Integer idusuario;\r\n");
      out.write("                                                private String nombreCompleto;\r\n");
      out.write("                                                private String usuario;\r\n");
      out.write("                                                private String contrasena;\r\n");
      out.write("                                                private int nivel;\r\n");
      out.write("                                                private Date fecha;-->\r\n");
      out.write("                        ");
 Modelo model = new Modelo();
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                idusuario   \r\n");
      out.write("                            </th>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                NombreCompleto   \r\n");
      out.write("                            </th>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                Usuario   \r\n");
      out.write("                            </th>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                Contraseña   \r\n");
      out.write("                            </th>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                Nivel   \r\n");
      out.write("                            </th>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                Fecha de Registro   \r\n");
      out.write("                            </th>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                Saldo Disponible  \r\n");
      out.write("                            </th>\r\n");
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("p");
      _jspx_th_c_forEach_0.setItems( model.findAll());
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("                            <tr>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idusuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.nombreCompleto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.contrasena}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.nivel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.fecha}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.saldodisponible}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                            </tr>\r\n");
            out.write("\r\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write(" \r\n");
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                </section>\r\n");
      out.write("                        <aside>\r\n");
      out.write("                     \r\n");
      out.write("                            <a href=\"../crud/principal.jsp\" class=\"waves-effect waves-light btn-large\"><i class=\"material-icons left\">cloud</i>button</a>\r\n");
      out.write("   \r\n");
      out.write("                            \r\n");
      out.write("                        </aside>\r\n");
      out.write("      \r\n");
      out.write("                <footer>Footer</footer>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- Compiled and minified JavaScript -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('.sidenav').sidenav();\r\n");
      out.write("                $('.materialboxed').materialbox();\r\n");
      out.write("                $('.parallax').parallax();\r\n");
      out.write("                $('.tabs').tabs();\r\n");
      out.write("                $('.datepicker').datepicker({\r\n");
      out.write("                    disableWeekends: true,\r\n");
      out.write("                    yearRange: 1\r\n");
      out.write("                });\r\n");
      out.write("                $('.tooltipped').tooltip();\r\n");
      out.write("                $('.scrollspy').scrollSpy();\r\n");
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
