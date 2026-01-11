package JavaCodes.StreamPractice;

import java.util.List;

public class Ques26 {
    public static void main(String[] args) {

        // 26. Find the Shortest String in a List
        List<String> words = List.of("apple", "banana", "kiwi");
        System.out.println(words.stream().min((x, y) -> x.length() - y.length()).get());
        System.out.println(words.stream().sorted((x, y) -> y.length() - x.length()).toList().getLast());
    }
}
