import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// import java.util.Collection;

class student implements Comparable<student> {
    int age;
    String name;

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(student that) {
        // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }

}

public class comparable_01 {

    public static void main(String[] args) {

        Comparator<student> com = new Comparator<student>() {
            public int compare(student i, student j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<student> studs = new ArrayList<student>();
        studs.add(new student(21, "saurabh"));
        studs.add(new student(30, "Himanshu"));
        studs.add(new student(12, "john"));
        studs.add(new student(16, "sujan"));

        Collections.sort(studs);
        System.out.println(studs);

        // for(student s : studs)
        // {
        // System.out.println(s);
        // }

    }
}
