package doubloon;

import java.util.ArrayList;

public class Doubloon {
    private String string;
    private ArrayList<Integer> frequency = new ArrayList<>();
    private boolean doubloon;

    public Doubloon(String string) {
        this.string = string;
    }

    public void calculateFrequency() {
        char[] chars = string.toCharArray();
        for (char a : chars) {
            int count = 0;
            for (int j = 0; j <= chars.length; j++) {
                if (chars[j] == a) {
                    count++;
                }
            }
            frequency.add(count);
        }
        for (Integer integer : frequency) {
            if (integer.intValue() == 2) {
                doubloon = true;
            } else {
                doubloon = false;
                break;
            }
        }

    }
}
