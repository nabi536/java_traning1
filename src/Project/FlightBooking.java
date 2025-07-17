package Project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

public class FlightBooking {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Flight database with airline name and updated flight numbers
            HashMap<Integer, Flight> flights = new HashMap<>();
            flights.put(1, new Flight("IG09Y", "Delhi", "Mumbai",
                    new String[]{"06:00 AM", "12:30 PM", "07:00 PM"},
                    LocalDate.of(2023, 12, 15), "IndiGo", 120));
            flights.put(2, new Flight("AXB288", "Mumbai", "Bangalore",
                    new String[]{"08:00 AM", "02:00 PM", "09:30 PM"},
                    LocalDate.of(2023, 12, 15), "AirAsia", 90));
            flights.put(3, new Flight("UAE348", "Delhi", "Dubai",
                    new String[]{"05:00 AM", "11:30 AM", "10:00 PM"},
                    LocalDate.of(2023, 12, 16), "Emirates", 210));
            flights.put(4, new Flight("EM414", "Delhi", "London",
                    new String[]{"09:00 AM", "03:00 PM"},
                    LocalDate.of(2023, 12, 17), "Emirates", 540));
            flights.put(5, new Flight("QTR962", "Mumbai", "Doha",
                    new String[]{"07:30 AM", "10:45 PM"},
                    LocalDate.of(2023, 12, 18), "Qatar Airways", 255));
            flights.put(6, new Flight("AIC208", "Delhi", "New York",
                    new String[]{"01:00 AM", "08:30 PM"},
                    LocalDate.of(2023, 12, 20), "Air India", 900));

            // Seat classes
            HashMap<String, Double> seatPrices = new HashMap<>();
            seatPrices.put("Economy", 1.0);
            seatPrices.put("Premium Economy", 1.5);
            seatPrices.put("Business", 2.5);
            seatPrices.put("First", 4.0);

            // Food options
            HashMap<String, Double> foodOptions = new HashMap<>();
            foodOptions.put("None", 0.0);
            foodOptions.put("Vegetarian Meal", 250.0);
            foodOptions.put("Non-Vegetarian Meal", 350.0);
            foodOptions.put("Special Meal", 500.0);

            final double GST_RATE = 18.0;
            ArrayList<Booking> bookings = new ArrayList<>();

            System.out.println("✈ Welcome to M2NG Airlines Management or Ticket Booking System ✈\n");

            boolean continueBooking = true;

            while (continueBooking) {
                displayFlights(flights);
                int choice = getFlightChoice(scanner, flights.size());

                if (choice == 0) {
                    continueBooking = false;
                } else if (flights.containsKey(choice)) {
                    Flight selectedFlight = flights.get(choice);
                    handleFlightBooking(scanner, selectedFlight, seatPrices, foodOptions, GST_RATE, bookings);

                    System.out.print("\nDo you want to book another flight? (yes/no): ");
                    String another = scanner.nextLine().trim().toLowerCase();
                    if (!another.equals("yes")) {
                        continueBooking = false;
                    }
                } else {
                    System.out.println("Invalid selection. Please try again.");
                }
            }

