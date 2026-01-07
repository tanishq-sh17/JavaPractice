package JavaCodes.CollectionFramework.Queuee;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
//        System.out.println(list);
//        Integer i = list.removeFirst();
//        System.out.println(list);
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());

        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);   // throws Exception
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        System.out.println(queue.remove());  // throws Exception if Empty
        System.out.println(queue.poll());

        System.out.println(queue.element()); // throws Exception if empty
        System.out.println(queue.peek());

        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);
//        queue1.add(1);
//        queue1.offer(2);
//        queue1.add(3);   // throws IllegalStateException if the queue is full
        System.out.println(queue1.add(1));  // true
        System.out.println(queue1.add(2));  // true

        System.out.println(queue1.add(3)); // throw an Exception
        System.out.println(queue1.offer(3));  // false




    }
}
