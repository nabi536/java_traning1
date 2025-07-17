package Oops;

public class SmallHello {
    public static void main(String[] args) {


        Hello hello = new Hello();
        SmallHello obj = new SmallHello();
        System.out.println(hello.age);
        System.out.println(hello.name);
        System.out.println(hello.add(10, 20));
       // System.out.println(hello.subtract());
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int subtract(int a,int b){
        return a-b;
    }

    public int add(int a, int b) {
        return a + b;
    }
}
