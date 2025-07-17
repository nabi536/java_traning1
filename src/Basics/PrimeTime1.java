package Basics;

import java.util.Scanner;

public class PrimeTime1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int fact = 0;
        for(int i=0;i<=Math.sqrt(n);i++){
            if(n%i==0){
                fact++;
            }
        }
        if(fact==2)
            System.out.println("prime");
        else
            System.out.println("composite");
    }
}
