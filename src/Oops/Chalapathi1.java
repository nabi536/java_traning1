package Oops;

public class Chalapathi1 implements Chalapathi{
    @Override
    public String hello() {
        return "nabi";
    }

    @Override
    public String hello1() {
        return "Saheb";
    }

    @Override
    public int add() {
        return 100;
    }

    @Override
    public int sub() {
        return 200;
    }

    public static void main(String[] args) {
        Chalapathi1 obj = new Chalapathi1();
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.hello());
    }
}
