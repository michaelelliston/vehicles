public class WheeledVehicle extends Vehicle {
    int numberOfWheels;

    public WheeledVehicle(String color, int numberOfWheels) {
        super(color);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }
}
