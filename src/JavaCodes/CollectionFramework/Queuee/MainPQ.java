package JavaCodes.CollectionFramework.Queuee;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MainPQ {

    public static void main(String[] args) {
        // part of the Queue Interface
        // orders elements based on their natural order (for primitives lowest first)
        // custom comparator for customised ordering
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq);  // not sorted

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }


        // internal working
        // PriorityQueue is implemented as a min-heap by default (for natural order)

    }
}
