package JavaCodes.Practice;

import java.util.Arrays;
import java.util.List;

public class Random1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 2, 6, 5);


        System.out.println(list.stream().mapToInt(x -> x).average().getAsDouble());
        System.out.println(list.stream().mapToDouble(x -> x).average().getAsDouble());
        System.out.println(list.stream().mapToLong(x -> x).average().getAsDouble());

        System.out.println(list.stream().max((a, b) -> a-b).get());
        System.out.println(list.stream().map(Integer::intValue).max((a, b) -> a - b).get());
        System.out.println(list.stream().mapToInt(x -> x).max().getAsInt());
        System.out.println(list.stream().mapToDouble(x -> x).max().getAsDouble());
        System.out.println(list.stream().mapToLong(x -> x).max().getAsLong());


        System.out.println(list.stream().min((a, b) -> a-b).get());
        System.out.println(list.stream().map(Integer::intValue).min((a, b) -> a - b).get());
        System.out.println(list.stream().mapToInt(x -> x).min().getAsInt());
        System.out.println(list.stream().mapToDouble(x -> x).min().getAsDouble());
        System.out.println(list.stream().mapToLong(x -> x).min().getAsLong());

        System.out.println(list.stream().filter(x -> x % 2 != 0).max((x, y) -> x - y).get());
//        list.stream().mapToInt(Integer::intValue).


    }
}
