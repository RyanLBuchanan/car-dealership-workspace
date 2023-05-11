package car_dealership;

import java.util.Objects;

public class Vehicle {

    private String make; // private field to store the make of the vehicle
    private String model; // private field to store the model of the vehicle
    private double price; // private field to store the price of the vehicle

    // Constructors
    public Vehicle(String make, String model, double price) { // constructor with three arguments
        super(); // call the constructor of the superclass (Object)
        this.make = make; // initialize the make field
        this.model = model; // initialize the model field
        this.price = price; // initialize the price field
    }

    public String getMake() { // public method to get the make of the vehicle
        return make;
    }

    public void setMake(String make) { // public method to set the make of the vehicle
        this.make = make;
    }

    public String getModel() { // public method to get the model of the vehicle
        return model;
    }

    public void setModel(String model) { // public method to set the model of the vehicle
        this.model = model;
    }

    public double getPrice() { // public method to get the price of the vehicle
        return price;
    }

    public void setPrice(double price) { // public method to set the price of the vehicle
        this.price = price;
    }

    @Override
    public String toString() { // overrides the toString() method of the Object class
        return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + "]";
    }

    @Override
    public int hashCode() { // overrides the hashCode() method of the Object class
        return Objects.hash(make, model, price); // returns the hash code of the object
    }

    @Override
    public boolean equals(Object obj) { // overrides the equals() method of the Object class
        if (this == obj) // if the objects are the same
            return true;
        if (obj == null) // if the other object is null
            return false;
        if (getClass() != obj.getClass()) // if the classes of the objects are different
            return false;
        Vehicle other = (Vehicle) obj; // cast the other object to a Vehicle object
        return Objects.equals(make, other.make) && Objects.equals(model, other.model)
                && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
        // compares the fields of the two Vehicle objects and returns true if they are equal
    }
}
