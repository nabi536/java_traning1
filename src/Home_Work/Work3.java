package Home_Work;

import java.util.Scanner;

/*3. Write a program to determine whether person is eligible for
casting vote or not?*/

public class Work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            if(age>=18){
                System.out.println("you are eligible to vote");
            }else{
                System.out.println("your not eligible to vote");
            }
    }
}
