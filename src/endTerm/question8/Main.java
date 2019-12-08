package endTerm.question8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String string = scanner.nextLine();
        Question8 qt8 = new Question8(string);
        int[] freq = qt8.calculateFrequency();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.printf("%c : %d\n", vowels[i], freq[i]);
            }
        }
    }
}
