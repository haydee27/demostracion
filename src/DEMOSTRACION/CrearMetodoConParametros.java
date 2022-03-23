
package DEMOSTRACION;

public class CrearMetodoConParametros {
    public static void main( String [] args){
        System.out.println("Metodo void: ");
        metodoConParametrosVoid(1, 24, 34, "Lucas");
        System.out.println("------------------");
        System.out.println("Metodo Int: ");
        metodoConParametrosInt (1);
        System.out.println("---------------");
        System.out.println("Metodo con double");
        metodoConParametrosDouble(24,34);
        System.out.println("---------------");
        System.out.println("Metodo String");
        metodoConParametrosString("Lucas");
    }
    
    public static void metodoConParametrosVoid(int ValorInt, double ValorDouble, String ValorString){
        System.out.println("Valor int: " + ValorInt); 
        System.out.println("Valor de Double: " + ValorDouble);
        System.out.println("Valor de String: " + ValorString);
        
    }
    
    public static int metodoConParametrosInt(){
        
    }
    
}
