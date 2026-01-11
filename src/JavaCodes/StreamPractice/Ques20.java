package JavaCodes.StreamPractice;

import java.util.List;

public class Ques20 {
    public static void main(String[] args) {
        // 20. Sort a List of Strings by Their Length


        List<String> words = List.of("apple", "banana", "kiwi");
        System.out.println(words.stream()
                .sorted((a, b) -> a.length() - b.length())
                .toList());
    }
}
