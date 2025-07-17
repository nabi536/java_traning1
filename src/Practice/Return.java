package Practice;

import java.util.Scanner;

public class Return {
    public static int mani(int a, int b){
        if(a<b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mani(10,15);
        System.out.println();
    }
}
