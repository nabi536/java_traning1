package Map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHash {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(1, "A");
        m1.put(2, "B");
        m1.put(3, "C");
        m1.put(4, "D");
        m1.put(10,"Nabi");
        System.out.println(m1.get(1));
        System.out.println(m1.get(2));
        System.out.println(m1.get(3));
        System.out.println(m1.get(4));
        System.out.println(m1.get(5));
        System.out.println(m1.values());
        System.out.println(m1.containsKey(1));
        System.out.println(m1.containsValue("A"));
        System.out.println(m1.remove(1));
        System.out.println(m1.remove(2,"B"));
        System.out.println(m1);
        System.out.println(m1.keySet());

        System.out.println(m1.entrySet());

        System.out.println(m1.getOrDefault(1, "A"));

        //Another map

        Set<Map.Entry<Integer,String >> set = m1.entrySet();
        Iterator<Map.Entry<Integer,String>> i = set.iterator();

        while(i.hasNext()){
            Map.Entry<Integer,String > entry1 = i.next();
            System.out.println(entry1);
            System.out.println(entry1.getKey());
            System.out.println(entry1.getValue());

        }}
}
