package Home_Work;

import java.util.Scanner;

//6.How to check which number is bigger among 2 numbers?

public class Work7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("here a is bigger");
        }else if( b<a){
            System.out.println("here b is bigger");
        }else{
            System.out.println("here a & b are equal");

        }
    }
}
