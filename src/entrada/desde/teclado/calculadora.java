
package entrada.desde.teclado;

import java.io.BufferedReader; //importa las clases para la lectura desde teclado
import java.io.InputStreamReader;//son tipos string habra que convertir los datos

public class calculadora {
   public static void main(String [ ] args){
       double cantidad1=0;
       double cantidad2=0;
       
       //crear el objeto leer de las clases correspondientes para obtener los datos
       
       BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
       
       try{ //se utiliza el manejo de errores de lo contrario genera error
           System.out.println("Ingrese cantidad 1: ");
           //Hace la lectura desde teclado y lo convierte a double
           cantidad1 = Double.parseDouble(leer.readLine());
           
           System.out.println("Ingrese la cantidad 2: ");
           cantidad2 = Double.parseDouble(leer.readLine());
          }catch (Exception e){//Captura del error
              System.out.println(e.getMessage());
          }
       System.out.println(cantidad1 + "  " + cantidad2);
   } 
}
