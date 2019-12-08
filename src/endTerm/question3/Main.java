package endTerm.question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        Question3 qt3 = new Question3(number);
        System.out.println(qt3.isZero());
        System.out.println(qt3.isNegative());
        System.out.println(qt3.isPositive());
        System.out.println(qt3.isEven());
        System.out.println(qt3.isOdd());
        System.out.println(qt3.isPrime());
    }
}
