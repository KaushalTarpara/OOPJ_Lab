class Vehicle {
    int numWheels;

    Vehicle(int numWheels) {
        this.numWheels = numWheels;
        System.out.println("Vehicle has " + numWheels + " wheels.");
    }

    void drive() {
        System.out.println("Driving...");
    }
}
//Single Inheritance
class Car extends Vehicle {
    String brand;

    Car(int numWheels, String brand) {
        //Call Vehicle Constructor
        super(numWheels);

        this.brand = brand;
        System.out.println("This car is a " + brand);
    }

    void start() {
        System.out.println("srating...");
    }
    //overload method
    void drive() {
        //First Call Vehicle Class drive method
        super.drive();
        System.out.println("Driving a " + brand + " car.");
    }
}
//Maltilevel Inheritance
class SportsCar extends Car {
    String model;

    SportsCar(int numWheels, String brand, String model) {
        //Call Car Class Constuctor
        super(numWheels, brand);
        
        this.model = model;
        System.out.println("This is a " + brand + " " + model);
    }

    void shiftGears() {
        System.out.println("Shifting gears...");
    }

    //overload method
    void drive() {
        //First call Car Class drive method
        super.drive();
        System.out.println("Driving a " + brand + " " + model + " sports car.");
    }
}

public class L4_1 {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar(4, "BMW", "9090");
        myCar.drive();
        myCar.start();
        myCar.shiftGears();
    }
}
 
    
