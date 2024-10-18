
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n####################################");
            System.out.println("########## Welcome to Vehicle Rentals #############");
            System.out.println("####################################");

            System.out.println("Please choose an option:");
            System.out.println("1. Make a car");
            System.out.println("2. Make a motorcycle");
            System.out.println("3. Make a truck");
            System.out.println("0. Exit");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.nextInt();
            }

            choice = scanner.nextInt();

           switch (choice) {
                case 1 -> {
                    System.out.println("Please enter the Car make:");
                    String make = scanner.next();
                    System.out.println("Please enter the Car model:");
                    String model = scanner.next();
                    System.out.println("Please enter the Car year:");
                    int year = scanner.nextInt();
                    System.out.println("Please enter the number of doors:");
                    int doors = scanner.nextInt();
                    System.out.println("Please enter the fuel type:");
                    String fuelType = scanner.next();
                    Car newCar = new Car(make, model, year, doors, fuelType);
                    System.out.println("Your Car..." + newCar.getMake() + " " + newCar.getModel() + " " + newCar.getYear() + newCar.getNumberOfDoors() + " " + newCar.getFuelType());
                }
                case 2 -> {
                    System.out.println("Please enter the Motorcycle make:");
                    String make = scanner.next();
                    System.out.println("Please enter the Motorcycle model:");
                    String model = scanner.next();
                    System.out.println("Please enter the Motorcycle year:");
                    int year = scanner.nextInt();
                    System.out.println("Please enter the number of wheels:");
                    int wheels = scanner.nextInt();
                    System.out.println("Please enter the motorcycle type: (sport, cruiser, or off-road)");
                    String motorcycleType = scanner.next();
                    Motorcycle newMotorcycle = new Motorcycle(make, model, year, wheels, motorcycleType);
                    System.out.println("Your Motorcycle..." + newMotorcycle.getMake() + " " + newMotorcycle.getModel() + " " + newMotorcycle.getYear() + " " + newMotorcycle.getNumberOfWheels() + newMotorcycle.getMotorcycleType());
                }
                case 3 -> {
                    System.out.println("Please enter the Truck make:");
                    String make = scanner.next();
                    System.out.println("Please enter the Truck model:");
                    String model = scanner.next();
                    System.out.println("Please enter the Truck year:");
                    int year = scanner.nextInt();
                    System.out.println("Please enter the Truck capacity (in Tons):");
                    double cargoCapacity = scanner.nextDouble();
                    System.out.println("Please enter the Truck transmission type: (manual or automatic)");
                    String transmissionType = scanner.next();
                    Truck newTruck = new Truck(cargoCapacity, transmissionType, make, model, year);
                    System.out.println("Your Truck..." + newTruck.getMake() + " " + newTruck.getModel() + " " + newTruck.getYear() + " " + newTruck.getCargoCapacity() + newTruck.getTransmissionType());
                }
                case 0 -> System.out.println("Goodbye!");

                default -> System.out.println("Sorry I didnt quite get that... Try again");

            }
        } while (choice != 0);{
            scanner.close();
        }

    }
}
