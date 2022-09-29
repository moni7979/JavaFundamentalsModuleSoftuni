package bSyntax.exersice;

import java.util.Scanner;

public class P9_orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        for (int i = 1; i <= n; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double totalCoffee = price * days * capsuleCount;
            totalPrice += totalCoffee;

            System.out.printf("The price for the coffee is: $%.2f%n", totalCoffee);
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
