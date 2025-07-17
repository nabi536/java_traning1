package Basics.operators;

import java.util.Scanner;

public class condi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int a = sc.nextInt();
        if((a%4==0)||(a%100!=0)){
            System.out.println("Is a leap year");
        }else{
            System.out.println("Is not a leap year");
        }
    }
}
