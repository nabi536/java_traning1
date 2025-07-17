package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinkedHash {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new LinkedHashMap<>();
        m1.put(1,"A");
        m1.put(2,"B");
        m1.put(3,"C");
        m1.put(5,"E");
        m1.put(4,"D");
        m1.put(6,null);
        m1.put(null,"hi");
        m1.put(null,null);

        System.out.println(m1);
    }
}
