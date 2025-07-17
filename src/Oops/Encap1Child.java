package Oops;

public class Encap1Child {
    public static void main(String[] args) {
        Encap1 obj = new Encap1();
        obj.setAge(25);
        obj.setName("Nabi");
        obj.setSalary(1000000.99);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
    }
}
