<%-- 
    Document   : admin
    Created on : 21/10/2018, 10:16:07 PM
    Author     : LENOVO
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div align="right">
            Bienvenido Sr  <p><%= sesion.getAttribute("nombre")%></p>
            <a href="../login.jsp?cerrar=true">Cerrar Sesion</a>
            <hr>

        </div>

        <h4>Administrador</h4> 

    </body>
</html>
