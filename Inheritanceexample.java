class Vehicle {
    public void drive() {
        System.out.println("Repairing a Vehicle");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Repairing a car");
    }
}

public class Inheritanceexample {
    public static void main(String[] arg) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive();
    }
}
