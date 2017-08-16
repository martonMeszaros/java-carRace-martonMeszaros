package carRace;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static boolean isRaining = false; // 30% every hour
    static ArrayList<Vehicle> vehicles = new ArrayList<>(30);

    private static void createVehicles() {
        String[] carNames = new String[]{
                "Barrage",
                "Celestial",
                "Lightning",
                "Guerilla",
                "Umbra",
                "Formula",
                "Warrior",
                "Adventure",
                "Crusader",
                "Paradox"
        };
        Random randomGen = new Random();
        // 10 cars, 10 motorcycles, 10 trucks
        for (int i = 0; i < 10; i++) {
            String newCarName = carNames[randomGen.nextInt(carNames.length)];
            newCarName += " " + carNames[randomGen.nextInt(carNames.length)];
            int newCarSpeedRandomness = randomGen.nextInt(31); // The difference between 110 and 80
            vehicles.add(new Car(newCarName, 80 + newCarSpeedRandomness));
            vehicles.add(new Motorcycle());
        }
    }

    private static void simulateRace() {
        Random randomGenerator = new Random();
        for (int i = 0; i < 50; i++) {
            // Set variables for current hour
            isRaining = (randomGenerator.nextInt(10) < 3) ? true : false;
            int newCarSpeedLimit = (randomGenerator.nextInt(10) < 3) ? 70 : 110;
            Car.setSpeedLimit(newCarSpeedLimit);
            
            for (Vehicle vehicle : vehicles) {
                vehicle.moveForAnHour(isRaining);
            }
        }
    }

    private static void printRaceResults() {
        for (Object vehicle : vehicles) {
            System.out.println(vehicle + "\n");
        }
    }

    public static void main(String[] args) {
        createVehicles();
        simulateRace();
        printRaceResults();
    }
}
