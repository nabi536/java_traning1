package Oops;

public class EncapChild extends Encap {
    public static void main(String[] args) {
        EncapChild obj = new EncapChild();
        obj.setAge(25);
        obj.setName("nabi");
        obj.setLocation("palaparru");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj.getLocation());
    }
}
