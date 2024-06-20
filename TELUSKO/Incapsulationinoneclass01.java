public class Incapsulationinoneclass01
{

    int id=1;
    String name="saurabh";
    float marks=73.5f;


    // void setData(int id,String name,float marks)
    // {
    //     this.id=id;
    //     this.name=name;
    //     this.marks=marks;
    // }

    void getData()
    {
        System.out.println("id : " + id + "name : " + name + "marks : " + marks);
    }

    public static void main(String[] args)
    {
       Incapsulationinoneclass01 obj1= new Incapsulationinoneclass01();

    //    obj1.setData(12, "Saurabh", 78.4f);
       obj1.getData();



    }
}