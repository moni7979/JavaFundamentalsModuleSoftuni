package bSyntax.exersice;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPerson = Integer.parseInt(scanner.nextLine());
        String category = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        if (day.equals("Friday")) {
            if (category.equals("Students")) {
                price = 8.45 * numPerson;
                if (numPerson >= 30) {
                    price -= price * 0.15;
                }
            } else if (category.equals("Business")) {
                price = 10.90 * numPerson;
                if (numPerson >= 100) {
                    price -= 10 * 10.90;
                }
            } else if (category.equals("Regular")) {
                price = 15 * numPerson;
                if (numPerson >= 10 && numPerson <= 20) {
                    price -= price * 0.05;
                }
            }
        } else if (day.equals("Saturday")) {
            if (category.equals("Students")) {
                price = 9.80 * numPerson;
                if (numPerson >= 30) {
                    price -= price * 0.15;
                }
            } else if (category.equals("Business")) {
                price = 15.60 * numPerson;
                if (numPerson >= 100) {
                    price -= 10 * 15.60;
                }
            } else if (category.equals("Regular")) {
                price = 20 * numPerson;
                if (numPerson >= 10 && numPerson <= 20) {
                    price -= price * 0.05;
                }
            }
        } else if (day.equals("Sunday")) {
            if (category.equals("Students")) {
                price = 10.46 * numPerson;
                if (numPerson >= 30) {
                    price -= price * 0.15;
                }
            } else if (category.equals("Business")) {
                price = 16 * numPerson;
                if (numPerson >= 100) {
                    price -= 10 * 16;
                }
            } else if (category.equals("Regular")) {
                price = 22.50 * numPerson;
                if (numPerson >= 10 && numPerson <= 20) {
                    price -= price * 0.05;
                }
            }
        }

        System.out.printf("Total price: %.2f", price);
    }
}
