package Oops;

public class AbstractEx00 extends AbstractEx0{
    @Override
    public int add() {
        return 200;
    }

    @Override
    public int sub() {
        return 100;
    }

    @Override
    public String display() {
        return "This is display method";
    }
    public int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        AbstractEx00 abstractEx00 = new AbstractEx00();
        System.out.println(abstractEx00.display());
        System.out.println(abstractEx00.add());
        System.out.println(abstractEx00.sub());
    }
}
