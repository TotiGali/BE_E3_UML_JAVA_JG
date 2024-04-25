/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be_e3_uml_java_jg;
import java.util.Date;

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
    private String sala;
    private float precio;
    private String estadoReserva;
    private String usuario;
    private String codigoReserva;
    
    // Constructor de Reserva
    public Reserva(int id, Date fechaReservaInicio, Date fechaReservaFin, int horaInicio, int horaFin, String sala, float precio, String estadoReserva, String usuario, String codigoReserva) {
        this.id = id;
        this.fechaReservaInicio = fechaReservaInicio;
        this.fechaReservaFin = fechaReservaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.sala = sala;
        this.precio = precio;
        this.estadoReserva = estadoReserva;
        this.usuario = usuario;
        this.codigoReserva = codigoReserva;
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

    public String getSala() {
        return sala;
    }

    public float getPrecio() {
        return precio;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    // Métodos de Reserva 
}

