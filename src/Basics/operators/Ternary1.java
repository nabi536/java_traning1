package Basics.operators;

public class Ternary1 {
    public static void main(String args[]){
        int a = 20;
        String gender="male";

        System.out.println((a>18)&&(gender=="male")?"eligible" :"not eligible");
        System.out.println((a>=1&&a<=18)?"Teen":(a>=18&&a<=24)?"adult":"khgyf");
    }
}
