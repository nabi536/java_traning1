package Queue;

import java.util.PriorityQueue;

public class PriorityQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
