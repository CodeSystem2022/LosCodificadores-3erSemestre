
package test;

import domain.*;

public class TestClaseObject {
   public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        if (empleado1 == empleado2){
            System.out.println("Tienen la misma rerferencia en memoria");
        }
        else{
            System.out.println("Tienen distintas referencias en memoria");
        }
        //Insert code
        
    }
     
}
