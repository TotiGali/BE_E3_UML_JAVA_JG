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
import java.util.*;


public class Report {
    private int id;
    private Date fechaReporte;
    private String descripcionReporte;
    private String reserva;
    
    // Constructor de Report
    public Report(int id, Date fechaReporte, String descripcionReporte, String reserva) {
        this.id = id;
        this.fechaReporte = fechaReporte;
        this.descripcionReporte = descripcionReporte;
        this.reserva = reserva;
    }
    
    // Getters de Report
    public int getId() {
        return id;
    }

    public Date getFechaReporte() {
        return fechaReporte;
    }

    public String getDescripcionReporte() {
        return descripcionReporte;
    }

    public String getReserva() {
        return reserva;
    }
}

