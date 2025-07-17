package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHm {
    public static void main(String[] args) {
        Map<Integer,String > m5 = new ConcurrentHashMap<>();
        m5.put(1,"A");
        m5.put(2,"B");
        m5.put(4,"C");
        m5.put(3,"D");
        m5.put(5,"E");
        m5.put(1,"nabi");

        System.out.println(m5);
    }
}
