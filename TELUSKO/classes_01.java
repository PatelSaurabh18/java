
class A {

    public void f1() {
        System.out.println("Hello World! ");
    }

}

public class classes_01 {

    public int x = 10;

    public static void main(String[] args) {
        // f1();

        A obj1 = new A();
        obj1.f1();

        // obj1.x=12;
        // System.out.println(obj1.x);

        // System.out.println(x);

        classes_01 obj2=new classes_01();
        obj2.x=132;

        System.out.println(obj2.x);

    }

}
