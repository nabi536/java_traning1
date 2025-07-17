package Oops;

public class Example2 {
    public int add(int a){
        return a;
    }
    public int add(int a,int b){
        return a+b;
    }
    public String add(String a, String b, String c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        System.out.println(obj.add(20));
        System.out.println(obj.add(20,20));
        System.out.println(obj.add("Inaganty","Nabi","Saheb"));
    }
}
