package JavaCodes.StreamPractice;

import java.util.List;

public class Ques25 {

    public static void main(String[] args) {

        // 25. Find the Longest String in a List

        List<String> words = List.of("apple", "banana", "kiwi");

        System.out.println(words.stream().max((x, y) -> x.length() - y.length()).get());
        System.out.println(words.stream().sorted((x, y) -> y.length() - x.length()).toList().getFirst());

    }
}
