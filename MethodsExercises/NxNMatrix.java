package methods.ex;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        findMatrix(n);
    }

    public static void findMatrix(int n) {

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
