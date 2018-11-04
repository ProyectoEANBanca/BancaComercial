/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancacomercial.clase.Database;

import java.sql.*;

/**
 *
 * @author LENOVO
 * Esta clase nos permite tener todos los metodos para validar los usarios
 */
public class Acceso {

    Database db = new Database();
    // nuestro script para la db
    String sql = "";
    // una variable de conexion
    Connection con;
    PreparedStatement pst;
    //donde voy a dejar los resultados de la consulta
    ResultSet rs;
    
    //constructor 
    public Acceso(){
    
    }
    
   
    
    // metodo para validar el nivel del usuario que se 
    public int validar(String usuario, String contra){
        int nivel = 0;
        
        //levantamos la conexion con nuesta db
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(),db.getUser(), db.getContra());
            sql = "select nivel from users where usuario='"+usuario+"' and contrasena='"+contra+"'";
            //preparar la consulta
            pst = con.prepareStatement(sql);
            // rs seria el nivel del usuario
            rs = pst.executeQuery();
            // reconrremos todos los resultados que nos trajo la consulta
            while(rs.next()){
                //obtenemos el indice de la tabla de datos con el nivel del usuario
               nivel = rs.getInt(1);


            }
            
            //nos desconectamos
            con.close();
            rs.close();
        } catch (SQLException | ClassNotFoundException  e) {
            return nivel;
            //e.printStackTrace();
             
        }
        //devolvemos el nivel de ese usuario con esa contraseña 
       return nivel;
    
    
    
    }
    
}
