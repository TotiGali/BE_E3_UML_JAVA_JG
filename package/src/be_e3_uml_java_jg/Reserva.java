/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be_e3_uml_java_jg;
import java.util.Date;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author jordi
 */
import java.util.Date;

public class Reserva {
    private int id;
    private Date fechaReservaInicio;
    private Date fechaReservaFin;
    private int horaInicio;
    private int horaFin;
    private Sala sala;
    private float precio;
    private String estadoReserva;
    private Client client;
    private String codigoReserva;
    private static List<Reserva> todasReservas = new ArrayList<>();
    
    // Constructor de Reserva
    public Reserva(int id, Date fechaReservaInicio, Date fechaReservaFin, int horaInicio, int horaFin, Sala sala, float precio, String estadoReserva, Client client, String codigoReserva) {
        this.id = id;
        this.fechaReservaInicio = fechaReservaInicio;
        this.fechaReservaFin = fechaReservaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.sala = sala;
        this.precio = precio;
        this.estadoReserva = estadoReserva;
        this.client = client;
        this.codigoReserva = codigoReserva;
        todasReservas.add(this);
    }

    // Getters de reserva
    public int getId() {
        return id;
    }

    public Date getFechaReservaInicio() {
        return fechaReservaInicio;
    }

    public Date getFechaReservaFin() {
        return fechaReservaFin;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public static List<Reserva> getListaTodasReservas(){
        return todasReservas;
    }
    
    
    //he esborrat el get de sala

    public float getPrecio() {
        return precio;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    //he esborrat el get de usuari
    
    public Client getClient(){
        return client;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    // Métodos de Reserva 
    
}

