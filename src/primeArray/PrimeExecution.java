package primeArray;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeExecution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Prime prime = new Prime(number);
        System.out.println(Arrays.toString(prime.determineArray()));
    }
}
