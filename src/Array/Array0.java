package Array;
import java.util.Arrays;
public class Array0 {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=25;
        a[4]=50;
        a[5]=35;
        a[6]=70;
        a[7]=80;
        a[8]=90;
        a[9]=100;
        System.out.println(a[4]);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
