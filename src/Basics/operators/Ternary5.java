package Basics.operators;

public class Ternary5 {
    public static void main(String args[]){
        int centuries = 83;
        String name="virat";

        System.out.println((centuries>18)&&(name=="virat")?"GOAT" :"PLAYER");
        System.out.println((centuries>=1&&centuries<=80)?"virat":(centuries>=80&&centuries<=100)?"sachin":".");
    }
}
