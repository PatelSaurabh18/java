public class constructors_01 {
    int x;

    public constructors_01(int k)
    {
        x=k;
    }

    public static void main(String[] args)
    {
        constructors_01 obj1=new constructors_01(100);
        System.out.println(obj1.x);
    }
}
