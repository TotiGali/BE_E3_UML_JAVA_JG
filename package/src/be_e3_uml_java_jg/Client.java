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
public class Client extends Usuari {
    private int telefon;
    public List<Reserva> llistaReserves;

    
    // Constructor de Client
    public Client(int id, String nom, String cognom, String rol, String mail, String contrasena, int telefon) {
        super(id, nom, cognom, rol, mail, contrasena);
        this.telefon = telefon;
        this.llistaReserves = new ArrayList<>();

    }
          
    // Getter para telefon
    public int getTelefon() {
        return telefon;
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
    
    //realitzar reserva
    public Reserva realizarReserva(int idReserva, Date fechaReservaInicio, Date fechaReservaFin, int horaInicio, int horaFin, Sala sala, float precio, String estadoReserva, String codigoReserva) {
        Reserva nuevaReserva = new Reserva(idReserva, fechaReservaInicio, fechaReservaFin, horaInicio, horaFin, sala, precio, estadoReserva, this, codigoReserva);
  
        llistaReserves.add(nuevaReserva);
        
        //sala.addReserva(nuevaReserva);

        // Imprimir confirmació de reserva
        System.out.println("¡Reserva realitzada amb èxit!");
        System.out.println("ID de reserva: " + idReserva);
        System.out.println("Fecha de inicio: " + fechaReservaInicio);
        System.out.println("Fecha de fin: " + fechaReservaFin);
        System.out.println("Hora de inicio: " + horaInicio);
        System.out.println("Hora de fin: " + horaFin);
        System.out.println("Sala reservada: " + sala); 
        System.out.println("Precio: " + precio);
        System.out.println("Estado de la reserva: " + estadoReserva);
        System.out.println("Código de reserva: " + codigoReserva);
        System.out.println("--------------------------------------------------");
        
        return nuevaReserva;
    }
    
    public List<Reserva> getReservas(){
        return llistaReserves;
    }
}

