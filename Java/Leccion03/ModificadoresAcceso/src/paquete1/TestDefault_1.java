
package paquete1;

public class TestDefault {
    public static void main(String[] args) {
        //Clase2 clase2 = new Clase2();
        ClaseHija2 claseH2 = new ClaseHija2();
        claseH2.atributoDefault = "Cambio desde la prueba";
        System.out.println("claseH2 atributo default = " + claseH2.atributoDefault);
        
    }
}
