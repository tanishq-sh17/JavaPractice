package JavaCodes.StreamPractice;

import java.util.List;

public class Ques7 {

    public static void main(String[] args) {
        // 7. Check if a List Contains a Specific Element

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(
                list.stream()
                .anyMatch(x -> x == 5)
        );
    }
}
