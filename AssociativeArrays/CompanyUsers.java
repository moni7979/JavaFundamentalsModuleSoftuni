package associativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> usersMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            if (usersMap.containsKey(companyName)) {
                List<String> employees = usersMap.get(companyName);
                if (!employees.contains(employeeId)) {
                    employees.add(employeeId);
                }
            } else {
                List <String> employees = new ArrayList<>();
                employees.add(employeeId);
                usersMap.put(companyName, employees);
            }
            input = scanner.nextLine();
        }

        usersMap.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().forEach(userId -> System.out.println("-- " + userId));
                });
    }
}
