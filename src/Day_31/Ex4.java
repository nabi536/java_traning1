package Day_31;

public class Ex4 {
    public static void main(String[] args) {
        int c = 0;

        try {
            int a = 10;
            int b = 0;
             c = a / b;
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        finally {
            System.out.println( c);
        }
    }
}
