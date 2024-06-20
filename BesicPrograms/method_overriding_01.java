class calc
{
    public calc()
    {
        System.out.println("Constructor calc");
    }

    int Add(int m,int n)
    {
        return (m+n);
    }
}


class Advcalc extends calc
{
    public Advcalc()
    {
        System.out.println("Constructor Advcalc");
    }

    // int Add(int m,int n)
    // {
    //     return (m+n+1);
    // }


}


public class method_overriding_01 {

    public static void main(String[] args)
    {
        Advcalc obj1=new Advcalc();

        System.out.println(obj1.Add(1, 2));

        
    }
    
}
