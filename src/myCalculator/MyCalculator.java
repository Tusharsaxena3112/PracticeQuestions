package myCalculator;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no.");
        int number = input.nextInt();
        try {
            if (number < 0) {
                throw new NegativeException;
            }
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
    }
}
