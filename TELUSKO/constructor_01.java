class human {
    int id;
    String name;


    public human()
    {
        // System.out.println("In constructor");
        id=12;
        name="saurabh";
    }

    public human(int id,String name) {
        // System.out.println("in Constructor");
        this.id = id;
        this.name = name;
    }

    void showData()
    {
        System.out.println("ID : " + id + " NAME : " + name);
    }
}

public class constructor_01 {

    public static void main(String[] args)

    {
        // human obj1= new human(34,"Suraj Singh");

        human obj2=new human();
        obj2.showData();

        // obj1.showData();

        
    }
}
