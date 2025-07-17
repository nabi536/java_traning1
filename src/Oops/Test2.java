package Oops;

import java.util.Scanner;

public class Test2 extends Example1  {
    public static int square(int a){
        return a*a;
    }
    public static int rectangle(int a, int b){
        return 2*(a+b);
    }
    public static double circle(double c){
        return 3.14*(c*c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Test2 obj = new Test2();
        System.out.println(obj.square(a));
        System.out.println(obj.rectangle(a,b));
        System.out.println(obj.circle(c));
    }
}
