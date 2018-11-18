<%-- 
    Document   : Editar
    Created on : 02/02/2018, 03:33:51 PM
    Author     : Joel
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
       //CONECTANOD A LA BASE DE DATOS:
       Connection con;
       String idusuario;
        String url="jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_45299d59f23971d?zeroDateTimeBehavior=convertToNull";
       String Driver="com.mysql.jdbc.Driver";
       String user="b736df627cfd48";
       String clave="8db75918";
       Class.forName(Driver);
       con=DriverManager.getConnection(url,user,clave);
       //Emnpezamos Listando los Datos de la Tabla Usuario pero de la fila seleccionada
       PreparedStatement ps;
       ResultSet rs;
        idusuario=request.getParameter("idusuario");
       ps=con.prepareStatement("select * from users where idusuario="+idusuario);
       rs=ps.executeQuery();
       while(rs.next()){
                         %>
        <div class="container">
            <h1>Modificar Registro</h1>
            <hr>
            <form action="" method="post" class="form-control" style="width: 500px; height: 400px">
                
                 Id usuario:
                <input type="text" readonly=""  class="form-control" value="<%= rs.getString("idusuario")%>"/>
                
                Nombres:
                <input type="text" readonly="" name="txtNom" class="form-control" value="<%= rs.getString("nombreCompleto")%>"/>
                
                 Usuario:
                <input type="text" name="txtUsuario" class="form-control" value="<%= rs.getString("Usuario")%>"/><br>
                
              
                Contraseña:
                <input type="text" name="txtContrasena" class="form-control" value="<%= rs.getString("contrasena")%>"/>
                
                  Nivel:
                  <input type="text" name="txtNivel" class="form-control" value="<%= rs.getString("nivel")%>"/>
                
                  Saldo Disponible:
                  <input type="text" name="txtSaldo" class="form-control" value="<%= rs.getString("saldodisponible")%>"/>
                
                
                 <br>
                <input type="submit" value="Guardar" class="btn btn-primary btn-lg"/>
                
                <a href="principal.jsp">Regresar</a>
            </form>
            <%}%>
        </div>
    </body>
</html>
<%
                String nombreCompleto, usuario, contrasena,nivel, saldoDisponible;
              
                
                nombreCompleto = request.getParameter("txtNom");
                usuario = request.getParameter("txtUsuario");

                contrasena = request.getParameter("txtContrasena");
 
               nivel = request.getParameter("txtNivel");
               saldoDisponible = request.getParameter("txtSaldo");
                
              
                
                
       if(nombreCompleto != null && usuario != null  && contrasena != null && nivel != null && saldoDisponible != null){
           ps=con.prepareStatement("update users set nombreCompleto='"+nombreCompleto+"', usuario='"+usuario+"', contrasena='"+contrasena+"', nivel='"+nivel+"', saldoDisponible='"+saldoDisponible+ "'where idusuario="+idusuario);
           ps.executeUpdate();
           response.sendRedirect("principal.jsp");
       }
       
       
%>
