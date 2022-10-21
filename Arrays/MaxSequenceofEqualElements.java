package arrays.ex;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxLenght = 0;
        int length = 1;

        int startIndex = 0;
        int bestStart = 0;

        for (int i = 1; i < numbersArr.length; i++) {
            if (numbersArr[i] == numbersArr[i - 1]) {
                length++;
            } else {
                length = 1;
                startIndex = i;
            }

            if (length > maxLenght) {
                maxLenght = length;
                bestStart = startIndex;
            }
        }

        for (int i = bestStart; i < bestStart + maxLenght; i++) {
            System.out.print(numbersArr[i] + " ");
        }
    }
}
