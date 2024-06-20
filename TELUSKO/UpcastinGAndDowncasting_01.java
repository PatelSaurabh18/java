class A {

    public void show1() {
        System.out.println("In A show1");

    }
}

class B extends A {
    public void show2() {
        System.out.println("In B show1");

    }
}

public class UpcastinGAndDowncasting_01 {

    public static void main(String[] args) {

        // System.out.println("Hello");

        // A obj1 = (A) new B();
        A obj = new B(); // these are the same , implicitly
        obj.show1(); //upcasting


        B obj1 = (B) obj;
        obj1.show2(); //downcasting

    }
}