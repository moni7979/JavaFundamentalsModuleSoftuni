package objectsAndClasses.ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class StudentsClass {
        String firstName;
        String lastName;
        double grade;

        public StudentsClass(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return this.grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", firstName, lastName, grade);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<StudentsClass> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String data = scanner.nextLine();

            String firstNameData = data.split(" ")[0];
            String lastNameData = data.split(" ")[1];
            double gradeData = Double.parseDouble(data.split(" ")[2]);

            StudentsClass student = new StudentsClass(firstNameData, lastNameData, gradeData);
            studentList.add(student);
        }

        studentList.sort(Comparator.comparing(StudentsClass::getGrade).reversed());

        for (StudentsClass student : studentList ) {
            System.out.println(student);
        }
    }
}
