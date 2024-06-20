public class method_overloading_01 {
    // static void SUm(int x, int  y)
    // {
    //     int z=x+y;
    //     System.out.println("Sum of x  and y is : " + z);
    // }

    // static void SUm(int x,float y)
    // {
    //     float z=x+y;
    //     System.out.println("Sum of x  and y is : " + z);  
    // }

    static int Add(int x,int y)
    {
        return x+y;
    }

    static float Add(float x,float y)
    {
        return (float)x + y;
    }

    public static void main(String[] args)
    {
        // SUm(2,7);
        // SUm(2,3.3f);

        float intsum = Add(5, 6);
        float floatsum = Add(3.4f,5.6f);

        System.out.println("Intsum : " + intsum);
        System.out.println("floatsum : " + floatsum);
        
    }


}
