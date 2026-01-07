package JavaCodes.CollectionFramework.HashMapp;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(4, "Four");

        System.out.println(map);

        System.out.println(map.lowerKey(4));
        System.out.println(map.lowerEntry(4));
        System.out.println(map.higherKey(4));
        System.out.println(map.higherEntry(4));
        System.out.println(map.ceilingKey(4));  // return key 4 if it exists in map or else return key greater than 4
        System.out.println(map.ceilingEntry(4));
        System.out.println(map.descendingMap());    // returns the map in descending
    }
}
