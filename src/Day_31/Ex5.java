package Day_31;

public class Ex5 {
    public static void main(String[] args) {
                int div=0;
                try{
                    div = 10/0;
                    System.out.println("welcome");
                }
                catch (RuntimeException e) {
                    System.out.println("Exception handled");
                }
            }
        }

