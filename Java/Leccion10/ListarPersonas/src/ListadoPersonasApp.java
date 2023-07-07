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
            mostrarMenu()
        }//Fin ciclo while
    }//Fin metodo main
}