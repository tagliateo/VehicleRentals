// 4. Generate a class named "Truck" that implements the Vehicle and "TruckVehicle" interfaces. This interface should include methods for setting and retrieving the cargo capacity (in tons) and the transmission type (manual or automatic).

public class Truck extends Vehicle implements Vehicle.vehicle, Vehicle.TruckVehicle {
    private double capacity;
    private String transmissionType;
    private String make;
    private String model;
    private int year;


    public Truck(double cargoCapacity, String transmissionType, String make, String model, int year) {
        this.capacity = cargoCapacity;
        this.transmissionType = transmissionType;
        this.make = make;
        this.model = model;
        this.year = year;
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
    public void setCargoCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public double getCargoCapacity() {
        return capacity;
    }

    @Override
    public void setTransmissionType(String transmission) {
        this.transmissionType = transmission;
    }

    @Override
    public String getTransmissionType() {
        return transmissionType;
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
