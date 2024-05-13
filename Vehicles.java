class Vehicle {
  public void run() {
    System.out.println("Vehicle is running");
  }
}

class Car extends Vehicle {
  public void drive() {
    System.out.println("Car is driving");
  }
}

class SportsCar extends Car {
  public void speed() {
    System.out.println("SportsCar is speeding");
  }
}

public class Main {
  public static void main(String[] args) {
    SportsCar sportsCar = new SportsCar();
    sportsCar.run(); // Vehicle is running
    sportsCar.drive(); // Car is driving
    sportsCar.speed(); // SportsCar is speeding
  }
}