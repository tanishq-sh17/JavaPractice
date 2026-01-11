package JavaCodes.StreamPractice;

import java.util.List;

public class Ques18 {
    public static void main(String[] args) {
        // 18. Sort a List of Integers in Descending Order

        List<Integer> numbers = List.of(5, 3, 1, 4, 2);
        System.out.println(numbers.stream()
                .sorted((x, y) -> y - x)
                .toList());
    }
}
