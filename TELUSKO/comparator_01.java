import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// import java.util.Collection;

public class comparator_01 {

    public static void main(String[] args) {
       
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i,Integer j){
                if(i%10 >j%10) return 1;
                else return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(48);
        nums.add(12);
        nums.add(35);
        nums.add(17);
        nums.add(26);

        Collections.sort(nums,com);
        System.out.println(nums);
        




    }
}