package test;

import domain.*;

public class TestInstaceOf {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Agustin", 10000);
        determinarTipo(empleado1);
        Gerente gerente = new Gerente("Ricardo", 30000, "Sanidad");
        determinarTipo(gerente);
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        } else if (empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
//            Gerente gerente = (Gerente)empleado;
//            System.out.println("gerente = " + gerente.getDepartamento());
        }else if (empleado instanceof Object){
            System.out.println("Es de tipo object");
        }
    }
}
