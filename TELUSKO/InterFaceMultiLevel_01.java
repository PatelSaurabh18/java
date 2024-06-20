interface A {
    public abstract void showA();
}

interface B extends A {
    public abstract void showB();
}

class C implements B {
    public void showA() {
        System.out.println("In A Show....");
    }

    public void showB() {
        System.out.println("In B Show....");
    }
}

// class C implements A, B {
// public void showA() {
// System.out.println("In A Show....");
// }

// public void showB() {
// System.out.println("In B Show....");
// }
// }

public class InterFaceMultiLevel_01 {
    public static void main(String[] args) {

        C obj1 = new C();
        obj1.showA();
        obj1.showB();

    }
}
