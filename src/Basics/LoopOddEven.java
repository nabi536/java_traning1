package Basics;

public class LoopOddEven {
    public static void main(String[] args) {
        System.out.print("Even: ");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Odd: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }}
