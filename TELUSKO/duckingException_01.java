class A{
    public void show() throws ClassNotFoundException
    {
        Class.forName("calc");
    }
}

public class duckingException_01 {
    public static void main(String[] args) {
        
    System.out.println("hello");

    A obj = new A();
    try {
        obj.show();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    

    }
}
