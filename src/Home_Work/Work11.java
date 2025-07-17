package Home_Work;

import java.util.Scanner;

/*11. Write a Program whether person is a kid, Teenage, adult or
old age based on age?*/

public class Work11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        if(age<=14){
            System.out.println("he is kid");
        }else if(age>=15 && age<=20){
            System.out.println("he is teenage");
        }else if(age>=21 && age<=50){
            System.out.println("he is adult");
        }else{
            System.out.println("he is old");

        }
    }
}
