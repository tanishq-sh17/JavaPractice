package JavaCodes.Java8Demo.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // Predicate --> takes a value a returns a boolean
        Predicate<Integer> isEven = x -> x%2 == 0;
//        System.out.println(isEven.test(4));
        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
//        System.out.println(isWordStartingWithA.test("andhej"));

        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);
//        System.out.println(and.test("andhhygdft"));

        Predicate<Integer> negate = isEven.negate();
//        System.out.println(negate.test(5));

//        System.out.println(Predicate.not(isEven).test(6));

        Predicate<String> or = isWordStartingWithA.or(isWordEndingWithT);
        System.out.println(or.negate().test("amfbdht"));

        Predicate<String> isJava = Predicate.isEqual("Java");
        System.out.println(isJava.test("Java"));


    }
}
