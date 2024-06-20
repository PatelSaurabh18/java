@FunctionalInterface
interface A {
    public void show1();
    // public void show2();  

    /* functional interface can't have two abstract methods */

    // {
    // System.out.println("in A Show...");
    // }
}

// class B implements A
// {
// public void show()
// {
// System.out.println("in B Show...");
// }
// }

public class FunctionalInterface_01 {
    public static void main(String[] args) {

        B obj1 = new B() {
            public void show1() {
                System.out.println("in  Show...");
            }
        };

        obj1.show();

    }
}
