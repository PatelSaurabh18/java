class A {

    int age;

    public void show()
    {
        System.out.println("In show");
    }

    // static class B 
    // {
    //     public void config()
    //     {
    //         System.out.println("In config....");
    //     }
    // }

    // Only inner class can be static

    class B 
    {
        public void config()
        {
            System.out.println("In config....");
        }
    }
}

public class innerClass_01 {
    public static void main(String[] args) {

        A obj1=new A();
        obj1.show();


        A.B obj2=obj1.new B();
        obj2.config();

        // A.B obj2=new A.B();
        // obj2.config();


        // the above example is of static class




    }
}