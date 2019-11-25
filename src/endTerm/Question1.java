package endTerm;

import java.util.Arrays;

public class Question1 {
    public int findSmallestMissingPositiveNumber(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (i != array[i]) {
                return i;
            }
        }
        return array.length;
    }
}

