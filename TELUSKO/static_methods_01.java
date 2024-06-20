class mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
        // System.out.println();
    }

    public static void show1(mobile obj1) {
        System.out.println("in static method");
        System.out.println(obj1.brand + " : " + obj1.price + " : " + obj1.name);
        // System.out.println(name);

    }
}

public class static_methods_01 {
    public static void main(String[] args) {


        
        mobile obj1 = new mobile();
        obj1.brand = "apple";
        obj1.price = 18000;
        // mobile.name="smartphone";

        
        mobile obj2 = new mobile();
        obj2.brand = "Samsung";
        obj2.price = 20000;
        // mobile.name="smartphone";

        mobile.name = "phone";

        // static variable should be asscessed with the class name
        // but it also can be asscessed by the object name but avoid that

        // obj1.show();
        // obj2.show();

        // mobile obj1 = new mobile();


        obj1.show();
        // mobile.show();   #ERROR

        mobile.show1(obj1);

        // obj1.show1();  #WARNING



    }
}
