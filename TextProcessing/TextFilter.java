package textProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {

            text = text.replace(word, countAsterisks(word));
        }
        System.out.println(text);
    }

    private static String countAsterisks(String word) {
        StringBuilder s  = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            s.append("*");
        }
        return s.toString();
    }
}
