package examPrep;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodQuantity = Double.parseDouble(scanner.nextLine());
        double hayQuantity = Double.parseDouble(scanner.nextLine());
        double coverQuantity = Double.parseDouble(scanner.nextLine());
        double guineaWeight = Double.parseDouble(scanner.nextLine());

        //цикъл за 30те дни
        double gramsFood = foodQuantity * 1000;
        double gramsHay = hayQuantity * 1000;
        double gramsCover = coverQuantity * 1000;
        double gramsGuinea = guineaWeight * 1000;

        boolean isEnough = true;
        for (int i = 1; i <= 30; i++) {
            // -евридей 300г храна
            gramsFood -= 300;

            // -всеки втори ден, първо яде после дава hay, който е 5% от останалата храна
            if (i % 2 == 0) {
                gramsHay -= 0.05 * gramsFood;
            }
            // -всеки 3ти ден cover, който е 1/3 от теглото му
            if (i % 3 == 0) {
                gramsCover -= gramsGuinea / 3;
            }

            // дали ще е достатъчно за месец ?
            if (gramsFood <= 0 || gramsHay <= 0 || gramsCover <= 0) {
                isEnough = false;
                break;
                //ако свърши food, hay, cover -> приключва програмата
            }
        }

        if (isEnough) {
            double foodToKg = gramsFood / 1000;
            double hayToKg = gramsHay / 1000;
            double coverToKg = gramsCover / 1000;

            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodToKg, hayToKg, coverToKg);
        } else {
            System.out.println("Merry must go to the pet store!");
        }

    }
}
