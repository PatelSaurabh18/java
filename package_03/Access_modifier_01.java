class A
{
    private int marks=10;


    int show()
    {
        return marks;
    }
}

public class  Access_modifier_01
{
    public static void main(String[] args)
    {
        
        A obj1=new A();

        System.out.println(obj1.show());
        
    }
}
