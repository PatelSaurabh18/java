abstract class A {

    public abstract void show();

}

// class B extends A {

//     public void show() {
//         System.out.println("In A show...");
//     }

// }

public class AbstractAndAnonymousInnerClass_01 {
    public static void main(String[] args) {

        // B obj1 = new B();
        // obj1.show();

        A obj2=new A() {
            
            public void show() {
                System.out.println("In New show...");
            }
        };

        obj2.show();


    }
}
