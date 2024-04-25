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

public class Recordatori {
    private int id;
    private Date fecha;
    private String reserva;
    private String usuari;
    
    // Constructor de Recordatori
    public Recordatori(int id, Date fecha, String reserva, String usuari) {
        this.id = id;
        this.fecha = fecha;
        this.reserva = reserva;
        this.usuari = usuari;
    }

    // Getters de Recordatori
    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getReserva() {
        return reserva;
    }

    public String getUsuari() {
        return usuari;
    }
}

