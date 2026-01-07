package JavaCodes.Java8Demo.Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        // Intermediate operations and transform a stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked

        List<String> list = Arrays.asList("Tanishq", "Shrivas", "Jim", "Micheal", "Tanishq");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("T"));
        // no filter is applied till a terminal operation is there in the stream
        long res = list.stream().filter(x -> x.startsWith("T")).count();

//        Predicate<String> startsWithT = x -> x.startsWith("T");
//        long res = list.stream().filter(startsWithT.and(x -> x.endsWith("q"))).count();

//        Predicate<String> startsWithT = x -> x.startsWith("T");
//        Predicate<String> endsWithT = x -> x.endsWith("q");
//        long res = list.stream().filter(startsWithT.and(endsWithT)).count();

//        long res = list.stream().filter(x -> x.startsWith("T") && x.endsWith("q")).count();

//        System.out.println(res);

        // 2. map
//        Stream<String> stringStream = list.stream().map(x -> x.toUpperCase());
        Stream<String> stringStream = list.stream().map(String::toUpperCase);


        // 3. sorted  --> used for natural sorting
//        Stream<String> sortedStream = list.stream().sorted();
//        List<String> printSortedStream = list.stream().sorted().toList();
//        System.out.println(printSortedStream);
//
        // sorted() with Comparator
//        Stream<String> sortedStream = list.stream().
//                sorted((a, b) ->  b.length() - a.length());
//        List<String> list3 = sortedStream.toList();
//        System.out.println(list3);
//
//
//        // 4. distinct  --> checks object equality not Predicate equality
//        System.out.println(list.stream()
//                .filter(x -> x.startsWith("T"))
//                .distinct()
//                .count());
//
//        // 5. limit
//        System.out.println(Stream.
//                iterate(1, x -> x + 1).
//                limit(100).
//                toList());
//
//        // 6. skip
//        System.out.println(Stream
//                .iterate(1, x -> x + 1)
//                .skip(10).limit(100)
//                .toList());

        // 7. peek() --> similar to forEach() but it is an intermediate operation
            // Performs an action on each element as it is consumed
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();


        double startedTime = System.currentTimeMillis();

        List<Integer> numbers = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100
        );


      List<Integer> list1=  numbers.stream().filter(n->n%2 != 0).collect(Collectors.toList());
      List<Integer> list2=  numbers.stream().filter(n->n%2 != 0).collect(Collectors.toList());
      List<Integer> list3=  numbers.stream().filter(n->n%2 != 0).collect(Collectors.toList());
      List<Integer> list4=  numbers.stream().filter(n->n%2 != 0).collect(Collectors.toList());

        double endTime = System.currentTimeMillis();


        System.out.println( endTime-startedTime );

        double startTime = System.currentTimeMillis();


        List<Integer> list5=  numbers.parallelStream().filter(n->n%2 != 0).collect(Collectors.toList());
        List<Integer> list6=  numbers.parallelStream().filter(n->n%2 != 0).collect(Collectors.toList());
        List<Integer> list7=  numbers.parallelStream().filter(n->n%2 != 0).collect(Collectors.toList());
        List<Integer> list8=  numbers.parallelStream().filter(n->n%2 != 0).collect(Collectors.toList());

        double endedTime = System.currentTimeMillis();


        System.out.println( endedTime-startTime );


    }
}
