package methods.ex;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {

            if (isSumDivisibleBy8(number) && isContainsOddDigit(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isSumDivisibleBy8(int number) {

            int sum = 0;

            while (number > 0) {
               int lastSymbol = number % 10;

               sum += lastSymbol;

               number /= 10;
            }

        return sum % 8 == 0;
    }

    public static boolean isContainsOddDigit (int number) {

        while (number > 0) {

            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}
