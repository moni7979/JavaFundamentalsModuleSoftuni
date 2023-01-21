package associativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String courseInfo = scanner.nextLine();
        Map<String, List<String>> courseMap = new LinkedHashMap<>();

        while (!courseInfo.equals("end")) {
            String courseName = courseInfo.split(" : ")[0];
            String studentName = courseInfo.split(" : ")[1];

            if(!courseMap.containsKey(courseName)) {
                courseMap.put(courseName, new ArrayList<>());
            }
            courseMap.get(courseName).add(studentName);

            courseInfo = scanner.nextLine();
        }

//        Map<String, Integer> finalCourseMap = new LinkedHashMap<>();
//        for (Map.Entry<String, List<String>> entry : courseMap.entrySet()) {
//            String name = entry.getKey();
//            int numberStudents = entry.getValue().size();
//
//            finalCourseMap.put(name, numberStudents);
//        }

        courseMap.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
                });


    }
}
