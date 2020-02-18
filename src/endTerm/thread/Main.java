package endTerm.thread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length:");
        int n = scanner.nextInt();
        Show show = new Show(n);
        show.start();
    }
}
