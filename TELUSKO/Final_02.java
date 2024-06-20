
//  class A {

//     int a;
//     public final void show()
//     {
//         System.out.println("Show  Of A...");
//     }

// }

// class B extends A {

//     public void show()
//     {
//         System.out.println("Show Of B...");
//     }
// }

// final method can't be overridden


final class A {

    int a;
    public  void show()
    {
        System.out.println("Show  Of A...");
    }

}

// final class cant be inherited


public class Final_02 {

    final int y=20;
    
    public static void main(String[] args) {

        final int x=10;
        System.out.println(x);
        

        Final_02 obj1=new Final_02();
        System.out.println(obj1.y);

    }
}
