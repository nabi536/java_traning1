package Singleton;

public class Ex2 {
    public int age=25;
    public String name="Nabi Saheb";

    public static Ex2 obj;

    //private constructor
    private Ex2() {

    }
    //public factory method
    public static Ex2 getInstance(){
        if(obj==null){
            obj=new Ex2();
        }
        return obj;
    }

    public static void main(String[] args) {
        Ex2 obj = new Ex2();
        System.out.println(obj.getInstance());
        System.out.println(obj.name);
    }
}
