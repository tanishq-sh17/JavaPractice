package JavaCodes.StreamPractice;

import java.util.ArrayList;
import java.util.List;

public class Ques10 {

    public static void main(String[] args) {

        // 10. Convert a List of Strings to Uppercase

        List<String> list = new ArrayList<>(List.of("alice", "bob", "charlie", "mike", "jim"));
        System.out.println(
                list.stream()
                        .map(String::toUpperCase)
                        .toList()
        );
    }
}
