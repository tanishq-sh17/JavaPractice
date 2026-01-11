package JavaCodes.StreamPractice;

import java.util.List;

public class Ques24 {
    public static void main(String[] args) {

        // 24. Find the Second-Smallest Element in a List

        List<Integer> numbers = List.of(1, 4, 3, 2, 5);
        System.out.println(numbers.stream().sorted().skip(1).findFirst().get());
    }
}
