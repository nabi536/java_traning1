package Basics;
import java.util.Scanner;
public class ReadingData {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the a valuel:");
        int a = sc.nextInt();
        System.out.println( "Enter the b valuel:");
        byte b = sc.nextByte();
        System.out.println( "Enter the c valuel:");
        float c = sc.nextFloat();
        System.out.println( "Enter the d valuel:");
        double d = sc.nextDouble();
        System.out.println( "Enter the e valuel:");
        long e = sc.nextLong();
        System.out.println( "Enter the f valuel:");
        String f = sc.next();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
