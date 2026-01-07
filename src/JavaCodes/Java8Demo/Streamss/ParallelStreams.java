package JavaCodes.Java8Demo.Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {

        // A type of stream that enables parallel processing of elements
        // Allowing multiple threads to process parts of the stream simultaneously
        // This can significantly improve performance for large data sets
        // workload id distributed across multiple threads

        long startTime = System.currentTimeMillis();

        List<Integer> list = Stream.iterate(1, x -> x+1).limit(20000).toList();
        List<Long> factorialList = list.stream().map(ParallelStreams::factorial).toList();

        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken with sequential stream: " + (endTime - startTime) + " ms");


        startTime = System.currentTimeMillis();

//        factorialList = list.parallelStream().map(ParallelStreams::factorial).toList();

        // we can also convert a parallel stream into a sequential stream by using sequential()

        factorialList = list.parallelStream().map(ParallelStreams::factorial).sequential().toList();

        endTime = System.currentTimeMillis();

        System.out.println("Time Taken with parallel stream: " + (endTime - startTime) + " ms");


        // Parallel streams are most effective for CPU-intensive or large datasets where tasks are independent
        // They may add overhead for simple tasks or small datasets

        List<Integer> numbers = Arrays.asList(1 ,2, 3, 4, 5);
//        int sum = 0;   // if we use int then there will be inconsistency in the result,
                         // so to achieve thread safety we will use AtomicInteger

        AtomicInteger sum = new AtomicInteger(0);

//        List<Integer> cumulativeSum = numbers.parallelStream().map(x -> {
//             int i = x + sum;
//            sum = i;
//            return i;
//        });
        List<Integer> cumulativeSum = numbers.parallelStream().map(sum::addAndGet).toList();
        System.out.println(cumulativeSum);
    }
    private static long factorial(int n){
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
