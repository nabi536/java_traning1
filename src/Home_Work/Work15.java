package Home_Work;

import java.util.Scanner;

/*15. Write a program to display a suitable message according to temperature state below?
Temp < 0 then Freezing weather
Temp 0-10 then Very Cold weather
Temp 10-20 then Cold weather
Temp 20-30 then Normal weather
Temp 30-40 then Hot weather
Temp >=40 then Very Hot weather*/

public class Work15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if(temp<0){
            System.out.println("Freezing weather");
        }else if(temp>=0 && temp<10){
            System.out.println("very cold weather");
        }else if(temp>=10 && temp<20){
            System.out.println("Cold weather");
        }else if(temp>=20 && temp<30){
            System.out.println("Normal method");
        }else if(temp>=30 && temp<40){
            System.out.println("Hot weather");
        }else if(temp>=40){
        }
            System.out.println("Very Hot weather");
        }
}
