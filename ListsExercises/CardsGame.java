package lists.ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //създавам двата листа, които после ще сравнявам
        List<Integer> deck1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> deck2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        boolean isFirstWinner = false;
        boolean isSecondWinner = false;
        while (deck1.size() != 0 && deck2.size() != 0) {

            int firstPlayerCard = deck1.get(0);
            int secondPlayerCard = deck2.get(0);
            deck1.remove(0);
            deck2.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                deck1.add(firstPlayerCard);
                deck1.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                deck2.add(secondPlayerCard);
                deck2.add(firstPlayerCard);
            }
        }
        if (deck1.size() == 0) {
            //втория печели -> сума от картите на втория
            System.out.printf("Second player wins! Sum: %d", findSum(deck2));
        }
        //2. ако на втория му свършат картите
        else if (deck2.size() == 0) {
            //първия печели
            System.out.printf("First player wins! Sum: %d", findSum(deck1));
        }
    }


    public static int findSum(List<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }
}
