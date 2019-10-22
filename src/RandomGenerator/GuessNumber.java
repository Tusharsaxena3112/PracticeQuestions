package RandomGenerator;

import java.util.Random;

public class GuessNumber {
    Random random = new Random();
    public int ranNumber = random.nextInt(100) + 1;
    private int number;

    public GuessNumber(int number) {
        this.number = number;
    }

    public String Check() {
        if (number == ranNumber) {
            return "found";
        } else if (number > ranNumber) {
            return String.format("%d above the actual no.", (number - ranNumber));
        }
        return String.format("%d below the actual no.", (ranNumber - number));
    }
}

