package Enum;

public enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        System.out.println(Days.THURSDAY.ordinal());
        System.out.println(Days.valueOf("MONDAY"));

        Days[] a = Days.values();
        for(Days ob:a){
            System.out.println(ob);
        }
    }
}
