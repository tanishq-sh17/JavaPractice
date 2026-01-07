package JavaCodes.CollectionFramework.HashMapp;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        // HashTable is synchronized
        // also all it's methods are synchronized
        // can't contain null key or value
        // legacy class, and got replaced by ConcurrentHashMap
        // slower than HashMap because of the multithreading overhead
        // only linkedList is used, even when collision occurs unlike HashMap which uses BST

        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

//        HashMap<Integer, String> map = new HashMap<>();
        // But what if we use HashTable instead of HashMap
        Hashtable<Integer, String> map = new Hashtable<>();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });

        Thread thread2 = new Thread(() -> {
            int count = 0;
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Threa2");
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(map.size());
    }
}

