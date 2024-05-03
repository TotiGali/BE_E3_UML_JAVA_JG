/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be_e3_uml_java_jg;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


/**
 *
 * @author jordi
 */
public class Usuari {
    public int id;
    private String nom;
    private String cognom;
    private String rol;
    private String mail;
    private String contrasena;
    public List<Reserva> listareservas;
    
    //Constructor de Usuari
    
    public Usuari(int id, String nom, String cognom, String rol, String mail, String contrasena){
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.rol = rol;
        this.mail = mail;
        this.contrasena = contrasena;
        this.listareservas = new ArrayList<>();
    }
    
    //Métodes de Usuari
    //Iniciar sessió 
    public boolean iniciarSesion(String correoIngresado, String contrasenaIngresada){
		if(this.mail == correoIngresado && this.contrasena == contrasenaIngresada){
			return true;
		} else{
			return false;
		}
	}
    
    //getters
    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public String getCognom(){
        return cognom;
    }
    public String getRol(){
        return rol;
    }
    public String getMail(){
        return mail;
    }
    public String getContrasena(){
        return contrasena;
    }
    
       
}
