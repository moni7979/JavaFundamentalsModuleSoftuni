package dataTypesVariables.ex;

import java.util.Scanner;

public class Me_DecryptingMsg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int numberLines = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 0; i < numberLines; i++) {
            char symbol = scanner.nextLine().charAt(0);
            char newSymbol = (char) (key + symbol);
            //newSymbol = newSymbol.charAt()
            message += newSymbol;
        }
        System.out.println(message);
    }
}
