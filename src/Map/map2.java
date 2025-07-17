package Map;

import java.util.HashMap;
import java.util.Map;

public class map2 {
    public static void main(String[] args) {
        Map<Integer,String> m2 = new HashMap<>();
        m2.put(1,"Nabi");
        m2.put(2,"Dhanu");
        m2.put(3,"Mani");
        m2.put(4,"Kiran");
        m2.put(5,null);
        m2.put(null,null);
        m2.put(10,"Saheb");
        m2.put(1,"Khasim");

        m2.putIfAbsent(6,"Sai");
        System.out.println(m2);
        System.out.println(m2.get(5));
        System.out.println(m2.values());
        System.out.println(m2.containsKey(1));
        System.out.println(m2.containsValue("Nabi"));
        //System.out.println(m2.remove(1));
      // System.out.println(m2.remove(2,"Dhanu"));
        System.out.println(m2);
        System.out.println(m2.keySet());
        System.out.println(m2.values());
    }
}
