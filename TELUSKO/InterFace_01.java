
interface A{

    public abstract void Config();
    // public  void show()
    // {
    //     System.out.println("In A Show...");
    // }

    
    
}

class B implements A 
{
    public  void Config()
    {
        System.out.println("Configuring...");
    }
}

public class InterFace_01 {
    
    public static void main(String[] args) {
        
        B obj1=new B();
        obj1.Config();
        // obj1.show();


    }
}
