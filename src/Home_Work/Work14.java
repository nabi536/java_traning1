package Home_Work;

import java.util.Scanner;

//14. Write a Program display pass or fail to user based on marks?

public class Work14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks:");
        int a = sc.nextInt();

        if(a>0 || a<100){
            System.out.println("choose between 0 to 100");
    } else if(a<28){
            System.out.println("fail");
        }else{
            System.out.println("pass");
        }
    }
}
