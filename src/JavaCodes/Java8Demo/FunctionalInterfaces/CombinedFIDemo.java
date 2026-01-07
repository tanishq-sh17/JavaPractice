package JavaCodes.Java8Demo.FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class CombinedFIDemo {
    public static void main(String[] args) {
        // combined example
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }


        // BiPredicate, Bi Consumer, BiFunction

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(5, 5));

        BiConsumer<String, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept("a", "bc");

        BiFunction<String, String, Integer> biFunction = (x, y) -> (x.length() + y.length());
        System.out.println(biFunction.apply("Tanishq", "Shrivas"));




        // Instead of Using normal Function<Integer, Integer>
        // we can simply use UnaryOperator<Integer>
        // and also BinaryOperator<Integer> instead of
        // BiFunction<Integer, Integer, Integer>

        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x, y) -> x + y;

        // Method reference --> use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Tanishq", "Shrivas", "jdgfjbs");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);

        // Constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhones = names.stream().map(MobilePhone::new).collect(Collectors.toList());



    }
}
class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}