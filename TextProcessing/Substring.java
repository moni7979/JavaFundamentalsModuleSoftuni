package textProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String input = scanner.nextLine();

        int index = input.indexOf(toRemove);
        while(input.contains(toRemove)) {
            input = input.replace(toRemove, "");
        }
        System.out.println(input);
    }
}
