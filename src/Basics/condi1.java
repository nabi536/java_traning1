package Basics;
import java.util.Scanner;
public class condi1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = sc.nextInt();
        System.out.println("Enter b value:");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a is bigger than b");
        }else{
            System.out.println("a is maller than b");

        }
    }
}
