package Oops;

public class Constructor {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(add(10,20));
        Constructor obj = new Constructor();
    }
    public Constructor(){
        System.out.println("Hello i am default construct");
    }
    public static int add(int a, int b){
        return a+b;
    }

}
