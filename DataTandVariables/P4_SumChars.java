package dataTypesVariables.ex;

import java.util.Scanner;

public class P4_SumChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            char letters = scanner.nextLine().charAt(0);
            sum += letters;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
