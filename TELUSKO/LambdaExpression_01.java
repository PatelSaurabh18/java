@FunctionalInterface
interface A {
    public void show();

}

// class B implements A {
// public void show() {
// System.out.println("in B Show...");
// }
// }

public class LambdaExpression_01 {
    public static void main(String[] args) {

        // B obj1 = new B() {
        // public void show() {
        // System.out.println("in Show...");
        // }
        // };
        // obj1.show();

        A obj1 = () -> {
                System.out.println("in  Show...");
        };
        obj1.show();

    }
}
