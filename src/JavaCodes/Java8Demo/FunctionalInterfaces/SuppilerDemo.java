package JavaCodes.Java8Demo.FunctionalInterfaces;

import java.util.function.Supplier;

public class SuppilerDemo {
    public static void main(String[] args) {
        // Supplier --> takes no argument but return something
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());
    }
}
