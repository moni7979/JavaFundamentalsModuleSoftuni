package dataTypesVariables.ex;

import java.util.Scanner;

public class P7_WaterFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLines = Integer.parseInt(scanner.nextLine());
        int tankCapacity = 255;
        int currentLiters = 0;

        for (int i = 1; i <= numberLines; i++) {
            int pouredLiters = Integer.parseInt(scanner.nextLine());
            currentLiters += pouredLiters;

            if (currentLiters > tankCapacity) {
                System.out.println("Insufficient capacity!");
                currentLiters -= pouredLiters;
            }
        }
        System.out.println(currentLiters);
    }
}
