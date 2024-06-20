import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arraylist_01 {
    public static void main(String[] args) {

        // Collection nums = new ArrayList();// it is the collection of objects

        // nums.add(5);
        // nums.add(6);
        // nums.add(7);

        // for (Object n: nums) {
        // int num = (Integer)n;

        // System.out.println(num*2);
        // }

        // it doesnt support Index value
        // Collection<Integer> nums = new ArrayList<Integer>();

        // nums.add(5);
        // nums.add(6);
        // nums.add(7);

        // for (int n : nums) {

        // System.out.println(n * 2);
        // }

        // List Supports repetitive VALUES

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(6);
        nums.add(7);

        System.out.println(nums.get(1));
        System.out.println(nums.indexOf(5));

    }
}