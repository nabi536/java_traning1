package Basics;

public class LoopWhileEven {
    public static void main(String[] args) {
        int i=1;
        int j=0;
        System.out.print("Even: ");
        while(i<=10){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
        System.out.print("Odd: ");
        while(j<=10){
            if(j%2!=0){
                System.out.print(j+" ");
            }
            j++;
        }

    }
}
