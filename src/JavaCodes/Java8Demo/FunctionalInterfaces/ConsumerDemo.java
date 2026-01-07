package JavaCodes.Java8Demo.FunctionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Consumer --> takes input but doesn't return anything
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(5);

        List<Integer> list = List.of(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for(int num : list){
                System.out.println(num);
            }
        };

        printList.accept(list);

        Consumer<String> printStr = s -> System.out.print(s);
        Consumer<String> printLen = s -> System.out.println(" : " + s.length());
        printStr.andThen(printLen).accept("Tanishq");
    }
}
