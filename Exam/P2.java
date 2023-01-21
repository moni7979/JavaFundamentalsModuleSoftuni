package exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String regex = "(.+)>(?<numbers>[0-9]{3})\\|(?<lcLetters>[a-z]{3})\\|(?<ucLetters>[A-Z]{3})\\|(?<symbols>[^<>]{3})<(\\1)";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String passwords = scanner.nextLine();
            Matcher matcher = pattern.matcher(passwords);


            if (matcher.find()) {
                StringBuilder sb = new StringBuilder();
                String numbers = matcher.group("numbers");
                String lcLetters = matcher.group("lcLetters");
                String ucLetters = matcher.group("ucLetters");
                String symbols = matcher.group("symbols");

                sb.append(numbers);
                sb.append(lcLetters);
                sb.append(ucLetters);
                sb.append(symbols);

                System.out.printf("Password: %s%n", sb);

            } else {
                System.out.println("Try another password!");
            }

        }


    }
}
