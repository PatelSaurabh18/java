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

public class runnablevsThreadInJava_01 {
    public static void main(String[] args) {

        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("saurabh");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("patel");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
