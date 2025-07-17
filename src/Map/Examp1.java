package Map;

import java.util.*;

public class Examp1 {
    public static void main(String[] args) {
        String[] s = {"nabi", "mani", "jani", "sai"};
        Map<Character, Integer> m1 = new TreeMap<>();

        for(String s1 : s){
            for(char c : s1.toCharArray()){
                m1.put(c, m1.getOrDefault(c, 0) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : m1.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
