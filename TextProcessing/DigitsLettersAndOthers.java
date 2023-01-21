package textProcessing;

import java.util.Scanner;

public class DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();
        for (char element : input.toCharArray()) {

            if (Character.isDigit(element)) {
                digits.append(element);
            } else if (Character.isLetter(element)) {
                letters.append(element);
            } else {
                other.append(element);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }
}
