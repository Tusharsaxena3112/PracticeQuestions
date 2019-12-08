package endTerm.question2;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

//Create a class in Java named “RandomNumberArrayClass” that generates a random array
// of integers whose length is specified by user input.
//
// The elements of the array must satisfy the following condition:
//The range of array elements is [0, 10 * length - 1].
//No two elements in the array can be the same
//Create a method named “populatePseudoRandomElementsInArray(int[] array)” to encapsulate the logic for this code.
public class Question2 {
    public void populatePseudoRandomElementsInArray() {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        System.out.println("Enter length of the array");
        int len = scanner.nextInt();
        int s = 0;
        set.add(random.nextInt(10 * len - 1));
        while (set.size() < len) {
            set.add(random.nextInt(10 * len - 1));
        }
        System.out.println(set);
    }
}
