package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> newList = sumLikeGauss(numberList);
        for (int item : newList) {
            System.out.print(item + " ");
        }
    }

    public static List<Integer> sumLikeGauss(List<Integer> list) {

        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int firstNum = list.get(i);
            int lastNum = list.get(list.size() - 1);

            int result = firstNum + lastNum;
            list.set(i, result);
            list.remove(list.size() - 1);

        }
        return list;
    }
}
