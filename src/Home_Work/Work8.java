package Home_Work;

import java.util.Scanner;

//7.How to check which number is bigger among 3 numbers?

public class Work8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        int a = sc.nextInt();

        System.out.println("Enter b value:");
        int b = sc.nextInt();

        System.out.println("Enter c value:");
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("hear a is bigger");
        }else if(b>=a && b>=c){
            System.out.println("here b is bigger");
        }else{
            System.out.println("here c is bigger");
        }
    }
}
