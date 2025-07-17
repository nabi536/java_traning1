package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(10);
        s2.add(20);
        s2.add(30);
        s2.add(40);
        s2.add(25);
        System.out.println(s2);

        for(Object temp : s2){
            System.out.println(temp);
           // s2.add(5); //in this adding element is not possible
        }
        System.out.println(s2);
    }
}
