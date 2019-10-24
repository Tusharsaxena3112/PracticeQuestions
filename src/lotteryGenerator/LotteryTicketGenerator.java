package lotteryGenerator;

import java.util.Random;

/*Create a class named ‘LotteryTicketGenerator.java’. This class would be used to create lottery ticket numbers.
 A sample lottery ticket number looks like the following -
        10 12 22 55 60 86
        Here is some information available about the lottery ticket
        Every lottery ticket number will have exactly six numbers;
        Each number can either be a single-digit number or a double-digit number; 00 is also a number. (each number ‘n’ should be [0, 100])
        If the number of the lottery ticket is a single-digit number, a zero should appear in front of the number, i.e if the number is 4, it would appear on the ticket as 04.
        Each time the lottery company open the lottery contest, it will only sell 100 tickets to customers.
        You will have to create a custom definition class named ‘LotteryTicket.java’ which will store an array of 6 integer numbers as the ticket number.
        public class LotteryTicket {
        private int[] numbers;
// create getter and setter for this class, two constructors (one with no parameters and one with an int array parameter) and some helper method if you need
        }*/
public class LotteryTicketGenerator {
    Random ran = new Random();
    private String[] lotteryNumbers = new String[10];

    public LotteryTicketGenerator() {
        this.lotteryNumbers = new String[]{"00", "00", "00", "00", "00", "00"};
        generateLottery();
    }

    public LotteryTicketGenerator(String[] lotteryNumbers) {
        this.lotteryNumbers = lotteryNumbers;
    }

    public String[] getLotteryNumbers() {
        return lotteryNumbers;
    }

    public void setLotteryNumbers(String[] lotteryNumbers) {
        this.lotteryNumbers = lotteryNumbers;
    }

    public void generateLottery() {
        for (int i = 0; i <= 5; i++) {
            int number = ran.nextInt(100);
            if (number <= 9) {
                lotteryNumbers[i] = "0" + number;
            } else {
                lotteryNumbers[i] = number + "";
            }
            System.out.print(lotteryNumbers[i] + " ");
        }
    }
}