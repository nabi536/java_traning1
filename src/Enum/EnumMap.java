package Enum;

import java.util.HashMap;
import java.util.Map;

public enum EnumMap {
    WRONG_PIN,
    INSUFFICIENT,
    NETWORK_ERROR,
    SERVER_ERROR,
    DAILY_LIMIT_EXCEEDED,
    MONTHLY_LIMIT_EXCEEDED,
    YOUR_CARD_IS_INVALID,
    YOUR_TRANSACTION_IS_ILLEGAL;

    public static void main(String[] args) {
        Map<Integer,EnumMap> m = new HashMap<>();
        m.put(100,EnumMap.WRONG_PIN);
        m.put(101,EnumMap.INSUFFICIENT);
        m.put(102,EnumMap.NETWORK_ERROR);
        m.put(103,EnumMap.SERVER_ERROR);
        m.put(104,EnumMap.DAILY_LIMIT_EXCEEDED);
        m.put(105,EnumMap.MONTHLY_LIMIT_EXCEEDED);
        m.put(106,EnumMap.YOUR_CARD_IS_INVALID);
        m.put(107,EnumMap.YOUR_TRANSACTION_IS_ILLEGAL);
        System.out.println(m+" ");
        System.out.println(m.get(10));
        for(Map.Entry<Integer,EnumMap>entry:m.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue()+" ");
        }





    }
}
