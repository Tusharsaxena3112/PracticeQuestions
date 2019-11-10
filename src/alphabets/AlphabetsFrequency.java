package alphabets;

import java.util.Scanner;

public class AlphabetsFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Counts = new int[26];
        System.out.println("Enter String:");
        String str = input.nextLine();
        char[] alphabets = "abcdehghijklmnopqrstuvwxyz".toCharArray();
        char[] str1 = str.toCharArray();
        for (int i = 0; i <= alphabets.length - 1; i++) {
            int count = 0;
            for (int j = 0; j <= str.length() - 1; j++) {
                if (alphabets[i] == str1[j]) {
                    count++;
                }
            }
            Counts[i] = count;
        }
        System.out.println(Counts);
    }
}
