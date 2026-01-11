package JavaCodes.StreamPractice;

import java.util.List;

public class Ques15 {

    public static void main(String[] args) {

        // 15. Check if Any Element in a List Satisfies a Condition

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list.stream().anyMatch(x -> x > 6));

    }
}
