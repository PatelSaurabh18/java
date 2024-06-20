public class Encapsulation_01 {

    private int k;

    public void set(int x)
    {
        k=x;
    }

    public int get()
    {
        return k;
    }


    public static void main(String[] args)
    {
        Encapsulation_01 obj=new Encapsulation_01();

        obj.set(12);
        System.out.println(obj.get());
    }
}
