package methods.ex;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleChar(input);
    }

    public static void printMiddleChar(String input) {

        int inputLength = input.length();
        int middleIndex = inputLength / 2;

        if (inputLength % 2 == 0) {
            System.out.print(input.charAt(middleIndex - 1));
            System.out.print(input.charAt(middleIndex));

        } else {
            System.out.println(input.charAt(middleIndex));
        }
    }
}
