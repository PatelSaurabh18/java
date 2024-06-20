
public class TryCatchWithThrow_01 {
    public static void main(String[] args) {

        int a = 18;
        int b = 0;
        int c=0;

        int arr[]={1,2,3,4,5};
        String str=null;


        try {
            c = a / b;
            if(b==0)
            {
                throw new ArithmeticException("I don't want to print Zero.");
            }
            // arr[4]=10;
            // System.out.println(str.length());


        } catch (ArithmeticException e) {
            // TODO: handle exception

            c = a / 1;
           
            // System.out.println("Error Accured...." + e);
            System.out.println("thats the default Output..." + e);
        }


        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error Accured...." + e);  
        }


        catch(Exception e)
        {
            System.out.println("Something went wrong...");
        }

        // System.out.println(c);
        

        System.out.println("Bye");

    }
}

