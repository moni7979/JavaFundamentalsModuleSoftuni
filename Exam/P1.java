package exam;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.contains("Translate")) {

                //tuk moje bi trqbwa da go naprawq na char!!!
                String symbol = command.split("\\s+")[1];
                String replacement = command.split("\\s+")[2];
                str = str.replaceAll(symbol, replacement);

                System.out.println(str);


            } else if (command.contains("Includes")) {

                String substring = command.split("\\s+")[1];
                if (str.contains(substring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (command.contains("Start")) {

                String substring = command.split("\\s+")[1];
                //Tuk specialno vnimanie
                if (str.contains(substring)) {
                    if (substring.charAt(0) == str.charAt(0) && substring.charAt(1) == str.charAt(1)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                }

            } else if (command.equals("Lowercase")) {

                str = str.toLowerCase();
                System.out.println(str);


            } else if (command.contains("FindIndex")) {

                String symbol = command.split("\\s+")[1];
                int index = str.lastIndexOf(symbol);
                System.out.println(index);

            } else if (command.contains("Remove")) {

                int startIndex = Integer.parseInt(command.split("\\s+")[1]);
                int count = Integer.parseInt(command.split("\\s+")[2]);

                int lastIndex = startIndex + count;

                String substring = str.substring(startIndex, lastIndex);

                str = str.replace(substring, "");

                System.out.println(str);

            } else {
                continue;
            }



            command = scanner.nextLine();
        }
    }
}
