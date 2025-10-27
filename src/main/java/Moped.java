public class Moped extends WheeledVehicle {
    String fuelType;

    public Moped(String color, int numberOfWheels, String fuelType) {
        super(color, numberOfWheels);
        this.fuelType = fuelType;
    }
}
