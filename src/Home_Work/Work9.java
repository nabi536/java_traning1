package Home_Work;

import java.util.Scanner;

//9. Write a Java program whether year is a leap year or not?

public class Work9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int a = sc.nextInt();
        if((a%4==0 && a%100!=0)||(a%400==0)){
            System.out.println("is a leap year");
        }else{
            System.out.println("is not a leap year");
        }
    }
}
