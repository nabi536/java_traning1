package Basics.operators;

public class Ternary6 {
    public static void main(String args[]){
        int centuries = 83;
        String name="virat";

        System.out.println((centuries>18)&&(name=="virat")?"GOAT" :"PLAYER");
        System.out.println((centuries>=1&&centuries<=18)?"gill":(centuries>=18&&centuries<=80)?".":"king");
    }
}
