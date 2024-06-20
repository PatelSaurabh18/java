// import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class map_01 {
    public static void main(String[] args) {
        

        //hashtable can also be used in place of ahshMap 
        Map<String,Integer> students = new Hashtable<>();

        students.put("saurabh", 98);
        students.put("suraj", 90);
        students.put("raunak", 70);
        students.put("abhishek",100);
        students.put("saurabh", 99);

        //key can't be repeted cause these are unique
        //and keys are set and values are of list

        // System.out.println(students);
        // System.out.println(students.get("raunak"));
        // System.out.println(students.keySet());
        // System.out.println(students.values());

        for(String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
            
        }



    }
}
