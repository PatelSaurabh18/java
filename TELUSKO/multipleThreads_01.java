class A extends Thread {
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("saurabh");
        }
    }
} 

class B extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("patel");
        }
    }
}


public class multipleThreads_01 {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2= new B();

        obj1.start();
        obj2.start();
    }
}
