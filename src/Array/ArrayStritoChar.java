package Array;

public class ArrayStritoChar {
    public static void main(String[] args) {
        String[] friend = {"nabi","saheb","nani"};
        String name = friend[0];
        char[] ch = name.toCharArray();
        for(char c:ch){ //c is a duplicate name to enter into array & we can change to nabi
            System.out.println(c);
        }
    }
}
