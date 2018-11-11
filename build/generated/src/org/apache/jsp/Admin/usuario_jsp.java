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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


    HttpSession sesion = request.getSession();

    if (sesion.getAttribute("nivel") == null) {
        response.sendRedirect("../login.jsp");

    } else {
        String nivel = sesion.getAttribute("nivel").toString();
        if (!nivel.equals("2")) {
            response.sendRedirect("../login.jsp");
        }
    }



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <!-- font awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.13/css/all.css\" integrity=\"sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp\" crossorigin=\"anonymous\"/>\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <!-- Compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/usuario.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../js/admin.js\"/>\n");
      out.write("\n");
      out.write("        <title>DashBoard Cliente</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            header{\n");
      out.write("                background: url(img/inicio.jpg);\n");
      out.write("                background-color: yellow;\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                min-height: 1000px;\n");
      out.write("            }\n");
      out.write("            @media screen and (max-width: 670px){\n");
      out.write("                header{\n");
      out.write("                    min-height: 500px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            .section{\n");
      out.write("                padding-top: 4vw;\n");
      out.write("                padding-bottom: 4vw;\n");
      out.write("            }\n");
      out.write("            .tabs .indicator{\n");
      out.write("                background-color: #1a237e;\n");
      out.write("            }\n");
      out.write("            .tabs .tab a:focus, .tabs .tab a:focus.active{\n");
      out.write("                background: transparent;\n");
      out.write("            }\n");
      out.write("            .color{\n");
      out.write("                color: #1a237e;\n");
      out.write("            }\n");
      out.write("            .brand-logo{\n");
      out.write("                color: #1a237e !important;\n");
      out.write("            }\n");
      out.write("            .usuario{\n");
      out.write("                color:tomato;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("        <!-- navbar -->\n");
      out.write("        <header>\n");
      out.write("            <img src=\"\">\n");
      out.write("            <nav class=\"nav-wrapper transparent\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <div class=\"chip\">\n");
      out.write("                        <i class=\"fas fa-child\">Usuari@</i>\n");
      out.write("                        ");
      out.print( sesion.getAttribute("nombre"));
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("<!--                    <a href=\"#\" class=\"brand-logo color \">Bienvenido ");
      out.print( sesion.getAttribute("nombre"));
      out.write("</a>-->\n");
      out.write("                    <a href=\"#\" class=\"sidenav-trigger\" data-target=\"mobile-menu\">\n");
      out.write("                        <i class=\"material-icons\">menu</i>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                        <li><a class=\"color\"  href=\"#photos\">Servicios</a></li>\n");
      out.write("                        <li><a class=\"color\" href=\"#services\">Plataforma</a></li>\n");
      out.write("                        <li><a class=\"color\" href=\"#contact\">Nostros</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li><a href=\"../index.html\" class=\"tooltipped btn-floating btn-small indigo darken-4\" data-position=\"bottom\" data-tooltip=\"Inicio\">\n");
      out.write("                                <i class=\"fas fa-users\"></i>\n");
      out.write("                            </a></li>\n");
      out.write("                        <li><a href=\"../login.jsp?cerrar=true\" class=\"tooltipped btn-floating btn-small indigo darken-4\" data-position=\"bottom\" data-tooltip=\"Cerra Sesion\">\n");
      out.write("                                <i class=\"fas fa-sitemap\"></i>\n");
      out.write("                            </a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"sidenav grey lighten-2\" id=\"mobile-menu\">\n");
      out.write("                        <li><a href=\"#\">Photo's</a></li>\n");
      out.write("                        <li><a href=\"#\">Services</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"progress\">\n");
      out.write("                        <div class=\"indeterminate\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--Aqui vamos agregar las grid para los modulos--> \n");
      out.write("            <div id=\"content\">\n");
      out.write("                <main>\n");
      out.write("\n");
      out.write("                    <!--implementando nuestra tarjeta de credito-->\n");
      out.write("\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card__front card__part\">\n");
      out.write("                            <img class=\"card__front-square card__square\" src=\"https://image.ibb.co/cZeFjx/little_square.png\">\n");
      out.write("                            <img class=\"card__front-logo card__logo\" src=\"https://www.fireeye.com/partners/strategic-technology-partners/visa-fireeye-cyber-watch-program/_jcr_content/content-par/grid_20_80_full/grid-20-left/image.img.png/1505254557388.png\">\n");
      out.write("                            <p class=\"card_numer\">1245 1548 1254 6258</p>\n");
      out.write("                            <div class=\"card__space-75\">\n");
      out.write("                                <span class=\"card__label\">Card holder</span>\n");
      out.write("                                <p class=\"card__info\">");
      out.print( sesion.getAttribute("nombre"));
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card__space-25\">\n");
      out.write("                                <span class=\"card__label\">Expires</span>\n");
      out.write("                                <p class=\"card__info\">10/25</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"card__back card__part\">\n");
      out.write("                            <div class=\"card__black-line\"></div>\n");
      out.write("                            <div class=\"card__back-content\">\n");
      out.write("                                <div class=\"card__secret\">\n");
      out.write("                                    <p class=\"card__secret--last\">420</p>\n");
      out.write("                                </div>\n");
      out.write("                                <img class=\"card__back-square card__square\" src=\"https://image.ibb.co/cZeFjx/little_square.png\">\n");
      out.write("                                <img class=\"card__back-logo card__logo\" src=\"https://www.fireeye.com/partners/strategic-technology-partners/visa-fireeye-cyber-watch-program/_jcr_content/content-par/grid_20_80_full/grid-20-left/image.img.png/1505254557388.png\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </main>\n");
      out.write("                <section>\n");
      out.write("                    <div class=\"login\" style=\"background-color: #fff !important \">\n");
      out.write("                        <form action=\"Transaccion\" method=\"POST\">\n");
      out.write("                            <label class=\"entrada\" style=\"background-color: #1a237e !important \">Id Cliente</label><br>\n");
      out.write("\n");
      out.write("                            <input  type=\"number\" placeholder=\"Id Cliente\" name=\"idcliente\" ><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <label class=\"entrada\" style=\"background-color: #1a237e !important \">Numero Producto</label><br>\n");
      out.write("                            <input  type=\"number\" placeholder=\"producto\" name=\"producto\"><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <label class=\"entrada\" style=\"background-color: #1a237e !important \">Tipo Transaccion</label><br>\n");
      out.write("                            <input  type=\"number\" placeholder=\"tipo\" name=\"tipo\"><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <label class=\"entrada\" style=\"background-color: #1a237e !important \">Valor</label><br>\n");
      out.write("                            <input  type=\"number\" placeholder=\"valor\" name=\"valor\"><br>\n");
      out.write("\n");
      out.write("                            <label class=\"entrada\" style=\"background-color: #1a237e !important \">NRO_factura</label><br>\n");
      out.write("                            <input  type=\"number\" placeholder=\"nro_factura\" name=\"nfacturas\"><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <input class=\"btn-floating btn-large pulse\" type=\"submit\" name=\"btnIniciar\" value=\"Login\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
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


                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("                <aside>Aside</aside>\n");
      out.write("                <nav>Nav</nav>\n");
      out.write("                <footer>Footer</footer>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <!-- Compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('.sidenav').sidenav();\n");
      out.write("                $('.materialboxed').materialbox();\n");
      out.write("                $('.parallax').parallax();\n");
      out.write("                $('.tabs').tabs();\n");
      out.write("                $('.datepicker').datepicker({\n");
      out.write("                    disableWeekends: true,\n");
      out.write("                    yearRange: 1\n");
      out.write("                });\n");
      out.write("                $('.tooltipped').tooltip();\n");
      out.write("                $('.scrollspy').scrollSpy();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
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
