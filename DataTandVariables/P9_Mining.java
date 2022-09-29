package dataTypesVariables.ex;

import java.util.Scanner;

public class P9_Mining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int source = Integer.parseInt(scanner.nextLine());

        int totalAmountSpices = 0;
        int days = 0;

        while (source >= 100) {
            int spices = source - 26;
            totalAmountSpices += spices;
            source -= 10;
            days++;
        }
        System.out.println(days);

        if (totalAmountSpices >= 26) {
            totalAmountSpices -= 26;
        }
        System.out.println(totalAmountSpices);

    }
}
