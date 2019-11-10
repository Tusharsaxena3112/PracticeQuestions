package coinGame;

import java.util.Scanner;

public class CoinExecution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Coin coin = new Coin();
        System.out.println("Enter State:");
        String state = input.nextLine().trim();
        System.out.println("Enter no.of times :");
        int n = input.nextInt();
        System.out.println(coin.tossAndCount(n, state));
    }
}
