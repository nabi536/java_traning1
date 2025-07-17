package SwitchCase;

import java.util.*;

    public class Exp1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to FNAG CINEMAS!");
            System.out.println("Currently showing:");
            System.out.println("1. Bahubali -------- 09:00 AM");
            System.out.println("2. Akhanda  -------- 12:00 PM");
            System.out.println("3. OG       -------- 04:00 PM");
            System.out.println("4. Devara   -------- 09:00 PM");

            System.out.print("Choose your movie (Enter 1-4): ");
            int movieChoice = sc.nextInt();
            String movieName = "";
            String showTime = "";

            switch (movieChoice) {
                case 1:
                    movieName = "Bahubali";
                    showTime = "09:00 AM";
                    break;
                case 2:
                    movieName = "Akhanda";
                    showTime = "12:00 PM";
                    break;
                case 3:
                    movieName = "OG";
                    showTime = "04:00 PM";
                    break;
                case 4:
                    movieName = "Devara";
                    showTime = "09:00 PM";
                    break;
                default:
                    System.out.println("Invalid movie selection.");
                    return;
            }

            System.out.println("Seat Types:");
            System.out.println("1. Recliner ---- Rs.500/-");
            System.out.println("2. Standard ---- Rs.200/-");
            System.out.print("Choose your seat type (Enter 1 or 2): ");
            int seat = sc.nextInt();
            String seatType = "";
            int seatPrice = 0;

            switch (seat) {
                case 1:
                    seatType = "Recliner";
                    seatPrice = 500;
                    break;
                case 2:
                    seatType = "Standard";
                    seatPrice = 200;
                    break;
                default:
                    System.out.println("Invalid seat type selection.");
                    return;
            }

            // GST Calculation
            double gstRate = 0.18; // 18%
            double gstAmount = seatPrice * gstRate;
            double totalAmount = seatPrice + gstAmount;

            // Final Bill
            System.out.println("\n-------- TICKET SUMMARY --------");
            System.out.println("Movie     : " + movieName);
            System.out.println("Show Time : " + showTime);
            System.out.println("Seat Type : " + seatType);
            System.out.println("Base Price: Rs." + seatPrice);
            System.out.printf("GST (18%%) : Rs.%.2f\n", gstAmount);
            System.out.printf("Total Bill: Rs.%.2f\n", totalAmount);
            System.out.println("Thank you for choosing FNAG CINEMAS!");
        }
    }
