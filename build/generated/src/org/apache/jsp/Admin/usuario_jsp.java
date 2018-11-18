package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        if (!nivel.equals("2")) {
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
      out.write("                        <i class=\"fas fa-child\">Usuari@</i>\r\n");
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
      out.write("\r\n");
      out.write("                    <!--implementando nuestra tarjeta de credito-->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <div class=\"card__front card__part\">\r\n");
      out.write("                            <img class=\"card__front-square card__square\" src=\"https://image.ibb.co/cZeFjx/little_square.png\">\r\n");
      out.write("                            <img class=\"card__front-logo card__logo\" src=\"https://www.fireeye.com/partners/strategic-technology-partners/visa-fireeye-cyber-watch-program/_jcr_content/content-par/grid_20_80_full/grid-20-left/image.img.png/1505254557388.png\">\r\n");
      out.write("                            <p class=\"card_numer\">1245 1548 1254 6258</p>\r\n");
      out.write("                            <div class=\"card__space-75\">\r\n");
      out.write("                                <span class=\"card__label\">Card holder</span>\r\n");
      out.write("                                <p class=\"card__info\">");
      out.print( sesion.getAttribute("nombre"));
      out.write("</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card__space-25\">\r\n");
      out.write("                                <span class=\"card__label\">Expires</span>\r\n");
      out.write("                                <p class=\"card__info\">10/25</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card__back card__part\">\r\n");
      out.write("                            <div class=\"card__black-line\"></div>\r\n");
      out.write("                            <div class=\"card__back-content\">\r\n");
      out.write("                                <div class=\"card__secret\">\r\n");
      out.write("                                    <p class=\"card__secret--last\">420</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <img class=\"card__back-square card__square\" src=\"https://image.ibb.co/cZeFjx/little_square.png\">\r\n");
      out.write("                                <img class=\"card__back-logo card__logo\" src=\"https://www.fireeye.com/partners/strategic-technology-partners/visa-fireeye-cyber-watch-program/_jcr_content/content-par/grid_20_80_full/grid-20-left/image.img.png/1505254557388.png\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </main>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                <section>\r\n");
      out.write("                    <div class=\"login\" style=\"background-color: #fff !important \">\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("<!--                        //implementar transaciones -->\r\n");
      out.write("                        <form action=\"Transaccion\" method=\"POST\">\r\n");
      out.write("                            <label class=\"entrada\" style=\"background-color: #1a237e !important \">Id Cliente</label><br>\r\n");
      out.write("\r\n");
      out.write("                            <input  type=\"number\" placeholder=\"Id Cliente\" name=\"idcliente\" ><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <label class=\"entrada\" style=\"background-color: #1a237e !important \">Numero Producto</label><br>\r\n");
      out.write("                            <input  type=\"number\" placeholder=\"producto\" name=\"producto\"><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <label class=\"entrada\" style=\"background-color: #1a237e !important \">Tipo Transaccion</label><br>\r\n");
      out.write("                            <input  type=\"number\" placeholder=\"tipo\" name=\"tipo\"><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <label class=\"entrada\" style=\"background-color: #1a237e !important \">Valor</label><br>\r\n");
      out.write("                            <input  type=\"number\" placeholder=\"valor\" name=\"valor\"><br>\r\n");
      out.write("\r\n");
      out.write("                            <label class=\"entrada\" style=\"background-color: #1a237e !important \">NRO_factura</label><br>\r\n");
      out.write("                            <input  type=\"number\" placeholder=\"nro_factura\" name=\"nfacturas\"><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <input class=\"btn-floating btn-large pulse\" type=\"submit\" name=\"btnIniciar\" value=\"Login\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");

    // los datos que recibe la vista del servlets
    //HttpSession sesion = request.getSession();
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
            response.sendRedirect("Admin/usuario.jsp");

        }
        else if(nivel == 2){
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
      out.write("\r\n");
      out.write("                </section>\r\n");
      out.write("                <aside>Aside</aside>\r\n");
      out.write("                <nav>Nav</nav>\r\n");
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
