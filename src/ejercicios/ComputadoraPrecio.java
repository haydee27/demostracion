
package ejercicios;

import java.util.Scanner;

public class ComputadoraPrecio {
    
    public static void main (String[] args){
        
        Scanner leer= new Scanner(System.in);     
 
        double precio;
        System.out.println("El precio de la computadora es: $ ");
         precio = leer.nextDouble();   
         
         double iva = 0.13;
         double desc= 0.15;
         double ttalprecio, ttaliva, ttaldesc, tIVA;
         
        ttaliva= precio * iva ;
        tIVA= precio + ttaliva;
        ttaldesc= tIVA * desc;
        ttalprecio = tIVA - ttaldesc;
        
        System.out.println("El precio de su computadora es: $ " + ttalprecio);
        
    }
}
