

class human {
    private int id;
    private String name;
    private float marks;

    void setData(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void getData() {
        System.out.println("id : " + id + " name : " + name + " marks : " + marks);
    }

}

public class incap_02 {

    public static void main(String[] args) {

        human obj1 = new human();


        obj1.setData(12, "Saurabh", 78.4f);
        obj1.getData();

    }
}
