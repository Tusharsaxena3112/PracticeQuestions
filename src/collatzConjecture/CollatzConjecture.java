package collatzConjecture;

import java.util.ArrayList;

public class CollatzConjecture {
    private int number;

    public CollatzConjecture(int number) {
        this.number = number;
    }

    public ArrayList<Integer> getCollatzString() {
        ArrayList<Integer> al = new ArrayList<>();
        if (number == 1) {
            return al;
        } else {
            while (number != 1) {
                if (number % 2 == 0) {
                    number = number / 2;
                    al.add(number);
                } else if (number % 2 != 0) {
                    number = 3 * number + 1;
                    al.add(number);
                } else if (number == 1) {
                    return al;
                }
            }
        }
        return al;
    }
}
