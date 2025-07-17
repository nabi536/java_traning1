package Collections;

import java.util.ArrayList;
import java.util.List;

public class BigData {
    public static void main(String[] args) {
        List li = new ArrayList();
        //creating the data
        li.add("nabi");
        li.add("saheb");
        li.add(25);
        li.add(6);
        System.out.println(li.get(1));
        li.set(1,"mohi");
        System.out.println(li.get(1));
        System.out.println(li.remove(0));
        System.out.println(li);


        //create a class where you can create al
        //to add family names using add method
        //print all of them using for loop
        //print all of them using for enhanced loop
    }
}
