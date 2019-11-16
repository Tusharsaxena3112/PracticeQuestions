package labPractice.question6.question1;

import java.util.HashSet;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine().trim();
        HashSet<Character> hs = new HashSet<>();
        for (Character i : name.toCharArray()) {
            hs.add(i);
        }
        System.out.println(hs);
        System.out.println(hs.size());
    }
}
