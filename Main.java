
package PrecioIva;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        precio();
        
            
       
    }
    public static void precio(){
         Scanner entrada = new Scanner(System.in);
        double precio,precioiva;
        System.out.println("introduce el precio");
        precio=entrada .nextFloat();
        System.out.println("con iva es "+precio*1.21);
  
        
        
        
        
    }
    
}
