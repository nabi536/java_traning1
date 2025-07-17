package Methods;

public class StringBuil {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Faang");
        s1.append("Hello");  //append means adding
        System.out.println(s1);
        System.out.println(s1.reverse());
        System.out.println(s1.delete(2,3));
        //System.out.println(s1.substring(2,5));


    }
}
