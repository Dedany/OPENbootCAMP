
package POO;


public class SmartWatch extends SmartDevice {
    boolean glonass ;

    public SmartWatch(String colour, String tienda, double sice, double weight, int price, boolean bluethoot, boolean gps) {
        super(colour, tienda, sice, weight, price, bluethoot, gps);
    }
    
    @Override
   public void operation(){
       System.out.println("este reloj se queda sin bateria rápido, está estropeado");
   }
    }
    
    
 
    
            


