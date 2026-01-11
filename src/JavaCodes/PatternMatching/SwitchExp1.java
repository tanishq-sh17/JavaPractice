package JavaCodes.PatternMatching;

import java.util.*;

public class SwitchExp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int percentage = sc.nextInt();
        char grade = switch (Math.min((percentage/10), 10)){
            case 10, 9 -> 'A';
//            case 9 -> 'A';
            case 8 -> {
                System.out.println("Hello");
                yield 'B';
            }
            case 7 -> 'C';
            case 6 -> 'D';
            case 5 -> 'E';
            default -> 'F';
        };
        // switch expression cares about the completion like default value;
        System.out.println(grade);

//        List<Integer> list = Arrays.asList(1, 1, 2, 2, 3);
//        Set<Integer> set = new HashSet<>();
//        System.out.println(
//                list.stream().filter(
//                        x -> !set.add(x))
//                        .toList()
//        );
//        System.out.println(list.stream().filter(x -> list.stream().filter(y -> x == y).count() > 1).distinct().toList());
//        list.stream().filter(x -> Collections.frequency(list, x) > 1).distinct().forEach(System.out::println);
    }
}
