// package Training;

public class Static_01 {

    int a=10;
    static int  b=100;


    public static void main(String[] args) {


        Static_01 obj1=new Static_01();
        Static_01 obj2=new Static_01();
        Static_01 obj3=new Static_01();

        obj1.a=1000;
        obj1.b=2000;

        System.out.println(obj2.a);
        System.out.println(obj2.b);





    }
    
}
