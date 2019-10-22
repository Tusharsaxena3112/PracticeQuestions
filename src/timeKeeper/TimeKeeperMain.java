package timeKeeper;

import java.util.Scanner;

public class TimeKeeperMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TimeKeeper timeKeeper = new TimeKeeper(input.nextDouble(), input.nextDouble(), input.nextDouble());
        //System.out.println(timeKeeper.calculateSeconds());
        //System.out.println(timeKeeper.dayPercentage());
        System.out.println(timeKeeper);
    }
}

