//1. Design and implement an interface named "Vehicle" that includes methods for retrieving the vehicle's make, model, and year of manufacture.
// 2. Develop a class named "Car" that implements the Vehicle and "CarVehicle" interfaces. This interface includes additional methods for setting and retrieving the number of doors and the fuel type (petrol, diesel, or electric).

interface CarVehicle extends Main.Vehicle {
    int getDoors();
    int setDoors(int doors);
    String getFuelType();
    int setFuelType(int fuelType);
}

public class Car implements CarVehicle {
    private int doors;
    private String fuelType;

    public Car(int doors, String fuelType) {
        this.doors = doors;
        this.fuelType = fuelType;
    }
    public int getDoors() {
        return doors;
    }

    @Override
    public int setDoors(int doors) {
        return 0;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public int setFuelType(int fuelType) {
        return 0;
    }

    @Override
    public String getMake() {
        return "";
    }

    @Override
    public String getModel() {
        return "";
    }

    @Override
    public int getYear() {
        return 0;
    }
}
