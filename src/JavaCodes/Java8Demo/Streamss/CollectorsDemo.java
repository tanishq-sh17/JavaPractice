package JavaCodes.Java8Demo.Streamss;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Collectors is a utility class
        // provides a set of methods to create common collectors

        // 1. Collecting a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        // 2. Collecting to a Set
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        // 3. Collecting to a Specified Collection
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));


        // 4. Joining Strings
        // Concatenates stream elements into a single String.
//        String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining());
        String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));

        System.out.println(concatenatedNames);

        // 5. Summarizing Data
        // Generate statistical summary (count, sum, min, average, max)

        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));


        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());


        // 6. Calculating Averages
        Double avg = numbers.stream().collect(Collectors.averagingInt(x -> x));

        System.out.println(avg);

        // 7. Counting Elements
        Long counting = numbers.stream().collect(Collectors.counting());

        Integer i = numbers.stream().reduce(0, Integer::sum);
        Integer i1 = numbers.stream().reduce(Integer::sum).get();
        int sum = numbers.stream().mapToInt(x -> x).sum();
        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(i);
        System.out.println(i1);
        System.out.println(sum);
        System.out.println(sum1);


        // 8. Grouping Elements
        List<String> words = Arrays.asList("hello", "world", "stream", "collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));

        HashMap<Integer, String> collect1 = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        HashMap::new,
                        Collectors.joining(", ")));
        System.out.println(collect1);

        HashMap<String, Integer> collect2 =
                words.stream().
                        collect(Collectors.groupingBy(
                                x -> x,
                                HashMap::new,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.get(0).length()
                                )
                        ));

        System.out.println(collect2);
        HashMap<String, Integer> hashMap = words.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        String::length,
                        (a, b) -> a,   // we can remove this merge function if there are no duplicates present
                        HashMap::new
                ));
        System.out.println(hashMap);


        // 9.Partitioning Elements
        // Partitions elements into two groups (true and false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(s -> s.length() > 5)));


        // 10. Mapping and Collecting
        // Applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toList())));
        System.out.println(words.stream().map(String::toUpperCase).toList());


        // Example 1. Collecting Names by length
        List<String> example1 = Arrays.asList("Alice", "Bob", "Charlie", "Alexander", "Jim", "Horse");
        System.out.println(example1.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(example1.stream().collect(Collectors.groupingBy(String::length, Collectors.toList())));


        // Example 2. Counting Word Occurence








    }
}
