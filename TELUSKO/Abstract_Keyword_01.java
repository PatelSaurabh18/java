abstract class  Car
{
    public abstract void drive();
    public abstract void playMusic() ;
   
}

class WaganR extends Car{
    public void drive()
    {
        System.out.println("Driving...");
    }

    public void playMusic()
    {
        System.out.println("Music Playing...");
    }
}


public class Abstract_Keyword_01 {
    
    public static void main(String[] args) {
        

        // car obj1= new car();
        // obj1.drive();
        // obj1.playMusic();

        // Car obj1=new WaganR();
        // obj1.drive();
        Car obj1= new WaganR();
        obj1.drive();
        obj1.playMusic();
        
        


    }
}
