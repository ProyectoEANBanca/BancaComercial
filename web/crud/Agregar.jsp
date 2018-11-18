<%-- 
    Document   : Agregar
    Created on : 02/02/2018, 01:11:48 PM
    Author     : Joel
--%>

<%@page import="java.awt.TrayIcon.MessageType"%>
<%@page import="javax.swing.JOptionPane"%>
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
        <div class="container">
            <h1>Agregar Registro</h1>
            <hr>
            <form action="" method="post" class="form-control" style="width: 500px; height: 400px">
                
                
                Nombres:
                <input type="text" name="txtNom" class="form-control"/><br>
                
                
                Usuario:
                <input type="text" name="txtUsuario" class="form-control"/>
                
                 Contraseña:
                <input type="text" name="txtContrasena" class="form-control"/>
                
                  Nivel:
                <input type="text" name="txtNivel" class="form-control"/>
                
                  Saldo Disponible:
                <input type="text" name="txtSaldo" class="form-control"/>
                
                
                <br>
                <input type="submit" value="Guardar" class="btn btn-primary btn-lg"/>
                <a href="principal.jsp">Regresar</a>
            </form>
        </div>
        
        
    </body>
</html>
<%
       //CONECTANOD A LA BASE DE DATOS:
       Connection con;
       String url="jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_45299d59f23971d?zeroDateTimeBehavior=convertToNull";
       String Driver="com.mysql.jdbc.Driver";
       String user="b736df627cfd48";
       String clave="8db75918";
       Class.forName(Driver);
       con=DriverManager.getConnection(url,user,clave);
       PreparedStatement ps;
       
                String nombreCompleto, usuario, contrasena,nivel, saldoDisponible;
             
                
                nombreCompleto = request.getParameter("txtNom");
                usuario = request.getParameter("txtUsuario");

                contrasena = request.getParameter("txtContrasena");

                nivel = request.getParameter("txtNivel");
                
                saldoDisponible = request.getParameter("txtSaldo");
       
       
       if(nombreCompleto != null && usuario != null  && contrasena != null && nivel != null && saldoDisponible != null){
           ps=con.prepareStatement("insert into users(nombreCompleto, usuario,contrasena, nivel,saldoDisponible)values('" + nombreCompleto + "','" + usuario + "','"+contrasena+ "','"+nivel+ "','"+ saldoDisponible+ "')");
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Se Agrego Correctamete");           
           response.sendRedirect("principal.jsp");
           
       }
       
       
%>