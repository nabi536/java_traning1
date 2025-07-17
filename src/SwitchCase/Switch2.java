package SwitchCase;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour =sc.nextInt();

        switch(hour){
            case 5: case 6: case 7: case 8: case 9: case 10: case 11:
                System.out.println("Morning");
                break;
            case 12: case 13: case 14: case 15: case 16:
                System.out.println("Afternoon");
                break;
            case 17: case 18: case 19: case 20:
                System.out.println("Evening");
                break;
            case 21: case 22: case 23: case 0: case 1: case 2: case 3: case 4:
                System.out.println("Night");
                break;
            default:
                System.out.println("Enter with in the 1 to 24 hours");
        }
    }
}