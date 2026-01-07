package JavaCodes.OOPs.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
//    static void main(String[] args) {
//        int[] numerators = {10, 200, 30, 40};
//        int[] denominators = {1, 2, 0, 4};
//        for (int i = 0; i < 10; i++) {
//            try {
//                System.out.println(divide(numerators[i], denominators[i]));
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//
//    }
//    static int divide(int a, int b){
//        return a/b;
//    }

//    static void main(String[] args) {
//        try{
//            level1();
//
//        } catch (Exception o) {
//            StackTraceElement[] stackTrace = o.getStackTrace();
//            for (int i = 0; i < stackTrace.length; i++) {
//                System.out.println(stackTrace[i]);
//            }
//        }
//        try{
//            level1();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public static void level3(){
//        int[] array = new int[5];
//        array[5] = 10;
//    }
//    public static void level2(){
//        level3();
//    }
//    public static void level1(){
//        level2();
//    }
    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            FileReader fileReader = new FileReader("a.txt");
//        } catch (Exception e) {
//
//        }

//        FileReader fileReader = new FileReader("a.txt");

        method1();

    }


    public static void method1() throws FileNotFoundException {
//        method2();
    }
//    public static void method2() throws FileNotFoundException {
////        FileReader fileReader = new FileReader("a.txt");
//
//        try{
//            FileReader fileReader = new FileReader("a.txt");
//        } catch (FileNotFoundException e){
//            System.out.println("File Not Found");
//            throw new FileNotFoundException("file not found");
//        }
//    }

    public static void method2() throws Exception {  // this will work
       throw new FileNotFoundException(); // checked exp
    }

//    public static void method3() throws FileNotFoundException{  // but not this will
//        throw new Exception();
//    }

    public static void method4(){ // this will not give error on compile time
        throw new ArithmeticException(); // unchecked exp
    }

}
