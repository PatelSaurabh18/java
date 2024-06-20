class A {
    public A() {
        System.out.println("Object Created");
    }

    public static void show() {
        System.out.println("In A Show");
    }
}

public class Anonymousobj_01 {

    public static void main(String[] args) {

        {
            // A obj1 = new A();

            /*
             * 
             * A obj1 = new A();
             * -> A obj;
             * obj = new A();
             * it means that A obj; is just a reference of a class
             * and obj1 = new A() is the object creation
             * and we are reffering a object as obj1 of A class
             * 
             */

            // new A();

            new A().show();


            // obj1.show();

        }
    }
}
