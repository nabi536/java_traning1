package Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a =sc.nextLine();
        String b =sc.nextLine();
        char[] ch = a.toCharArray();
        char [] arr = b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(arr);
        if(Arrays.equals(ch,arr))
            System.out.println(true);
        else
            System.out.println(false);

        }

    }

