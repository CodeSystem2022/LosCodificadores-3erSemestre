
package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql(); // No se puede instanciar desde la Interfase, sino desde 
                                                        // la Clase que implementa el comportamiento de esa Interface.
        //datos.listar();                                 // Se ejecuta el método de la Clase. Sucede el polimorfismo.
        //imprimir(datos);
        datos = new ImplementacionOracle();             // A través del polimorfismo va a la implementación de Oracle.
        //datos.listar();                                 // La misma variable apunta a diferentes implementaciones.
        imprimir(datos);
    } 
    public static void imprimir(IAccesoDatos datos){    // Método static (de acuerdo a main), que recibe de la interface datos.
        datos.listar();                                 // Depende de que referencia recibe datos.
    }
                                                        
}

