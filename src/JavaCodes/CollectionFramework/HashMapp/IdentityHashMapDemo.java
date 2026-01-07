package JavaCodes.CollectionFramework.HashMapp;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
//        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new IdentityHashMap<>();
        // in IdentityHashMap it runs the hashCode() and equals() method of Object class
        // irrespective of whether the Specified have these methods or not.
        // --> hasCode of Object class is also known as identityHashMap
        map.put(key1, 1);
        map.put(key2, 2);

        System.out.println(key1.equals(key2));
        System.out.println(map);
    }
}
