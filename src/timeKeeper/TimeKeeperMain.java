package timeKeeper;

import java.util.Scanner;

public class TimeKeeperMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TimeKeeper timeKeeper = new TimeKeeper(input.nextDouble(), input.nextDouble(), input.nextDouble());
        timeKeeper.calculateSeconds();
    }
}

