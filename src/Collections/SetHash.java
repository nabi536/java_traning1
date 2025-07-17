package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetHash {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        System.out.println(s1);

        for(Object obj : s1)
            System.out.println(obj);

        System.out.println(s1.contains(50));
        s1.remove(10);
        System.out.println(s1);
    }
}
