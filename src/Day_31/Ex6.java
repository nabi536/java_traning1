package Day_31;

public class Ex6 {
        public static void main(String[] args) {
            int div=0;
            try{
                div=10/0;
                System.out.println("welcome");
            }catch (ArithmeticException ex){
                System.out.println("exception handled 1");
            }catch (NullPointerException ex){
                System.out.println("exception handled 2");
            }catch (Throwable ex){
                System.out.println("exception handeled 3");
            }
        }
    }
