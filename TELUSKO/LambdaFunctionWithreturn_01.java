
@FunctionalInterface
interface A {
    int show(int a,int b);
    // {
    // System.out.println("Show A..");
    // }
}

// class B extends A
// {

// }

public class LambdaFunctionWithreturn_01 {
    public static void main(String[] args) {

        // A obj1 = () -> {
        // System.out.println("in Show...");

        // };

        // A obj1 = (i) -> System.out.println("in Show..." + i);

         A obj1 = (a,b) ->  (a+b);
            
        
        

        int result = obj1.show(5,10);
        System.out.println(result);

    }
}