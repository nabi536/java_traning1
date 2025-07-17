package SwitchCase;

import java.util.*;;

public class Exp0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcomr to FNAG CINEMAS!");
        System.out.println("Currenty showing");
        System.out.println("1.Bahubali -------- 09:00Am");
        System.out.println("2.Akhanda  -------- 12:00Pm");
        System.out.println("3.OG       -------- 04:00Pm");
        System.out.println("4.Devara   -------- 09:00Pm");

        System.out.println("Choose your movie: ");
        int n = sc.nextInt();
        switch(n){
            case 1:System.out.println("Bahubali ---- 09:00Am");
            break;
            case 2:
                System.out.println("Akhanda     ---- 12:00Pm");
                break;
            case 3:
                System.out.println("OG          ---- 04:00Pm");
                break;
            case 4:
                System.out.println("Devara      ---- 09:00Pm");
                break;
            default:
                System.out.println("No");
        }

        System.out.println("Choose your seat type:");
        System.out.println("recliner ---- Rs.500/-");
        System.out.println("standard ---- Rs.200/-");
        int seat = sc.nextInt();
        switch(seat){
            case 1:
                System.out.println("recliner ---- 500/-");
                break;
            case 2:
                System.out.println("standard ---- 200/-");
                break;
            default:
                System.out.println("No");
                break;
        }
        System.out.println("Bill");


    }
}
