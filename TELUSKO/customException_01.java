class saurabhException extends Exception {
    public saurabhException(String str) {
        super(str);
    }
}

public class customException_01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int arr[] = { 1, 2, 3, 4, 5 };
        String str = null;
        int c;

        try {
            // System.out.println(str.size());
            // System.out.println(str.length());
            // int c = a / b;
            // arr[5]=10;
            // System.out.println(str.length());
            c = a + b;
            throw new saurabhException("HA ha ha");

        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Error Accured...." + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Accured...." + e);
        } catch (NullPointerException e) {
            System.out.println("String galat hai : " + e);
        } catch (saurabhException e) {
            System.out.println("saurabh exception hai "+ e);
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        } finally {
            System.out.println("Bye");
        }

    }
}