package JavaCodes.StreamPractice;

import java.util.List;

public class Ques23 {

    public static void main(String[] args) {

        // 23. Find the Second-Largest Element in a List

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(numbers.stream()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .get());
    }
}
