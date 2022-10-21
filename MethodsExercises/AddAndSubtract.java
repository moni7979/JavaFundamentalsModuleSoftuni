package methods.ex;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int result = subtract(n1, n2, n3);
        System.out.println(result);
    }

    public static int sum(int number1,int number2) {
        int result = number1 + number2;
        return result;
    }

    public static int subtract(int number1 , int number2 ,int number3) {
        int result = sum(number1, number2) - number3;

        return result;
    }
}
