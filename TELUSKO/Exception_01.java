public class Exception_01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int arr[]={1,2,3,4,5};
        String str=null;


        try {
            // System.out.println(str.size());
            System.out.println(str.length());
            int c = a / b;
            arr[5]=10;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Error Accured...." + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error Accured...." + e);  
        }
        catch(NullPointerException e)
        {
            System.out.println("String galat hai : "+e);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong...");
        }
        finally{
            System.out.println("Bye");
        }
        

        // System.out.println("Bye");

    }
}
