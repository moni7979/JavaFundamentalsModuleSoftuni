package bSyntax.exersice;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;

        int sumFactorials = 0;
        while (number > 0) {
            int lastDigit = number % 10;

            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            sumFactorials += fact;

            number = number / 10;
        }

        if (sumFactorials == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
