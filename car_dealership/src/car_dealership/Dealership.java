package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer(); 
		cust1.name = "Tom";
		cust1.address = "123 Anything Street";
		cust1.cashOnHand = 12000;
		
		cust1.purchaseCar(vehicle, emp, false);
		
		
		handleCustomer(Customer cust, boolean finance, Vehicle vehicle){
			if(finance == true){
				runCreditHistory(Customer cust, double doubleAmount);
			} else if (vehicle.getPrice() <= cust.cashOnHand) {
				processTransaction(Customer cust, Vehicle vehicle);
			} else {
				System.out.println("Insufficient funds");
			}
		}
	}

}
