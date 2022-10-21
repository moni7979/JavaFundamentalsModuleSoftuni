package lists.ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int sum = 0;
        while (numberList.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            //взимам елемента за премахване
            if (index >= 0 && index <= numberList.size() - 1) {
                int removedElement = numberList.get(index);
                sum += removedElement;
                //премахвам от индекса
                numberList.remove(index);
                //обхождам всеки елемент и проверявам дали е по-голям или по-малък от махнатия
                modifyList(numberList, removedElement);
                // проверка дали индексът е по-малък от 0
                //в този случай премахвам първия елемент и КОПИРАМ последния елемент на тази позиция
            } else if (index < 0) {
                int lastNumber = numberList.get(numberList.size() - 1);
                //добавям премахнатия първи елемент към сумата
                int firstNumber = numberList.get(0);
                sum += firstNumber;

                numberList.remove(0);

                numberList.set(0, lastNumber);
                modifyList(numberList, firstNumber);

            } else if (index > numberList.size() - 1) { //проверка дали индекса е по-голям от последния индекс в поредицата
                int firstNumber = numberList.get(0);
                int lastElement = numberList.get(numberList.size() - 1);
                sum += lastElement;
                numberList.remove(numberList.size() - 1);
                numberList.add(firstNumber);
                modifyList(numberList, lastElement);
            }

        }
        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numberList, int removedElement) {
        for (int indexInList = 0; indexInList <= numberList.size() - 1; indexInList++) {
            int currentNumber = numberList.get(indexInList);
            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            numberList.set(indexInList, currentNumber);
        }
    }
}
