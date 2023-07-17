
package POO;


public abstract class SmartDevice {
    
     protected String colour,tienda;
     protected double sice,weight;
     protected int price;
     protected boolean bluethoot,gps;

    public SmartDevice(String colour, String tienda, double sice, double weight, int price, boolean bluethoot, boolean gps) {
        this.colour = colour;
        this.tienda = tienda;
        this.sice = sice;
        this.weight = weight;
        this.price = price;
        this.bluethoot = bluethoot;
        this.gps = gps;
    }

      public void operation(){
}
}
