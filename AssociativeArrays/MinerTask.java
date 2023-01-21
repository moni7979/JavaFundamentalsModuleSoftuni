package associativeArrays;

import java.util.*;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Integer>> miningData = new LinkedHashMap<>();
        String resource = scanner.nextLine();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!miningData.containsKey(resource)) {
                miningData.put(resource, new ArrayList<>());
            }
            miningData.get(resource).add(quantity);

            resource = scanner.nextLine();
        }

        Map<String, Integer> finalMiningData = new LinkedHashMap<>();
        for (Map.Entry<String, List<Integer>> entry : miningData.entrySet()) {
            String resourceName = entry.getKey();
            List<Integer> listData = entry.getValue();

            int sumOfList = getSumList(listData);

            finalMiningData.put(resourceName, sumOfList);
        }

        finalMiningData.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));


    }

    private static int getSumList(List<Integer> listData) {
        int sum = 0;

        for (int element : listData) {
            sum += element;
        }
        return sum;
    }
}
