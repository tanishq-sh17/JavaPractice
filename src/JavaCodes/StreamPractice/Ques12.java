package JavaCodes.StreamPractice;

import java.util.List;

public class Ques12 {
    public static void main(String[] args) {

        // 12. Find the First Element in a List
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list.stream().findFirst().get());
    }
}
