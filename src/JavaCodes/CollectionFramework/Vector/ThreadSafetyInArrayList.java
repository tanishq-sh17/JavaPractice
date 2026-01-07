package JavaCodes.CollectionFramework.Vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class ThreadSafetyInArrayList {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
        Vector<Integer> list = new Vector<>();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                list.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Size of the list: " + list.size());  // output should be 2000
    }
}
