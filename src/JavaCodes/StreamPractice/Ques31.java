package JavaCodes.StreamPractice;

import java.util.ArrayList;
import java.util.List;

public class Ques31 {

    public static void main(String[] args) {

        // 31. Find the Intersection of Two Lists

        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 5, 6);

        System.out.println(list1.stream()
                .filter(list2::contains)
                .toList());
    }
}
