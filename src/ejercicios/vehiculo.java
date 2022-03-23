
package ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class vehiculo {
    public static void main(String[] args){
        
        double  Depre, DAI;
        double VA=0, VF=0, VS=0;
        //CREAR EL OBJETO PARA LLAMAR A LAS CLASES 
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //MANEJO DE ERRORES
        try{
            System.out.println("Ingrese el valor de vehiculo: ");
            VA= Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el valor de los fletes: ");
            VF= Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el valor del seguro del vehiculo: ");
            VS = Double.parseDouble(leer.readLine());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        
        //proceso para sacar la depreciacion del vehiculo
         Depre= VA * 0.10;
         
         //Proceso para sacar el monto de DAI
         
         DAI = (VA - Depre - VF - VS) * 0.25;
        
        
        System.out.println( "El valor de su vehiculo es: $" + VA );
        System.out.println("El costo de depreciacion es : $" + Depre);
        System.out.println("El costo por fletes es: $ " + VF);
        System.out.println("El costo por seguro es: $" +VS);
        System.out.println("El derecho arancelario a la importacion de su vehiculo es:$ " + DAI);
    }
}
