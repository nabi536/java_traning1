package Collections;
import java.util.*;

public class Arraylist1 {
    public static void main(String[] args) {

       Integer[] a = new Integer[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();

        List<Integer> num=new ArrayList<>(Arrays.asList(a));
        System.out.println(num);
        num.add(11);
        System.out.println(num);

        List<Integer> num1=new ArrayList<>(Arrays.asList(500,600,700,800,900));
        System.out.println(num1);
        System.out.println(num1.size());//5
        num.addAll(num1);
        System.out.println(num.size());//16
        System.out.println(num);
    }
}