package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arras1 {
    public static void main(String[] args) {
        List<Integer> l2 = new LinkedList<>(Arrays.asList(10,20,30,40,100,null));
        System.out.println(l2);

        /*for(Object temp : l2)
            System.out.println(temp);*/

        Iterator<Integer> ite =l2.iterator();

       /* while(ite.hasNext()){
            System.out.println(ite.next());*/

            //l2.add(24);

            l2.remove(Integer.valueOf(100));
            System.out.println(l2);
        }
    }

//collection
   //List
   //Set
   //Map
   //Queue
   //Iterator
   //Iterable
   //SortedTree
   //ListIterator