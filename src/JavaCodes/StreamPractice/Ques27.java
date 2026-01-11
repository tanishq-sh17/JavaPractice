package JavaCodes.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Ques27 {
    public static void main(String[] args) {

        // 27. Group a List of Strings by Their Length

        List<String> words = List.of("apple", "banana", "kiwi", "mango", "pineapple");

        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));


    }
}
