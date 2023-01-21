package regularExpression;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        double sum = 0;
        List<String> names = new LinkedList<>();
        while(!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double totalPrice = price * quantity;
                sum += totalPrice;

                String name = matcher.group("name");
                names.add(name);
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.printf("Total money spend: %.2f", sum);
    }
}
