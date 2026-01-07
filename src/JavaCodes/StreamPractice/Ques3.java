package JavaCodes.StreamPractice;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Ques3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list.stream().mapToInt(Integer::intValue).average().orElse(0));

        IntSummaryStatistics avg = list.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(avg.getAverage());

//        list.stream().map(Integer::intValue).
    }
}
