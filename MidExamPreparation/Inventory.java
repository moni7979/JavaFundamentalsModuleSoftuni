package examPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventoryList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String[] commandArr = input.split(" - ");
            String command = commandArr[0];

            switch (command) {
                case "Collect":
                    String collectedItem = commandArr[1];
                    if (!inventoryList.contains(collectedItem)) {
                        inventoryList.add(collectedItem);
                    }
                    break;

                case "Drop":
                    String dropItem = commandArr[1];
                    if (inventoryList.contains(dropItem)) {
                        inventoryList.remove(dropItem);
                    }
                    break;

                case "Combine Items":
                    String[] elementsArr = commandArr[1].split(":");
                    String oldElement = elementsArr[0];
                    String newElement = elementsArr[1];

                    if (inventoryList.contains(oldElement)) {
                        int indexOldItem = inventoryList.indexOf(oldElement);
                        inventoryList.add(indexOldItem + 1, newElement);
                    }
                    break;

                case "Renew":
                    String renewItem = commandArr[1];
                    if (inventoryList.contains(renewItem)) {
                        inventoryList.remove(renewItem);
                        inventoryList.add(renewItem);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", inventoryList));
    }
}
