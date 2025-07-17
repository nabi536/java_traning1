package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(5);
        s1.add(10);
        s1.add(15);
        s1.add(20);
        s1.add(25);
        System.out.println(s1);

        for(Object temp: s1){
            System.out.println(temp);
           // s1.add(6);  //in this adding element is not possible
        }
        System.out.println(s1);

    }
}
