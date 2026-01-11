package JavaCodes.StreamPractice;

import java.util.List;
import java.util.stream.Stream;

public class Ques32 {

    public static void main(String[] args) {

        // 32. Find the Union of Two Lists

        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 5, 6);

        System.out.println(Stream.concat(list1.stream(), list2.stream()).distinct().toList());
    }
}
