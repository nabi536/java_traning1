package Oops;

public class Example1 {
    public void display(int a){
        System.out.println("1 parameters");
    }
    public void display(int a, int b){
        System.out.println("2 parameters");
    }
    public void display(String name){
        System.out.println("it is a String");
    }
    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.display(10);
        obj.display(20,30);
        obj.display("ciet");
    }
}
