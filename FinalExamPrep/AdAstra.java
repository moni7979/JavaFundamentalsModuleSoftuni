package finalExamPrep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(#|\\|)(?<name>[A-Za-z ]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);


        LinkedHashMap<String, String> expirationMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> caloriesMap = new LinkedHashMap<>();

       // StringBuilder outputItems = new StringBuilder();

        int totalCalories = 0;
        while (matcher.find()) {

            String name = matcher.group("name");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories;

            expirationMap.put(name, expirationDate);
            caloriesMap.put(name, calories);

            //outputItems.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", name, expirationDate, calories));
        }

        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        for (Map.Entry<String, String> entry : expirationMap.entrySet()) {

            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", entry.getKey(), entry.getValue(), caloriesMap.get(entry.getKey()));
        }
       // System.out.println(outputItems);

    }
}
