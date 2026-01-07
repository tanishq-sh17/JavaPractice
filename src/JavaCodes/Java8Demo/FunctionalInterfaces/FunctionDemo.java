package JavaCodes.Java8Demo.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // Function --> work for you
        // tasks two types - 1. input type
        //                   2. return type

        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.apply(20));
        System.out.println(tripleIt.apply(30));

        System.out.println(doubleIt.andThen(tripleIt).apply(10));  // first doubleIt will run then tripleIt will run
        System.out.println(doubleIt.compose(tripleIt).apply(10));  // opposite of andThen() method

        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(1000));
    }
}
