package Home_Work;

import java.util.Scanner;

/*4.Write a Program to check whether number is
even or odd?*/

public class Work4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("it an even number");
        }else{
            System.out.println("it is an odd number");
        }
    }
}
