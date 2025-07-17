package Methods;

public class StringBuilder1 {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb= new StringBuilder(s);
        sb.append("Faang");
        sb.reverse();
        String s1 = sb.toString();
        System.out.println(s1);
    }

}
