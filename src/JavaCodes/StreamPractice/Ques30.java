package JavaCodes.StreamPractice;

import java.util.List;
import java.util.stream.Stream;

public class Ques30 {

    public static void main(String[] args) {

        // 30. Merge Two Lists into a Single List

        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);

        System.out.println(
                Stream.concat(list1.stream(), list2.stream()).toList()
        );
    }
}
