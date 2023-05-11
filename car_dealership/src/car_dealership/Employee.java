package car_dealership;

public class Employee {

    // Method for handling a customer's car purchase, taking in the customer object,
    // a boolean for financing, and the vehicle object
    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
        if (finance == true) {
            // If the customer is financing, calculate the loan amount and run a credit history check
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);
        } else if (vehicle.getPrice() <= cust.getCashOnHand()) {
            // If the customer has enough cash to pay for the vehicle, process the transaction
            processTransaction(cust, vehicle);
        } else {
            // If the customer does not have enough cash or cannot finance, print an error message
            System.out.println("Customer will need more money to purchase the " + vehicle + ".");
        }
    }
    
    // Method for running a credit history check, taking in the customer object and the loan amount
    public void runCreditHistory(Customer cust, double loanAmount) { 
        System.out.println("Ran credit history for " + cust.getName() + " with "+ "$" + loanAmount + ".");
        System.out.println("Customer has been approved.");
    }
    
    // Method for processing a transaction, taking in the customer object and the vehicle object
    public void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("Customer has purchased the " + vehicle + " for "  + "$" + vehicle.getPrice() + ".");
    }
}

