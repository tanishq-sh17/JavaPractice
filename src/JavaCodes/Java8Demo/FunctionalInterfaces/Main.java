package JavaCodes.Java8Demo.FunctionalInterfaces;

public class Main {
    public static void main(String[] args) {
//        Thread t1 = new Thread();
//        MathOperation addition = new SumOperation();
        MathOperation addition = (a, b) -> a+b;
        MathOperation subtraction = (a, b) -> a-b;
        System.out.println(addition.operate(2, 3));
        System.out.println(subtraction.operate(10, 4));

        Thread t1 = new Thread(() -> System.out.println("Hello"));

        MathOperation multiplication = new MathOperation() {

            @Override
            public int operate(int a, int b) {
                return 0;
            }

//            @Override
//            public int evaluate(int a, int b) {
//                return 0;
//            }

            @Override
            public int evaluate(int a, int b) {
                return MathOperation.super.evaluate(a, b);
            }
        };
        System.out.println(multiplication.evaluate(3, 3));
        t1.start();
    }
}

//class SumOperation implements MathOperation {
//
//    @Override
//    public int operate(int a, int b) {
//        return a + b;
//    }
//}

@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
    default int evaluate(int a, int b){
        return a * b;
    }

}