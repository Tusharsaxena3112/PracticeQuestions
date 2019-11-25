package endTerm;

import java.util.Scanner;

public class ExecutionMain {
    public static void main(String[] args) {
        Question1 q = new Question1();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int array[] = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(q.findSmallestMissingPositiveNumber(array));
    }
}
