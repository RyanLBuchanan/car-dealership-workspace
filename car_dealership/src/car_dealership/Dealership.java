package car_dealership;

public class Dealership {

    public static void main(String[] args) {
    
        // Create a new customer object and set its attributes
        Customer cust1 = new Customer(); 
        cust1.setName("Tom");
        cust1.setAddress("123 Anything Street");
        cust1.setCashOnHand(25000);
        
        // Create two new vehicle objects
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 20000);
        Vehicle car = new Vehicle("Toyota", "Corolla", 20000);
        
        // Create a new employee object
        Employee emp = new Employee();
        
        // The customer purchases the first vehicle from the dealership
        cust1.purchaseCar(vehicle, emp, false);
        
        // Check if the two vehicles are equal (should be true)
        boolean value = car.equals(vehicle);
        System.out.println(value);
    }

}

