public class static_and_public_01 {
    

    public static void f1()
    {
        System.out.println("Static");
    }

    public void f2()
    {
        System.out.println("Public");
    }

    public static void main(String[] args)
    {
        static_and_public_01.f1();

        f1();
        // f2();

        static_and_public_01 obj=new static_and_public_01();

        obj.f1();
        // f2();
    }
}
