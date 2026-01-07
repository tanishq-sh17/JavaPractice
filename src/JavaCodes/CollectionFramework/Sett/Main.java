package JavaCodes.CollectionFramework.Sett;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(0);


//        for(int i : set){
//            System.out.println(i);
//            if(i%2 == 0){
//                set.add(i+10);
//            }
//        }

        System.out.println(set);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(4);
        set1.add(0);
        System.out.println(set1);

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(6);
        set2.add(0);
        System.out.println(set2.ceiling(5));
        System.out.println(set2);


//        Set<Integer> syncSet = Collections.synchronizedSet(set);
//        NavigableSet<Integer> syncSet = new ConcurrentSkipListSet<>(set);
//       synchronized (syncSet) {
//            for(int i : syncSet){
//                System.out.println(i);
//                if(i % 2 == 0){
//                    syncSet.add(i+10);
//                }
//          }
//        }

        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 5; i++) {
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }

//        for (Integer i : copyOnWriteSet) {
//            System.out.println(i);
//            copyOnWriteSet.add(6);
//        }
////        System.out.println(copyOnWriteSet);
        for(Integer i : concurrentSkipListSet){
            System.out.println(i);
            concurrentSkipListSet.add(6);
        }
        System.out.println(concurrentSkipListSet);

    }


}
