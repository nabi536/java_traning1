package Basics;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a>b)&&(a>c)?a:(b>c)?b:c);
    }
}
