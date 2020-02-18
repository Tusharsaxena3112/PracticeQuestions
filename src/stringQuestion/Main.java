package stringQuestion;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        String str1 = m.generateString();
        System.out.println(str1);
        char[] sorted = m.sortedString(str1);
        System.out.println(sorted);
//        System.out.println(Arrays.toString(m.countFreq(m.sortedString(m.generateString()))));
        int[] freq1 = m.countFreq(str1.toCharArray());
        System.out.println(Arrays.toString(freq1));
        int max = 0;
        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] > max) {
                max = freq1[i];
            }
        }
        int min = freq1[0];
        for (int i = 1; i < freq1.length; i++) {
            if (freq1[i] < min) {
                min = freq1[i];
            }
        }
//        System.out.println(max);
//        System.out.println(min);
        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] == max) {
                System.out.println("Max= " + (char) (91 - i - 1));
            }
            if (freq1[i] == min) {
                System.out.println("Min= " + (char) (91 - i - 1));
            }
        }
    }

    public String generateString() {
        Random rn = new Random();
        String str = "";
        while (str.length() < 500) {
            int ran = rn.nextInt(91);
            while (true) {
                if (ran >= 65 && ran <= 91) {
                    break;
                } else {
                    ran = rn.nextInt(91);
                }
            }
            str += (char) ran;
        }
        return str;
    }

    public char[] sortedString(String str) {
        char[] strArray = str.toCharArray();
        for (int i = str.length() - 1; i >= 1; i--) {
            char temp;
            for (int j = 0; j < str.length() - 1; j++) {
                if (strArray[j] > strArray[j + 1]) {
                    temp = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = temp;
                }
            }

        }
        return strArray;
    }

    public int[] countFreq(char[] arr) {
        int[] freq = new int[26];
        for (int i = 0; i < arr.length; i++) {
            freq[91 - (int) arr[i] - 1]++;
        }
        return freq;
    }
}
