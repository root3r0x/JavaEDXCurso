//Ejemplo el paquete .util se importa manual
//mientras que java.lang es el único que se importa automaticamente.
import java.util.*; 

public class ErroresComundes {
   public static void main(String[] args) {
      //Errores comundes en Java Mayusculas y minusculas.

      //Integer es una clase, comienza con mayuscula.
      Integer varInteger = new Integer(1); //Deprecaded. Solo es ejemplo.
      //Miestras que string es un tipo de dato por comenzar en minuscula.
      int var = 2;

      /**
       * Un error común es intentar utilizar una clase en nuestros programas 
       * sin importar los paquetes requeridos. En relación al uso de los arrays 
       * de dos dimensiones, los programadores novatos tienden a asumir que los 
       * arrays bidimensionales están implementados directamente en Java. 
       * Por lo tanto, un error común  es escribir:
       * int[,] array = new int[2,5];
       *        
       * En Java tenemos que crear las filas en primer lugar y, después, las 
       * columnas. Los arrays bidimensionales son dos arrays unidimensionales 
       * que contiene cada uno una dimensión diferente. Por lo tanto, la 
       * sentencia previa debería haber sido escrita de la siguiente manera:
       */
      int[][] array = new int[2][]; 
      array[0] = new int[5]; //Se asigna la longitud de la posicion 0.
      array[1] = new int[5]; //Se asigna la longitud de la psiscion 1.
      //O de forma mas corta
      int[][] array2 = new int[5][4];
   }
}
