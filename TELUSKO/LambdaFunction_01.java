@FunctionalInterface
interface A {
    void show(int i);
    // {
    // System.out.println("Show A..");
    // }
}

// class B extends A
// {

// }

public class LambdaFunction_01 {
    public static void main(String[] args) {

        // A obj1 = () -> {
        // System.out.println("in Show...");

        // };

        // A obj1 = (i) -> System.out.println("in Show..."+i);
        // obj1.show(5);

        // A obj1 = new A() {
        //     public void show(int i) {
        //         System.out.println("Hello" + i);
        //     }
        // };

        // obj1.show(5);

        A obj2 = (i) -> {
            System.out.println("Hello obj2" + i);

        };

        obj2.show(10);



    }

}
