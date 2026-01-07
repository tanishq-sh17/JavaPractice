package JavaCodes.Java8Demo.Streamss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Stream<String> stream = names.stream().filter(name -> {
            System.out.println("Filtering: " + name);
            return name.length() > 3;
        });

        System.out.println("Before terminal Operation");  // this will print first because of the terminal operation not being there

        List<String> list = stream.collect(Collectors.toList());

        System.out.println("After terminal Operation");

        System.out.println(list);

        List<Integer> dummy = Arrays.asList(1, 2, 3, 4);
        List<Integer> dummy1 = new ArrayList<>();
        dummy.stream().forEach(dummy1::addFirst);
        System.out.println(dummy1);

    }
}
