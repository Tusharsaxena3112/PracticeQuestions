package tempConverter;

import java.util.Scanner;

public class TemperatureConverterMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TemperatureConverter temp = new TemperatureConverter(input.nextDouble());
        System.out.println(temp);
    }
}

