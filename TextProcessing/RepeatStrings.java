package textProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputArr.length; i++) {
            int count = inputArr[i].length();
            for (int j = 0; j < count; j++) {
                result.append(inputArr[i]);
            }
        }
        System.out.println(result);
    }
}
