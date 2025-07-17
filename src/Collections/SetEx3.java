package Collections;

import java.util.Set;
import java.util.TreeSet;

public class SetEx3 {
    public static void main(String[] args) {
        Set<Integer> s3 = new TreeSet<>();
        s3.add(2);
        s3.add(6);
        s3.add(5);
        s3.add(5);
        s3.add(8);
        s3.add(10);
        System.out.println(s3);

        for(Object temp : s3){
            System.out.println(temp);
            //s3.add(11); // in this adding element is not possible
        }
        System.out.println(s3);
    }
}
