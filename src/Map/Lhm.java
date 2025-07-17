package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lhm {
    public static void main(String[] args) {
        Map<Integer,String > m2 = new LinkedHashMap<>();
        m2.put(1,"A");
        m2.put(2,"B");
        m2.put(4,"C");
        m2.put(3,"D");
        m2.put(5,"E");
        m2.put(1,"nabi");

        System.out.println(m2);
    }
}
