package Home_Work;

import java.util.Scanner;

//10. Write a program to check whether number is a Buzz number or not?

public class Work10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a%3==0)&&(a%5!=0)){
            System.out.println("Fizz");
        }else
            System.out.println("buzz");

    }
}
