package JavaCodes.PatternMatching;

public class PMwithInstanceOf {
    public static void main(String[] args) {
        System.out.println(process(1));
        System.out.println(process("hello"));
    }

    public static String process(Object input){
        if(input instanceof Integer){
            return "got a number";
        }
//        if(input instanceof String){
//            return "got a string";
//        }
        // what if we also want to use any property or method of an Object
        // then we have to typecast that Object into the actual type of that object
        // to do so.
        // instead we can use something like this (input instanceOf String str)
        // so we can simply use the str String obj, without the hassle of typecasting

        if(input instanceof String str){
            return "got a string of length: " + str.length();

            // Object input ----> memory <---- String str
            // str is an alias to input, with type being String instead of Object

        } // str scope ends here
        return "whatever!";
    }

}
