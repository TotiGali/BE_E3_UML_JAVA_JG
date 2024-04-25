/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be_e3_uml_java_jg;


/**
 *
 * @author jordi
 */
public class Administrador extends Usuari {
    
    // Constructor de Administrador
    public Administrador(int id, String nom, String cognom, String rol, String mail, String contrasena) {
        super(id, nom, cognom, rol, mail, contrasena);
    }
    
    // Getters heredados de la clase Usuari
    public int getId() {
        return super.getId();
    }

    public String getNom() {
        return super.getNom();
    }

    public String getCognom() {
        return super.getCognom();
    }

    public String getRol() {
        return super.getRol();
    }

    public String getMail() {
        return super.getMail();
    }

    public String getContrasena() {
        return super.getContrasena();
    }
}
