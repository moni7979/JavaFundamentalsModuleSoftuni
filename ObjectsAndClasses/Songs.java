package objectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

    static class SongsClass {
        String typeList;
        String name;
        String time;

        public SongsClass(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberSongs = Integer.parseInt(scanner.nextLine());

        List<SongsClass> listSongs = new ArrayList<>();
        for (int i = 0; i < numberSongs; i++) {
            String data = scanner.nextLine();
            String[] dataArr = data.split("_");

            SongsClass currentSong = new SongsClass(dataArr[0], dataArr[1], dataArr[2]);
            listSongs.add(currentSong);
        }
        String command = scanner.nextLine();
        if(command.equals("all")) {
            for (SongsClass item : listSongs) {
                System.out.println(item.getName());
            }
        } else {
            for (SongsClass item : listSongs) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
