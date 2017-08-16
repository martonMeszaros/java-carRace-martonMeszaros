package carRace;

public class Car extends Vehicle {
    private static int speedLimit = 110;
    private int normalSpeed;

    public Car(String name, int normalSpeed) {
        super();
        this.name = name;
        this.normalSpeed = normalSpeed;
    }

    public static void setSpeedLimit(int limit) {
        if (limit == 70) {
            speedLimit = limit;
        } else {
            speedLimit = 110;
        }
    }

    @Override
    public void moveForAnHour(boolean isRaining) {
        if (speedLimit == 70) {
            distanceTravelled += speedLimit;
        } else {
            distanceTravelled += normalSpeed;
        }
    }
}
