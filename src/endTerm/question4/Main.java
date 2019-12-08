package endTerm.question4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Question4 qt4 = new Question4();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ON/OFF:");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            arrayList.add(scanner.nextLine());
        }
        if (arrayList.get(0) == "ON") {
            qt4.setAC_ON(true);
        }
        if (arrayList.get(1) == "ON") {
            qt4.setHOME_THEATRE(true);
        }
        if (arrayList.get(2) == "ON") {
            qt4.setFAN_ON(true);
        }
        if (arrayList.get(3) == "ON") {
            qt4.setLIGHT_ON(true);
        }
        int powerConsumed = qt4.calculateTotalPowerConsumed();
        if (powerConsumed > 2000) {
            System.out.println("Overloaded");
        } else {
            System.out.println(powerConsumed);
        }
    }
}
