package JavaCodes.StreamPractice;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ques6 {

    public static void main(String[] args) {

        // 6. Count the Number of Elements in a List

        List<Integer> list = List.of(1, 1, 2, 3, 4, 4, 5);
        System.out.println(list.stream()
                .count());
        System.out.println(list.stream().collect(Collectors.counting()));
    }
}
