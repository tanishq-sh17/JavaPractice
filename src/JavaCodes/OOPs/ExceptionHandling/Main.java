package JavaCodes.OOPs.ExceptionHandling;

public class Main {
    static void main(String[] args) {
//        int a = 5;
//        int b = 0;
        try {
//            int ans = divide(a, b);
//            System.out.println(ans);

            String name = "Tanishq";
            if(name.equals("Tanishq")){
                throw new MyException("name is tanishq");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {   // Implicitly throwing an Exception
            System.out.println(e.getMessage());
        } catch (Exception e) {   // Implicitly throwing an Exception
            System.out.println("normal exception");
        } finally {
            System.out.println("finally will always run..!");
        }
    }
    // Explicitly throwing an Exception
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero.");
        }
        return a/b;
    }
}
