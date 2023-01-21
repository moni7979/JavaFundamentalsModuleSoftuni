package textProcessing.ex;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            int codeIndex = input.charAt(i) + 3;
            char symbol = (char) codeIndex;
            result += symbol;
        }
        System.out.println(result);
    }
}
