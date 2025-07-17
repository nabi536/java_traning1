package Home_Work;

import java.util.Scanner;

public class Work17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character:");
        char ch = sc.next().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("This is lowercase letters");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("This is Uppercase letters");

        }
    }
}
