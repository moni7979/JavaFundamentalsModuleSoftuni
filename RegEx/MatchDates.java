package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<day>[\\d][\\d])([\\/\\-\\.])(?<month>[A-Z][a-z]{2})\\2(?<year>[\\d]{4})";

        Pattern patter = Pattern.compile(regex);
        Matcher matcher = patter.matcher(input);

        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
