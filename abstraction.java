package softE;
interface Engine {
    void startEngine();
    void stopEngine();
}

// Abstract class Vehicle
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void move(); // Abstract method

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Car class - a type of Vehicle
class Car extends Vehicle implements Engine {
    Car(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    @Override
    void move() {
        System.out.println("Car is driving on the road.");
    }
}

// Boat class - another type of Vehicle
class Boat extends Vehicle implements Engine {
    Boat(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Boat engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Boat engine stopped.");
    }

    @Override
    void move() {
        System.out.println("Boat is sailing on water.");
    }
}

// Main class to test abstraction
public class abstraction {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        myCar.showBrand();
        ((Engine) myCar).startEngine();
        myCar.move();
        ((Engine) myCar).stopEngine();

        System.out.println();

        Vehicle myBoat = new Boat("Yamaha");
        myBoat.showBrand();
        ((Engine) myBoat).startEngine();
        myBoat.move();
        ((Engine) myBoat).stopEngine();
    }
}
