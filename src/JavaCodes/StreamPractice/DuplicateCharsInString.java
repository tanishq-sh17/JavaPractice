package JavaCodes.StreamPractice;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class DuplicateCharsInString {
    public static void main(String[] args) {

        //

        String name = "aaniishqq";
        Set<Character> set1 = new HashSet<>();

        System.out.println(name.chars()
                .filter(x -> !set1.add((char) x))
                .mapToObj(x -> (char) x)
                .toList());



        System.out.println(name
                .chars()
                .mapToObj(x -> (char) x)
                .filter(
                        x -> name.chars()
                                .filter(y -> x == y)
                                .count() > 1
                )
                .distinct().toList()

        );

        System.out.println(name.chars()
                .mapToObj(c -> (char) c)
                .filter(Predicate.not(x -> name.chars()
                        .filter(y -> y == x).count() > 1))
                .toList());



    }
}
