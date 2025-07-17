package Basics;

public class Sample {
    int a,b;
    int add(){
        return a+b;
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        s.a=10;
        s.b=20;
        System.out.println(s.add());
    }
}
