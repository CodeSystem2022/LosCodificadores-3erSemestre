
package test;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = 10/0;
        } catch(Exception e){
            System.out.println("Ocurrio un Error");
            e.printStackTrace(System.out);//se conoce como pila de excepciones
        }
        System.out.println("La variable de resultado tiene como valor:  = "+resultado );
    }
}