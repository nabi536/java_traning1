package Oops;

//POJO
//plain old JAVA object
//It is used as binding the data through private variables and public setters and getters

public class Encap1 {
    private int age;
    private String name;
    private double salary;

    public void setAge(int a){
        age = a;
    }
    public int getAge() {
        return age;
    }
    public void setName(String b){
        name = b;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double c){
        salary = c;
    }

    public double getSalary() {
        return salary;
    }
}
