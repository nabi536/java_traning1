package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetEx5 {
    public static void main(String[] args) {
        Integer[] a ={13,23,33,33333,3333333};
        Set<Integer> s1 = new HashSet<>(Arrays.asList(a));

        System.out.println(Collections.min(s1));
        System.out.println(Collections.max(s1));

    }
}
