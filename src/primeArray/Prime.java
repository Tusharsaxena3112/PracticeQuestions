package primeArray;

import java.util.ArrayList;

public class Prime {
    private int number;
    ArrayList<Boolean> arrayList = new ArrayList<>();
    public Prime(int number) {
        this.number = number;
    }

    public Object[] determineArray() {
        for (int i = 1; i <= number; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                arrayList.add(Boolean.valueOf(true));
            } else {
                arrayList.add(Boolean.valueOf(false));
            }
        }
        return arrayList.toArray();
    }
}
