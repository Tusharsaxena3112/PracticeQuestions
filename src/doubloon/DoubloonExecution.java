package doubloon;

import java.util.Scanner;

public class DoubloonExecution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Doubloon doubloon = new Doubloon(str);
        System.out.println(doubloon.calculateFrequency());
    }
}
