package Oops;

public class Const1 {
    private int age;
    private String gender;
    private String name;
    private long salary;

public Const1(int age,String gender,String name,int salary) {
    this.age = age;
    this.gender = gender;
    this.name = name;
    this.salary = salary;
}

    public static void main(String[] args) {
        Const1 obj = new Const1(25, "male","nabi",10000000);
        System.out.println(obj.age);
        System.out.println(obj.gender);
        System.out.println(obj.name);
        System.out.println(obj.salary);

    }
}
