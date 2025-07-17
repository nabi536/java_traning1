package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hm {
    public static void main(String[] args) {
        Map<Integer,String > m1 = new HashMap<>();
        m1.put(1,"A");
        m1.put(2,"B");
        m1.put(3,"C");
        m1.put(5,"D");
        m1.put(4,"E");
        m1.put(6,"D");
        m1.put(1,"nabi");

        System.out.println(m1);
        System.out.println(m1.get(1));
        System.out.println(m1.get(2));
        System.out.println(m1.get(6));
        System.out.println(m1.values());
        System.out.println(m1.containsValue("sai"));

        /*Set<Integer> s1 = m1.keySet();
        for(Integer temp : s1){
            System.out.println(temp);
        }*/

         for(Map.Entry<Integer,String> temp :m1.entrySet()) {
            System.out.println(temp.getKey() + "--->" + temp.getValue());
        }
        /*for(Map.Entry<Integer,String> temp :m1.entrySet()) {
            System.out.println(temp.getKey());
        }*/
    }
}
