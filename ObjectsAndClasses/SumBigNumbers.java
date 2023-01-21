package objectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstBigNum = new BigInteger(scanner.nextLine());
        BigInteger secondBigNum = new BigInteger(scanner.nextLine());

        BigInteger sum = firstBigNum.add(secondBigNum);

        System.out.println(sum);
    }
}
