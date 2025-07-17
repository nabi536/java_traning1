package Collections;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> s4 = new CopyOnWriteArraySet<>();
        s4.add(90);
        s4.add(80);
        s4.add(70);
        s4.add(60);
        System.out.println(s4);

        for(Object temp : s4) {
            System.out.println(temp);

            s4.add(10);
        }
        System.out.println(s4);

    }
}
