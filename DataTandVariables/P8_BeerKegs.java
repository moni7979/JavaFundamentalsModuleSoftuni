package dataTypesVariables.ex;

import java.util.Scanner;

public class P8_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;
        String modelBiggestKeg = "";
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double result = Math.PI * Math.pow(radius, 2) * height;

            if (result > maxValue) {
                maxValue = result;
                modelBiggestKeg = model;
            }
        }
        System.out.println(modelBiggestKeg);
    }
}
