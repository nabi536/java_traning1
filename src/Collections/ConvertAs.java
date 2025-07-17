package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertAs {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(10,20,30,40,20));
        System.out.println(a1);
        int sum=0;
        for (int i = 0; i < a1.size(); i++) {
            sum+=a1.get(i);
        }
        System.out.println(sum);

        Set<Integer> s1 = new HashSet<>(a1);
        System.out.println(s1);

    }
}
