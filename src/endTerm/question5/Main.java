package endTerm.question5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Question5> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String name = scanner.nextLine();
            double percentage = scanner.nextDouble();
            scanner.nextLine();
            arrayList.add(new Question5(name, percentage));
        }
        for (int i = 0; i < 3; i++) {
            if (arrayList.get(i).getPercentage() < 40) {
                System.out.println(arrayList.get(i).toString());
            }
        }
    }
}
