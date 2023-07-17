
package POO;

public class main {
    
    public static void main (String []args ){
        SmartPhone iphone= new SmartPhone(true,"negro","apple",23.32,234.3,1200,true,true);
        SmartWatch applewatch = new SmartWatch ("rosa","Mediamark",20,03,459,false,true);
        
        iphone.operaction();
        System.out.println("tiene airdrop" +iphone.airdrop);
        iphone.airdrop=true;
        System.out.println(iphone.airdrop);
        System.out.println(iphone.colour);
        
        
        applewatch.operation();
        System.out.println(applewatch.bluethoot);
        applewatch.bluethoot=true;
        System.out.println(applewatch.bluethoot);
        
    }
    
    
}

