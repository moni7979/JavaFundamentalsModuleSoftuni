package arrays.ex;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] peopleArr = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            peopleArr[i] += people;
            sum += people;
        }
        for (int element : peopleArr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
