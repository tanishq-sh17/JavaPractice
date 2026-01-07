package JavaCodes.Java8Demo.OptionalDemo;

import java.util.Optional;

public class OpDemo1 {
    public static void main(String[] args) {
        String email = null;
//        String email = "tanishq@gmail.com";

        // static methods of Optional  --> of, empty, ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

//        Optional<String> email1 = Optional.of(email);   // this will throw NPException if the value is null
//        System.out.println(email1);
//
        Optional<String> stringOptional = Optional.ofNullable(email);
//        System.out.println(stringOptional.get());

        // get() method will throw NoSuchElementException if the value is null

        // isPresent() method is used to check whether the Optional contains a value or not --> return boolean
//        if(stringOptional.isPresent()){
//            System.out.println(stringOptional.get());
//        }
//        else{
//            System.out.println("No value present");
//        }

        // orElse() method returns the value if it is not null otherwise it returns the default value
        System.out.println(stringOptional.orElse("default@gmail.com"));


        // orElseGet() methods is similar to orElse() but it takes a Supplier as an argument
        System.out.println(stringOptional.orElseGet(() -> "default@gmail.com"));

        // orElseThrow() method is used to throw exception if the value is not present
//        System.out.println(stringOptional.orElseThrow());
//        System.out.println(stringOptional.orElseThrow(() -> new IllegalArgumentException("Value does not exist")));

        // ifPresent() -->
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyOptional1 = Optional.empty();
        gender.ifPresent(x -> System.out.println("Value is present"));


        Optional<String> optionalStr = Optional.of("adaabcde");
        System.out.println(optionalStr.filter(s -> s != null && s.contains("abc")).get());

    }
}
