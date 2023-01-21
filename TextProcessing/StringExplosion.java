package textProcessing.ex;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder inputSb = new StringBuilder(input);

        int totalStrength = 0;
        for (int position = 0; position <= inputSb.length() - 1; position++) {
            char currentSymbol = inputSb.charAt(position);

            if (currentSymbol == '>') {
                int explosionStrength = Integer.parseInt(inputSb.charAt(position + 1) + "");
                totalStrength += explosionStrength;
            } else if (currentSymbol != '>' && totalStrength > 0) {
                inputSb.deleteCharAt(position);
                totalStrength--;
                position--;
            }
        }
        System.out.println(inputSb);
    }
}
