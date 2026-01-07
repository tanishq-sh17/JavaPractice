package JavaCodes.Java8Demo.Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        // feature introduced in java 8
        // process collections of data in a functional and declarative manner
        // Simplify data processing
        // Embrace Functionality Programming
        // Improve Readability and Maintainability
        // Enable Easy Parallelism (with dealing with complexity of multithreading)

        // What is Stream?
        // a sequence of elements supporting functional and declarative programming

        // How to use Streams?
        // Source, intermediate operations & terminal operation.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenList = numbers.stream().filter(x -> (x % 2 == 0)).collect(Collectors.toList());
        int sum = numbers.stream()
                .reduce((a, b) -> a + b)
                .get();
        int even = numbers.stream()
                .filter(a -> a % 2 == 0)
                .reduce((a, b) -> a + b).get();
        System.out.println(
                numbers.stream()
                .filter(x -> x % 2 == 0).count()
        );
        System.out.println(even);
        System.out.println(evenList);
        System.out.println(sum);

        int sum3 = numbers.stream().filter(x -> x % 2 != 0).reduce((a, b) -> a + b).get();
        System.out.println(sum3);


        // Creating Streams:
        // 1. From Collections
        List<Integer> listt = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = listt.stream();
        // 2. From Arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);
        // 3. Using Stream.of()
        Stream<String> stream2 = Stream.of("a", "b");
        // 4. Infinite Streams
        Stream<Integer> generate = Stream.generate(() -> 1);
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collect);
    }
}
