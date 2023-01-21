package objectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");

        Random random = new Random();
        for (int i = 0; i < inputArr.length; i++) {
            int indexOld = random.nextInt(inputArr.length);
            int indexNew = random.nextInt(inputArr.length);

            String oldWord = inputArr[indexOld];
            inputArr[indexOld] = inputArr[indexNew];
            inputArr[indexNew] = oldWord;
        }

        System.out.println(String.join(System.lineSeparator(), inputArr));
    }
}
