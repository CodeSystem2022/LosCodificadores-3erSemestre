
package ar.com.system2023.mundopc;

//Creamos la clase Orden
public class Orden {
    //Atributos
    private final int idOrden;
    private Computadora computadora[];//Arreglo de objeto vacio
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadora;
    
    //Constructor Vacio
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    //Metodo para agregar una nueva computadora al Arreglo
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadora < Orden.MAX_COMPUTADORAS){
            this.computadora[this.contadorComputadora++] = computadora;
        }
        else{
            System.out.println("Has superado el limite: "+Orden.MAX_COMPUTADORAS);
        }
    }
    //Metodo para mostrar Orden
    public void mostrarOrden(){
        System.out.println("Orden #: "+this.idOrden);
        System.out.println("Computadoras de la orden #: "+this.idOrden);
        for (int i = 0; i < this.contadorComputadora; i++){
            System.out.println(this.computadora[i]);
        }
    }
}
