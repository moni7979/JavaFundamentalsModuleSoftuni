package textProcessing.ex;

import java.util.Scanner;

public class extractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] filePath = scanner.nextLine().split("\\\\");
        String word = filePath[filePath.length - 1];

        String fileName = word.split("\\.")[0];
        String fileExtension = word.split("\\.")[1];

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", fileExtension);
    }
}
