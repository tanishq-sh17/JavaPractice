package JavaCodes.Practice.KeyFeatureTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("Harry Potter", 101, Type.FICTIONAL, 3456),
                new Book("Dune Prophecy", 2, Type.SCIFI, 4367),
                new Book("Atomic Habits", 300, Type.MOTIVATIONAL, 300),
                new Book("Spiderman", 4, Type.FICTIONAL, 987),
                new Book("The Great Gatsby", 5, Type.NOVEL, 765)
        );

        System.out.println(bookList.stream().map(x -> x.getPageNo()).sorted().toList().getLast());
        System.out.println(bookList.stream().collect(Collectors.groupingBy(Book::getType)));


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        System.out.println(list.stream().);
        int n=5;
//        System.out.println(IntStream.rangeClosed(1, n).reduce((a, b) -> a * b).getAsInt();

        System.out.println(Stream.iterate(1, x -> x + 1).limit(5).reduce((a, b) -> a * b).get());


    }
}
