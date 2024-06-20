
abstract class A 
{
    public abstract void Run();
    public abstract void Jump();
    public void show()
    {
        System.out.println("Showing....");
    }
    
}




class B extends A{

    public void Run()
    {
        System.out.println("Running...");
    }

    public void Jump()
    {
        System.out.println("Jumping....");
    }

}

public class Abstract_01 {
    
    public static void main(String[] args) {

        B obj1=new B();
        obj1.Jump();
        obj1.Run();

        obj1.show();
        
    }
}
