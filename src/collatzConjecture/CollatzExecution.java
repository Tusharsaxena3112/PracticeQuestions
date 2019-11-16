package collatzConjecture;

import java.util.Scanner;

public class CollatzExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        CollatzConjecture cl = new CollatzConjecture(number);
        System.out.println(cl.getCollatzString().toString());
    }
}