            displayBookingSummary(bookings, GST_RATE);
            scanner.close();
        }

        private static void displayFlights(HashMap<Integer, Flight> flights) {
            System.out.println("\nAvailable Flights:");
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.printf("%-8s %-10s %-18s %-12s %-12s %-15s %-10s%n",
                    "Option", "Flight No", "Airline", "From", "To", "Date", "Duration");
            System.out.println("---------------------------------------------------------------------------------------------");

            for (Map.Entry<Integer, Flight> entry : flights.entrySet()) {
                Flight f = entry.getValue();
                System.out.printf("%-8d %-10s %-18s %-12s %-12s %-15s %-10d mins%n",
                        entry.getKey(), f.flightNumber, f.airlineName, f.departureCity, f.arrivalCity,
                        f.date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")), f.durationMinutes);
            }
            System.out.println("0. Exit");
        }

        private static int getFlightChoice(Scanner scanner, int maxOptions) {
            while (true) {
                try {
                    System.out.print("\nEnter flight option number (0 to exit): ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    return choice;
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                    scanner.nextLine();
                }
            }
        }

        private static void handleFlightBooking(Scanner scanner, Flight flight,
                                                HashMap<String, Double> seatPrices,
                                                HashMap<String, Double> foodOptions,
                                                double gstRate,
                                                ArrayList<Booking> bookings) {

            // Display timings to select
            System.out.printf("%nAvailable Timings for %s (%s | %s to %s):%n",
                    flight.flightNumber, flight.airlineName, flight.departureCity, flight.arrivalCity);
            System.out.println("---------------------------------------");
            for (int i = 0; i < flight.timings.length; i++) {
                System.out.printf("%d. %s%n", i + 1, flight.timings[i]);
            }
            System.out.println("---------------------------------------");

            int timeChoice = getTimingChoice(scanner, flight.timings.length);
            String selectedTime = flight.timings[timeChoice - 1];

            // Seat Class selection
            System.out.println("\nAvailable Seat Classes:");
            System.out.println("---------------------------------------------");
            System.out.printf("%-20s %-20s%n", "Seat Class", "Price (per ticket)");
            System.out.println("---------------------------------------------");
            for (Map.Entry<String, Double> entry : seatPrices.entrySet()) {
                double calculatedPrice = flight.basePrice * entry.getValue();
                System.out.printf("%-20s ₹%-19.2f%n", entry.getKey(), calculatedPrice);
            }
            System.out.println("---------------------------------------------");

            String seatClass = getSeatClass(scanner, seatPrices);

            // Food selection
            System.out.println("\nFood Options:");
            System.out.println("---------------------------------");
            System.out.printf("%-25s %-10s%n", "Option", "Price");
            System.out.println("---------------------------------");
            for (Map.Entry<String, Double> entry : foodOptions.entrySet()) {
                System.out.printf("%-25s ₹%-10.2f%n", entry.getKey(), entry.getValue());
            }
            System.out.println("---------------------------------");
            String foodChoice = getFoodChoice(scanner, foodOptions);

            // Ticket quantity
            int ticketCount = getNumberOfTickets(scanner);

            // Passenger details
            ArrayList<Passenger> passengers = getPassengerDetails(scanner, ticketCount);

            // Costs
            double seatCost = flight.basePrice * seatPrices.get(seatClass) * ticketCount;
            double foodCost = foodOptions.get(foodChoice) * ticketCount;
            double subtotal = seatCost + foodCost;
            double gstAmount = subtotal * gstRate / 100;
            double totalCost = subtotal + gstAmount;

            bookings.add(new Booking(flight.flightNumber, flight.departureCity, flight.arrivalCity, selectedTime,
                    flight.date, flight.airlineName, seatClass, foodChoice,
                    passengers, subtotal, gstAmount, totalCost, foodOptions.get(foodChoice)));

            System.out.printf("%nBooking Confirmed for %d passenger(s)!%n", ticketCount);
            System.out.printf("Seat Cost: ₹%.2f%n", seatCost);
            System.out.printf("Food Cost: ₹%.2f%n", foodCost);
            System.out.printf("Subtotal: ₹%.2f%n", subtotal);
            System.out.printf("GST (%.1f%%): ₹%.2f%n", gstRate, gstAmount);
            System.out.printf("Total Amount: ₹%.2f%n", totalCost);
        }

        private static int getTimingChoice(Scanner scanner, int max) {
            while (true) {
                try {
                    System.out.print("Select flight timing option: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    if (choice >= 1 && choice <= max) return choice;
                    System.out.println("Choose a valid option!");
                } catch (Exception e) {
                    System.out.println("Invalid input.");
                    scanner.nextLine();
                }
            }
        }

        private static String getSeatClass(Scanner scanner, HashMap<String, Double> seatPrices) {
            while (true) {
                System.out.print("Enter seat class: ");
                String input = scanner.nextLine().trim();
                if (seatPrices.containsKey(input)) return input;
                System.out.println("Invalid seat class. Choose again.");
            }
        }

        private static String getFoodChoice(Scanner scanner, HashMap<String, Double> foodOptions) {
            while (true) {
                System.out.print("Choose food option: ");
                String input = scanner.nextLine().trim();
                if (foodOptions.containsKey(input)) return input;
                System.out.println("Invalid food option.");
            }
        }

        private static int getNumberOfTickets(Scanner scanner) {
            while (true) {
                try {
                    System.out.print("Enter number of tickets: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    if (n > 0) return n;
                    System.out.println("Must book at least 1 ticket.");
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("Invalid number.");
                }
            }
        }

        private static ArrayList<Passenger> getPassengerDetails(Scanner scanner, int count) {
            ArrayList<Passenger> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                System.out.printf("Passenger %d:%n", i + 1);
                System.out.print("Name: ");
                String name = scanner.nextLine().trim();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Passport No: ");
                String passport = scanner.nextLine().trim();
                list.add(new Passenger(name, age, passport));
            }
            return list;
        }

        private static void displayBookingSummary(ArrayList<Booking> bookings, double gstRate) {
            if (bookings.isEmpty()) {
                System.out.println("\nNo bookings made. Thank you for visiting M2NG Airlines!");
                return;
            }

            System.out.println("\n🧾 Booking Summary 🧾");
            System.out.println("=".repeat(80));

            double grandTotal = 0;

            for (int i = 0; i < bookings.size(); i++) {
                Booking b = bookings.get(i);
                System.out.printf("%nBooking %d:%n", i + 1);
                System.out.println("Flight: " + b.flightNumber + " (" + b.airline + ")");
                System.out.println("Route: " + b.departureCity + " to " + b.arrivalCity);
                System.out.println("Date: " + b.date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
                System.out.println("Time: " + b.time);
                System.out.println("Seat Class: " + b.seatClass);
                System.out.println("Food Option: " + b.foodChoice);
                System.out.println("Passengers:");
                for (int j = 0; j < b.passengers.size(); j++) {
                    Passenger p = b.passengers.get(j);
                    System.out.printf("  %d. %s (Age: %d, Passport: %s)%n", j + 1, p.name, p.age, p.passportNumber);
                }

                System.out.println("\nCost Summary:");
                System.out.printf("Subtotal: ₹%.2f%n", b.subtotal);
                System.out.printf("GST: ₹%.2f%n", b.gstAmount);
                System.out.printf("Total: ₹%.2f%n", b.totalCost);
                grandTotal += b.totalCost;
            }

            System.out.println("=".repeat(80));
            System.out.printf("🎯 Grand Total: ₹%.2f%n", grandTotal);
            System.out.println("Thank you for booking with M2NG Airlines!");
        }

        // Class definitions
        static class Flight {
            String flightNumber;
            String departureCity;
            String arrivalCity;
            String[] timings;
            LocalDate date;
            String airlineName;
            int basePrice = 5000;
            int durationMinutes;

            public Flight(String flightNumber, String departureCity, String arrivalCity,
                          String[] timings, LocalDate date, String airlineName, int durationMinutes) {
                this.flightNumber = flightNumber;
                this.departureCity = departureCity;
                this.arrivalCity = arrivalCity;
                this.timings = timings;
                this.date = date;
                this.airlineName = airlineName;
                this.durationMinutes = durationMinutes;
            }
        }

        static class Booking {
            String flightNumber, departureCity, arrivalCity, time, seatClass, foodChoice, airline;
            LocalDate date;
            ArrayList<Passenger> passengers;
            double subtotal, gstAmount, totalCost, foodCost;

            public Booking(String flightNumber, String departureCity, String arrivalCity, String time,
                           LocalDate date, String airline, String seatClass, String foodChoice,
                           ArrayList<Passenger> passengers, double subtotal,
                           double gstAmount, double totalCost, double foodCost) {
                this.flightNumber = flightNumber;
                this.departureCity = departureCity;
                this.arrivalCity = arrivalCity;
                this.time = time;
                this.date = date;
                this.airline = airline;
                this.seatClass = seatClass;
                this.foodChoice = foodChoice;
                this.passengers = passengers;
                this.subtotal = subtotal;
                this.gstAmount = gstAmount;
                this.totalCost = totalCost;
                this.foodCost = foodCost;
            }
        }

        static class Passenger {
            String name;
            int age;
            String passportNumber;

            public Passenger(String name, int age, String passportNumber) {
                this.name = name;
                this.age = age;
                this.passportNumber = passportNumber;
            }
        }
    }
