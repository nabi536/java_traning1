package Map;

import java.util.Hashtable;
import java.util.Map;

public class Htable {
    public static void main(String[] args) {
        Map<Integer,String > m4 = new Hashtable<>();
        m4.put(1,"A");
        m4.put(2,"B");
        m4.put(4,"C");
        m4.put(3,"D");
        m4.put(5,"E");
        m4.put(1,"nabi");

        System.out.println(m4);
    }
}
