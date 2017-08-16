package carRace;

import java.util.Random;

public class Truck extends Vehicle{
    private static final int DEFAULT_SPEED = 100;
    private int breakdownTurnsLeft;
    private int speed;

    public Truck() {
        super();
        Random randomGenerator = new Random();
        this.name = Integer.toString(randomGenerator.nextInt(1000));
        this.breakdownTurnsLeft = 0;
        this.speed = DEFAULT_SPEED;
    }

    @Override
    public void moveForAnHour(boolean isRaining) {
        if (breakdownTurnsLeft == 0) {
            Random randomGenerator = new Random();
            if (randomGenerator.nextInt(20) == 0) {
                breakdownTurnsLeft = 2;
            }
        }

        if (breakdownTurnsLeft == 0) {
            distanceTravelled += speed;
        } else {
            breakdownTurnsLeft--;
        }
    }
}
