package methods.ex;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        findDivision(num1, num2);
    }
    public static long findFact(int number) {

        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void findDivision(int number1, int number2) {

        long factNumber1 = findFact(number1);
        long factNumber2 = findFact(number2);
        double result = factNumber1 * 1.0 / factNumber2 ;
        System.out.printf("%.2f", result);
    }
}
