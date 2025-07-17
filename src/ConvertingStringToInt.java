public class ConvertingStringToInt {
    static int salary = 200000;
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = "13";
        int number = Integer.parseInt(s3);
        System.out.println(number);
        System.out.println(s1==s2);
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(salary);
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.concat(s2));
    }
}
