package Collections;

import org.w3c.dom.css.ElementCSSInlineStyle;

import java.util.*;

public class Arras {
    public static void main(String[] args) {
    List<Integer> l1 =  new ArrayList<>(Arrays.asList(6,7,8,9));
    l1.add(10);
    l1.add(15);
    l1.add(20);
    l1.add(25);
    l1.add(30);
    System.out.println(l1);


        for (Object temp : l1)
            System.out.println(temp);


    }
}
