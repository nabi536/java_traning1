package Home_Work;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tennies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO TENNIES SHOP");
        System.out.println("please enter your Name:");
        String a = sc.nextLine();

        System.out.println("please enter your Age:");
        int b = sc.nextInt();
        System.out.println();

        System.out.println("Rackets Available");
        System.out.println( " "+"1.$300:Technifibre/Babolat \n 2.$500:Head/Yonex\n 3.$800:Vector");
        System.out.println();

        System.out.println("Choose your brand:-");
        String brand = sc.next();
        String b1 ="Technifibre";
        String b2 ="Babolat";
        String b3 ="Head";
        String b4 ="Yonex";
        String b5 ="Vector";
        if(brand.equals(b1)||brand.equals(b2)){
            System.out.println("Amount is:$300");

        }else if(brand.equals(b3)||brand.equals(b4)){
            System.out.println("Amount is:$500");

        }else if(brand.equals(b5)||brand.equals(b5)){
            System.out.println("Vector");
            System.out.println("Amouns is:$800");
        }else{
            System.out.println("This"+" "+brand+" "+"brand is not available");
        }
        System.out.println("Enter the delivery date in the form of (DD/MM/YYY)");
        System.out.println("Date:");
        String date = sc.next();
        System.out.println("Thank you for conforming the Order");
    }
}