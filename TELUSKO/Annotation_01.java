
class A {
    public void show() {
        System.out.println("Show A...");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("Show B...");
    }
}

public class Annotation_01 {
    public static void main(String[] args) {

        B obj1 = new B();
        obj1.show();
    }
}
