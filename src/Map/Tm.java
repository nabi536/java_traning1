package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tm {
    public static void main(String[] args) {
        Map<Integer,String > m3 = new TreeMap<>();
        m3.put(1,"A");
        m3.put(2,"B");
        m3.put(3,"C");
        m3.put(4,"D");
        m3.put(5,"E");
        m3.put(1,"nabi");

        System.out.println(m3);
    }
}
