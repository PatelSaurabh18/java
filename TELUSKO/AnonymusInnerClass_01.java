class A
{

    public void show()
    {
        System.out.println("In A show..");
    }
}


// class B extends A{

//     public void show()
//     {
//         System.out.println("In B show..");
//     }

// }

public class AnonymusInnerClass_01 {
    public static void main(String[] args) {


        // B obj1=new B();
        // obj1.show();

        A obj=new A()
        {
            public void show()
            {
                System.out.println("In New show..");
            }
        };

        obj.show();

    }
}
