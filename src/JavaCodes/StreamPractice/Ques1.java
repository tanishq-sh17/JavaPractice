package JavaCodes.StreamPractice;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Ques1 {
    public static void main(String[] args) {

        // 1. Find the Sum of All Elements in a List

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list.stream().reduce(Integer::sum).get());

        IntSummaryStatistics summ = list.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(summ.getSum());

        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        System.out.println(list.stream().mapToDouble(Integer::intValue).sum());

        AtomicInteger sum = new AtomicInteger(0);
        list.forEach(sum::addAndGet);
        System.out.println(sum);
    }
}
