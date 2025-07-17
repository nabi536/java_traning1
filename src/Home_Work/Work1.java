package Home_Work;

import java.util.Scanner;

//1. Write a program to accept two integers and check whether they are
//   equal or not?
public class Work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a integer:");
        int a = sc.nextInt();
        System.out.println("Enter the b integer:");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("This integers are equal");
        }else{
            System.out.println("This integers are not equal");

        }
    }
}
