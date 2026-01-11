package JavaCodes.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Ques2 {
    public static void main(String[] args) {

        // 2. Find the Product of All Elements in a List

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list.stream().reduce(1, (a, b) -> a*b));
        System.out.println(list.stream().reduce((a, b) -> a*b).get());

    }
}
