class A extends Thread {
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("saurabh");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
} 

class B extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("patel");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
            }
        }
    }
}


public class threadPriority_01 {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2= new B();

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());



        obj1.start();
        obj2.start();
    }
}


