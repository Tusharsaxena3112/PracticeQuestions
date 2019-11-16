package labPractice.question6.question4;

import java.util.TreeSet;

public class Question4 {
    public static void main(String[] args) {
//        HashSet<Name> al = new HashSet<>();
//        for (int i = 0; i <= 9; i++) {
//            al.add(new Name("Tushar" + i, "Saxena" + i));
//        }
//        System.out.println(al);
        TreeSet<Name> ts = new TreeSet<>();
        for (int i = 0; i <= 9; i++) {
            ts.add(new Name("Tushar" + i, "Saxena" + i));
        }
    }

}
