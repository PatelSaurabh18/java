class mobile {
    String brand;
    int price;
    static String name;



    static {
        name="phone";
        System.out.println("In static Block");
    }

    // static block is called at once when the class 
    // lodes , in jvm classloder is used to load a class

    public mobile()
    {
    brand="realme";
    price=16000;
    // name="smartphone";
    System.out.println("In Constructor");
    }


    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class static_block_01 {
    public static void main(String[] args)  throws ClassNotFoundException {


        Class.forName("mobile"); 


        // mobile obj1 = new mobile();

        // obj1.brand = "apple";
        // obj1.price = 18000;
        // // mobile.name = "smartphone";

        // obj1.show();

         
        // mobile obj2 = new mobile();

        // obj2.brand = "apple";
        // obj2.price = 18000;
        // // mobile.name = "smartphone";


        // obj2.show();

        // 11 21 11 22 11 23
        // 11 21 12 22 13 23

    }
}
