package textProcessing.ex;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernameArr = scanner.nextLine().split(", ");

        for (String username : usernameArr) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }

    }

    public static boolean isValidUsername(String username) {

        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return  false;
            }
        }
        return true;
    }
}
