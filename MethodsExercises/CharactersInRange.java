package methods.ex;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startSymbol = scanner.nextLine().charAt(0);
        char endSymbol = scanner.nextLine().charAt(0);

        printBetweenChars(startSymbol, endSymbol);

    }

    public static void printBetweenChars(char start, char end) {

        if (start < end) {
            for (char i = (char)(start + 1); i < end; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = (char) (end + 1); i < start; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
