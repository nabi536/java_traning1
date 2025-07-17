package Collections;

import java.util.ArrayList;
import java.util.List;

public class CollecEx {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add("nabi");
        li.add("mohi");
        li.add("mani");
        li.add("saheb");
        for (Object temp : li) {
            System.out.println(temp);
        }
        System.out.println("Second for loop");
        System.out.println();

        for(int i=0;i<li.size(); i++){
            System.out.println(li);
    }
    }
}
