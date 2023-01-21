package textProcessing.ex;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String str1 = input.split(" ")[0];
        String str2 = input.split(" ")[1];



        System.out.println(characterMultiplier(str1, str2));
    }
    private static int characterMultiplier(String str1, String str2) {
        int sum = 0;

        if (str1.length() > str2.length()) {

            for (int i = 0; i < str2.length(); i++) {
                int charCode1 = str1.charAt(i);
                int charCode2 = str2.charAt(i);

                int result = charCode1 * charCode2;
                sum += result;
            }

            for (int i = str2.length(); i < str1.length(); i++) {
                int charCodeForStr1 = str1.charAt(i);
                sum += charCodeForStr1;
            }


        } else {

            for (int i = 0; i < str1.length(); i++) {
                int charCode1 = str1.charAt(i);
                int charCode2 = str2.charAt(i);

                int result = charCode1 * charCode2;
                sum += result;
            }

            for (int i = str1.length(); i < str2.length(); i++) {
                int charCodeForStr2 = str2.charAt(i);
                sum += charCodeForStr2;
            }
        }
        return sum;
    }
}
