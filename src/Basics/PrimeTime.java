package Basics;

import java.util.Scanner;

public class PrimeTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n =sc.nextInt();
        int fact = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                fact++;
            }
        }
        System.out.println(fact);
        if(fact==2)
            System.out.println("prime");
        else
            System.out.println("composite");
    }
}
