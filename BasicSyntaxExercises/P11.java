package bSyntax.exersice;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int numberHeadsets = lostGames / 2;
        int numberMouses = lostGames / 3;
        int numberKeyboards = lostGames / 6;
        int numberDisplays = lostGames / 12;

        double totalHeadset = numberHeadsets * headsetPrice;
        double totalMouse = numberMouses * mousePrice;
        double totalKeyboards = numberKeyboards * keyboardPrice;
        double totalDisplays = numberDisplays * displayPrice;

        double totalPrice =  totalHeadset + totalMouse + totalKeyboards + totalDisplays;

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
