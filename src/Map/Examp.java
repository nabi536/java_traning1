package Map;

import java.util.ArrayList;
import java.util.*;

public class Examp {
    public static int fre(int targ, List<Integer> l1){
        int count =0;
        for(int ele : l1){
            if(targ == ele)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Integer a[] = {1,2,3,1,4,5,2,6,1};
        List<Integer> l1 = new ArrayList<>(Arrays.asList(a));
        Map<Integer,Integer> m1 = new LinkedHashMap<>();

        for(Integer i : l1)
            m1.put(i,fre(i,l1));
        System.out.println(m1);
    }
}
