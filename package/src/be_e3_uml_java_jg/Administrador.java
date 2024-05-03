/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be_e3_uml_java_jg;
import be_e3_uml_java_jg.Sala;
import be_e3_uml_java_jg.Usuari;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author jordi
 */

public class Administrador extends Usuari {
    private List<Sala> llistasales; // declara Llista de sales
    private List<Client> llistaClients; // declara Llista de clients
    private List<Reserva> llistareserves; // declara Llista de reserves


    
    // Constructor
    public Administrador(int id, String nom, String cognom, String rol, String mail, String contrasena) {
        super(id, nom, cognom, rol, mail, contrasena);
        this.llistasales = new ArrayList<>(); // Inicialitza la llista de sales
        this.llistaClients = new ArrayList<>(); // Inicialitza la llista de clients
        this.llistareserves = new ArrayList<>(); // Inicialitza la llista de reserves

    }
    
    //METODES DE ADMINISTRADOR
    
    // Métode per crear una nova sala i afegir-la a la llista de sales
    public Sala crearNovaSala(int id, float superficieM2, int capacidad, String disponibilidad, String ubicacion, String equipamiento, String descripcion) {
        Sala novaSala = new Sala(id, superficieM2, capacidad, disponibilidad, ubicacion, equipamiento, descripcion);
        llistasales.add(novaSala); // Afegeix la nova sala a la llista de sales
        
        // Imprimeix la informació de la nova sala creada
        System.out.println("Nova sala creada amb èxit:");
        System.out.println("ID: " + novaSala.getId());
        System.out.println("Superfície: " + novaSala.getSuperficieM2() + " m^2");
        System.out.println("Capacitat: " + novaSala.getCapacidad() + " persones");
        System.out.println("Disponibilitat: " + novaSala.getDisponibilidad());
        System.out.println("Ubicació: " + novaSala.getUbicacion());
        System.out.println("Equipament: " + novaSala.getEquipamiento());
        System.out.println("Descripció: " + novaSala.getDescripcion());
        System.out.println("------------------------------------");
        
        return novaSala;
    }
    
    // Mètode per obtenir la llista de sales
    public List<Sala> getLlistaSales() {
        return llistasales;
    }
    
    // Métode per crear un nou client
    public Client crearNouClient(int id, String nom, String cognom, String mail, String contrasena, int telefon) {
        // Crear una nova instància de Client
        Client nouClient = new Client(id, nom, cognom, "Client", mail, contrasena, telefon);

        // Afegir el nou client a la llista de clients
        llistaClients.add(nouClient);

        // Imprimir el nou client creat
        System.out.println("Nou client creat per l'administrador:");
        System.out.println("ID: " + nouClient.getId());
        System.out.println("Nom: " + nouClient.getNom());
        System.out.println("Cognom: " + nouClient.getCognom());
        System.out.println("Mail: " + nouClient.getMail());
        System.out.println("Telèfon: " + nouClient.getTelefon());
        System.out.println("--------------------------------------------------");

        return nouClient;
    }

    // Mètode per obtenir la llista de clients
    public List<Client> getLlistaClients() {
        return llistaClients;
    }

    // Getters heretats de la classe Usuari
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
