package JavaCodes.StreamPractice;

import java.util.List;

public class Ques14 {
    public static void main(String[] args) {
        // 14. Check if All Elements in a List Satisfy a Condition
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        System.out.println(list.stream().allMatch(x -> x % 2 == 0));
        System.out.println(list.stream().noneMatch(x -> x < 10));
    }
}
