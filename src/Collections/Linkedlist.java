
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Make the list unmodifiable
        List<String> unmodifiableList = Collections.unmodifiableList(linkedList);

        System.out.println("Unmodifiable LinkedList: " + unmodifiableList);

    }
}
