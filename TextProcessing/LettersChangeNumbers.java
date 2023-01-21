package textProcessing.ex;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");

        double sum = 0;
        for (String code : inputArr) {

            char firstLetter = code.charAt(0);
            char lastLetter = code.charAt(code.length() - 1);

            double number = Double.parseDouble(code.replace(firstLetter, ' ').replace(lastLetter, ' ').trim());


            if (Character.isUpperCase(firstLetter)) {
                int positionUpper = firstLetter - 64;
                number /= positionUpper;

            } else if (Character.isLowerCase(firstLetter)) {
                int positionLower = firstLetter - 96;
                number *= positionLower;
            }


            if (Character.isUpperCase(lastLetter)) {
                int positionUpper = lastLetter - 64;
                number -= positionUpper;

            } else if (Character.isLowerCase(lastLetter)) {
                int positionLower = lastLetter - 96;
                number += positionLower;
            }
            sum += number;

        }

        System.out.printf("%.2f", sum);
    }
}
