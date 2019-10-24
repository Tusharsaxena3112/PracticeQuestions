package jioBillCalculator;

import java.util.Scanner;

public class BillCalculatorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BillCalculator bill = new BillCalculator(input.nextInt());
        System.out.println();
    }
}
