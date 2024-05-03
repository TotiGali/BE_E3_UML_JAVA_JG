/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be_e3_uml_java_jg;
import java.util.Date;
import java.util.*;



/**
 *
 * @author jordi
 */
public class Equipament {
    private int id;
    private int proyector;
    private int sisVideo;

    // Constructor de Equipament
    public Equipament(int id, int proyector, int sisVideo) {
        this.id = id;
        this.proyector = proyector;
        this.sisVideo = sisVideo;
    }

    // Getters de Equipament
    public int getId() {
        return id;
    }

    public int getProyector() {
        return proyector;
    }

    public int getSisVideo() {
        return sisVideo;
    }
}

