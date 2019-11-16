package labPractice.question6.question4;

import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) {
        ArrayList<Name> al = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            al.add(new Name("Tushar" + i, "Saxena" + i));

        }
    }

}
