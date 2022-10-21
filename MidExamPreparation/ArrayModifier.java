package examPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commandArr = input.split(" ");

            String command = commandArr[0];


            switch (command) {
                case "swap":
                    int index1 = Integer.parseInt(commandArr[1]);
                    int index2 = Integer.parseInt(commandArr[2]);

                    int numberAtIndex1 = numbersArr[index1];
                    int numberAtIndex2 = numbersArr[index2];

                    numbersArr[index1] = numberAtIndex2;
                    numbersArr[index2] = numberAtIndex1;
                    break;

                case "multiply":
                    int index1multipl = Integer.parseInt(commandArr[1]);
                    int index2multipl = Integer.parseInt(commandArr[2]);

                    int product = numbersArr[index1multipl] * numbersArr[index2multipl];
                    numbersArr[index1multipl] = product;
                    break;

                case "decrease":
                    for (int i = 0; i < numbersArr.length; i++) {
                        numbersArr[i] -= 1;
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < numbersArr.length; i++) {
            if (i == numbersArr.length - 1) {
                System.out.print(numbersArr[i]);
            } else {
                System.out.print(numbersArr[i] + ", ");
            }
        }
    }
}
