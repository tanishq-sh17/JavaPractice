package JavaCodes.StreamPractice;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ques13 {
    public static void main(String[] args) {
        // 13. Find the Last Element in a List

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        System.out.println(list.stream().toList().getLast());
        System.out.println(list.stream().reduce((a, b) -> b).get());
    }
}
