package finalExamPrep;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String command = scanner.nextLine();
        StringBuilder newPass = new StringBuilder();
        while (!command.equals("Done")) {

            if (command.equals("TakeOdd")) {

                for (int i = 1; i <= str.length() - 1; i++) {
                    if (i % 2 != 0) {
                        char symbol = str.charAt(i);
                        newPass.append(symbol);
                    }
                }
                str = newPass.toString();
                System.out.println(str);

            } else if (command.contains("Cut")) {

                int index = Integer.parseInt(command.split("\\s+")[1]);
                int length = Integer.parseInt(command.split("\\s+")[2]);

                String substring = str.substring(index, index + length);
                str = str.replaceFirst(substring, "");

                System.out.println(str);

            } else if (command.contains("Substitute")) {

                String substring = command.split("\\s+")[1];
                String substitute = command.split("\\s+")[2];

                if (str.contains(substring)) {
                    str = str.replaceAll(substring, substitute);
                    System.out.println(str);
                } else {
                    System.out.println("Nothing to replace!");
                }

            }

            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", str);
    }
}
