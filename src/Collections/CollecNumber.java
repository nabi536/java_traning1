package Collections;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class CollecNumber {
    public static void main(String[] args) {
        List n1 = new ArrayList();
        n1.add(10);
        n1.add(35);
        n1.add(20);
        n1.add(45);

       // System.out.println(n1.get(0));
        Collections.sort(n1);
        System.out.print(n1);
        /*for(Object temp:n1){
            System.out.println(temp);
        }*/
    }
}
