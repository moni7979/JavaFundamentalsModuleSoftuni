package objectsAndClasses.ex;

import java.util.Scanner;

public class OpinionPoll {

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            String name = inputArr[0];
            int age = Integer.parseInt(inputArr[1]);


            if (age > 30) {
                Person currentPerson = new Person(name, age);
                System.out.printf("%s"  + " - " + "%d%n", currentPerson.getName(), currentPerson.getAge());
            }
        }
    }
}
