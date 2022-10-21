package methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (command.equals("add")) {
            addNums(num1,num2);
        } else if (command.equals("multiply")) {
            multiplyNums(num1,num2);
        } else if (command.equals("subtract")) {
            subtractNums(num1,num2);
        } else if (command.equals("divide")) {
            divideNums(num1,num2);
        }
    }

    public static void addNums(int n1, int n2) {
        int result = n1 + n2;
        System.out.println(result);
    }

    public static void multiplyNums(int n1, int n2) {
        int result = n1 * n2;
        System.out.println(result);
    }

    public static void subtractNums(int n1, int n2) {
        int result = n1 - n2;
        System.out.println(result);
    }

    public static void divideNums(int n1, int n2) {
        int result = n1 / n2;
        System.out.println(result);
    }
}
