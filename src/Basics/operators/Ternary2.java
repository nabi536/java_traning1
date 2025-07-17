package Basics.operators;

public class Ternary2 {
    public static void main(String args[]){
        int a = 10;
        String gender="Female";

        System.out.println((a>18)&&(gender=="male")?"eligible" :"not eligible");
        System.out.println((a>=1&&a<=18)?"Teen":(a>=18&&a<=24)?"adult":"khgyf");
    }
}
