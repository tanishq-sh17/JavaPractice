package JavaCodes.StreamPractice;

import java.util.List;

public class Ques11 {
    public static void main(String[] args) {

        //11. Convert a List of Integers to Their Squares
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list.stream().map(x -> x * x).toList());
    }
}
