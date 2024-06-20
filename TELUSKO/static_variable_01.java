class mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : " + price+" : " + name);
    }
}



public class static_variable_01 {
    public static void main(String[] args)
    {
        mobile m1=new mobile();

        m1.brand="apple";
        m1.price=18000;
        // mobile.name="smartphone";

        mobile m2=new mobile();

        
        m2.brand="Samsung";
        m2.price=20000;
        // mobile.name="smartphone";


        mobile.name="phone";

        //static variable should be asscessed with the class name
        // but it also can be asscessed by the object name but avoid that


        

        m1.show();
        m2.show();






    } 
}
