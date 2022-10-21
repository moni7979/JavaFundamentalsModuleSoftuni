package lists.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listWagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while(!input.equals("end")) {

            if (input.contains("Add")) {
                int numberToAdd = Integer.parseInt(input.split(" ")[1]);
                listWagons.add(numberToAdd);

            } else {
                int intValue = Integer.parseInt(input);
                for (int i = 0; i < listWagons.size(); i++) {
                    int number = listWagons.get(i);
                    if (number + intValue <= maxCapacity) {
                        listWagons.set(i, number + intValue);
                        //i -= 1;
                        break;
                    } else {
                        continue;
                    }
                }
            }


            input = scanner.nextLine();
        }
        for (int element : listWagons) {
            System.out.print(element + " ");
        }
    }
}
