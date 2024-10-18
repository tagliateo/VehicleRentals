


// 3. Construct a class named "Motorcycle" that also implements Vehicle and the "MotorVehicle" interfaces. This interface should have methods for setting and retrieving the number of wheels and the type of motorcycle (sport, cruiser, or off-road).


public class Motorcycle extends Vehicle implements Vehicle.vehicle, Vehicle.MotorVehicle{
    private String make;
    private String model;
    private int year;
    private int wheels;
    private String motorcycleType;

    public Motorcycle(String make, String model, int year, int wheels, String motorcycleType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
        this.motorcycleType = motorcycleType;
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

    public void setWheels(int wheels){
        this.wheels = wheels;
    }


    @Override
    public void setNumberOfWheels(int wheels) {

    }

    @Override
    public int getNumberOfWheels() {
        return wheels;
    }

    @Override
    public void setMotorcycleType(String type) {
        this.motorcycleType = type;
    }

    @Override
    public String getMotorcycleType() {
        return motorcycleType;
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

