package JavaCodes.StreamPractice;

import java.util.List;

public class Ques17 {
    public static void main(String[] args) {

        // 17. Sort a List of Integers in Ascending Order

        List<Integer> numbers = List.of(5, 3, 1, 4, 2);

        System.out.println(numbers.stream()
                .sorted()
                .toList());
    }
}
