
package ejercicios;

import java.util.Scanner;

public class salarioejer_5 {
    public static void main (String [] args){
        
         Scanner l = new Scanner (System.in);
     
    String N ;
    double SM, LLT;
    double R = 0.10; 
    
        System.out.println("Escriba el nombre del empleado: ");
        N = l.nextLine();
        System.out.println("Escriba el salario por mes: $ ");
        SM = l.nextDouble();
        System.out.println("Minutos por llegadas tardias: ");
        LLT = l.nextDouble();
        
       double SB = SM - salarioejer_5.FormulaSalario(SM, LLT) - salarioejer_5.retencionPorRenta(SM, R);
        System.out.println("El nombre del empleado es: " + N);
        System.out.println("El descuento por llegadas tardias es: " + salarioejer_5.FormulaSalario(SM, LLT));
        System.out.println("La retencion de renta: " + salarioejer_5.retencionPorRenta(SM, R));
        System.out.println("El salario en bruto es: " + SB);
        
    }
    
    public static double FormulaSalario(double SM, double LLT){
      double  S= (SM / 30) / 8  ;
      double SxM = S * 60 ;
      double desc= SxM * LLT;
       return desc; 
    }
    
    public static double retencionPorRenta(double SM, double R){
        double TR = SM * R;
        return TR;
    }
    
    
}
