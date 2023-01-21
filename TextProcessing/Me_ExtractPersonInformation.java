package textProcessing.ex;

import java.util.Scanner;

public class Me_ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            String[] firstTrim = input.split("@");
            String toTrim = firstTrim[1];

            String[] secondTrim = toTrim.split("\\|");
            String name = secondTrim[0];

            // blahblahblahblah

            String[] firstTrimAge = input.split("#");
            String toTrimAge = firstTrimAge[1];

            String[] secondTrimAge = toTrimAge.split("\\*");
            String age = secondTrimAge[0];

            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}
