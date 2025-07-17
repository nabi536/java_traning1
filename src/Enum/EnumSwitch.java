package Enum;
//wrong pin-100
  //Insufficient-101
  //Network error-102
  //server Error-103
  //Daily Limit Exceded-104
  //monthly Limit Exceded-105
  //Your card is invalid-106
  //Your Transaction is illegal
public enum EnumSwitch {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public static void main(String[] args) {
        EnumSwitch day = MONDAY;
        switch(day){
            case MONDAY:
                int a =10;
                int b =20;
             System.out.println(a+b);
             break;
            case TUESDAY:
                System.out.println("TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("THURSDAY");
                break;
            case FRIDAY:
                System.out.println("FRIDAY");
                break;
            case SATURDAY:
                System.out.println("SATURDAY");
                break;
            case SUNDAY:
                System.out.println("SUNDAY");
                break;
        }
    }
}
