class A
{
    void show()
    {
        System.out.println("In A Show()");
    }
}

class B extends A
{
    void show()
    {
        System.out.println("In B Show()");
    }
}

public class polymorphism_01 {
    public static void main(String[] args)
    {

        B obj1;
        obj1=new B();

        obj1.show();
    }

}
