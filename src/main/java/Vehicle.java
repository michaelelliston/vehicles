public class Vehicle {

    String color;
    int numberOfPassengers;
    int cargoCapacity;
    int fuelCapacity;
    String fuelType;
    double vehicleWeight;
    double currentSpeed;
    double maxSpeed;
    double accelerationSpeed;
    int turnRadius;
    boolean isOn;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getVehicleWeight() {
        return vehicleWeight;
    }

    public void setVehicleWeight(double vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getAccelerationSpeed() {
        return accelerationSpeed;
    }

    public void setAccelerationSpeed(double accelerationSpeed) {
        this.accelerationSpeed = accelerationSpeed;
    }

    public int getTurnRadius() {
        return turnRadius;
    }

    public void setTurnRadius(int turnRadius) {
        this.turnRadius = turnRadius;
    }

    public void accelerateVehicle() {
        if (isOn) {
            System.out.println("Flooring it!");
            this.currentSpeed = this.currentSpeed + this.accelerationSpeed;
        } else {
            System.out.println("Start your vehicle, first!");
        }
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void toggleVehicleOnOrOff() {
        System.out.println("Turning the keys...");
        this.isOn = !this.isOn;
    }
}
