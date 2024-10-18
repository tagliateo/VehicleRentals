//1. Design and implement an interface named "Vehicle" that includes methods for retrieving the vehicle's make, model, and year of manufacture.
// 2. Develop a class named "Car" that implements the Vehicle and "CarVehicle" interfaces. This interface includes additional methods for setting and retrieving the number of doors and the fuel type (petrol, diesel, or electric).


public class Car implements Vehicle.vehicle, Vehicle.CarVehicle  {
    private String make;
    private String model;
    private int year;
    private int doors;
    private String fuelType;

    public Car (String model, String make, int year, int doors, String fuelType) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.doors = doors;
        this.fuelType = fuelType;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }


    @Override
    public void setNumberOfDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public int getNumberOfDoors() {
        return doors;
    }

    @Override
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }


    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }


}
