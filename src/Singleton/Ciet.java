package Singleton;

public class Ciet {
    public int age =25;
    public String name = "nabi";

    //private object early creation
    public static final Ciet obj = new Ciet();

    //private constructor
    private Ciet(){

    }

    //public factory method
    public Ciet getInstance(){
        return obj;
    }

    public static void main(String[] args) {
        Ciet ciet = new Ciet();
        System.out.println(ciet.getInstance());
        System.out.println(obj.age);
        System.out.println(obj.name);

    }
}
