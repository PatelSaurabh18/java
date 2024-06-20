import java.net.SocketImpl;

class laptop {
    String model;
    int price;

    public String toString() {
        return "saurabh123";
    }

    // public boolean equals(laptop that) {
    //     if ((this.model.equals(that.model)) && this.price==that.price) {
    //         return true;
    //     }
    //     // (this.model.equals(that.model)) && (this.price.equals(that.price))
    //     else
    //         return false;
    // }


    



}

public class ObjectClass_01 {

    public static void main(String[] args) {

        laptop l1 = new laptop();
        l1.model = "chiron";
        l1.price = 2000;

        System.out.println(l1.toString());

        laptop l2 = new laptop();
        l2.model = "chiron";
        l2.price = 2000;

        System.out.println(l1.toString());

        boolean result = l1.equals(l2);

        System.out.println(result);

    }
}
