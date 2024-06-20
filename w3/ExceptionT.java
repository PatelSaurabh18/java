
public class ExceptionT {

   void checkAge(int age) { 
    try{
          if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
          } else {
            System.out.println("Access granted - You are old enough!"); 
          }
      } catch(Exception e){
            System.out.println("Throwed Error "+e); 
      }

}

  public static void main(String[] args) {
    ExceptionT obj = new ExceptionT();

    obj.checkAge(15);
    }
}

