package JavaCodes.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Ques29 {

    public static void main(String[] args) {

        // 29. Partition a List of Integers into Even and Odd Numbers

        List<Integer> numbers = List.of(1, 2, 3 ,4, 5, 6);

        System.out.println(
                numbers.stream()
                .collect(Collectors.partitioningBy(
                        x -> x % 2 == 0)
                )
        );
    }
}
