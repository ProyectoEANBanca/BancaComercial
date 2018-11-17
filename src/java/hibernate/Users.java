package hibernate;
// Generated 11/11/2018 01:40:36 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private Integer idusuario;
     private String nombreCompleto;
     private String usuario;
     private String contrasena;
     private int nivel;
     private Date fecha;
     private int saldodisponible;

    public Users() {
    }

    public Users(String nombreCompleto, String usuario, String contrasena, int nivel, Date fecha,int saldodisponible) {
       this.nombreCompleto = nombreCompleto;
       this.usuario = usuario;
       this.contrasena = contrasena;
       this.nivel = nivel;
       this.fecha = fecha;
       this.saldodisponible = saldodisponible;
    }
   
    public Integer getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }
    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public int getNivel() {
        return this.nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getSaldodisponible() {
        return saldodisponible;
    }

    public void setSaldodisponible(int saldodisponible) {
        this.saldodisponible = saldodisponible;
    }




}


