package JavaCodes.StreamPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ques21 {
    public static void main(String[] args) {

        // 21. Find the Sum of Digits of a Number

        int num = 12345;
//        int sum = String.valueOf(num)
//                .chars()
//                .map(x -> x - '0')
//                .sum();
//        System.out.println(sum);

        int sum = String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        System.out.println(sum);
    }
}
