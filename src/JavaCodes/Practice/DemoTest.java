package JavaCodes.Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoTest {
    public static void main(String[] args) {
//        List<String> listStr = new ArrayList<>(List.of("Tanishq", "Shrivas", "bjdnbcjndc"));
//        List<String> list = listStr.stream()
//                .map(String::toUpperCase)
//                .filter(
//                        x -> x.length() <= 7
//                )
//                .toList();
//
//        System.out.println(list);
//
//
//        List<String> listStr1 = new ArrayList<>(List.of("Tanishq", "Shrivas", "Bjdnbcjndc"));
//        List<String> list1 = listStr1.stream().map(x -> {
//            StringBuilder sb = new StringBuilder();
//            for(char ch : x.toCharArray()){
//                if(Character.isUpperCase(ch)){
//                    sb.append(Character.toLowerCase(ch));
//                }
//                else{
//                    sb.append(Character.toUpperCase(ch));
//                }
//            }
//            return sb.toString();
//        }).toList();
//
//        List<Integer> list11 = new ArrayList<>(List.of(1, 2, 5, 6));
//
//        list11.sort((a, b) -> -1);
//
//        System.out.println(list11);
//
//
//        List<Integer> nums = Arrays.asList(1, 5, 3);


        List<String> words = Arrays.asList("hello", "world", "stream", "collecting");

        HashMap<String, Integer> collect2 =
                words.stream().
                        collect(Collectors.groupingBy(
                                x -> x,
                                HashMap::new,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.get(0).length()
                                )
                        ));

        System.out.println(collect2);
        HashMap<String, Integer> hashMap = words.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        String::length,
                        (a, b) -> a,   // we can remove this merge function if there are no duplicates present
                        HashMap::new
                ));
        System.out.println(hashMap);




    }
}
