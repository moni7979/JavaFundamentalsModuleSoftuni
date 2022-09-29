package dataTypesVariables.ex;

import java.util.Scanner;

public class P11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double snowballValue = Double.MIN_VALUE;
        int snowballBiggest = 0;
        int snowballTimeBiggest = 0;
        int snowBallQualityBiggest = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double result = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (result > snowballValue) {
                snowballValue = result;
                snowballBiggest = snowballSnow;
                snowballTimeBiggest = snowballTime;
                snowBallQualityBiggest = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballBiggest, snowballTimeBiggest, snowballValue, snowBallQualityBiggest);
    }
}
