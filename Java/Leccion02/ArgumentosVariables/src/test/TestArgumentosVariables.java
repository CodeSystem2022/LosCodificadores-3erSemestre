
package test;


public class TestArgumentosVariables {
  public static void main(String[] arg) {
      
        }
  //los 3 puntos muestran que es un argumento variable
  private static void imprimirNumeros(int...numeros){ // esta variable se va a convertir en un arreglo de tipo entero con una cantidad indefinida de elementos
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Elementos: "+numeros[i]);
    }
  }
}
