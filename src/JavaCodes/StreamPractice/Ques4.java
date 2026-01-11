package JavaCodes.StreamPractice;

import java.util.List;
import java.util.stream.Stream;

public class Ques4 {
    public static void main(String[] args) {

        // 4. Find the Maximum Element in a List

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        System.out.println(list.stream()
                .sorted((a, b) -> b - a)
                .toList().get(0));

        System.out.println(list.stream().max(Integer::compare).get());

        // least


    }
}
