package RandomGenerator;

import java.util.Scanner;

public class GuessNumberMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessNumber number = new GuessNumber(input.nextInt());
        System.out.println(number);
    }
}
