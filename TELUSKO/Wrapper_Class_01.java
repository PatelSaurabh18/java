

public class Wrapper_Class_01 {
    public static void main(String[] args) {
        
        int num=7;

        // Integer num1=new Integer(10);  // boxing

        Integer num1=  num; //Autoboxing

        // int num2=num1.intValue(); //unboxing
        int  num2 = num1; //AutoUnBoxing


        System.out.println(num2);

        String str="12";
        int n=Integer.parseInt(str);

        System.out.println(n+num);

    }
}
