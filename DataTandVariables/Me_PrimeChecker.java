package dataTypesVariables.ex;

import java.util.Scanner;

public class Me_PrimeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());

        for (int number = 2; number <= counter; number++) {
            boolean isPrime = true;
            for (int numberCheck = 2; numberCheck < number; numberCheck++) {
                if (number % numberCheck == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", number, isPrime);
        }
    }
}
