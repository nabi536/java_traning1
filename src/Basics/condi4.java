package Basics;

import java.util.Scanner;

public class condi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("a is positive");
        }else if(a<0){
            System.out.println("b is negative");
        }else{
            System.out.println("c is zero");
        }
    }
}
