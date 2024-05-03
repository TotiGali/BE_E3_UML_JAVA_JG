/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package be_e3_uml_java_jg;
import java.util.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author jordi
 */
public class BE_E3_UML_JAVA_JG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // CREAR NOUS USUARIS. Crear una instancia de Sistema per crear usuaris nous
            Sistema sistema = new Sistema(1);
        
            // Detalls del nou usuari
            int id = 1;
            String nom = "John";
            String cognom = "Doe";
            String rol = "Usuari";
            String mail = "john@example.com";
            String contrasena = "password123";

            // Llamar al método para crear un nuevo usuario
            sistema.crearNouUsuari(id, nom, cognom, rol, mail, contrasena);

            // Detalls del nou usuari
            int id2 = 2;
            String nom2 = "Pere";
            String cognom2 = "Mas";
            String rol2 = "Usuari";
            String mail2 = "pere@example.com";
            String contrasena2 = "password1234";

            // Llamar al método para crear un nuevo usuario
            sistema.crearNouUsuari(id2, nom2, cognom2, rol2, mail2, contrasena2);
        
                
        // CREAR UN ADMINISTRADOR. Detalls del nou administrador
            int idAdmin = 1;
            String nomAdmin = "Pere";
            String cognomAdmin = "Deulofeu";
            String rolAdmin = "Administrador";
            String mailAdmin = "admin@example.com";
            String contrasenaAdmin = "admin123";

            // Crear una nova instància d'Administrador
            Administrador admin = new Administrador(idAdmin, nomAdmin, cognomAdmin, rolAdmin, mailAdmin, contrasenaAdmin);
            
            // Imprimir informació del nou administrador
            System.out.println("Informació del nou administrador:");
            System.out.println("ID: " + admin.getId());
            System.out.println("Nombre: " + admin.getNom());
            System.out.println("Apellido: " + admin.getCognom());
            System.out.println("Rol: " + admin.getRol());
            System.out.println("Correo electrónico: " + admin.getMail());
            System.out.println("--------------------------------------------------");
       
        //CREAR UNA SALA. El administrador crea tres noves sales.
            // No cal Crear una instància d'Administrador perquè ja està creada més amunt
            
            Sala sala1 = admin.crearNovaSala(3, 50.0f, 12, "disponible", "planta baixa", "projector, taules, cadires", "Sala de reunions");
            Sala sala2 = admin.crearNovaSala(3, 120.0f, 12, "disponible", "planta baixa", "projector, taules, cadires", "Sala de reunions");
            Sala sala3 = admin.crearNovaSala(3, 80.0f, 12, "disponible", "planta primera", "projector, taules, cadires", "Sala de treball");


            // Imprimeix llista de sales creades
            List<Sala> sales = admin.getLlistaSales();
            System.out.println("Llista de sales creades pel administrador:");
            for (Sala sala : sales) {
                System.out.println("ID: " + sala.getId() + ", Ubicació: " + sala.getUbicacion() + ", Descripció: " + sala.getDescripcion());
            }
            System.out.println("--------------------------------------------------");

        
        //EL ADMINISTRADOR CREA DOS NOUS CLIENTS
            // No cal Crear una instància d'Administrador perquè ja està creada més amunt

            // Crear dos nous clients
            Client client1 = admin.crearNouClient(101, "Tom", "McDonald", "client1@example.com", "client123", 123456789);
            Client client2 = admin.crearNouClient(102, "Jon", "McDonald", "client2@example.com", "client456", 987654321);

            // Imprimir la llista de clients
            System.out.println("Llista de clients:");
            for (Client client : admin.getLlistaClients()) {
                System.out.println("ID: " + client.getId() + ", Nom: " + client.getNom() + ", Cognom: " + client.getCognom() + ", Mail: " + client.getMail() + ", Telèfon: " + client.getTelefon());
            }
            System.out.println("--------------------------------------------------");
            
        //CREAR UNA NOVA RESERVA. El client1 i el client2 fan noves reserves
            
            System.out.println("El client " + client1.id + " ha fet una reserva:");
            Reserva reserva1 = client1.realizarReserva(1, new Date(124, 4, 28), new Date(124, 4, 28), 10, 12, sala1, 50.0f, "pendent", "ABC123");
            
            System.out.println("El client " + client2.id + " ha fet una reserva:");
            Reserva reserva2 = client2.realizarReserva(2, new Date(124, 4, 28), new Date(124, 4, 28), 12, 14, sala3, 150.0f, "pendent", "DEF123");
            
             Reserva reserva3 = client1.realizarReserva(3, new Date(124, 4, 28), new Date(124, 4, 28), 10, 12, sala1, 50.0f, "pendent", "ABC345");

            //Imprimir la llista de reserves
            for (Client client : admin.getLlistaClients()){
                System.out.println("Lista de las reservas del cliente: " + client.getNom() + " " + client.getCognom());
                for(Reserva reservas : client.getReservas()){
                    System.out.println("Reseva realizada: " + reservas.getCodigoReserva());
                }           
            }
            
            System.out.println("Lista genérica de todas las reservas: ");
            for(Reserva reservas : Reserva.getListaTodasReservas()){
                System.out.println("Reserva con código: " + reservas.getCodigoReserva() + " realizada por el cliente: " + reservas.getClient().getNom() + " " + reservas.getClient().getCognom());
            }
            
            
            //System.out.println("Llista de reserves:");
            //for (Reserva reserva : admin.getLlistaReserves()) {
                //System.out.println("ID de reserva: " + reserva.getId());
                //System.out.println("Fecha de reserva inicio: " + reserva.getFechaReservaInicio());
                //System.out.println("Fecha de reserva fin: " + reserva.getFechaReservaFin());
                //System.out.println("Hora de inicio: " + reserva.getHoraInicio());
                //System.out.println("Hora de fin: " + reserva.getHoraFin());
                //System.out.println("Sala reservada: " + reserva.getSala());
                //System.out.println("Precio: " + reserva.getPrecio());
                //System.out.println("Estado de la reserva: " + reserva.getEstadoReserva());
                //System.out.println("Usuario: " + reserva.getUsuario());
                //System.out.println("Código de reserva: " + reserva.getCodigoReserva());
                //System.out.println("--------------------------------------");
            //}

            //System.out.println("--------------------------------------------------");
            
        //PER COMPROBAR L'AUTENTIFICACIÓ
        Scanner scanner = new Scanner(System.in);  // Crear una instancia de Scanner
        
        System.out.print("Sietpalu introdueix el teu correu electrònic: ");  // Pedir al usuario su nombre
        String correoIngresado = scanner.nextLine();  // Leer el nombre del usuario
                
        System.out.print("Sietpalu introdueix la teva contrasenya: ");  // Pedir al usuario su nombre
        String contrasenaIngresada = scanner.nextLine();  // Leer el nombre del usuario
        
//         // Verificar las credenciales e iniciar sesión
//        Usuari usuarioIniciado = null;
//        for (Usuari usuario : usuaris) {
//            if (usuario.iniciarSesion(correoIngresado, contrasenaIngresada)) {
//                usuarioIniciado = usuario;
//                break;
//            }
//        }

//        // Verificar si se inició sesión correctamente y mostrar el usuario
//        if (usuarioIniciado != null) {
//            System.out.println("Sesión iniciada correctamente como: " + usuarioIniciado.getNom());
//        } else {
//            System.out.println("Las credenciales proporcionadas son incorrectas.");
//        }
//    }
    
}
}