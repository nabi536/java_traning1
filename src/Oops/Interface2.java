package Oops;
//Interface
//Abstraction-Abstract-50%  Interfaces-100%
//extends, abstract, interfaces, abstractions


public class Interface2 implements Interface1{

    public int add(){
        return 200;
    }
    public String name(){
        return "nabi";
    }

    public static void main(String[] args) {
        Interface2 obj = new Interface2();
        System.out.println(obj.add());
        System.out.println(obj.name());
    }
}
