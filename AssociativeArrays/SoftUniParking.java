package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> platesMap = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String firstCommand = command.split( " ")[0];

            if (firstCommand.equals("register")) {

                String username = command.split(" ")[1];
                String licensePlate = command.split(" ")[2];

                if (!platesMap.containsKey(username)) {
                    platesMap.put(username, licensePlate);
                    System.out.println(username + " registered " + licensePlate + " successfully");
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                }


            } else if (firstCommand.equals("unregister")) {

                String usernameToRemove = command.split(" ")[1];

                if (!platesMap.containsKey(usernameToRemove)) {
                    System.out.printf("ERROR: user %s not found%n", usernameToRemove);
                } else {
                    platesMap.remove(usernameToRemove);
                    System.out.printf("%s unregistered successfully%n", usernameToRemove);
                }

            }


        }
        for (Map.Entry<String, String> entry : platesMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
