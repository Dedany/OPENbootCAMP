
package POO;


public class SmartPhone extends SmartDevice {
    
    boolean airdrop;

    public SmartPhone(boolean airdrop, String colour, String tienda, double sice, double weight, int price, boolean bluethoot, boolean gps) {
        super(colour, tienda, sice, weight, price, bluethoot, gps);
        this.airdrop = airdrop;
    }

   
    
   
    
    public void operaction(){
        System.out.println("el móvil funciona correctamente");
    }
    
}
