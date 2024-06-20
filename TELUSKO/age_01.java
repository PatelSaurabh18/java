public class age_01 {
    static void Age(int age)
    {
        if(age > 18)
        {
            System.out.println("Can Vote ! ");
        }

        else{
            System.out.println("Can't Vote !");
        }
    }


    public static void main(String[] args)
    {
        Age(82);
    }
}
