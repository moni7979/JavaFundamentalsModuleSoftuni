package objectsAndClasses.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {

    static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int hp;

        public Vehicle(String type, String model, String color, int hp) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.hp = hp;
        }

        @Override
        public String toString() {

            String formatedType = "";
            if (this.type.equals("car")) {
                formatedType = "Car";
            } else if (this.type.equals("truck")) {
                formatedType = "Truck";
            }
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", formatedType, this.model, this.color, this.hp);
        }


        public String getType() {
            return this.type;
        }

        public String getModel() {
            return this.model;
        }

        public String getColor() {
            return this.color;
        }

        public int getHp() {
            return this.hp;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandArr = command.split(" ");
            String vehicleType = commandArr[0];
            String model = commandArr[1];
            String color = commandArr[2];
            int hp = Integer.parseInt(commandArr[3]);

            Vehicle currentVehicle = new Vehicle(vehicleType, model, color, hp);
            vehicleList.add(currentVehicle);

            command = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (model.equals("Close the Catalogue")) {

            for (Vehicle vehicle : vehicleList) {
                System.out.println(vehicle);
            }

            model = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of %.2f%n.", getAverageHp(vehicleList, "cars"));
        System.out.printf("Trucks have average horsepower of %.2f.", getAverageHp(vehicleList, "trucks"));

    }

    private static double getAverageHp(List<Vehicle> vehicleList, String type) {

        double sum = 0;
        int count = 0;
        if (type.equals("cars")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getHp();
                    count++;
                }
            }

        } else if (type.equals("trucks")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getHp();
                    count++;
                }
            }
        }

        if (sum == 0) {
            return 0;
        }
        return sum / count;
    }
}
