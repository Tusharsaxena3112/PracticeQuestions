package labPractice.question6.question3;

import java.util.HashSet;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        HashSet<Character> hs = new HashSet<>();
        HashSet<Character> hs1 = new HashSet<>();
        for (Character i : name.toCharArray()) {
            if (!hs.add(i)) { //for duplicate Elements;
                hs1.add(i);
            }
        }
        System.out.println(hs1);
    }

}
