package finalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            StringBuilder sb = new StringBuilder();

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                for (char symbol : input.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        sb.append(symbol);
                    }
                }

                if (sb.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", sb);
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }

    }
}
