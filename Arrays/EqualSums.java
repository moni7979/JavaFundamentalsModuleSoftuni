package arrays.ex;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < index; j++) {
                int leftNumber = numbers[j];
                leftSum += leftNumber;
            }
            for (int k = index + 1; k < numbers.length; k++) {
                int rightNumber = numbers[k];
                rightSum += rightNumber;
            }
            if (leftSum == rightSum) {
                isFound = true;
                System.out.println(index);
                break;
            }
        }

        if (!isFound) {
            System.out.println("no");
        }
    }
}
