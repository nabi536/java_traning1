package Enum;

public enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static void main(String[] args) {
        Months[] a = Months.values();
        for(Months obj:a){
            System.out.println(obj);
        }
    }
}
