package JavaCodes.StreamPractice;

import java.util.stream.IntStream;

public class Ques22 {

    public static void main(String[] args) {
        // 22. Find the Factorial of a Number

        int num = 5;

        System.out.println(IntStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b));
        System.out.println(IntStream.rangeClosed(1, num).reduce((a, b) -> a * b).getAsInt());


    }
}
