package methods.ex;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")) {

            if (isFindPalindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    public static boolean isFindPalindrome(String inputNumber) {
        String reversedStr = "";
        for (int i = inputNumber.length() - 1; i >= 0; i--) {
            reversedStr += inputNumber.charAt(i);
        }
        return inputNumber.equals(reversedStr);
    }
}
