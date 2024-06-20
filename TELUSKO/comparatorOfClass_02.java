import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// import java.util.Collection;

class students{
    int age;
    String name;
    public students(int age, String name) {
        this.age = age;
        this.name = name;
    }
  
    public String toString() {
        return "students [age=" + age + ", name=" + name + "]";
    }
}

public class comparatorOfClass_02 {

    public static void main(String[] args) {
       
        Comparator<students> com = new Comparator<students>() {
            public int compare(students i,students j){
                if(i.age%10 >j.age%10) return 1;
                else return -1;
            }
        };


        List<students> studs = new ArrayList<students>();
        studs.add(new students(21, "saurabh"));
        studs.add(new students(30, "Himanshu"));
        studs.add(new students(12, "john"));
        studs.add(new students(16, "sujan"));

        Collections.sort(studs,com);
        System.out.println(studs);

        // for(students s : studs)
        // {
        //     System.out.println(s);
        // }
        




    }
}
