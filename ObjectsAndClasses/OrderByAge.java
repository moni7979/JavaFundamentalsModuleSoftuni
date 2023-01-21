package objectsAndClasses.ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    static class Person {

        private String name;
        private String iD;
        private int age;

        public Person(String name, String iD, int age) {
            this.name = name;
            this.iD = iD;
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.iD, this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String name = command.split(" ")[0];
            String iD = command.split(" ")[1];
            int age = Integer.parseInt(command.split(" ")[2]);

            Person currentPerson = new Person(name, iD, age);
            personList.add(currentPerson);

            command = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));
        for (Person person : personList) {
            System.out.println(person);
        }

    }
}
