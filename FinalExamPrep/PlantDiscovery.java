package finalExamPrep;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> plantMap = new HashMap<>();
        Map<String, Double> ratingMap = new HashMap<>();


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            String[] plantInput = scanner.nextLine().split("<->");
            String plant = plantInput[0];
            int rarity = Integer.parseInt(plantInput[1]);

            plantMap.put(plant, rarity);
            ratingMap.put(plant, 0.0);
        }


        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {

            String[] tokens = command.split("[: -]+");
            String toDo = tokens[0];
            String name = tokens[1];

            if (plantMap.containsKey(name)) {

                if (toDo.equals("Rate")) {

                   // ratingMap.put(name, 0.0);
                    double rating = Double.parseDouble(tokens[2]);

                    if (ratingMap.get(name) == 0) {
                        ratingMap.put(name, rating);
                    } else {
                        double oldRating = ratingMap.get(name);
                        ratingMap.put(name, (rating + oldRating) / 2);
                    }
                } else if (toDo.equals("Update")) {
                    int rarity = Integer.parseInt(tokens[2]);
                    plantMap.put(name, rarity);

                } else if (toDo.equals("Reset")) {

                    ratingMap.put(name, 0.0);
                }
            } else {
                System.out.println("error");
            }

            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), ratingMap.get(entry.getKey()));
        }

    }
}
