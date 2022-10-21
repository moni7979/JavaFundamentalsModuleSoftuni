package lists.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input1 -> колко точно ще бъдат командите
        int input = Integer.parseInt(scanner.nextLine());
        //създавам празен лист, който ще се пълни спрямо командите
        List<String> nameList = new ArrayList<>();

        //for цикъл като на всяка итерация ще се иска команда
        for (int countOperations = 1; countOperations <= input; countOperations++) {
            //прочитам командата
            String command = scanner.nextLine();

            //две проверки дали исгоинг и дали е в листа
            if (command.contains("is going")) {
                //сплитвам командата, и проверявам дали името се съдържа в листа
                String name = command.split(" ")[0];
                if (nameList.contains(name)) {
                    // щом се съдържа принитрам съобщение
                    System.out.printf("%s is already in the list!", name);
                    System.out.println();
                } else { // щом не се съдържа го добавям
                    nameList.add(name);
                }
            } else if (command.contains("is not going")) {
                String name = command.split(" ")[0];
                //ако името присъства в листа, го премахвам
                if (nameList.contains(name)) {
                    nameList.remove(name);
                } else { //щом няма да ходи и не присъства в листа, принитрам, че не присъства
                    System.out.printf("%s is not in the list!", name);
                    System.out.println();
                }
            }


        }
        for (String guest : nameList) {
            System.out.println(guest);
        }
    }
}
