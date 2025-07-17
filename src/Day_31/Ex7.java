package Day_31;

public class Ex7 {
    // Method declares it might throw an Exception
    public int add(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("Negative numbers not allowed");
        }
        return a + b;
    }

    public static void main(String[] args) {
        Ex7 obj = new Ex7();

        try {
            int result = obj.add(10, -5);
            System.out.println("Result: " + result);
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
