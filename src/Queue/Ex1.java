package Queue;

import java.util.PriorityQueue;

public class Ex1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        pq1.add(20);
        pq1.add(10);
        pq1.add(50);
        pq1.add(30);
        pq1.add(40);
        pq1.add(5);

        System.out.println(pq1); //5,20,10,30,40,50;
    }
}
