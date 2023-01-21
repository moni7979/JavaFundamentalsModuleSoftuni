package associativeArrays;

import java.util.*;

public class StudenyAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, new ArrayList<>());
            }
            studentsMap.get(name).add(grade);
        }

        Map <String, Double> averageGradeStudents = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrades = entry.getValue();
            
            double averageGrade = getAverageGrade(listGrades);

            if (averageGrade >= 4.50) {
                averageGradeStudents.put(studentName, averageGrade);
            }
        }
        averageGradeStudents.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));



    }

    private static double getAverageGrade(List<Double> listGrades) {
        double sumGrade = 0;
        for (double grade : listGrades) {
            sumGrade += grade;
        }
        return sumGrade / listGrades.size();
    }
}
