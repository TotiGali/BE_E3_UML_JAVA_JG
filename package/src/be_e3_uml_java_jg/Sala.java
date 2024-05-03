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
public class Sala {
    private int id;
    private Float superficieM2;
    private int capacidad;
    private String disponibilidad;
    private String ubicacion;
    private String equipamiento;
    private String descripcion;
    
    public Sala (int id, Float superficieM2, int capacidad, String disponibilidad, String ubicacion, String equipamiento, String descripcion){
        this.id = id;
        this.superficieM2 = superficieM2;
        this.capacidad = capacidad;
        this.disponibilidad = disponibilidad;
        this.ubicacion = ubicacion;
        this.equipamiento = equipamiento;
        this.descripcion = descripcion;
    }
    
    //métodes getters
    
    public int getId(){
        return id;
    }
    
    public Float getSuperficieM2(){
        return superficieM2;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public String getDisponibilidad(){
        return disponibilidad;
    }

    public String getUbicacion(){
        return ubicacion;
    }

    public String getEquipamiento(){
        return equipamiento;
    }

    public String getDescripcion(){
        return descripcion;
    }
}
