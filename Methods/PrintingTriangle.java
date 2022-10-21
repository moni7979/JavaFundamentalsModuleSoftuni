package methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printTriangle(n);
    }
    
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(1, i);
        }
        for (int j = n - 1; j > 0; j--) {
            printLine(1, j);
        }
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
