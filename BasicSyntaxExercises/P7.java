package bSyntax.exersice;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //only works with 0.1, 0.2, 0.5, 1, and 2 coins.

        double nutsPrice = 2.0;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrice = 1.0;


        String input = scanner.nextLine();
        double sumCoins = 0;
        while (!input.equals("Start")) {
            double parsedPrice = Double.parseDouble(input);

            if (parsedPrice == 0.1) {
                sumCoins += parsedPrice;
            } else if (parsedPrice == 0.2) {
                sumCoins += parsedPrice;
            } else if (parsedPrice == 0.5) {
                sumCoins += parsedPrice;
            } else if (parsedPrice == 1) {
                sumCoins += parsedPrice;
            } else if (parsedPrice == 2) {
                sumCoins += parsedPrice;
            } else {
                System.out.printf("Cannot accept %.2f%n", parsedPrice);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {

            if (input.equals("Nuts")) {
                if (sumCoins >= nutsPrice) {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins -= 2.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Water")) {
                if (sumCoins >= waterPrice) {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins -= 0.7;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Crisps")) {
                if (sumCoins >= crispsPrice) {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins -= 1.5;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Soda")) {
                if (sumCoins >= sodaPrice) {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins -= 0.8;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Coke")) {
                if (sumCoins >= cokePrice) {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins -= 1.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}
