import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class ListadoPersonasApp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del while
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menu
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch(Exception e){
                System.out.println("Ocurrió un error: "+e.getMessage());
            }
            System.out.println();
        }//Fin ciclo while
    }//Fin metodo main

    private static void mostrarMenu(){
        //mostramos las opciones
        System.out.print("""
                ******* Listado de Personas *******
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Digite una de las opciones: ");
    }

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        // Revismos la opción digitada a través de un switch
        switch (opcion){
            case 1 -> { //Agregar una persona a la lista
                System.out.print("Digite el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Digite el telefono: ");
                var tel = entrada.nextLine();
                System.out.print("Digite el correo: ");
                var email = entrada.nextLine();
                // Se crea el objeto persona
                var persona = new Persona(nombre, tel, email);
                // Agregamos la persona a la lista
                personas.add(persona);
                System.out.println("la lista tiene: "+personas.size()+" elementos");
            } // Fin caso 1
        }
    } // Fin del método ejecutarOperación
} // Fin de la clase ListadoPersonasApp
