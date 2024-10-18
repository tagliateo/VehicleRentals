public class Vehicle extends Main {

    interface vehicle {
        String getMake();
        String getModel();
        int getYear();
    }

    // Define the CarVehicle interface
    interface CarVehicle extends vehicle {
        void setNumberOfDoors(int doors);
        int getNumberOfDoors();
        void setFuelType(String fuelType);
        String getFuelType();
    }

    // Define the Motorcycle interface
    interface MotorVehicle extends vehicle {
        void setNumberOfWheels(int wheels);
        int getNumberOfWheels();
        void setMotorcycleType(String type);
        String getMotorcycleType();
    }

    // Define the TruckVehicle interface
    interface TruckVehicle extends vehicle {
        void setCargoCapacity(double capacity);
        double getCargoCapacity();
        void setTransmissionType(String transmission);
        String getTransmissionType();
    }
}
