package endTerm.thread;

import java.util.ArrayList;
import java.util.Random;

public class CreateList {
    public ArrayList<Integer> createList(int number) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(random.nextInt(10));
        for (int i = 0; i < number; i++) {
            arrayList.add(random.nextInt(10));
        }
        return arrayList;
    }
}
