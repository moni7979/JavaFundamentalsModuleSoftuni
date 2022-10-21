package methods.ex;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine().toLowerCase(Locale.ROOT);

        countVowels(input);
    }
    
    public static void countVowels(String textInput) {
        int count = 0;
        for (char symbol : textInput.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
