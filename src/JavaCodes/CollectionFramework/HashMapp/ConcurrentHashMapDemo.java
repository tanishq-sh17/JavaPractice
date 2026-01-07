package JavaCodes.CollectionFramework.HashMapp;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        // Java 7 --> segment based locking --> 16 segments --> smaller hashmaps
        // Only the segments being written to or read from is locked
        // read: do not require locking unless there is a write operation happening on the same segment
        // write: locking happens

        // Java 8 --> no segmentation
        //           --> Compare-And-Swap approach --> no locking except resizing or collision
        // read: no locking
        // Thread A last saw --> x = 45
        // Thread A work --> x to 50
        // if x is still 45, then change it to 50 else don't change and retry
        // and will not move in a loop again and again
        // but will wait for a short random time and will try again


        // incremental resizing


        // MAP --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap

    }
}
