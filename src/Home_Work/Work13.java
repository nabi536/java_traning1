package Home_Work;

import java.util.Scanner;

//13. Write a Program to display wish message to end user based on time?

public class Work13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<=11){
            System.out.println("Good morning");
        }else if(a>=12 && a<=18){
            System.out.println("Good afternoon");
        }else if(a>=19 && a<=24){
            System.out.println("Good night");
        }
    }
}
