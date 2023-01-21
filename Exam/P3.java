package exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, Integer> likeMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> commentMap = new LinkedHashMap<>();

        int countFollowers = 0;

        String command = scanner.nextLine();
        while (!command.equals("Log out")) {
            String username = command.split(": ")[1];

            if (command.contains("New follower")) {

                if (!likeMap.containsKey(username)) {
                    likeMap.put(username, 0);
                    commentMap.put(username, 0);

                    countFollowers++;
                }


            } else if (command.contains("Like")) {
                int count = Integer.parseInt(command.split(": ")[2]);

                if (!likeMap.containsKey(username)) {
                    likeMap.put(username, count);
                    commentMap.put(username, 0);

                    countFollowers++;
                } else {
                    int currentLikes = likeMap.get(username);
                    likeMap.put(username, currentLikes + count);
                }

            } else if (command.contains("Comment")) {

                if (!commentMap.containsKey(username)) {
                    commentMap.put(username, 1);
                    likeMap.put(username, 0);

                    countFollowers++;
                } else {
                    int currentComments = commentMap.get(username);
                    commentMap.put(username, currentComments + 1);
                }

            } else if (command.contains("Blocked")) {

                if (likeMap.containsKey(username)) {
                    likeMap.remove(username);
                    commentMap.remove(username);

                    countFollowers--;
                } else {
                    System.out.printf("%s doesn't exist.%n", username);
                }

            }

            command = scanner.nextLine();
        }

        System.out.printf("%d followers%n", countFollowers);
        for (Map.Entry<String, Integer> entry : likeMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue() + commentMap.get(entry.getKey()));
        }

    }
}
