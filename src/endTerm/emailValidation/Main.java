package endTerm.emailValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scanner.nextLine().trim();
        EmailValidation emailValidation = new EmailValidation(email);
        System.out.println(emailValidation.validateEmail());
    }
}
