package JavaCodes.StreamPractice;

import java.util.List;

public class Ques16 {
    public static void main(String[] args) {

        // 16. Remove Duplicate Elements from a List

        List<Integer> list = List.of(1, 2, 2, 3, 4, 4, 5);

        System.out.println(list.stream()
                .distinct()
                .toList());

    }
}
