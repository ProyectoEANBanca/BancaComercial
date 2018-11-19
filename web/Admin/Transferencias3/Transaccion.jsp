<%-- 
   Document   : Transaccion
   Created on : 17/11/2018, 10:39:41 PM
   Author     : Sergio Trabajo
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%

        HttpSession sesion = request.getSession();

    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page <></title>
    </head>
    <body>
        <form action="GrabarTransaccion.jsp" method="post">
            <h1>Datos de la consignación</h1>

            <td><label >Identificacion del cliente Origen </label></td>
            <input type="text" name="Vcliente" id="Identificacion del cliente Origen"><br>

            <td><label >Valor a consignar </label></td>
            <input type="text" name="VValor" id="Valor a consignar"><br>

            <td><label >Identificacion del cliente Destinatario  </label></td>
            <input type="text" name="VclienteD" id="Identificacion del cliente Destinatario "><br>

            <tr>
                <td colspan="2" align="center"><input type="submit" name="button" id="button" value="Consignar"></td>
            </tr>

        </form>
    </body>
</html>