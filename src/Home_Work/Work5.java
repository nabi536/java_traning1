package Home_Work;

import java.util.Scanner;

//5. Write a Program to check number is even or odd without using if-else?

public class Work5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println((a%2==0)?"This is even number":"This is odd number" );

    }
}
