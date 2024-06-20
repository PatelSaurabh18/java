
class A 
{
    int a;

    void showOfA()
    {
        System.out.println("In Outer Show...");
    }


    class B
    {
        void showOfB()
        {
            System.out.println("In Inner Show....");
        }
    }
}


public class innerClass_02
{
    public static void main(String[] args) {

        A obj1=new A();
        obj1.a=10;
        System.out.println(obj1.a);
        obj1.showOfA();

        A.B obj2=obj1.new B();
        obj2.showOfB();
    


    }
}