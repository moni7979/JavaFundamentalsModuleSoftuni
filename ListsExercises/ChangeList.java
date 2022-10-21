package lists.ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listIntegers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            if(input.contains("Delete")) {
                int elementToDelete = Integer.parseInt(input.split(" ")[1]);
                listIntegers.removeAll(Arrays.asList(elementToDelete));
            } else if (input.contains("Insert")) {
                int elementToInsert = Integer.parseInt(input.split(" ")[1]);
                int indexToInsert = Integer.parseInt(input.split(" ")[2]);

                listIntegers.add(indexToInsert, elementToInsert);
            }
            input = scanner.nextLine();
        }

        for (int element : listIntegers) {
            System.out.print(element + " ");
        }
    }
}
