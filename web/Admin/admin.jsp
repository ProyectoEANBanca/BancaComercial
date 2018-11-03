<%-- 
    Document   : admin
    Created on : 21/10/2018, 10:16:07 PM
    Author     : SERGIO Y CAMILO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<%

    HttpSession sesion = request.getSession();

    if (sesion.getAttribute("nivel") == null) {
        response.sendRedirect("../login.jsp");

    } else {
        String nivel = sesion.getAttribute("nivel").toString();
        if (!nivel.equals("1")) {
            response.sendRedirect("../login.jsp");
        }
    }


%>



<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <!-- font awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous"/>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">
        <link rel="stylesheet" href="../css/admin.css"/>
        <link rel="stylesheet" href="../js/admin.js"/>

        <title>DashBoard Cliente</title>

        <style>
            header{
                background: url(img/inicio.jpg);
                background-color: yellow;
                background-size: cover;
                background-position: center;
                min-height: 1000px;
            }
            @media screen and (max-width: 670px){
                header{
                    min-height: 500px;
                }
            }
            .section{
                padding-top: 4vw;
                padding-bottom: 4vw;
            }
            .tabs .indicator{
                background-color: #1a237e;
            }
            .tabs .tab a:focus, .tabs .tab a:focus.active{
                background: transparent;
            }
            .color{
                color: #1a237e;
            }
            .brand-logo{
                color: #1a237e !important;
            }
            .usuario{
                color:tomato;
            }

            /*               <!--Aqui vamos agregar las grid para los modulos--> */

            body{
                color: #fff;
                font-family: 'Nunito Semibold';
                text-align: center;
            }
            #content{
                display: grid;
                grid-template-columns: repeat(4, 1fr);
                grid-auto-rows: minmax(136px, auto);
                grid-gap: 10px;
                max-width: 960px;
                margin: 0 auto;
                grid-template-areas:
                    "header header header header"
                    "footer footer footer footer"
                    "main main main main"
                    "main main main main"
                    "aside aside nav nav"
                    "section section section section"
                    "section section section section";
            }
            /* desktop grid */
            @media screen and (min-width: 760px){
                #content{
                    display: grid;
                    grid-template-columns: repeat(4, 1fr);
                    grid-auto-rows: minmax(100px, auto);
                    grid-gap: 10px;
                    max-width: 960px;
                    margin: 0 auto;
                    grid-template-areas:
                        "header header header header"
                        "aside main main main"
                        "nav main main main"
                        "section section section section"
                        "section section section section"
                        "footer footer footer footer";
                }
            }
            #content > *{
                background: #3bbced;
                padding: 30px;
            }
            main{
                grid-area: main;
            }
            aside{
                grid-area: aside;
            }
            nav{
                grid-area: nav;
            }
            section{
                grid-area: section;
            }
            footer{
                grid-area: footer;
                background: #333 !important;
            }

            .cardForm-Field50 {
                float: left;
                width: 50%;
            }

        </style>
    </head>
    <body >
        <!--
            <div align="right">
                Bienvenido Sr  <p><%= sesion.getAttribute("nombre")%></p>
                <a href="../login.jsp?cerrar=true">Cerrar Sesion</a>
                <hr>
    
            </div>-->

        <!-- navbar -->
        <header>
            <img src="">
            <nav class="nav-wrapper transparent">
                <div class="container">

                    <div class="chip">
                        <i class="fas fa-child"></i>
                        <%= sesion.getAttribute("nombre")%>
                    </div>

<!--                    <a href="#" class="brand-logo color ">Bienvenido <%= sesion.getAttribute("nombre")%></a>-->
                    <a href="#" class="sidenav-trigger" data-target="mobile-menu">
                        <i class="material-icons">menu</i>
                    </a>
                    <ul class="right hide-on-med-and-down">
                        <li><a class="color"  href="#photos">Servicios</a></li>
                        <li><a class="color" href="#services">Plataforma</a></li>
                        <li><a class="color" href="#contact">Nostros</a></li>


                        <li><a href="../index.html" class="tooltipped btn-floating btn-small indigo darken-4" data-position="bottom" data-tooltip="Inicio">
                                <i class="fas fa-users"></i>
                            </a></li>
                        <!--                                                    <li><a href="#" class="tooltipped btn-floating btn-small indigo darken-4" data-position="bottom" data-tooltip="Administrador">
                                                                                    <i class="fas fa-user-shield"></i>
                                                    </a></li>-->

                        <li><a href="../login.jsp?cerrar=true" class="tooltipped btn-floating btn-small indigo darken-4" data-position="bottom" data-tooltip="Cerra Sesion">
                                <i class="fas fa-sitemap"></i>
                            </a></li>

                    </ul>
                    <ul class="sidenav grey lighten-2" id="mobile-menu">
                        <li><a href="#">Photo's</a></li>
                        <li><a href="#">Services</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>


                    <div class="progress">
                        <div class="indeterminate"></div>
                    </div>
                </div>
            </nav>



            <!--Aqui vamos agregar las grid para los modulos--> 

            <div id="content">
                <main>

                    <div class="card">
                        <div class="card__front card__part">
                            <img class="card__front-square card__square" src="https://image.ibb.co/cZeFjx/little_square.png">
                            <img class="card__front-logo card__logo" src="https://www.fireeye.com/partners/strategic-technology-partners/visa-fireeye-cyber-watch-program/_jcr_content/content-par/grid_20_80_full/grid-20-left/image.img.png/1505254557388.png">
                            <p class="card_numer">1223 2343 4564 6258</p>
                            <div class="card__space-75">
                                <span class="card__label">Card holder</span>
                                <p class="card__info">Sergio Medina Chaparro</p>
                            </div>
                            <div class="card__space-25">
                                <span class="card__label">Expires</span>
                                <p class="card__info">10/25</p>
                            </div>
                        </div>

                        <div class="card__back card__part">
                            <div class="card__black-line"></div>
                            <div class="card__back-content">
                                <div class="card__secret">
                                    <p class="card__secret--last">420</p>
                                </div>
                                <img class="card__back-square card__square" src="https://image.ibb.co/cZeFjx/little_square.png">
                                <img class="card__back-logo card__logo" src="https://www.fireeye.com/partners/strategic-technology-partners/visa-fireeye-cyber-watch-program/_jcr_content/content-par/grid_20_80_full/grid-20-left/image.img.png/1505254557388.png">

                            </div>
                        </div>

                    </div>





                </main>
                <section>Section</section>
                <aside>Aside</aside>
                <nav>Nav</nav>
                <footer>Footer</footer>

            </div>


        </header>
        <!-- Compiled and minified JavaScript -->
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
        <script>
            $(document).ready(function () {
                $('.sidenav').sidenav();
                $('.materialboxed').materialbox();
                $('.parallax').parallax();
                $('.tabs').tabs();
                $('.datepicker').datepicker({
                    disableWeekends: true,
                    yearRange: 1
                });
                $('.tooltipped').tooltip();
                $('.scrollspy').scrollSpy();
            });
        </script>


    </body>
</html>
