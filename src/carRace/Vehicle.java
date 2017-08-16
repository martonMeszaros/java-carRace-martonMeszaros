package carRace;

public class Vehicle {
    protected int distanceTravelled;
    protected String name;

    public Vehicle() {
        this.distanceTravelled = 0;
    }

    public void moveForAnHour() {}

    @Override
    public String toString() {
        String representation = "Name: " + name;
        representation += "\nDistance travelled: " + distanceTravelled;
        representation += "\nType: " + getClass().getSimpleName();
        return  representation;
    }
}
