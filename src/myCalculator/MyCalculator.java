package myCalculator;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 1;
        System.out.println("Enter the no.");
        int number = input.nextInt();
        System.out.println("Enter the power:");
        int power = input.nextInt();
        try {
            if (number < 0) {
                throw new NegativeException("Number is negative");
            } else if (power < 0) {
                throw new NegativeException("Power cannot be negative");
            } else {
                for (int i = 0; i <= power - 1; i++) {
                    result = result * number;
                }
                System.out.printf("Your result is:%d", result);
            }
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }

    }
}
