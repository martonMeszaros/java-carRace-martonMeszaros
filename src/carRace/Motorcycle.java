package carRace;

import java.util.Random;

public class Motorcycle extends Vehicle{
    private static final int DEFAULT_SPEED = 100;
    private static int nameNumber = 1;
    private int speed;

    public Motorcycle() {
        super();
        this.name = "Motorcycle " + nameNumber;
        this.speed = DEFAULT_SPEED;

        nameNumber++;
    }

    @Override
    public void moveForAnHour(boolean isRaining) {
        if (isRaining) {
            Random randomGenerator = new Random();
            int randomnessOffset = randomGenerator.nextInt(45); // Difference between 50 and 5
            int slowness = 5 + randomnessOffset;
            distanceTravelled += speed - slowness;
        } else {
            distanceTravelled += speed;
        }

    }
}
