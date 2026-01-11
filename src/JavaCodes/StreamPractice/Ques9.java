package JavaCodes.StreamPractice;

import java.util.List;

public class Ques9 {
    public static void main(String[] args) {

        // 9. Filter Out Odd Numbers from a List

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list.stream().filter(x -> x % 2 == 0).toList());
    }
}
