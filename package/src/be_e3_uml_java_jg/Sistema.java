/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be_e3_uml_java_jg;
import java.util.*;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author jordi
 */
public class Sistema {
    public int id;
    public List<Usuari> listausuaris;
    public List<Reserva> listareservas;

    public Sistema (int id){
        this.id = id;
        this.listausuaris = new ArrayList<>();
        this.listareservas = new ArrayList<>();
    }
    
    //getters
    public int getId(){
        return id;
    }
    
    //Métode crear usuari
    
    public boolean crearNouUsuari(int id, String nom, String cognom, String rol, String mail, String contrasena) {
        Usuari nouUsuari = new Usuari(id, nom, cognom, rol, mail, contrasena);

        listausuaris.add(nouUsuari);

        // Imprimir el nuevo usuario creado
        System.out.println("Nou usuari creat amb èxit:");
        System.out.println("ID: " + id);
        System.out.println("Non: " + nom);
        System.out.println("Cognom: " + cognom);
        System.out.println("Rol: " + rol);
        System.out.println("Correu electrònic: " + mail);
        // No imprimimos la contraseña por motivos de seguridad
        System.out.println("--------------------------------------------------");
        
        return true;
    }
    
}