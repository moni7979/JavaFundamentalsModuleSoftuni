package methods.ex;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (checkCharLength(input) && checkForLetterDigits(input) && checkTwoDigits(input)) {
            System.out.println("Password is valid");
        }

        if (!checkCharLength(input) && checkForLetterDigits(input) && checkTwoDigits(input)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (checkCharLength(input) && !checkForLetterDigits(input) && checkTwoDigits(input)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (checkCharLength(input) && checkForLetterDigits(input) && !checkTwoDigits(input)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean checkCharLength(String input) {
        return input.length() >= 6 && input.length() <= 10;
    }

    public static boolean checkForLetterDigits(String input) {
        input.toCharArray();
        for (char symbol = (char) 0; symbol < input.length(); symbol++) {
            if ((symbol >= 48 && symbol <= 57) || (symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 122)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkTwoDigits(String input) {
        input.toCharArray();
        return input.length() > 2;
    }
}
