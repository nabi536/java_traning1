package Home_Work;

import java.util.Scanner;

/*2. Write a program to check whether a number is divisible
with another number or not?*/
public class Work2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        int a = sc.nextInt();

        System.out.println("Enter b value:");
        int b = sc.nextInt();

        if(b==0){
            System.out.println("zero is not divisible");
        }else if(a%b==0){
            System.out.println("a is divisible to b");
        }else{
            System.out.println("a is not divisible to b");

        }
    }
}
