package lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < inputList.size() - 1; i++) {
            double firstNum = inputList.get(i);
            double secondNum = inputList.get(i + 1);

            if (firstNum == secondNum) {
                double result = firstNum + secondNum;
                inputList.set(i, result);
                inputList.remove(i + 1);
                i --;
            }
        }
        System.out.println(joinElementsByDelimiter(inputList, " "));

    }

    public static String joinElementsByDelimiter(List<Double> list, String delimiter) {

        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";

        for (double item : list) {
            String numDf = df.format(item) + delimiter;
            result += numDf;
        }
        return result;
    }
}
