package JavaCodes.PatternMatching;

public class PMwithSwitchExp1 {
    public static String process(Object input){
        return switch (input) {
            case Integer i -> "got an integer";
            case Double d -> "got a double";
            case String str -> "got a string of length: " + str.length();
            default -> "whatever";
        };
    }
    public static void main(String[] args) {
        System.out.println(process(1));
        System.out.println(process(5));
        System.out.println(process(1.0));
        System.out.println(process("hello"));
    }
}
