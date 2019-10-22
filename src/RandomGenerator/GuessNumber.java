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
            return "You got it right.";
        } else if (number > ranNumber) {
            return String.format(" OOPS !! %d above the actual no.", (number - ranNumber));
        }
        return String.format("OOPS !! %d below the actual no.", (ranNumber - number));
    }

    public String toString() {
        return Check();
    }
}

