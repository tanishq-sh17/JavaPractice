package JavaCodes.CollectionFramework.HashMapp;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
//        SortedMap<Integer, String> sortedMap = new TreeMap<>();
//        SortedMap<Integer, String> sortedMap = new TreeMap<>((a, b) -> Integer.compare(b, a));
//        SortedMap<Integer, String> sortedMap = new TreeMap<>((a, b) -> b-a);
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(99, "Tanishq");
        sortedMap.put(88, "Shrivas");
        sortedMap.put(77, "Fun");
        sortedMap.put(66, "Chill");

        System.out.println(sortedMap);


        System.out.println(sortedMap.subMap(77, 99));
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(88));
        System.out.println(sortedMap.tailMap(88));
    }
}
