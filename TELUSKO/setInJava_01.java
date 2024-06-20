// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

import java.util.Collection;
import java.util.TreeSet;
import java.util.Iterator;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class setInJava_01 {
    public static void main(String[] args) {
        
        
        //set gives us non-repetitive values and doesnt
        //have indices and shows values in random order
        // Set<Integer> nums = new HashSet<Integer>();

        // nums.add(7);
        // nums.add(6);
        // nums.add(5);
        // nums.add(8);
        // nums.add(7);

        // // System.out.println(nums.get(1));
        // // System.out.println(nums.indexOf(5));

        // for(int i: nums)
        // {
        //     System.out.println(i);
        // }

        //TreeSet can also gives us repetitive values and
        //have indices and shows values in accesending order
        Collection<Integer> nums = new TreeSet<Integer>();

        nums.add(7);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        // for(int i: nums)
        // {
        //     System.out.println(i);
        // }

        Iterator<Integer> values =nums.iterator();
        while(values.hasNext())
        System.out.println(values.next());

    }
}
