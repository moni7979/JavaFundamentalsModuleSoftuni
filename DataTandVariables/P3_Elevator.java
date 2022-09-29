package dataTypesVariables.ex;

import java.util.Scanner;

public class P3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = numberPeople / capacity;

        if (numberPeople % capacity != 0) {
            courses += 1;
        }
        System.out.println(courses);
    }
}
