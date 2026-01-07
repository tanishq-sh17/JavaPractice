package JavaCodes.CollectionFramework.LinkedLists;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList =  new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList.get(2));  // get(int index)   TC - O(n)
        linkedList.addFirst(0);   // O(1)
        linkedList.addLast(5);    // O(1)
        System.out.println(linkedList.getFirst());  // O(1)
        System.out.println(linkedList.getLast());   // O(1)


        System.out.println(linkedList);
        linkedList.removeIf(x -> x%2 == 0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));


    }
}
