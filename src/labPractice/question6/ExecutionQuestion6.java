package labPractice.question6;

import java.util.TreeSet;

public class ExecutionQuestion6 {
    public static void main(String[] args) {
        TreeSet<Question6> set = new TreeSet<>();
        for (int i = 0; i <= 9; i++) {
            set.add(new Question6("Tushar" + (i + 18), (100 - i)));
            System.out.println(i + 1 + " element added successfully");
        }
//        for (Question6 q6:set) {
//            System.out.println(q6);
//        }
        System.out.println(set);
    }

}
