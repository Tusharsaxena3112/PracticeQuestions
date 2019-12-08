package endTerm.exceptionHandling;

//Design a class in java that handles either of the following Exceptions: InputMismatchException
// OR NumberFormatException OR ArithmeticException.
public class Main {
    public static void main(String[] args) {
        try {
            int n = 10 / 1;
            throw new ArithmeticException("Arithmetic Exception.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        //throw new ArithmeticException("Division by zero.");
    }
}
