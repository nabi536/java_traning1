package Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertAs1 {
    public static void main(String[] args) {
        Set<Integer> s1 = new LinkedHashSet<>(Arrays.asList(1,2,10,20,30,10,0,-20));
        System.out.println(s1);

        Set<Integer> s2 = new TreeSet<>(Arrays.asList(10,20,111,2,2,2,30,40,-22));
        System.out.println(s2);

        //it uses the Comparator
        //comparable
        //single thread
        //it remove duplicate values

    }
}
