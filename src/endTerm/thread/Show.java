package endTerm.thread;

import java.util.ArrayList;

public class Show extends Thread {
    private int number;

    public Show(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        CreateList createList = new CreateList();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = createList.createList(number);
//        System.out.println(arrayList.get(0));
        for (Integer i : arrayList) {
            try {
                System.out.println(i);
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println("Interrupt");
            }
        }

    }
}
