# VehicleProject
import java.util.Scanner;

// Define the Vehicle interface
interface Vehicle {
String getMake();
String getModel();
int getYear();
}

// Define the CarVehicle interface
interface CarVehicle extends Vehicle {
void setNumberOfDoors(int doors);
int getNumberOfDoors();
void setFuelType(String fuelType);
String getFuelType();
}

// Define the Motorcycle interface
interface MotorVehicle extends Vehicle {
void setNumberOfWheels(int wheels);
int getNumberOfWheels();
void setMotorcycleType(String type);
String getMotorcycleType();
}

// Define the TruckVehicle interface
interface TruckVehicle extends Vehicle {
void setCargoCapacity(double capacity);
double getCargoCapacity();
void setTransmissionType(String transmission);
String getTransmissionType();
}

// Implement the Car class
class Car implements CarVehicle {
private String make;
private String model;
private int year;
private int numberOfDoors;
private String fuelType;

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

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void setNumberOfDoors(int doors) {
        this.numberOfDoors = doors;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
}

// Implement the Motorcycle class
class Motorcycle implements MotorVehicle {
private String make;
private String model;
private int year;
private int numberOfWheels;
private String motorcycleType;

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

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void setNumberOfWheels(int wheels) {
        this.numberOfWheels = wheels;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void setMotorcycleType(String type) {
        this.motorcycleType = type;
    }

    @Override
    public String getMotorcycleType() {
        return motorcycleType;
    }
}

// Implement the Truck class
class Truck implements TruckVehicle {
private String make;
private String model;
private int year;
private double cargoCapacity;
private String transmissionType;

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

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void setCargoCapacity(double capacity) {
        this.cargoCapacity = capacity;
    }

    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void setTransmissionType(String transmission) {
        this.transmissionType = transmission;
    }

    @Override
    public String getTransmissionType() {
        return transmissionType;
    }
}

// Main program to interact with the user
public class VehicleRentalSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        // Create a Car
        Car car = new Car();
        System.out.println("Enter Car Make:");
        car.setMake(scanner.nextLine());
        System.out.println("Enter Car Model:");
        car.setModel(scanner.nextLine());
        System.out.println("Enter Year of Manufacture:");
        car.setYear(scanner.nextInt());
        System.out.println("Enter Number of Doors:");
        car.setNumberOfDoors(scanner.nextInt());
        scanner.nextLine(); // consume the newline
        System.out.println("Enter Fuel Type (petrol, diesel, electric):");
        car.setFuelType(scanner.nextLine());

        // Create a Motorcycle
        Motorcycle motorcycle = new Motorcycle();
        System.out.println("\nEnter Motorcycle Make:");
        motorcycle.setMake(scanner.nextLine());
        System.out.println("Enter Motorcycle Model:");
        motorcycle.setModel(scanner.nextLine());
        System.out.println("Enter Year of Manufacture:");
        motorcycle.setYear(scanner.nextInt