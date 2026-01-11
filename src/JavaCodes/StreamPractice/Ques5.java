package JavaCodes.StreamPractice;

import java.util.List;

public class Ques5 {

    public static void main(String[] args) {

        // 5. Find the Minimum Element in a List

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        System.out.println(list.stream().min(Integer::compare).get());
        System.out.println(list.stream().sorted().toList().get(0));

    }
}
