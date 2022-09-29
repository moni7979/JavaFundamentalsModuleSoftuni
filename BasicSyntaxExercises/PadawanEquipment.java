package bSyntax.exersice;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        int freeBelts = studentsCount / 6;
        double totalSaber = saberPrice * Math.ceil(studentsCount + 0.10 * studentsCount);
        double totalRobes = robesPrice * studentsCount;
        double totalBelts = beltsPrice * (studentsCount - freeBelts);

        double neededEquipment = totalSaber + totalRobes + totalBelts;

        if (neededEquipment <= amountMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", neededEquipment);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", neededEquipment - amountMoney);
        }
    }
}
