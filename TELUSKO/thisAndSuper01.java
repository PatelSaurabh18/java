class A extends Object
{

    int a;

    public A() {
        super();
        System.out.println("In constructor A ");
    }

    public A(int x) {
        super();
        System.out.println("Para Constructor A");
        a = x;
    }
}

class B extends A {
    int b;

    public B() {

        super();
        System.out.println("In constructor B");
    }

    public B(int y) {

        this();
        // super(y);
        System.out.println("Para constructor B");
        b = y;
    }
}

public class thisAndSuper01 {

    public static void main(String[] args)

    {

        B obj1 = new B(5);

    }
}
