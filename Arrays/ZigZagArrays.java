package arrays.ex;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[rows];
        String[] secondArr = new String[rows];

        for (int row = 1; row <= rows; row++) {
            String[] numbersArr = scanner.nextLine().split(" ");
            String firstNumber = numbersArr[0];
            String secondNumber = numbersArr[1];

            if(row % 2 == 0) {
                secondArr[row - 1] = firstNumber;
                firstArr[row - 1] = secondNumber;

            } else {
                firstArr[row - 1] = firstNumber;
                secondArr[row - 1] = secondNumber;
            }
        }

        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
