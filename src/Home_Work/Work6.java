package Home_Work;

import java.util.Scanner;

//6. How to check number is +Ve,-Ve or Zero?

public class Work6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number:");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("it is positive");
        } else if (a < 0) {
            System.out.println("it is negative");
        } else {
            System.out.println("it is zero");
        }

    }
}