// class A implements Runnable{
//     public void run()
//     {
//         for(int i=0;i<10;i++)
//         {
//             System.out.println("saurabh");
//             try {
//                 Thread.sleep(2);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// } 

// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("patel");
//             try {
//                 Thread.sleep(2);
//             } catch (InterruptedException e) {
//             }
//         }
//     }
// }
class counter{
    int count;
    public void increment()
    {
        count++;
    }
}

public class raceInThreads_01 {
    public static void main(String[] args) {

        counter c = new counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
               c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


        System.out.println(c.count);
    }
}

