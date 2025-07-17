package Basics;

import java.util.Scanner;

public class PrimeTime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ch = 0;
        for (int i = 0; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("composite");
                ch = 1;
                break;
            }
        }
        if (ch == 0)
            System.out.println("prime");
    }
}
