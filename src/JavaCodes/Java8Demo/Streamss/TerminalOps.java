package JavaCodes.Java8Demo.Streamss;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        // 1. collect()
        List<Integer> skipList = list.stream()
                .skip(1)
                .collect(Collectors.toList());

//        Map<Integer, Integer> listTomap = list.stream().collect(Collectors.toMap(x -> x, x ->  1, (a, b) -> a + b));
//        Map<Integer, Integer> listTomap = list.stream()
//                .collect(Collectors.toMap(
//                                x -> x,
//                                x ->  1,
//                                Integer::sum)
//                );

//        List<Integer> randomList = Arrays.asList(1, 2, 1, 3, 4, 3, 4, 5, 0);
//        Map<Integer, Long> freqMap = randomList.stream()
//                .collect(Collectors.groupingBy(
//                        x -> x,
//                        Collectors.counting())
//                );
//        System.out.println(skipList);
//        System.out.println(listTomap);
//        System.out.println(freqMap);


        // 2. forEach()
//        list.stream().forEach(x -> System.out.println(x));

        // 3. reduce() --> Combines elements to produce a single list
//        int sum = list.stream().reduce(0, Integer::sum);
//        Optional<Integer> opSum = list.stream().reduce(Integer::sum);
//        System.out.println(sum);
//        System.out.println(opSum.get());

        // 4. count()

        // 5. anyMatch(), allMatch(), noneMatch()
//        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
//        System.out.println(b);
//        boolean b1 = list.stream().allMatch(x -> x > 0);
//        System.out.println(b1);
//        boolean b2 = list.stream().noneMatch(x -> x < 0);
//        System.out.println(b2);


        // 6. findFirst(), findAny()  --> Returns an Optional<T>
//        Integer i = list.stream().findFirst().get();
//        System.out.println(i);
//        Integer i1 = list.stream().findAny().get();
//        System.out.println(i1);


        // 7. toArray() --> used to convert a stream into an array
//        Object[] array = Stream.of(1, 2, 3, 4).toArray();


        // 8. min() / max()
//        System.out.println(Stream.of(2, 44, 99).max(Comparator.naturalOrder()).get());
//        System.out.println(Stream.of(2, 44, 99).min(Comparator.naturalOrder()).get());

        // 9. forEachOrdered() --> to iterate in order while using parallel stream().
        List<Integer> newList = Arrays.asList(1, 2, 4, 5, 6, 0, 4, 3);
//        newList.parallelStream().forEach(System.out::println);
        newList.parallelStream().forEachOrdered(System.out::println);
        // 8. flatMap
        // Handle streams of collections, lists, or arrays where each element is itself a collection
        // Flatten nested structures (e.g., lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time.

        // Example 1:
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );

        List<String> flatendList = listOfLists.stream().
                flatMap(Collection::stream).
                map(String::toUpperCase).
                sorted()
                .toList();
        System.out.println(flatendList);

        // Example 2:
        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );

        List<String> list1 = sentences.stream().
                flatMap(
                        sentence -> Arrays.stream(sentence.split("\\s+"))
                ).map(String::toUpperCase)
                .toList();
        System.out.println(list1);

        // Example: Filtering and Collecting Names
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(
                names.stream()
                        .filter(x -> x.length() > 3)
                        .collect(Collectors.toList())
        );

        // Example: Squaring and Sorting Numbers
        List<Integer> nums = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(
                nums.stream()
                        .map(x -> x * x)
                        .sorted()
                        .toList()
        );

        // Example: Summing Values
        System.out.println(nums.stream()
                .reduce(0, Integer::sum)
        );
        System.out.println(nums.stream()
                .reduce(Integer::sum)
                .get()
        );
        System.out.println(nums.stream()
                .reduce((a, b) -> a+b)
                .get()
        );

        // Example: Counting Occurrences of a Character
        String sentence = "Hello World";
        System.out.println(sentence
                .chars()             // chars() creates a IntStream for the corresponding String
                .filter(x -> x == 'l')
                .count()
        );

        // Streams can't be reused after a terminal operation has been called
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);

        // now, here the stream will give warning that it has been consumed
//        List<String> list2 = stream.map(String::toUpperCase).toList();


        // Stateful and Stateless operations  -

        // Stateful Operations - A stateful operation needs to remember previously processed elements to work correctly.

        // Stateless Operations - A stateless operation processes each element independently.
                            //It does not remember or depend on other elements in the stream.


        List<Integer> list2 = Stream.iterate(1, x -> x += x).limit(20).toList();
        System.out.println(list2);


    }
}
