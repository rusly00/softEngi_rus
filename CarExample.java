// CarModel class uses encapsulation
class CarModel {
    // Private fields (hidden from outside)
    private String brand;
    private String model;
    private int year;
    private double price;

    // Constructor
    public CarModel(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Public getter for brand
    public String getBrand() {
        return brand;
    }

    // Public setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Public getter for model
    public String getModel() {
        return model;
    }

    // Public setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Public getter for year
    public int getYear() {
        return year;
    }

    // Public setter for year
    public void setYear(int year) {
        if (year > 1885) { // Cars were invented around 1886
            this.year = year;
        } else {
            System.out.println("Invalid year for a car!");
        }
    }

    // Public getter for price
    public double getPrice() {
        return price;
    }

    // Public setter for price
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative!");
        }
    }
}

// Main class to test CarModel
public class CarExample {
    public static void main(String[] args) {
        // Create a car object using the constructor
        CarModel myCar = new CarModel("Toyota", "Camry", 2022, 28000.00);

        // Accessing and displaying car info through getters
        System.out.println("Car Info:");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: $" + myCar.getPrice());

        // Modifying values using setters
        myCar.setModel("Corolla");
        myCar.setPrice(25000.00);
        System.out.println("\nUpdated Car Info:");
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Price: $" + myCar.getPrice());

        // Invalid update
        myCar.setYear(1800); // This will show an error message
    }
}
