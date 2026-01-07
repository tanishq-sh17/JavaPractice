package JavaCodes.CollectionFramework.Vector;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // the initial capacity of vector is 10
        // we can also change as well set it's capacity
        // and also set value of increment capacity
//        Vector<Integer> vector = new Vector<>();
//        Vector<Integer> vector = new Vector<>(5);
        Vector<Integer> vector = new Vector<>(5, 3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());

        Vector<Integer> vec1 = new Vector<>(Arrays.asList(1, 2, 3));
        System.out.println(vec1);
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);ll.add(2);ll.add(4);
        Vector<Integer> vec2 = new Vector<>(ll);
        System.out.println(vec2);
    }
}
