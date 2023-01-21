package finalExamPrep;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String instruction = scanner.nextLine();
        while (!instruction.equals("Generate")) {

            String[] tokens = instruction.split(">>>");
            String toDo = tokens[0];

            if (toDo.equals("Contains")) {

                String substring = tokens[1];
                if (activationKey.contains(substring)) {
                    System.out.printf("%s contains %s.%n", activationKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (toDo.equals("Flip")) {

                String upperOrLower = tokens[1];
                int startIndex = Integer.parseInt(tokens[2]);
                int endIndex = Integer.parseInt(tokens[3]);

                String oldSubstring = activationKey.substring(startIndex, endIndex);
                String newSubstring = "";
                if (upperOrLower.equals("Upper")) {
                    newSubstring = oldSubstring.toUpperCase();

                    activationKey = activationKey.replace(oldSubstring, newSubstring);
                } else if (upperOrLower.equals("Lower")) {
                    newSubstring = oldSubstring.toLowerCase();

                    activationKey = activationKey.replace(oldSubstring, newSubstring);
                }
                System.out.println(activationKey);

            } else if (toDo.equals("Slice")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);
                String substring2 = activationKey.substring(startIndex, endIndex);
                activationKey = activationKey.replace(substring2, "");

                System.out.println(activationKey);

            }

            instruction = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);
    }
}
