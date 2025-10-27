public class Main {

    public static void main(String[] args) {
        SemiTruck semiTruck = new SemiTruck();
        Car car = new Car();
        Moped moped = new Moped("Red", 2, "Gas");
        Hovercraft hovercraft = new Hovercraft();

        car.setColor("Blue");
        System.out.println("The car is: " + car.getColor());

        moped.setNumberOfPassengers(1);
        System.out.println("The moped has " + moped.getNumberOfPassengers() + " passenger(s), is " + moped.getColor() + ", and has " + moped.getNumberOfWheels() + " wheels.");

        hovercraft.setVehicleWeight(1500);
        System.out.println("The hovercraft has a weight of " + hovercraft.getVehicleWeight() + " pounds.");

        semiTruck.setColor("Neon Yellow");
        semiTruck.setFuelCapacity(30);
        semiTruck.setCargoCapacity(100);
        semiTruck.setCurrentSpeed(0);
        semiTruck.setAccelerationSpeed(20);
        semiTruck.setFuelType("Gas");

        System.out.println("Your vehicle is a " + semiTruck.getColor() + " Semi Truck with a current speed of " + semiTruck.getCurrentSpeed() + ".");

        System.out.println("Is your vehicle on?: " + semiTruck.getIsOn());

        semiTruck.accelerateVehicle();

        semiTruck.toggleVehicleOnOrOff();

        System.out.println("Is your vehicle on now?: " + semiTruck.getIsOn());

        semiTruck.accelerateVehicle();

        System.out.println("Your vehicle is now moving at a speed of: " + semiTruck.getCurrentSpeed());


    }
}
