package Collections;

import java.util.List;
import java.util.ArrayList;

public class CollecFrute {
    public static void main(String[] args) {
        List fruit = new ArrayList();
        fruit.add("Banana");
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("orange");

        for(Object temp:fruit) {
            System.out.println(temp);
        }
            System.out.println("Second option");
            boolean hasBanana = fruit.contains("Banana");

            if (hasBanana) {
                System.out.println("Banana found");
            } else {
                //fruit.add("banana");
                //System.out.println("banana");
                System.out.println("Banana not Found");
            }

    }
}
